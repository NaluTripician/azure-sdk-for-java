// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Azure-SSIS integration runtime outbound network dependency endpoints for one category.
 */
@Fluent
public final class IntegrationRuntimeOutboundNetworkDependenciesCategoryEndpoint {
    /*
     * The category of outbound network dependency.
     */
    @JsonProperty(value = "category")
    private String category;

    /*
     * The endpoints for outbound network dependency.
     */
    @JsonProperty(value = "endpoints")
    private List<IntegrationRuntimeOutboundNetworkDependenciesEndpoint> endpoints;

    /**
     * Creates an instance of IntegrationRuntimeOutboundNetworkDependenciesCategoryEndpoint class.
     */
    public IntegrationRuntimeOutboundNetworkDependenciesCategoryEndpoint() {
    }

    /**
     * Get the category property: The category of outbound network dependency.
     * 
     * @return the category value.
     */
    public String category() {
        return this.category;
    }

    /**
     * Set the category property: The category of outbound network dependency.
     * 
     * @param category the category value to set.
     * @return the IntegrationRuntimeOutboundNetworkDependenciesCategoryEndpoint object itself.
     */
    public IntegrationRuntimeOutboundNetworkDependenciesCategoryEndpoint withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Get the endpoints property: The endpoints for outbound network dependency.
     * 
     * @return the endpoints value.
     */
    public List<IntegrationRuntimeOutboundNetworkDependenciesEndpoint> endpoints() {
        return this.endpoints;
    }

    /**
     * Set the endpoints property: The endpoints for outbound network dependency.
     * 
     * @param endpoints the endpoints value to set.
     * @return the IntegrationRuntimeOutboundNetworkDependenciesCategoryEndpoint object itself.
     */
    public IntegrationRuntimeOutboundNetworkDependenciesCategoryEndpoint
        withEndpoints(List<IntegrationRuntimeOutboundNetworkDependenciesEndpoint> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (endpoints() != null) {
            endpoints().forEach(e -> e.validate());
        }
    }
}
