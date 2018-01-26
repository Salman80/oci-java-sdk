/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.util.internal;

import com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider;
import com.oracle.bmc.http.internal.WrappedInvocationBuilder;
import com.oracle.bmc.model.BmcException;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import javax.ws.rs.core.Response;

import com.google.common.base.Function;
import com.google.common.base.Supplier;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * Future that both delegates to another one and provides the ability to transform
 * the response to another type. This is intended to work with instance principals
 * authenticated calls and has handling so that if we receive a 401, we'll refresh the
 * instance principals auth token and then try again.
 *
 * This is to account for scenarios where we  have a valid/non-expired token but the permissions
 * for the instance have changed since the token was issued and so on the server-side the presented
 * token is considered invalid.
 *
 * @param <FROM> The type returned by the delegate Future.
 * @param <TO> The type to convert to.
 */
@RequiredArgsConstructor
public class InstancePrincipalsBasedTransformingFuture<FROM, TO> implements Future<TO> {
    @NonNull private Future<FROM> delegate;

    private final Function<FROM, TO> transformer;
    private final InstancePrincipalsAuthenticationDetailsProvider authProvider;
    private final Supplier<Future<FROM>> generateNewFutureForRetry;

    private int numAttempts = 0;

    @Override
    public boolean cancel(boolean mayInterruptIfRunning) {
        return delegate.cancel(mayInterruptIfRunning);
    }

    @Override
    public boolean isCancelled() {
        return delegate.isCancelled();
    }

    @Override
    public boolean isDone() {
        return delegate.isDone();
    }

    @Override
    public TO get() throws InterruptedException, ExecutionException {
        FROM from = delegate.get();
        try {
            return transformer.apply(from);
        } catch (BmcException e) {
            if (e.getStatusCode() == 401) {
                authProvider.refreshSecurityToken();
                delegate = generateNewFutureForRetry.get();
                return transformer.apply(delegate.get());
            } else {
                throw e;
            }
        }
    }

    @Override
    public TO get(long timeout, TimeUnit unit)
            throws InterruptedException, ExecutionException, TimeoutException {
        FROM from = delegate.get(timeout, unit);
        try {
            return transformer.apply(from);
        } catch (BmcException e) {
            if (e.getStatusCode() == 401) {
                authProvider.refreshSecurityToken();
                delegate = generateNewFutureForRetry.get();
                return transformer.apply(delegate.get(timeout, unit));
            } else {
                throw e;
            }
        }
    }
}
