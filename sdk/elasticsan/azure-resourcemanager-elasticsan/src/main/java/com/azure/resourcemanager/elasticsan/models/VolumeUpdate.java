// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.elasticsan.fluent.models.VolumeUpdateProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response for Volume request.
 */
@Fluent
public final class VolumeUpdate {
    /*
     * Properties of Volume.
     */
    @JsonProperty(value = "properties")
    private VolumeUpdateProperties innerProperties;

    /**
     * Creates an instance of VolumeUpdate class.
     */
    public VolumeUpdate() {
    }

    /**
     * Get the innerProperties property: Properties of Volume.
     * 
     * @return the innerProperties value.
     */
    private VolumeUpdateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the sizeGiB property: Volume size.
     * 
     * @return the sizeGiB value.
     */
    public Long sizeGiB() {
        return this.innerProperties() == null ? null : this.innerProperties().sizeGiB();
    }

    /**
     * Set the sizeGiB property: Volume size.
     * 
     * @param sizeGiB the sizeGiB value to set.
     * @return the VolumeUpdate object itself.
     */
    public VolumeUpdate withSizeGiB(Long sizeGiB) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeUpdateProperties();
        }
        this.innerProperties().withSizeGiB(sizeGiB);
        return this;
    }

    /**
     * Get the managedBy property: Parent resource information.
     * 
     * @return the managedBy value.
     */
    public ManagedByInfo managedBy() {
        return this.innerProperties() == null ? null : this.innerProperties().managedBy();
    }

    /**
     * Set the managedBy property: Parent resource information.
     * 
     * @param managedBy the managedBy value to set.
     * @return the VolumeUpdate object itself.
     */
    public VolumeUpdate withManagedBy(ManagedByInfo managedBy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeUpdateProperties();
        }
        this.innerProperties().withManagedBy(managedBy);
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
