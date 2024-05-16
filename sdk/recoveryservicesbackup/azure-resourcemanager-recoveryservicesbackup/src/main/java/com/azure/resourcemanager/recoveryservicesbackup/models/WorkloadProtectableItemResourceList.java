// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.WorkloadProtectableItemResourceInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * List of WorkloadProtectableItem resources.
 */
@Fluent
public final class WorkloadProtectableItemResourceList extends ResourceList {
    /*
     * List of resources.
     */
    @JsonProperty(value = "value")
    private List<WorkloadProtectableItemResourceInner> value;

    /**
     * Creates an instance of WorkloadProtectableItemResourceList class.
     */
    public WorkloadProtectableItemResourceList() {
    }

    /**
     * Get the value property: List of resources.
     * 
     * @return the value value.
     */
    public List<WorkloadProtectableItemResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of resources.
     * 
     * @param value the value value to set.
     * @return the WorkloadProtectableItemResourceList object itself.
     */
    public WorkloadProtectableItemResourceList withValue(List<WorkloadProtectableItemResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WorkloadProtectableItemResourceList withNextLink(String nextLink) {
        super.withNextLink(nextLink);
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
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
