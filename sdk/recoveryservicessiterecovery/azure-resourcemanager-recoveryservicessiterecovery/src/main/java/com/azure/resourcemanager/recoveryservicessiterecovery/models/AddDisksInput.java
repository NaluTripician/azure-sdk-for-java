// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Input for add disk(s) operation.
 */
@Fluent
public final class AddDisksInput {
    /*
     * Add disks input properties.
     */
    @JsonProperty(value = "properties")
    private AddDisksInputProperties properties;

    /**
     * Creates an instance of AddDisksInput class.
     */
    public AddDisksInput() {
    }

    /**
     * Get the properties property: Add disks input properties.
     * 
     * @return the properties value.
     */
    public AddDisksInputProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Add disks input properties.
     * 
     * @param properties the properties value to set.
     * @return the AddDisksInput object itself.
     */
    public AddDisksInput withProperties(AddDisksInputProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
