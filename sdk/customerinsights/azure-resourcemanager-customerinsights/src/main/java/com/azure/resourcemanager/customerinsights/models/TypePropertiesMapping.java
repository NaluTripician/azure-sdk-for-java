// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Metadata for a Link's property mapping. */
@Fluent
public final class TypePropertiesMapping {
    /*
     * Property name on the source Entity Type.
     */
    @JsonProperty(value = "sourcePropertyName", required = true)
    private String sourcePropertyName;

    /*
     * Property name on the target Entity Type.
     */
    @JsonProperty(value = "targetPropertyName", required = true)
    private String targetPropertyName;

    /*
     * Link type.
     */
    @JsonProperty(value = "linkType")
    private LinkTypes linkType;

    /** Creates an instance of TypePropertiesMapping class. */
    public TypePropertiesMapping() {
    }

    /**
     * Get the sourcePropertyName property: Property name on the source Entity Type.
     *
     * @return the sourcePropertyName value.
     */
    public String sourcePropertyName() {
        return this.sourcePropertyName;
    }

    /**
     * Set the sourcePropertyName property: Property name on the source Entity Type.
     *
     * @param sourcePropertyName the sourcePropertyName value to set.
     * @return the TypePropertiesMapping object itself.
     */
    public TypePropertiesMapping withSourcePropertyName(String sourcePropertyName) {
        this.sourcePropertyName = sourcePropertyName;
        return this;
    }

    /**
     * Get the targetPropertyName property: Property name on the target Entity Type.
     *
     * @return the targetPropertyName value.
     */
    public String targetPropertyName() {
        return this.targetPropertyName;
    }

    /**
     * Set the targetPropertyName property: Property name on the target Entity Type.
     *
     * @param targetPropertyName the targetPropertyName value to set.
     * @return the TypePropertiesMapping object itself.
     */
    public TypePropertiesMapping withTargetPropertyName(String targetPropertyName) {
        this.targetPropertyName = targetPropertyName;
        return this;
    }

    /**
     * Get the linkType property: Link type.
     *
     * @return the linkType value.
     */
    public LinkTypes linkType() {
        return this.linkType;
    }

    /**
     * Set the linkType property: Link type.
     *
     * @param linkType the linkType value to set.
     * @return the TypePropertiesMapping object itself.
     */
    public TypePropertiesMapping withLinkType(LinkTypes linkType) {
        this.linkType = linkType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sourcePropertyName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property sourcePropertyName in model TypePropertiesMapping"));
        }
        if (targetPropertyName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property targetPropertyName in model TypePropertiesMapping"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(TypePropertiesMapping.class);
}
