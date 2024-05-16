// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The status of a UpdateStage.
 */
@Immutable
public final class UpdateStageStatus {
    /*
     * The status of the UpdateStage.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private UpdateStatus status;

    /*
     * The name of the UpdateStage.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The list of groups to be updated as part of this UpdateStage.
     */
    @JsonProperty(value = "groups", access = JsonProperty.Access.WRITE_ONLY)
    private List<UpdateGroupStatus> groups;

    /*
     * The status of the wait period configured on the UpdateStage.
     */
    @JsonProperty(value = "afterStageWaitStatus", access = JsonProperty.Access.WRITE_ONLY)
    private WaitStatus afterStageWaitStatus;

    /**
     * Creates an instance of UpdateStageStatus class.
     */
    public UpdateStageStatus() {
    }

    /**
     * Get the status property: The status of the UpdateStage.
     * 
     * @return the status value.
     */
    public UpdateStatus status() {
        return this.status;
    }

    /**
     * Get the name property: The name of the UpdateStage.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the groups property: The list of groups to be updated as part of this UpdateStage.
     * 
     * @return the groups value.
     */
    public List<UpdateGroupStatus> groups() {
        return this.groups;
    }

    /**
     * Get the afterStageWaitStatus property: The status of the wait period configured on the UpdateStage.
     * 
     * @return the afterStageWaitStatus value.
     */
    public WaitStatus afterStageWaitStatus() {
        return this.afterStageWaitStatus;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (status() != null) {
            status().validate();
        }
        if (groups() != null) {
            groups().forEach(e -> e.validate());
        }
        if (afterStageWaitStatus() != null) {
            afterStageWaitStatus().validate();
        }
    }
}
