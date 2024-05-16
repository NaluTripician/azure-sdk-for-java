// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Parameters to be used during configuration of backup of blobs.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("BlobBackupDatasourceParameters")
@Fluent
public final class BlobBackupDatasourceParameters extends BackupDatasourceParameters {
    /*
     * List of containers to be backed up during configuration of backup of blobs
     */
    @JsonProperty(value = "containersList", required = true)
    private List<String> containersList;

    /**
     * Creates an instance of BlobBackupDatasourceParameters class.
     */
    public BlobBackupDatasourceParameters() {
    }

    /**
     * Get the containersList property: List of containers to be backed up during configuration of backup of blobs.
     * 
     * @return the containersList value.
     */
    public List<String> containersList() {
        return this.containersList;
    }

    /**
     * Set the containersList property: List of containers to be backed up during configuration of backup of blobs.
     * 
     * @param containersList the containersList value to set.
     * @return the BlobBackupDatasourceParameters object itself.
     */
    public BlobBackupDatasourceParameters withContainersList(List<String> containersList) {
        this.containersList = containersList;
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
        if (containersList() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property containersList in model BlobBackupDatasourceParameters"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(BlobBackupDatasourceParameters.class);
}
