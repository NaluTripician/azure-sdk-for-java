// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.msi.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.UUID;

/** Describes an identity resource. */
@Fluent
public final class IdentityInner extends Resource {
    /*
     * User Assigned Identity properties.
     *
     * The properties associated with the identity.
     */
    @JsonProperty(value = "properties", access = JsonProperty.Access.WRITE_ONLY)
    private UserAssignedIdentityProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of IdentityInner class. */
    public IdentityInner() {
    }

    /**
     * Get the innerProperties property: User Assigned Identity properties.
     *
     * <p>The properties associated with the identity.
     *
     * @return the innerProperties value.
     */
    private UserAssignedIdentityProperties innerProperties() {
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

    /** {@inheritDoc} */
    @Override
    public IdentityInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IdentityInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the tenantId property: The id of the tenant which the identity belongs to.
     *
     * @return the tenantId value.
     */
    public UUID tenantId() {
        return this.innerProperties() == null ? null : this.innerProperties().tenantId();
    }

    /**
     * Get the principalId property: The id of the service principal object associated with the created identity.
     *
     * @return the principalId value.
     */
    public UUID principalId() {
        return this.innerProperties() == null ? null : this.innerProperties().principalId();
    }

    /**
     * Get the clientId property: The id of the app associated with the identity. This is a random generated UUID by
     * MSI.
     *
     * @return the clientId value.
     */
    public UUID clientId() {
        return this.innerProperties() == null ? null : this.innerProperties().clientId();
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
