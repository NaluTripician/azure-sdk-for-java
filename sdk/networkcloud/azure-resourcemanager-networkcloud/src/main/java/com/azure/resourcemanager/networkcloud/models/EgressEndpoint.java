// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * EgressEndpoint represents the connection from a cloud services network to the specified endpoint for a common
 * purpose.
 */
@Fluent
public final class EgressEndpoint {
    /*
     * The descriptive category name of endpoints accessible by the AKS agent node. For example,
     * azure-resource-management, API server, etc. The platform egress endpoints provided by default will use the
     * category 'default'.
     */
    @JsonProperty(value = "category", required = true)
    private String category;

    /*
     * The list of endpoint dependencies.
     */
    @JsonProperty(value = "endpoints", required = true)
    private List<EndpointDependency> endpoints;

    /** Creates an instance of EgressEndpoint class. */
    public EgressEndpoint() {
    }

    /**
     * Get the category property: The descriptive category name of endpoints accessible by the AKS agent node. For
     * example, azure-resource-management, API server, etc. The platform egress endpoints provided by default will use
     * the category 'default'.
     *
     * @return the category value.
     */
    public String category() {
        return this.category;
    }

    /**
     * Set the category property: The descriptive category name of endpoints accessible by the AKS agent node. For
     * example, azure-resource-management, API server, etc. The platform egress endpoints provided by default will use
     * the category 'default'.
     *
     * @param category the category value to set.
     * @return the EgressEndpoint object itself.
     */
    public EgressEndpoint withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Get the endpoints property: The list of endpoint dependencies.
     *
     * @return the endpoints value.
     */
    public List<EndpointDependency> endpoints() {
        return this.endpoints;
    }

    /**
     * Set the endpoints property: The list of endpoint dependencies.
     *
     * @param endpoints the endpoints value to set.
     * @return the EgressEndpoint object itself.
     */
    public EgressEndpoint withEndpoints(List<EndpointDependency> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (category() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property category in model EgressEndpoint"));
        }
        if (endpoints() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property endpoints in model EgressEndpoint"));
        } else {
            endpoints().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(EgressEndpoint.class);
}
