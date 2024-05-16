// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.imagebuilder.fluent.models.RunOutputInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The result of List run outputs operation.
 */
@Fluent
public final class RunOutputCollection {
    /*
     * An array of run outputs
     */
    @JsonProperty(value = "value")
    private List<RunOutputInner> value;

    /*
     * The continuation token.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of RunOutputCollection class.
     */
    public RunOutputCollection() {
    }

    /**
     * Get the value property: An array of run outputs.
     * 
     * @return the value value.
     */
    public List<RunOutputInner> value() {
        return this.value;
    }

    /**
     * Set the value property: An array of run outputs.
     * 
     * @param value the value value to set.
     * @return the RunOutputCollection object itself.
     */
    public RunOutputCollection withValue(List<RunOutputInner> value) {
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
     * @return the RunOutputCollection object itself.
     */
    public RunOutputCollection withNextLink(String nextLink) {
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
