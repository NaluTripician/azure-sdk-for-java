// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The power state of the virtual machine. */
public final class VirtualMachinePowerState extends ExpandableStringEnum<VirtualMachinePowerState> {
    /** Static value On for VirtualMachinePowerState. */
    public static final VirtualMachinePowerState ON = fromString("On");

    /** Static value Off for VirtualMachinePowerState. */
    public static final VirtualMachinePowerState OFF = fromString("Off");

    /**
     * Creates a new instance of VirtualMachinePowerState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public VirtualMachinePowerState() {
    }

    /**
     * Creates or finds a VirtualMachinePowerState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding VirtualMachinePowerState.
     */
    @JsonCreator
    public static VirtualMachinePowerState fromString(String name) {
        return fromString(name, VirtualMachinePowerState.class);
    }

    /**
     * Gets known VirtualMachinePowerState values.
     *
     * @return known VirtualMachinePowerState values.
     */
    public static Collection<VirtualMachinePowerState> values() {
        return values(VirtualMachinePowerState.class);
    }
}
