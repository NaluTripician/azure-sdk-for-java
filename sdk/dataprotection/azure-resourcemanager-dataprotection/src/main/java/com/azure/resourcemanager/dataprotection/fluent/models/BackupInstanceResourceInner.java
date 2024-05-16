// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.dataprotection.models.BackupInstance;
import com.azure.resourcemanager.dataprotection.models.DppProxyResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * BackupInstanceResource
 * 
 * BackupInstance Resource.
 */
@Fluent
public final class BackupInstanceResourceInner extends DppProxyResource {
    /*
     * BackupInstanceResource properties
     */
    @JsonProperty(value = "properties")
    private BackupInstance properties;

    /**
     * Creates an instance of BackupInstanceResourceInner class.
     */
    public BackupInstanceResourceInner() {
    }

    /**
     * Get the properties property: BackupInstanceResource properties.
     * 
     * @return the properties value.
     */
    public BackupInstance properties() {
        return this.properties;
    }

    /**
     * Set the properties property: BackupInstanceResource properties.
     * 
     * @param properties the properties value to set.
     * @return the BackupInstanceResourceInner object itself.
     */
    public BackupInstanceResourceInner withProperties(BackupInstance properties) {
        this.properties = properties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BackupInstanceResourceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (properties() != null) {
            properties().validate();
        }
    }
}
