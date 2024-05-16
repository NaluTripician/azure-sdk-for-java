// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Set VM DRS-driven movement to restricted (enabled) or not (disabled). */
@Fluent
public final class VirtualMachineRestrictMovement {
    /*
     * Whether VM DRS-driven movement is restricted (enabled) or not (disabled)
     */
    @JsonProperty(value = "restrictMovement")
    private VirtualMachineRestrictMovementState restrictMovement;

    /** Creates an instance of VirtualMachineRestrictMovement class. */
    public VirtualMachineRestrictMovement() {
    }

    /**
     * Get the restrictMovement property: Whether VM DRS-driven movement is restricted (enabled) or not (disabled).
     *
     * @return the restrictMovement value.
     */
    public VirtualMachineRestrictMovementState restrictMovement() {
        return this.restrictMovement;
    }

    /**
     * Set the restrictMovement property: Whether VM DRS-driven movement is restricted (enabled) or not (disabled).
     *
     * @param restrictMovement the restrictMovement value to set.
     * @return the VirtualMachineRestrictMovement object itself.
     */
    public VirtualMachineRestrictMovement withRestrictMovement(VirtualMachineRestrictMovementState restrictMovement) {
        this.restrictMovement = restrictMovement;
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
