// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Supported operating systems property.
 */
@Fluent
public final class SupportedOSProperty {
    /*
     * The replication provider type.
     */
    @JsonProperty(value = "instanceType")
    private String instanceType;

    /*
     * The list of supported operating systems.
     */
    @JsonProperty(value = "supportedOs")
    private List<SupportedOSDetails> supportedOs;

    /**
     * Creates an instance of SupportedOSProperty class.
     */
    public SupportedOSProperty() {
    }

    /**
     * Get the instanceType property: The replication provider type.
     * 
     * @return the instanceType value.
     */
    public String instanceType() {
        return this.instanceType;
    }

    /**
     * Set the instanceType property: The replication provider type.
     * 
     * @param instanceType the instanceType value to set.
     * @return the SupportedOSProperty object itself.
     */
    public SupportedOSProperty withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * Get the supportedOs property: The list of supported operating systems.
     * 
     * @return the supportedOs value.
     */
    public List<SupportedOSDetails> supportedOs() {
        return this.supportedOs;
    }

    /**
     * Set the supportedOs property: The list of supported operating systems.
     * 
     * @param supportedOs the supportedOs value to set.
     * @return the SupportedOSProperty object itself.
     */
    public SupportedOSProperty withSupportedOs(List<SupportedOSDetails> supportedOs) {
        this.supportedOs = supportedOs;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (supportedOs() != null) {
            supportedOs().forEach(e -> e.validate());
        }
    }
}
