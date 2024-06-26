// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hardwaresecuritymodules.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Cloud HSM Cluster Resource.
 */
@Fluent
public class CloudHsmClusterResource extends Resource {
    /*
     * SKU details
     */
    @JsonProperty(value = "sku")
    private CloudHsmClusterSku sku;

    /*
     * Managed service identity (system assigned and/or user assigned identities)
     */
    @JsonProperty(value = "identity")
    private ManagedServiceIdentity identity;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Creates an instance of CloudHsmClusterResource class.
     */
    public CloudHsmClusterResource() {
    }

    /**
     * Get the sku property: SKU details.
     * 
     * @return the sku value.
     */
    public CloudHsmClusterSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: SKU details.
     * 
     * @param sku the sku value to set.
     * @return the CloudHsmClusterResource object itself.
     */
    public CloudHsmClusterResource withSku(CloudHsmClusterSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the identity property: Managed service identity (system assigned and/or user assigned identities).
     * 
     * @return the identity value.
     */
    public ManagedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Managed service identity (system assigned and/or user assigned identities).
     * 
     * @param identity the identity value to set.
     * @return the CloudHsmClusterResource object itself.
     */
    public CloudHsmClusterResource withIdentity(ManagedServiceIdentity identity) {
        this.identity = identity;
        return this;
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
    public CloudHsmClusterResource withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CloudHsmClusterResource withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
    }
}
