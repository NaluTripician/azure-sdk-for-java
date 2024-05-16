// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.batch.fluent.models.PoolInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Values returned by the List operation.
 */
@Fluent
public final class ListPoolsResult {
    /*
     * The collection of returned pools.
     */
    @JsonProperty(value = "value")
    private List<PoolInner> value;

    /*
     * The continuation token.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of ListPoolsResult class.
     */
    public ListPoolsResult() {
    }

    /**
     * Get the value property: The collection of returned pools.
     * 
     * @return the value value.
     */
    public List<PoolInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The collection of returned pools.
     * 
     * @param value the value value to set.
     * @return the ListPoolsResult object itself.
     */
    public ListPoolsResult withValue(List<PoolInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The continuation token.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The continuation token.
     * 
     * @param nextLink the nextLink value to set.
     * @return the ListPoolsResult object itself.
     */
    public ListPoolsResult withNextLink(String nextLink) {
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
