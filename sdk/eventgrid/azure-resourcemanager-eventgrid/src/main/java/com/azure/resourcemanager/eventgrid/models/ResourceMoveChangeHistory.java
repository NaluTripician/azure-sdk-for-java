// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The change history of the resource move. */
@Fluent
public final class ResourceMoveChangeHistory {
    /*
     * Azure subscription ID of the resource.
     */
    @JsonProperty(value = "azureSubscriptionId")
    private String azureSubscriptionId;

    /*
     * Azure Resource Group of the resource.
     */
    @JsonProperty(value = "resourceGroupName")
    private String resourceGroupName;

    /*
     * UTC timestamp of when the resource was changed.
     */
    @JsonProperty(value = "changedTimeUtc")
    private OffsetDateTime changedTimeUtc;

    /**
     * Get the azureSubscriptionId property: Azure subscription ID of the resource.
     *
     * @return the azureSubscriptionId value.
     */
    public String azureSubscriptionId() {
        return this.azureSubscriptionId;
    }

    /**
     * Set the azureSubscriptionId property: Azure subscription ID of the resource.
     *
     * @param azureSubscriptionId the azureSubscriptionId value to set.
     * @return the ResourceMoveChangeHistory object itself.
     */
    public ResourceMoveChangeHistory withAzureSubscriptionId(String azureSubscriptionId) {
        this.azureSubscriptionId = azureSubscriptionId;
        return this;
    }

    /**
     * Get the resourceGroupName property: Azure Resource Group of the resource.
     *
     * @return the resourceGroupName value.
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Set the resourceGroupName property: Azure Resource Group of the resource.
     *
     * @param resourceGroupName the resourceGroupName value to set.
     * @return the ResourceMoveChangeHistory object itself.
     */
    public ResourceMoveChangeHistory withResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    /**
     * Get the changedTimeUtc property: UTC timestamp of when the resource was changed.
     *
     * @return the changedTimeUtc value.
     */
    public OffsetDateTime changedTimeUtc() {
        return this.changedTimeUtc;
    }

    /**
     * Set the changedTimeUtc property: UTC timestamp of when the resource was changed.
     *
     * @param changedTimeUtc the changedTimeUtc value to set.
     * @return the ResourceMoveChangeHistory object itself.
     */
    public ResourceMoveChangeHistory withChangedTimeUtc(OffsetDateTime changedTimeUtc) {
        this.changedTimeUtc = changedTimeUtc;
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
