// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * Basic UE Information Properties.
 */
@Fluent
public final class UeInfoPropertiesFormat {
    /*
     * RAT Type
     */
    @JsonProperty(value = "ratType", required = true)
    private RatType ratType;

    /*
     * State of the UE.
     */
    @JsonProperty(value = "ueState", required = true)
    private UeState ueState;

    /*
     * The ueIpAddresses property.
     */
    @JsonProperty(value = "ueIpAddresses")
    private List<DnnIpPair> ueIpAddresses;

    /*
     * The timestamp of last list UEs call to the packet core (UTC).
     */
    @JsonProperty(value = "lastReadAt")
    private OffsetDateTime lastReadAt;

    /**
     * Creates an instance of UeInfoPropertiesFormat class.
     */
    public UeInfoPropertiesFormat() {
    }

    /**
     * Get the ratType property: RAT Type.
     * 
     * @return the ratType value.
     */
    public RatType ratType() {
        return this.ratType;
    }

    /**
     * Set the ratType property: RAT Type.
     * 
     * @param ratType the ratType value to set.
     * @return the UeInfoPropertiesFormat object itself.
     */
    public UeInfoPropertiesFormat withRatType(RatType ratType) {
        this.ratType = ratType;
        return this;
    }

    /**
     * Get the ueState property: State of the UE.
     * 
     * @return the ueState value.
     */
    public UeState ueState() {
        return this.ueState;
    }

    /**
     * Set the ueState property: State of the UE.
     * 
     * @param ueState the ueState value to set.
     * @return the UeInfoPropertiesFormat object itself.
     */
    public UeInfoPropertiesFormat withUeState(UeState ueState) {
        this.ueState = ueState;
        return this;
    }

    /**
     * Get the ueIpAddresses property: The ueIpAddresses property.
     * 
     * @return the ueIpAddresses value.
     */
    public List<DnnIpPair> ueIpAddresses() {
        return this.ueIpAddresses;
    }

    /**
     * Set the ueIpAddresses property: The ueIpAddresses property.
     * 
     * @param ueIpAddresses the ueIpAddresses value to set.
     * @return the UeInfoPropertiesFormat object itself.
     */
    public UeInfoPropertiesFormat withUeIpAddresses(List<DnnIpPair> ueIpAddresses) {
        this.ueIpAddresses = ueIpAddresses;
        return this;
    }

    /**
     * Get the lastReadAt property: The timestamp of last list UEs call to the packet core (UTC).
     * 
     * @return the lastReadAt value.
     */
    public OffsetDateTime lastReadAt() {
        return this.lastReadAt;
    }

    /**
     * Set the lastReadAt property: The timestamp of last list UEs call to the packet core (UTC).
     * 
     * @param lastReadAt the lastReadAt value to set.
     * @return the UeInfoPropertiesFormat object itself.
     */
    public UeInfoPropertiesFormat withLastReadAt(OffsetDateTime lastReadAt) {
        this.lastReadAt = lastReadAt;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ratType() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property ratType in model UeInfoPropertiesFormat"));
        }
        if (ueState() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property ueState in model UeInfoPropertiesFormat"));
        }
        if (ueIpAddresses() != null) {
            ueIpAddresses().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(UeInfoPropertiesFormat.class);
}
