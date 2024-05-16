// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Billing information related properties of a server.
 */
@Fluent
public final class MySqlServerSku {
    /*
     * The name of the sku, e.g. Standard_D32s_v3.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The tier of the particular SKU, e.g. GeneralPurpose.
     */
    @JsonProperty(value = "tier", required = true)
    private ServerSkuTier tier;

    /**
     * Creates an instance of MySqlServerSku class.
     */
    public MySqlServerSku() {
    }

    /**
     * Get the name property: The name of the sku, e.g. Standard_D32s_v3.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the sku, e.g. Standard_D32s_v3.
     * 
     * @param name the name value to set.
     * @return the MySqlServerSku object itself.
     */
    public MySqlServerSku withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier property: The tier of the particular SKU, e.g. GeneralPurpose.
     * 
     * @return the tier value.
     */
    public ServerSkuTier tier() {
        return this.tier;
    }

    /**
     * Set the tier property: The tier of the particular SKU, e.g. GeneralPurpose.
     * 
     * @param tier the tier value to set.
     * @return the MySqlServerSku object itself.
     */
    public MySqlServerSku withTier(ServerSkuTier tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property name in model MySqlServerSku"));
        }
        if (tier() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property tier in model MySqlServerSku"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MySqlServerSku.class);
}
