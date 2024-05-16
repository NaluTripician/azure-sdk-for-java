// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The validation state of the ASN associated with the peer. */
public final class ValidationState extends ExpandableStringEnum<ValidationState> {
    /** Static value None for ValidationState. */
    public static final ValidationState NONE = fromString("None");

    /** Static value Pending for ValidationState. */
    public static final ValidationState PENDING = fromString("Pending");

    /** Static value Approved for ValidationState. */
    public static final ValidationState APPROVED = fromString("Approved");

    /** Static value Failed for ValidationState. */
    public static final ValidationState FAILED = fromString("Failed");

    /**
     * Creates a new instance of ValidationState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ValidationState() {
    }

    /**
     * Creates or finds a ValidationState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ValidationState.
     */
    @JsonCreator
    public static ValidationState fromString(String name) {
        return fromString(name, ValidationState.class);
    }

    /**
     * Gets known ValidationState values.
     *
     * @return known ValidationState values.
     */
    public static Collection<ValidationState> values() {
        return values(ValidationState.class);
    }
}
