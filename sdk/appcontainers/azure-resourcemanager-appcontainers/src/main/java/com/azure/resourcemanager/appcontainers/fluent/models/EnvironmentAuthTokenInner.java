// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/**
 * Environment Auth Token.
 */
@Fluent
public final class EnvironmentAuthTokenInner extends Resource {
    /*
     * Environment auth token resource specific properties
     */
    @JsonProperty(value = "properties")
    private EnvironmentAuthTokenProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Creates an instance of EnvironmentAuthTokenInner class.
     */
    public EnvironmentAuthTokenInner() {
    }

    /**
     * Get the innerProperties property: Environment auth token resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private EnvironmentAuthTokenProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnvironmentAuthTokenInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnvironmentAuthTokenInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the token property: Auth token value.
     * 
     * @return the token value.
     */
    public String token() {
        return this.innerProperties() == null ? null : this.innerProperties().token();
    }

    /**
     * Get the expires property: Token expiration date.
     * 
     * @return the expires value.
     */
    public OffsetDateTime expires() {
        return this.innerProperties() == null ? null : this.innerProperties().expires();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
