// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.elasticsan.models.ProvisioningStates;
import com.azure.resourcemanager.elasticsan.models.SnapshotCreationData;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties for Snapshot.
 */
@Fluent
public final class SnapshotProperties {
    /*
     * Data used when creating a volume snapshot.
     */
    @JsonProperty(value = "creationData", required = true)
    private SnapshotCreationData creationData;

    /*
     * State of the operation on the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningStates provisioningState;

    /*
     * Size of Source Volume
     */
    @JsonProperty(value = "sourceVolumeSizeGiB", access = JsonProperty.Access.WRITE_ONLY)
    private Long sourceVolumeSizeGiB;

    /*
     * Source Volume Name of a snapshot
     */
    @JsonProperty(value = "volumeName", access = JsonProperty.Access.WRITE_ONLY)
    private String volumeName;

    /**
     * Creates an instance of SnapshotProperties class.
     */
    public SnapshotProperties() {
    }

    /**
     * Get the creationData property: Data used when creating a volume snapshot.
     * 
     * @return the creationData value.
     */
    public SnapshotCreationData creationData() {
        return this.creationData;
    }

    /**
     * Set the creationData property: Data used when creating a volume snapshot.
     * 
     * @param creationData the creationData value to set.
     * @return the SnapshotProperties object itself.
     */
    public SnapshotProperties withCreationData(SnapshotCreationData creationData) {
        this.creationData = creationData;
        return this;
    }

    /**
     * Get the provisioningState property: State of the operation on the resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningStates provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the sourceVolumeSizeGiB property: Size of Source Volume.
     * 
     * @return the sourceVolumeSizeGiB value.
     */
    public Long sourceVolumeSizeGiB() {
        return this.sourceVolumeSizeGiB;
    }

    /**
     * Get the volumeName property: Source Volume Name of a snapshot.
     * 
     * @return the volumeName value.
     */
    public String volumeName() {
        return this.volumeName;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (creationData() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property creationData in model SnapshotProperties"));
        } else {
            creationData().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SnapshotProperties.class);
}
