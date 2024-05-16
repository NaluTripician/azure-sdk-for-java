// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The security level. */
public final class SecurityLevel extends ExpandableStringEnum<SecurityLevel> {
    /** Static value Unknown for SecurityLevel. */
    public static final SecurityLevel UNKNOWN = fromString("Unknown");

    /** Static value SL150 for SecurityLevel. */
    public static final SecurityLevel SL150 = fromString("SL150");

    /** Static value SL2000 for SecurityLevel. */
    public static final SecurityLevel SL2000 = fromString("SL2000");

    /** Static value SL3000 for SecurityLevel. */
    public static final SecurityLevel SL3000 = fromString("SL3000");

    /**
     * Creates a new instance of SecurityLevel value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SecurityLevel() {
    }

    /**
     * Creates or finds a SecurityLevel from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SecurityLevel.
     */
    @JsonCreator
    public static SecurityLevel fromString(String name) {
        return fromString(name, SecurityLevel.class);
    }

    /**
     * Gets known SecurityLevel values.
     *
     * @return known SecurityLevel values.
     */
    public static Collection<SecurityLevel> values() {
        return values(SecurityLevel.class);
    }
}
