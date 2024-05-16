// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceprovisioningservices.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** List of possible provisioning service SKUs. */
@Fluent
public final class IotDpsSkuInfo {
    /*
     * Sku name.
     */
    @JsonProperty(value = "name")
    private IotDpsSku name;

    /*
     * Pricing tier name of the provisioning service.
     */
    @JsonProperty(value = "tier", access = JsonProperty.Access.WRITE_ONLY)
    private String tier;

    /*
     * The number of units to provision
     */
    @JsonProperty(value = "capacity")
    private Long capacity;

    /**
     * Get the name property: Sku name.
     *
     * @return the name value.
     */
    public IotDpsSku name() {
        return this.name;
    }

    /**
     * Set the name property: Sku name.
     *
     * @param name the name value to set.
     * @return the IotDpsSkuInfo object itself.
     */
    public IotDpsSkuInfo withName(IotDpsSku name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier property: Pricing tier name of the provisioning service.
     *
     * @return the tier value.
     */
    public String tier() {
        return this.tier;
    }

    /**
     * Get the capacity property: The number of units to provision.
     *
     * @return the capacity value.
     */
    public Long capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity property: The number of units to provision.
     *
     * @param capacity the capacity value to set.
     * @return the IotDpsSkuInfo object itself.
     */
    public IotDpsSkuInfo withCapacity(Long capacity) {
        this.capacity = capacity;
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
