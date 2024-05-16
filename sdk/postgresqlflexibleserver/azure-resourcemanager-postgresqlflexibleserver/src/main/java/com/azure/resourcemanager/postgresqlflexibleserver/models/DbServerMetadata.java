// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Database server metadata.
 */
@Fluent
public final class DbServerMetadata {
    /*
     * Location of database server
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /*
     * Version for database engine
     */
    @JsonProperty(value = "version")
    private String version;

    /*
     * Storage size in MB for database server
     */
    @JsonProperty(value = "storageMb")
    private Integer storageMb;

    /*
     * SKU for the database server. This object is empty for PG single server
     */
    @JsonProperty(value = "sku")
    private ServerSku sku;

    /**
     * Creates an instance of DbServerMetadata class.
     */
    public DbServerMetadata() {
    }

    /**
     * Get the location property: Location of database server.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the version property: Version for database engine.
     * 
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: Version for database engine.
     * 
     * @param version the version value to set.
     * @return the DbServerMetadata object itself.
     */
    public DbServerMetadata withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the storageMb property: Storage size in MB for database server.
     * 
     * @return the storageMb value.
     */
    public Integer storageMb() {
        return this.storageMb;
    }

    /**
     * Set the storageMb property: Storage size in MB for database server.
     * 
     * @param storageMb the storageMb value to set.
     * @return the DbServerMetadata object itself.
     */
    public DbServerMetadata withStorageMb(Integer storageMb) {
        this.storageMb = storageMb;
        return this;
    }

    /**
     * Get the sku property: SKU for the database server. This object is empty for PG single server.
     * 
     * @return the sku value.
     */
    public ServerSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: SKU for the database server. This object is empty for PG single server.
     * 
     * @param sku the sku value to set.
     * @return the DbServerMetadata object itself.
     */
    public DbServerMetadata withSku(ServerSku sku) {
        this.sku = sku;
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
    }
}
