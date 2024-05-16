// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Gets or sets the state of the runbook. */
public final class RunbookState extends ExpandableStringEnum<RunbookState> {
    /** Static value New for RunbookState. */
    public static final RunbookState NEW = fromString("New");

    /** Static value Edit for RunbookState. */
    public static final RunbookState EDIT = fromString("Edit");

    /** Static value Published for RunbookState. */
    public static final RunbookState PUBLISHED = fromString("Published");

    /**
     * Creates or finds a RunbookState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RunbookState.
     */
    @JsonCreator
    public static RunbookState fromString(String name) {
        return fromString(name, RunbookState.class);
    }

    /**
     * Gets known RunbookState values.
     *
     * @return known RunbookState values.
     */
    public static Collection<RunbookState> values() {
        return values(RunbookState.class);
    }
}
