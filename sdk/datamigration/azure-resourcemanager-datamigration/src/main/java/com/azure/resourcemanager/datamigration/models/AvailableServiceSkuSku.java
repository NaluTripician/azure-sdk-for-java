// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SKU name, tier, etc. */
@Fluent
public final class AvailableServiceSkuSku {
    /*
     * The name of the SKU
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * SKU family
     */
    @JsonProperty(value = "family")
    private String family;

    /*
     * SKU size
     */
    @JsonProperty(value = "size")
    private String size;

    /*
     * The tier of the SKU, such as "Free", "Basic", "Standard", or "Premium"
     */
    @JsonProperty(value = "tier")
    private String tier;

    /** Creates an instance of AvailableServiceSkuSku class. */
    public AvailableServiceSkuSku() {
    }

    /**
     * Get the name property: The name of the SKU.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the SKU.
     *
     * @param name the name value to set.
     * @return the AvailableServiceSkuSku object itself.
     */
    public AvailableServiceSkuSku withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the family property: SKU family.
     *
     * @return the family value.
     */
    public String family() {
        return this.family;
    }

    /**
     * Set the family property: SKU family.
     *
     * @param family the family value to set.
     * @return the AvailableServiceSkuSku object itself.
     */
    public AvailableServiceSkuSku withFamily(String family) {
        this.family = family;
        return this;
    }

    /**
     * Get the size property: SKU size.
     *
     * @return the size value.
     */
    public String size() {
        return this.size;
    }

    /**
     * Set the size property: SKU size.
     *
     * @param size the size value to set.
     * @return the AvailableServiceSkuSku object itself.
     */
    public AvailableServiceSkuSku withSize(String size) {
        this.size = size;
        return this;
    }

    /**
     * Get the tier property: The tier of the SKU, such as "Free", "Basic", "Standard", or "Premium".
     *
     * @return the tier value.
     */
    public String tier() {
        return this.tier;
    }

    /**
     * Set the tier property: The tier of the SKU, such as "Free", "Basic", "Standard", or "Premium".
     *
     * @param tier the tier value to set.
     * @return the AvailableServiceSkuSku object itself.
     */
    public AvailableServiceSkuSku withTier(String tier) {
        this.tier = tier;
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
