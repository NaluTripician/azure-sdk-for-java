// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Microsoft.Elastic SKU. */
@Fluent
public final class ResourceSku {
    /*
     * Name of the SKU.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /** Creates an instance of ResourceSku class. */
    public ResourceSku() {
    }

    /**
     * Get the name property: Name of the SKU.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the SKU.
     *
     * @param name the name value to set.
     * @return the ResourceSku object itself.
     */
    public ResourceSku withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model ResourceSku"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ResourceSku.class);
}
