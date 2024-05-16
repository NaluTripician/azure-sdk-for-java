// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dynatrace.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.dynatrace.fluent.models.AppServiceInfoInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Response of a list App Services Operation. */
@Fluent
public final class AppServiceListResponse {
    /*
     * The items on this page
     */
    @JsonProperty(value = "value")
    private List<AppServiceInfoInner> value;

    /*
     * The link to the next page of items
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of AppServiceListResponse class. */
    public AppServiceListResponse() {
    }

    /**
     * Get the value property: The items on this page.
     *
     * @return the value value.
     */
    public List<AppServiceInfoInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The items on this page.
     *
     * @param value the value value to set.
     * @return the AppServiceListResponse object itself.
     */
    public AppServiceListResponse withValue(List<AppServiceInfoInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link to the next page of items.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link to the next page of items.
     *
     * @param nextLink the nextLink value to set.
     * @return the AppServiceListResponse object itself.
     */
    public AppServiceListResponse withNextLink(String nextLink) {
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
