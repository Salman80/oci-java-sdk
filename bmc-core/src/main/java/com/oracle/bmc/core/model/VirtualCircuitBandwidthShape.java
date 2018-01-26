/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 * An individual bandwidth level for virtual circuits.
 *
 * <br/>
 * Note: This model distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a set of all
 * explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods
 * are implemented to take {@link #__explicitlySet__} into account. The constructor, on the other hand, does not
 * set {@link #__explicitlySet__} (since the constructor cannot distinguish explicit {@code null} from unset
 * {@code null}). As a consequence, objects should always be created or deserialized using the {@link Builder}.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = VirtualCircuitBandwidthShape.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class VirtualCircuitBandwidthShape {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("bandwidthInMbps")
        private Integer bandwidthInMbps;

        public Builder bandwidthInMbps(Integer bandwidthInMbps) {
            this.bandwidthInMbps = bandwidthInMbps;
            this.__explicitlySet__.add("bandwidthInMbps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VirtualCircuitBandwidthShape build() {
            VirtualCircuitBandwidthShape __instance__ =
                    new VirtualCircuitBandwidthShape(bandwidthInMbps, name);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VirtualCircuitBandwidthShape o) {
            Builder copiedBuilder = bandwidthInMbps(o.getBandwidthInMbps()).name(o.getName());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The bandwidth in Mbps.
     * <p>
     * Example: `10000`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bandwidthInMbps")
    Integer bandwidthInMbps;

    /**
     * The name of the bandwidth shape.
     * <p>
     * Example: `10 Gbps`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
