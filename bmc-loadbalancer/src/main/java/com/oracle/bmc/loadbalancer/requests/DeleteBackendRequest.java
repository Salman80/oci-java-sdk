/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.requests;

import java.io.*;
import java.util.*;

import lombok.Builder;
import lombok.Getter;
import lombok.experimental.Accessors;

import com.oracle.bmc.model.*;
import com.oracle.bmc.loadbalancer.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@Builder(builderClassName = "Builder")
@Getter
public class DeleteBackendRequest {

    /**
     * The [OCID](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/identifiers.htm) of the load balancer associated with the backend set and server.
     */
    private String loadBalancerId;

    /**
     * The name of the backend set associated with the backend server.
     * <p>
     * Example: `My backend set`
     *
     */
    private String backendSetName;

    /**
     * The name of the backend server to remove.
     * <p>
     * Example: `My backend server`
     *
     */
    private String backendName;

    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(DeleteBackendRequest o) {
            loadBalancerId(o.getLoadBalancerId());
            backendSetName(o.getBackendSetName());
            backendName(o.getBackendName());
            opcRequestId(o.getOpcRequestId());
            return this;
        }
    }
}