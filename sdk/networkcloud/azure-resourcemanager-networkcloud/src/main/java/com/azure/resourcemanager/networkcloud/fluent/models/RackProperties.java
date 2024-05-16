// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.networkcloud.models.RackDetailedStatus;
import com.azure.resourcemanager.networkcloud.models.RackProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** RackProperties represents the properties of the rack. */
@Fluent
public final class RackProperties {
    /*
     * The value that will be used for machines in this rack to represent the availability zones that can be referenced
     * by Hybrid AKS Clusters for node arrangement.
     */
    @JsonProperty(value = "availabilityZone", required = true)
    private String availabilityZone;

    /*
     * The resource ID of the cluster the rack is created for. This value is set when the rack is created by the
     * cluster.
     */
    @JsonProperty(value = "clusterId", access = JsonProperty.Access.WRITE_ONLY)
    private String clusterId;

    /*
     * The more detailed status of the rack.
     */
    @JsonProperty(value = "detailedStatus", access = JsonProperty.Access.WRITE_ONLY)
    private RackDetailedStatus detailedStatus;

    /*
     * The descriptive message about the current detailed status.
     */
    @JsonProperty(value = "detailedStatusMessage", access = JsonProperty.Access.WRITE_ONLY)
    private String detailedStatusMessage;

    /*
     * The provisioning state of the rack resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private RackProvisioningState provisioningState;

    /*
     * The free-form description of the rack location. (e.g. “DTN Datacenter, Floor 3, Isle 9, Rack 2B”)
     */
    @JsonProperty(value = "rackLocation", required = true)
    private String rackLocation;

    /*
     * The unique identifier for the rack within Network Cloud cluster. An alternate unique alphanumeric value other
     * than a serial number may be provided if desired.
     */
    @JsonProperty(value = "rackSerialNumber", required = true)
    private String rackSerialNumber;

    /*
     * The SKU for the rack.
     */
    @JsonProperty(value = "rackSkuId", required = true)
    private String rackSkuId;

    /** Creates an instance of RackProperties class. */
    public RackProperties() {
    }

    /**
     * Get the availabilityZone property: The value that will be used for machines in this rack to represent the
     * availability zones that can be referenced by Hybrid AKS Clusters for node arrangement.
     *
     * @return the availabilityZone value.
     */
    public String availabilityZone() {
        return this.availabilityZone;
    }

    /**
     * Set the availabilityZone property: The value that will be used for machines in this rack to represent the
     * availability zones that can be referenced by Hybrid AKS Clusters for node arrangement.
     *
     * @param availabilityZone the availabilityZone value to set.
     * @return the RackProperties object itself.
     */
    public RackProperties withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * Get the clusterId property: The resource ID of the cluster the rack is created for. This value is set when the
     * rack is created by the cluster.
     *
     * @return the clusterId value.
     */
    public String clusterId() {
        return this.clusterId;
    }

    /**
     * Get the detailedStatus property: The more detailed status of the rack.
     *
     * @return the detailedStatus value.
     */
    public RackDetailedStatus detailedStatus() {
        return this.detailedStatus;
    }

    /**
     * Get the detailedStatusMessage property: The descriptive message about the current detailed status.
     *
     * @return the detailedStatusMessage value.
     */
    public String detailedStatusMessage() {
        return this.detailedStatusMessage;
    }

    /**
     * Get the provisioningState property: The provisioning state of the rack resource.
     *
     * @return the provisioningState value.
     */
    public RackProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the rackLocation property: The free-form description of the rack location. (e.g. “DTN Datacenter, Floor 3,
     * Isle 9, Rack 2B”).
     *
     * @return the rackLocation value.
     */
    public String rackLocation() {
        return this.rackLocation;
    }

    /**
     * Set the rackLocation property: The free-form description of the rack location. (e.g. “DTN Datacenter, Floor 3,
     * Isle 9, Rack 2B”).
     *
     * @param rackLocation the rackLocation value to set.
     * @return the RackProperties object itself.
     */
    public RackProperties withRackLocation(String rackLocation) {
        this.rackLocation = rackLocation;
        return this;
    }

    /**
     * Get the rackSerialNumber property: The unique identifier for the rack within Network Cloud cluster. An alternate
     * unique alphanumeric value other than a serial number may be provided if desired.
     *
     * @return the rackSerialNumber value.
     */
    public String rackSerialNumber() {
        return this.rackSerialNumber;
    }

    /**
     * Set the rackSerialNumber property: The unique identifier for the rack within Network Cloud cluster. An alternate
     * unique alphanumeric value other than a serial number may be provided if desired.
     *
     * @param rackSerialNumber the rackSerialNumber value to set.
     * @return the RackProperties object itself.
     */
    public RackProperties withRackSerialNumber(String rackSerialNumber) {
        this.rackSerialNumber = rackSerialNumber;
        return this;
    }

    /**
     * Get the rackSkuId property: The SKU for the rack.
     *
     * @return the rackSkuId value.
     */
    public String rackSkuId() {
        return this.rackSkuId;
    }

    /**
     * Set the rackSkuId property: The SKU for the rack.
     *
     * @param rackSkuId the rackSkuId value to set.
     * @return the RackProperties object itself.
     */
    public RackProperties withRackSkuId(String rackSkuId) {
        this.rackSkuId = rackSkuId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (availabilityZone() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property availabilityZone in model RackProperties"));
        }
        if (rackLocation() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property rackLocation in model RackProperties"));
        }
        if (rackSerialNumber() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property rackSerialNumber in model RackProperties"));
        }
        if (rackSkuId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property rackSkuId in model RackProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RackProperties.class);
}
