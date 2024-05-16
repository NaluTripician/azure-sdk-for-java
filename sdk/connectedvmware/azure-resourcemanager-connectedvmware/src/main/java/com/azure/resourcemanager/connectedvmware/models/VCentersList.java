// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.connectedvmware.fluent.models.VCenterInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of VCenters. */
@Fluent
public final class VCentersList {
    /*
     * Url to follow for getting next page of VCenters.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /*
     * Array of VCenters
     */
    @JsonProperty(value = "value", required = true)
    private List<VCenterInner> value;

    /** Creates an instance of VCentersList class. */
    public VCentersList() {
    }

    /**
     * Get the nextLink property: Url to follow for getting next page of VCenters.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Url to follow for getting next page of VCenters.
     *
     * @param nextLink the nextLink value to set.
     * @return the VCentersList object itself.
     */
    public VCentersList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Get the value property: Array of VCenters.
     *
     * @return the value value.
     */
    public List<VCenterInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Array of VCenters.
     *
     * @param value the value value to set.
     * @return the VCentersList object itself.
     */
    public VCentersList withValue(List<VCenterInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model VCentersList"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VCentersList.class);
}
