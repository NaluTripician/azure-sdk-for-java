// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Status of the mirror relationship.
 */
public final class RelationshipStatus extends ExpandableStringEnum<RelationshipStatus> {
    /**
     * Static value Idle for RelationshipStatus.
     */
    public static final RelationshipStatus IDLE = fromString("Idle");

    /**
     * Static value Transferring for RelationshipStatus.
     */
    public static final RelationshipStatus TRANSFERRING = fromString("Transferring");

    /**
     * Static value Failed for RelationshipStatus.
     */
    public static final RelationshipStatus FAILED = fromString("Failed");

    /**
     * Static value Unknown for RelationshipStatus.
     */
    public static final RelationshipStatus UNKNOWN = fromString("Unknown");

    /**
     * Creates a new instance of RelationshipStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public RelationshipStatus() {
    }

    /**
     * Creates or finds a RelationshipStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding RelationshipStatus.
     */
    @JsonCreator
    public static RelationshipStatus fromString(String name) {
        return fromString(name, RelationshipStatus.class);
    }

    /**
     * Gets known RelationshipStatus values.
     * 
     * @return known RelationshipStatus values.
     */
    public static Collection<RelationshipStatus> values() {
        return values(RelationshipStatus.class);
    }
}
