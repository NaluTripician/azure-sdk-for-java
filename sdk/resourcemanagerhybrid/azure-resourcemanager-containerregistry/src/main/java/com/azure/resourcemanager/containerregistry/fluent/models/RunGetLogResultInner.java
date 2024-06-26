// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The result of get log link operation. */
@Fluent
public final class RunGetLogResultInner {
    /*
     * The link to logs for a run on a azure container registry.
     */
    @JsonProperty(value = "logLink")
    private String logLink;

    /**
     * Get the logLink property: The link to logs for a run on a azure container registry.
     *
     * @return the logLink value.
     */
    public String logLink() {
        return this.logLink;
    }

    /**
     * Set the logLink property: The link to logs for a run on a azure container registry.
     *
     * @param logLink the logLink value to set.
     * @return the RunGetLogResultInner object itself.
     */
    public RunGetLogResultInner withLogLink(String logLink) {
        this.logLink = logLink;
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
