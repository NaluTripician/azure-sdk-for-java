// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The provisioning state of the virtual machine console. */
public final class ConsoleProvisioningState extends ExpandableStringEnum<ConsoleProvisioningState> {
    /** Static value Succeeded for ConsoleProvisioningState. */
    public static final ConsoleProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for ConsoleProvisioningState. */
    public static final ConsoleProvisioningState FAILED = fromString("Failed");

    /** Static value Canceled for ConsoleProvisioningState. */
    public static final ConsoleProvisioningState CANCELED = fromString("Canceled");

    /** Static value Provisioning for ConsoleProvisioningState. */
    public static final ConsoleProvisioningState PROVISIONING = fromString("Provisioning");

    /** Static value Accepted for ConsoleProvisioningState. */
    public static final ConsoleProvisioningState ACCEPTED = fromString("Accepted");

    /**
     * Creates a new instance of ConsoleProvisioningState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ConsoleProvisioningState() {
    }

    /**
     * Creates or finds a ConsoleProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ConsoleProvisioningState.
     */
    @JsonCreator
    public static ConsoleProvisioningState fromString(String name) {
        return fromString(name, ConsoleProvisioningState.class);
    }

    /**
     * Gets known ConsoleProvisioningState values.
     *
     * @return known ConsoleProvisioningState values.
     */
    public static Collection<ConsoleProvisioningState> values() {
        return values(ConsoleProvisioningState.class);
    }
}
