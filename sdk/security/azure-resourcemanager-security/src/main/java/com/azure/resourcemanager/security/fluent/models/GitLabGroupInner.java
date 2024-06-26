// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.security.models.GitLabGroupProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GitLab Group resource.
 */
@Fluent
public final class GitLabGroupInner extends ProxyResource {
    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * GitLab Group properties.
     */
    @JsonProperty(value = "properties")
    private GitLabGroupProperties properties;

    /**
     * Creates an instance of GitLabGroupInner class.
     */
    public GitLabGroupInner() {
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the properties property: GitLab Group properties.
     * 
     * @return the properties value.
     */
    public GitLabGroupProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: GitLab Group properties.
     * 
     * @param properties the properties value to set.
     * @return the GitLabGroupInner object itself.
     */
    public GitLabGroupInner withProperties(GitLabGroupProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
