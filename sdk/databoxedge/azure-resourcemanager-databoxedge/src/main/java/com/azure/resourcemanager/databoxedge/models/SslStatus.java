// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Signifies whether SSL needs to be enabled or not. */
public final class SslStatus extends ExpandableStringEnum<SslStatus> {
    /** Static value Enabled for SslStatus. */
    public static final SslStatus ENABLED = fromString("Enabled");

    /** Static value Disabled for SslStatus. */
    public static final SslStatus DISABLED = fromString("Disabled");

    /**
     * Creates a new instance of SslStatus value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SslStatus() {
    }

    /**
     * Creates or finds a SslStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SslStatus.
     */
    @JsonCreator
    public static SslStatus fromString(String name) {
        return fromString(name, SslStatus.class);
    }

    /**
     * Gets known SslStatus values.
     *
     * @return known SslStatus values.
     */
    public static Collection<SslStatus> values() {
        return values(SslStatus.class);
    }
}
