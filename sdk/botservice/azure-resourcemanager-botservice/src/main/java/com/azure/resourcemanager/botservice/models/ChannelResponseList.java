// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.botservice.fluent.models.BotChannelInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The list of bot service channel operation response. */
@Fluent
public final class ChannelResponseList {
    /*
     * The link used to get the next page of bot service channel resources.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /*
     * Gets the list of bot service channel results and their properties.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<BotChannelInner> value;

    /**
     * Get the nextLink property: The link used to get the next page of bot service channel resources.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link used to get the next page of bot service channel resources.
     *
     * @param nextLink the nextLink value to set.
     * @return the ChannelResponseList object itself.
     */
    public ChannelResponseList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Get the value property: Gets the list of bot service channel results and their properties.
     *
     * @return the value value.
     */
    public List<BotChannelInner> value() {
        return this.value;
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
