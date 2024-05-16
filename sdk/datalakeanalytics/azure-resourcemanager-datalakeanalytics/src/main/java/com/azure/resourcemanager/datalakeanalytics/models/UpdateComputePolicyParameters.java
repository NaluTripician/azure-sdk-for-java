// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.datalakeanalytics.fluent.models.UpdateComputePolicyProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/** The parameters used to update a compute policy. */
@Fluent
public final class UpdateComputePolicyParameters {
    /*
     * The compute policy properties to use when updating a compute policy.
     */
    @JsonProperty(value = "properties")
    private UpdateComputePolicyProperties innerProperties;

    /** Creates an instance of UpdateComputePolicyParameters class. */
    public UpdateComputePolicyParameters() {
    }

    /**
     * Get the innerProperties property: The compute policy properties to use when updating a compute policy.
     *
     * @return the innerProperties value.
     */
    private UpdateComputePolicyProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the objectId property: The AAD object identifier for the entity to create a policy for.
     *
     * @return the objectId value.
     */
    public UUID objectId() {
        return this.innerProperties() == null ? null : this.innerProperties().objectId();
    }

    /**
     * Set the objectId property: The AAD object identifier for the entity to create a policy for.
     *
     * @param objectId the objectId value to set.
     * @return the UpdateComputePolicyParameters object itself.
     */
    public UpdateComputePolicyParameters withObjectId(UUID objectId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new UpdateComputePolicyProperties();
        }
        this.innerProperties().withObjectId(objectId);
        return this;
    }

    /**
     * Get the objectType property: The type of AAD object the object identifier refers to.
     *
     * @return the objectType value.
     */
    public AadObjectType objectType() {
        return this.innerProperties() == null ? null : this.innerProperties().objectType();
    }

    /**
     * Set the objectType property: The type of AAD object the object identifier refers to.
     *
     * @param objectType the objectType value to set.
     * @return the UpdateComputePolicyParameters object itself.
     */
    public UpdateComputePolicyParameters withObjectType(AadObjectType objectType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new UpdateComputePolicyProperties();
        }
        this.innerProperties().withObjectType(objectType);
        return this;
    }

    /**
     * Get the maxDegreeOfParallelismPerJob property: The maximum degree of parallelism per job this user can use to
     * submit jobs. This property, the min priority per job property, or both must be passed.
     *
     * @return the maxDegreeOfParallelismPerJob value.
     */
    public Integer maxDegreeOfParallelismPerJob() {
        return this.innerProperties() == null ? null : this.innerProperties().maxDegreeOfParallelismPerJob();
    }

    /**
     * Set the maxDegreeOfParallelismPerJob property: The maximum degree of parallelism per job this user can use to
     * submit jobs. This property, the min priority per job property, or both must be passed.
     *
     * @param maxDegreeOfParallelismPerJob the maxDegreeOfParallelismPerJob value to set.
     * @return the UpdateComputePolicyParameters object itself.
     */
    public UpdateComputePolicyParameters withMaxDegreeOfParallelismPerJob(Integer maxDegreeOfParallelismPerJob) {
        if (this.innerProperties() == null) {
            this.innerProperties = new UpdateComputePolicyProperties();
        }
        this.innerProperties().withMaxDegreeOfParallelismPerJob(maxDegreeOfParallelismPerJob);
        return this;
    }

    /**
     * Get the minPriorityPerJob property: The minimum priority per job this user can use to submit jobs. This property,
     * the max degree of parallelism per job property, or both must be passed.
     *
     * @return the minPriorityPerJob value.
     */
    public Integer minPriorityPerJob() {
        return this.innerProperties() == null ? null : this.innerProperties().minPriorityPerJob();
    }

    /**
     * Set the minPriorityPerJob property: The minimum priority per job this user can use to submit jobs. This property,
     * the max degree of parallelism per job property, or both must be passed.
     *
     * @param minPriorityPerJob the minPriorityPerJob value to set.
     * @return the UpdateComputePolicyParameters object itself.
     */
    public UpdateComputePolicyParameters withMinPriorityPerJob(Integer minPriorityPerJob) {
        if (this.innerProperties() == null) {
            this.innerProperties = new UpdateComputePolicyProperties();
        }
        this.innerProperties().withMinPriorityPerJob(minPriorityPerJob);
        return this;
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
