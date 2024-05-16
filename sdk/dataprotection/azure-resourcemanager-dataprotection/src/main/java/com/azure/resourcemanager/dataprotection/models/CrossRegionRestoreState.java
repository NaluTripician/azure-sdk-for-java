// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * CrossRegionRestore state.
 */
public final class CrossRegionRestoreState extends ExpandableStringEnum<CrossRegionRestoreState> {
    /**
     * Static value Disabled for CrossRegionRestoreState.
     */
    public static final CrossRegionRestoreState DISABLED = fromString("Disabled");

    /**
     * Static value Enabled for CrossRegionRestoreState.
     */
    public static final CrossRegionRestoreState ENABLED = fromString("Enabled");

    /**
     * Creates a new instance of CrossRegionRestoreState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public CrossRegionRestoreState() {
    }

    /**
     * Creates or finds a CrossRegionRestoreState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding CrossRegionRestoreState.
     */
    @JsonCreator
    public static CrossRegionRestoreState fromString(String name) {
        return fromString(name, CrossRegionRestoreState.class);
    }

    /**
     * Gets known CrossRegionRestoreState values.
     * 
     * @return known CrossRegionRestoreState values.
     */
    public static Collection<CrossRegionRestoreState> values() {
        return values(CrossRegionRestoreState.class);
    }
}
