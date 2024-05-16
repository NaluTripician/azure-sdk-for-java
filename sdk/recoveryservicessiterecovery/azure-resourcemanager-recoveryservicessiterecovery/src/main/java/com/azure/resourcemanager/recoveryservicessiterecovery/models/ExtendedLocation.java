// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Extended location of the resource.
 */
@Fluent
public final class ExtendedLocation {
    /*
     * The name of the extended location.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The extended location type.
     */
    @JsonProperty(value = "type", required = true)
    private ExtendedLocationType type;

    /**
     * Creates an instance of ExtendedLocation class.
     */
    public ExtendedLocation() {
    }

    /**
     * Get the name property: The name of the extended location.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the extended location.
     * 
     * @param name the name value to set.
     * @return the ExtendedLocation object itself.
     */
    public ExtendedLocation withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The extended location type.
     * 
     * @return the type value.
     */
    public ExtendedLocationType type() {
        return this.type;
    }

    /**
     * Set the type property: The extended location type.
     * 
     * @param type the type value to set.
     * @return the ExtendedLocation object itself.
     */
    public ExtendedLocation withType(ExtendedLocationType type) {
        this.type = type;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property name in model ExtendedLocation"));
        }
        if (type() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property type in model ExtendedLocation"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ExtendedLocation.class);
}
