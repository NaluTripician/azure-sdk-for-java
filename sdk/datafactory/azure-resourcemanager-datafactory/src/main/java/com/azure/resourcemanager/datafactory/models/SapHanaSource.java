// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A copy activity source for SAP HANA source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", defaultImpl = SapHanaSource.class, visible = true)
@JsonTypeName("SapHanaSource")
@Fluent
public final class SapHanaSource extends TabularSource {
    /*
     * Copy source type.
     */
    @JsonTypeId
    @JsonProperty(value = "type", required = true)
    private String type = "SapHanaSource";

    /*
     * SAP HANA Sql query. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "query")
    private Object query;

    /*
     * The packet size of data read from SAP HANA. Type: integer(or Expression with resultType integer).
     */
    @JsonProperty(value = "packetSize")
    private Object packetSize;

    /*
     * The partition mechanism that will be used for SAP HANA read in parallel. Possible values include: "None", "PhysicalPartitionsOfTable", "SapHanaDynamicRange". 
     */
    @JsonProperty(value = "partitionOption")
    private Object partitionOption;

    /*
     * The settings that will be leveraged for SAP HANA source partitioning.
     */
    @JsonProperty(value = "partitionSettings")
    private SapHanaPartitionSettings partitionSettings;

    /**
     * Creates an instance of SapHanaSource class.
     */
    public SapHanaSource() {
    }

    /**
     * Get the type property: Copy source type.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the query property: SAP HANA Sql query. Type: string (or Expression with resultType string).
     * 
     * @return the query value.
     */
    public Object query() {
        return this.query;
    }

    /**
     * Set the query property: SAP HANA Sql query. Type: string (or Expression with resultType string).
     * 
     * @param query the query value to set.
     * @return the SapHanaSource object itself.
     */
    public SapHanaSource withQuery(Object query) {
        this.query = query;
        return this;
    }

    /**
     * Get the packetSize property: The packet size of data read from SAP HANA. Type: integer(or Expression with
     * resultType integer).
     * 
     * @return the packetSize value.
     */
    public Object packetSize() {
        return this.packetSize;
    }

    /**
     * Set the packetSize property: The packet size of data read from SAP HANA. Type: integer(or Expression with
     * resultType integer).
     * 
     * @param packetSize the packetSize value to set.
     * @return the SapHanaSource object itself.
     */
    public SapHanaSource withPacketSize(Object packetSize) {
        this.packetSize = packetSize;
        return this;
    }

    /**
     * Get the partitionOption property: The partition mechanism that will be used for SAP HANA read in parallel.
     * Possible values include: "None", "PhysicalPartitionsOfTable", "SapHanaDynamicRange".
     * 
     * @return the partitionOption value.
     */
    public Object partitionOption() {
        return this.partitionOption;
    }

    /**
     * Set the partitionOption property: The partition mechanism that will be used for SAP HANA read in parallel.
     * Possible values include: "None", "PhysicalPartitionsOfTable", "SapHanaDynamicRange".
     * 
     * @param partitionOption the partitionOption value to set.
     * @return the SapHanaSource object itself.
     */
    public SapHanaSource withPartitionOption(Object partitionOption) {
        this.partitionOption = partitionOption;
        return this;
    }

    /**
     * Get the partitionSettings property: The settings that will be leveraged for SAP HANA source partitioning.
     * 
     * @return the partitionSettings value.
     */
    public SapHanaPartitionSettings partitionSettings() {
        return this.partitionSettings;
    }

    /**
     * Set the partitionSettings property: The settings that will be leveraged for SAP HANA source partitioning.
     * 
     * @param partitionSettings the partitionSettings value to set.
     * @return the SapHanaSource object itself.
     */
    public SapHanaSource withPartitionSettings(SapHanaPartitionSettings partitionSettings) {
        this.partitionSettings = partitionSettings;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapHanaSource withQueryTimeout(Object queryTimeout) {
        super.withQueryTimeout(queryTimeout);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapHanaSource withAdditionalColumns(Object additionalColumns) {
        super.withAdditionalColumns(additionalColumns);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapHanaSource withSourceRetryCount(Object sourceRetryCount) {
        super.withSourceRetryCount(sourceRetryCount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapHanaSource withSourceRetryWait(Object sourceRetryWait) {
        super.withSourceRetryWait(sourceRetryWait);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapHanaSource withMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.withMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapHanaSource withDisableMetricsCollection(Object disableMetricsCollection) {
        super.withDisableMetricsCollection(disableMetricsCollection);
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
        if (partitionSettings() != null) {
            partitionSettings().validate();
        }
    }
}
