// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.postgresqlflexibleserver.models.Operation;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * A list of resource provider operations.
 */
@Fluent
public final class OperationListResultInner {
    /*
     * Collection of available operation details
     */
    @JsonProperty(value = "value")
    private List<Operation> value;

    /*
     * URL client should use to fetch the next page (per server side paging).
     * It's null for now, added for future use.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of OperationListResultInner class.
     */
    public OperationListResultInner() {
    }

    /**
     * Get the value property: Collection of available operation details.
     * 
     * @return the value value.
     */
    public List<Operation> value() {
        return this.value;
    }

    /**
     * Set the value property: Collection of available operation details.
     * 
     * @param value the value value to set.
     * @return the OperationListResultInner object itself.
     */
    public OperationListResultInner withValue(List<Operation> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URL client should use to fetch the next page (per server side paging).
     * It's null for now, added for future use.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL client should use to fetch the next page (per server side paging).
     * It's null for now, added for future use.
     * 
     * @param nextLink the nextLink value to set.
     * @return the OperationListResultInner object itself.
     */
    public OperationListResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
