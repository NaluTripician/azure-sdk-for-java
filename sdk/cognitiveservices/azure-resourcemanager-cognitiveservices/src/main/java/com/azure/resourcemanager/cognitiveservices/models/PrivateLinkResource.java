// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A private link resource. */
@Fluent
public final class PrivateLinkResource extends ProxyResource {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private PrivateLinkResourceProperties properties;

    /** Creates an instance of PrivateLinkResource class. */
    public PrivateLinkResource() {
    }

    /**
     * Get the properties property: Resource properties.
     *
     * @return the properties value.
     */
    public PrivateLinkResourceProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Resource properties.
     *
     * @param properties the properties value to set.
     * @return the PrivateLinkResource object itself.
     */
    public PrivateLinkResource withProperties(PrivateLinkResourceProperties properties) {
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
