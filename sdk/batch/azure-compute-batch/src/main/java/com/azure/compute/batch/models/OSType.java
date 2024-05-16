// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * OSType enums.
 */
public final class OSType extends ExpandableStringEnum<OSType> {

    /**
     * The Linux operating system.
     */
    @Generated
    public static final OSType LINUX = fromString("linux");

    /**
     * The Windows operating system.
     */
    @Generated
    public static final OSType WINDOWS = fromString("windows");

    /**
     * Creates a new instance of OSType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public OSType() {
    }

    /**
     * Creates or finds a OSType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OSType.
     */
    @Generated
    public static OSType fromString(String name) {
        return fromString(name, OSType.class);
    }

    /**
     * Gets known OSType values.
     *
     * @return known OSType values.
     */
    @Generated
    public static Collection<OSType> values() {
        return values(OSType.class);
    }
}
