// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The status of the hybrid machine agent.
 */
public final class StatusTypes extends ExpandableStringEnum<StatusTypes> {
    /**
     * Static value Connected for StatusTypes.
     */
    public static final StatusTypes CONNECTED = fromString("Connected");

    /**
     * Static value Disconnected for StatusTypes.
     */
    public static final StatusTypes DISCONNECTED = fromString("Disconnected");

    /**
     * Static value Error for StatusTypes.
     */
    public static final StatusTypes ERROR = fromString("Error");

    /**
     * Creates a new instance of StatusTypes value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public StatusTypes() {
    }

    /**
     * Creates or finds a StatusTypes from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding StatusTypes.
     */
    @JsonCreator
    public static StatusTypes fromString(String name) {
        return fromString(name, StatusTypes.class);
    }

    /**
     * Gets known StatusTypes values.
     * 
     * @return known StatusTypes values.
     */
    public static Collection<StatusTypes> values() {
        return values(StatusTypes.class);
    }
}
