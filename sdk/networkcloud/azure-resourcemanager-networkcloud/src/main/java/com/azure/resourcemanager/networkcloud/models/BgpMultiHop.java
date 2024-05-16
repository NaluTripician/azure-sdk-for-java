// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The indicator to enable multi-hop peering support. */
public final class BgpMultiHop extends ExpandableStringEnum<BgpMultiHop> {
    /** Static value True for BgpMultiHop. */
    public static final BgpMultiHop TRUE = fromString("True");

    /** Static value False for BgpMultiHop. */
    public static final BgpMultiHop FALSE = fromString("False");

    /**
     * Creates a new instance of BgpMultiHop value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public BgpMultiHop() {
    }

    /**
     * Creates or finds a BgpMultiHop from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding BgpMultiHop.
     */
    @JsonCreator
    public static BgpMultiHop fromString(String name) {
        return fromString(name, BgpMultiHop.class);
    }

    /**
     * Gets known BgpMultiHop values.
     *
     * @return known BgpMultiHop values.
     */
    public static Collection<BgpMultiHop> values() {
        return values(BgpMultiHop.class);
    }
}
