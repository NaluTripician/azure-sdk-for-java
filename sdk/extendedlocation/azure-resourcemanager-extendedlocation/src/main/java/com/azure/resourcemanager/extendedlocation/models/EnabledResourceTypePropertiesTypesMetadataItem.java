// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.extendedlocation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Metadata of the Resource Type. */
@Fluent
public final class EnabledResourceTypePropertiesTypesMetadataItem {
    /*
     * Api Version of Resource Type
     */
    @JsonProperty(value = "apiVersion")
    private String apiVersion;

    /*
     * Resource Provider Namespace of Resource Type
     */
    @JsonProperty(value = "resourceProviderNamespace")
    private String resourceProviderNamespace;

    /*
     * Resource Type
     */
    @JsonProperty(value = "resourceType")
    private String resourceType;

    /**
     * Get the apiVersion property: Api Version of Resource Type.
     *
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /**
     * Set the apiVersion property: Api Version of Resource Type.
     *
     * @param apiVersion the apiVersion value to set.
     * @return the EnabledResourceTypePropertiesTypesMetadataItem object itself.
     */
    public EnabledResourceTypePropertiesTypesMetadataItem withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * Get the resourceProviderNamespace property: Resource Provider Namespace of Resource Type.
     *
     * @return the resourceProviderNamespace value.
     */
    public String resourceProviderNamespace() {
        return this.resourceProviderNamespace;
    }

    /**
     * Set the resourceProviderNamespace property: Resource Provider Namespace of Resource Type.
     *
     * @param resourceProviderNamespace the resourceProviderNamespace value to set.
     * @return the EnabledResourceTypePropertiesTypesMetadataItem object itself.
     */
    public EnabledResourceTypePropertiesTypesMetadataItem withResourceProviderNamespace(
        String resourceProviderNamespace) {
        this.resourceProviderNamespace = resourceProviderNamespace;
        return this;
    }

    /**
     * Get the resourceType property: Resource Type.
     *
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Set the resourceType property: Resource Type.
     *
     * @param resourceType the resourceType value to set.
     * @return the EnabledResourceTypePropertiesTypesMetadataItem object itself.
     */
    public EnabledResourceTypePropertiesTypesMetadataItem withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
