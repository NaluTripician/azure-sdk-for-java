// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The resource types. */
public final class ResourceType extends ExpandableStringEnum<ResourceType> {
    /** Static value standard for ResourceType. */
    public static final ResourceType STANDARD = fromString("standard");

    /** Static value dedicated for ResourceType. */
    public static final ResourceType DEDICATED = fromString("dedicated");

    /** Static value lowPriority for ResourceType. */
    public static final ResourceType LOW_PRIORITY = fromString("lowPriority");

    /** Static value shared for ResourceType. */
    public static final ResourceType SHARED = fromString("shared");

    /** Static value serviceSpecific for ResourceType. */
    public static final ResourceType SERVICE_SPECIFIC = fromString("serviceSpecific");

    /**
     * Creates a new instance of ResourceType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ResourceType() {
    }

    /**
     * Creates or finds a ResourceType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ResourceType.
     */
    @JsonCreator
    public static ResourceType fromString(String name) {
        return fromString(name, ResourceType.class);
    }

    /**
     * Gets known ResourceType values.
     *
     * @return known ResourceType values.
     */
    public static Collection<ResourceType> values() {
        return values(ResourceType.class);
    }
}
