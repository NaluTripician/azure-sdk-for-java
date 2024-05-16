// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.providerhub.models.CustomRolloutProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Rollout details. */
@Fluent
public final class CustomRolloutInner extends ProxyResource {
    /*
     * Properties of the rollout.
     */
    @JsonProperty(value = "properties", required = true)
    private CustomRolloutProperties properties;

    /** Creates an instance of CustomRolloutInner class. */
    public CustomRolloutInner() {
    }

    /**
     * Get the properties property: Properties of the rollout.
     *
     * @return the properties value.
     */
    public CustomRolloutProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of the rollout.
     *
     * @param properties the properties value to set.
     * @return the CustomRolloutInner object itself.
     */
    public CustomRolloutInner withProperties(CustomRolloutProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property properties in model CustomRolloutInner"));
        } else {
            properties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CustomRolloutInner.class);
}
