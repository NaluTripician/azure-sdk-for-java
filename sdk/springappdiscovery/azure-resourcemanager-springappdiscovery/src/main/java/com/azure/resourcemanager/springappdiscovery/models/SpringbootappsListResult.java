// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.springappdiscovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.springappdiscovery.fluent.models.SpringbootappsModelInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The springbootapps list resource definition.
 */
@Fluent
public final class SpringbootappsListResult {
    /*
     * The springbootsites list.
     */
    @JsonProperty(value = "value")
    private List<SpringbootappsModelInner> value;

    /*
     * The link used to get the next page of springbootapps resources list.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of SpringbootappsListResult class.
     */
    public SpringbootappsListResult() {
    }

    /**
     * Get the value property: The springbootsites list.
     * 
     * @return the value value.
     */
    public List<SpringbootappsModelInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The springbootsites list.
     * 
     * @param value the value value to set.
     * @return the SpringbootappsListResult object itself.
     */
    public SpringbootappsListResult withValue(List<SpringbootappsModelInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link used to get the next page of springbootapps resources list.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link used to get the next page of springbootapps resources list.
     * 
     * @param nextLink the nextLink value to set.
     * @return the SpringbootappsListResult object itself.
     */
    public SpringbootappsListResult withNextLink(String nextLink) {
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
