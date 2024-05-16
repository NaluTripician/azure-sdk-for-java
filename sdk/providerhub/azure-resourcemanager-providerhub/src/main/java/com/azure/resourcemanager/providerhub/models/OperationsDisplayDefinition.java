// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The OperationsDisplayDefinition model. */
@Fluent
public class OperationsDisplayDefinition {
    /*
     * The provider property.
     */
    @JsonProperty(value = "provider", required = true)
    private String provider;

    /*
     * The resource property.
     */
    @JsonProperty(value = "resource", required = true)
    private String resource;

    /*
     * The operation property.
     */
    @JsonProperty(value = "operation", required = true)
    private String operation;

    /*
     * The description property.
     */
    @JsonProperty(value = "description", required = true)
    private String description;

    /** Creates an instance of OperationsDisplayDefinition class. */
    public OperationsDisplayDefinition() {
    }

    /**
     * Get the provider property: The provider property.
     *
     * @return the provider value.
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set the provider property: The provider property.
     *
     * @param provider the provider value to set.
     * @return the OperationsDisplayDefinition object itself.
     */
    public OperationsDisplayDefinition withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get the resource property: The resource property.
     *
     * @return the resource value.
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Set the resource property: The resource property.
     *
     * @param resource the resource value to set.
     * @return the OperationsDisplayDefinition object itself.
     */
    public OperationsDisplayDefinition withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the operation property: The operation property.
     *
     * @return the operation value.
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set the operation property: The operation property.
     *
     * @param operation the operation value to set.
     * @return the OperationsDisplayDefinition object itself.
     */
    public OperationsDisplayDefinition withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get the description property: The description property.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description property.
     *
     * @param description the description value to set.
     * @return the OperationsDisplayDefinition object itself.
     */
    public OperationsDisplayDefinition withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (provider() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property provider in model OperationsDisplayDefinition"));
        }
        if (resource() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property resource in model OperationsDisplayDefinition"));
        }
        if (operation() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property operation in model OperationsDisplayDefinition"));
        }
        if (description() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property description in model OperationsDisplayDefinition"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(OperationsDisplayDefinition.class);
}
