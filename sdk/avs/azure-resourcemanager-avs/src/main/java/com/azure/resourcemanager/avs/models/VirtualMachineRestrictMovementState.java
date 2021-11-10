// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for VirtualMachineRestrictMovementState. */
public final class VirtualMachineRestrictMovementState
    extends ExpandableStringEnum<VirtualMachineRestrictMovementState> {
    /** Static value Enabled for VirtualMachineRestrictMovementState. */
    public static final VirtualMachineRestrictMovementState ENABLED = fromString("Enabled");

    /** Static value Disabled for VirtualMachineRestrictMovementState. */
    public static final VirtualMachineRestrictMovementState DISABLED = fromString("Disabled");

    /**
     * Creates or finds a VirtualMachineRestrictMovementState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding VirtualMachineRestrictMovementState.
     */
    @JsonCreator
    public static VirtualMachineRestrictMovementState fromString(String name) {
        return fromString(name, VirtualMachineRestrictMovementState.class);
    }

    /** @return known VirtualMachineRestrictMovementState values. */
    public static Collection<VirtualMachineRestrictMovementState> values() {
        return values(VirtualMachineRestrictMovementState.class);
    }
}
