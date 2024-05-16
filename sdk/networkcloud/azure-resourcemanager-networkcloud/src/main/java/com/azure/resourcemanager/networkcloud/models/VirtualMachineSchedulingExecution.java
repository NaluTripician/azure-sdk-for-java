// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The indicator of whether the hint is a hard or soft requirement during scheduling. */
public final class VirtualMachineSchedulingExecution extends ExpandableStringEnum<VirtualMachineSchedulingExecution> {
    /** Static value Hard for VirtualMachineSchedulingExecution. */
    public static final VirtualMachineSchedulingExecution HARD = fromString("Hard");

    /** Static value Soft for VirtualMachineSchedulingExecution. */
    public static final VirtualMachineSchedulingExecution SOFT = fromString("Soft");

    /**
     * Creates a new instance of VirtualMachineSchedulingExecution value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public VirtualMachineSchedulingExecution() {
    }

    /**
     * Creates or finds a VirtualMachineSchedulingExecution from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding VirtualMachineSchedulingExecution.
     */
    @JsonCreator
    public static VirtualMachineSchedulingExecution fromString(String name) {
        return fromString(name, VirtualMachineSchedulingExecution.class);
    }

    /**
     * Gets known VirtualMachineSchedulingExecution values.
     *
     * @return known VirtualMachineSchedulingExecution values.
     */
    public static Collection<VirtualMachineSchedulingExecution> values() {
        return values(VirtualMachineSchedulingExecution.class);
    }
}
