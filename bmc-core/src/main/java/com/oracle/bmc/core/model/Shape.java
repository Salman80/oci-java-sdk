/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * A compute instance shape that can be used in {@link #launchInstance(LaunchInstanceRequest) launchInstance}.
 * For more information, see [Overview of the Compute Service](https://docs.cloud.oracle.com/Content/Compute/Concepts/computeoverview.htm).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Shape.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class Shape {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("processorDescription")
        private String processorDescription;

        public Builder processorDescription(String processorDescription) {
            this.processorDescription = processorDescription;
            this.__explicitlySet__.add("processorDescription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ocpus")
        private Float ocpus;

        public Builder ocpus(Float ocpus) {
            this.ocpus = ocpus;
            this.__explicitlySet__.add("ocpus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("memoryInGBs")
        private Float memoryInGBs;

        public Builder memoryInGBs(Float memoryInGBs) {
            this.memoryInGBs = memoryInGBs;
            this.__explicitlySet__.add("memoryInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("networkingBandwidthInGbps")
        private Float networkingBandwidthInGbps;

        public Builder networkingBandwidthInGbps(Float networkingBandwidthInGbps) {
            this.networkingBandwidthInGbps = networkingBandwidthInGbps;
            this.__explicitlySet__.add("networkingBandwidthInGbps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxVnicAttachments")
        private Integer maxVnicAttachments;

        public Builder maxVnicAttachments(Integer maxVnicAttachments) {
            this.maxVnicAttachments = maxVnicAttachments;
            this.__explicitlySet__.add("maxVnicAttachments");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("gpus")
        private Integer gpus;

        public Builder gpus(Integer gpus) {
            this.gpus = gpus;
            this.__explicitlySet__.add("gpus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("gpuDescription")
        private String gpuDescription;

        public Builder gpuDescription(String gpuDescription) {
            this.gpuDescription = gpuDescription;
            this.__explicitlySet__.add("gpuDescription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("localDisks")
        private Integer localDisks;

        public Builder localDisks(Integer localDisks) {
            this.localDisks = localDisks;
            this.__explicitlySet__.add("localDisks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("localDisksTotalSizeInGBs")
        private Float localDisksTotalSizeInGBs;

        public Builder localDisksTotalSizeInGBs(Float localDisksTotalSizeInGBs) {
            this.localDisksTotalSizeInGBs = localDisksTotalSizeInGBs;
            this.__explicitlySet__.add("localDisksTotalSizeInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("localDiskDescription")
        private String localDiskDescription;

        public Builder localDiskDescription(String localDiskDescription) {
            this.localDiskDescription = localDiskDescription;
            this.__explicitlySet__.add("localDiskDescription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ocpuOptions")
        private ShapeOcpuOptions ocpuOptions;

        public Builder ocpuOptions(ShapeOcpuOptions ocpuOptions) {
            this.ocpuOptions = ocpuOptions;
            this.__explicitlySet__.add("ocpuOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("memoryOptions")
        private ShapeMemoryOptions memoryOptions;

        public Builder memoryOptions(ShapeMemoryOptions memoryOptions) {
            this.memoryOptions = memoryOptions;
            this.__explicitlySet__.add("memoryOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("networkingBandwidthOptions")
        private ShapeNetworkingBandwidthOptions networkingBandwidthOptions;

        public Builder networkingBandwidthOptions(
                ShapeNetworkingBandwidthOptions networkingBandwidthOptions) {
            this.networkingBandwidthOptions = networkingBandwidthOptions;
            this.__explicitlySet__.add("networkingBandwidthOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxVnicAttachmentOptions")
        private ShapeMaxVnicAttachmentOptions maxVnicAttachmentOptions;

        public Builder maxVnicAttachmentOptions(
                ShapeMaxVnicAttachmentOptions maxVnicAttachmentOptions) {
            this.maxVnicAttachmentOptions = maxVnicAttachmentOptions;
            this.__explicitlySet__.add("maxVnicAttachmentOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Shape build() {
            Shape __instance__ =
                    new Shape(
                            shape,
                            processorDescription,
                            ocpus,
                            memoryInGBs,
                            networkingBandwidthInGbps,
                            maxVnicAttachments,
                            gpus,
                            gpuDescription,
                            localDisks,
                            localDisksTotalSizeInGBs,
                            localDiskDescription,
                            ocpuOptions,
                            memoryOptions,
                            networkingBandwidthOptions,
                            maxVnicAttachmentOptions);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Shape o) {
            Builder copiedBuilder =
                    shape(o.getShape())
                            .processorDescription(o.getProcessorDescription())
                            .ocpus(o.getOcpus())
                            .memoryInGBs(o.getMemoryInGBs())
                            .networkingBandwidthInGbps(o.getNetworkingBandwidthInGbps())
                            .maxVnicAttachments(o.getMaxVnicAttachments())
                            .gpus(o.getGpus())
                            .gpuDescription(o.getGpuDescription())
                            .localDisks(o.getLocalDisks())
                            .localDisksTotalSizeInGBs(o.getLocalDisksTotalSizeInGBs())
                            .localDiskDescription(o.getLocalDiskDescription())
                            .ocpuOptions(o.getOcpuOptions())
                            .memoryOptions(o.getMemoryOptions())
                            .networkingBandwidthOptions(o.getNetworkingBandwidthOptions())
                            .maxVnicAttachmentOptions(o.getMaxVnicAttachmentOptions());

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
     * The name of the shape. You can enumerate all available shapes by calling
     * {@link #listShapes(ListShapesRequest) listShapes}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    String shape;

    /**
     * A short description of the processors available to an instance of this shape.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("processorDescription")
    String processorDescription;

    /**
     * The default number of OCPUs available to an instance of this shape.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ocpus")
    Float ocpus;

    /**
     * The default amount of memory, in gigabytes, available to an instance of this shape.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("memoryInGBs")
    Float memoryInGBs;

    /**
     * The networking bandwidth, in gigabits per second, available to an instance of this shape.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("networkingBandwidthInGbps")
    Float networkingBandwidthInGbps;

    /**
     * The maximum number of VNIC attachments available to an instance of this shape.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxVnicAttachments")
    Integer maxVnicAttachments;

    /**
     * The number of GPUs available to an instance of this shape.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gpus")
    Integer gpus;

    /**
     * A short description of the GPUs available to instances of this shape.
     * This field is `null` if `gpus` is `0`.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gpuDescription")
    String gpuDescription;

    /**
     * The number of local disks available to the instance.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("localDisks")
    Integer localDisks;

    /**
     * The size of the local disks, aggregated, in gigabytes.
     * This field is `null` if `localDisks` is equal to `0`.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("localDisksTotalSizeInGBs")
    Float localDisksTotalSizeInGBs;

    /**
     * A short description of the local disks available to instances of this shape.
     * This field is `null` if `localDisks` is equal to `0`.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("localDiskDescription")
    String localDiskDescription;

    @com.fasterxml.jackson.annotation.JsonProperty("ocpuOptions")
    ShapeOcpuOptions ocpuOptions;

    @com.fasterxml.jackson.annotation.JsonProperty("memoryOptions")
    ShapeMemoryOptions memoryOptions;

    @com.fasterxml.jackson.annotation.JsonProperty("networkingBandwidthOptions")
    ShapeNetworkingBandwidthOptions networkingBandwidthOptions;

    @com.fasterxml.jackson.annotation.JsonProperty("maxVnicAttachmentOptions")
    ShapeMaxVnicAttachmentOptions maxVnicAttachmentOptions;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
