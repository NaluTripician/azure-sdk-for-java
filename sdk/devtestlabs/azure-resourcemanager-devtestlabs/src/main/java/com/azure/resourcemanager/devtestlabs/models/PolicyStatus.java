// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The status of the policy. */
public final class PolicyStatus extends ExpandableStringEnum<PolicyStatus> {
    /** Static value Enabled for PolicyStatus. */
    public static final PolicyStatus ENABLED = fromString("Enabled");

    /** Static value Disabled for PolicyStatus. */
    public static final PolicyStatus DISABLED = fromString("Disabled");

    /**
     * Creates a new instance of PolicyStatus value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PolicyStatus() {
    }

    /**
     * Creates or finds a PolicyStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PolicyStatus.
     */
    @JsonCreator
    public static PolicyStatus fromString(String name) {
        return fromString(name, PolicyStatus.class);
    }

    /**
     * Gets known PolicyStatus values.
     *
     * @return known PolicyStatus values.
     */
    public static Collection<PolicyStatus> values() {
        return values(PolicyStatus.class);
    }
}
