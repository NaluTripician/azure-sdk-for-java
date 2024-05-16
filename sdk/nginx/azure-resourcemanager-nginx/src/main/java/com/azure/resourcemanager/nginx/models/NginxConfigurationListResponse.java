// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.nginx.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.nginx.fluent.models.NginxConfigurationInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Response of a list operation.
 */
@Fluent
public final class NginxConfigurationListResponse {
    /*
     * Results of a list operation.
     */
    @JsonProperty(value = "value")
    private List<NginxConfigurationInner> value;

    /*
     * Link to the next set of results, if any.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of NginxConfigurationListResponse class.
     */
    public NginxConfigurationListResponse() {
    }

    /**
     * Get the value property: Results of a list operation.
     * 
     * @return the value value.
     */
    public List<NginxConfigurationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Results of a list operation.
     * 
     * @param value the value value to set.
     * @return the NginxConfigurationListResponse object itself.
     */
    public NginxConfigurationListResponse withValue(List<NginxConfigurationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to the next set of results, if any.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Link to the next set of results, if any.
     * 
     * @param nextLink the nextLink value to set.
     * @return the NginxConfigurationListResponse object itself.
     */
    public NginxConfigurationListResponse withNextLink(String nextLink) {
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
