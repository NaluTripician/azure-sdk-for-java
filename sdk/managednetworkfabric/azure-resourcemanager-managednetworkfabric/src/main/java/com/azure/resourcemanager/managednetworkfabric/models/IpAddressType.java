// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** IP Address type. */
public final class IpAddressType extends ExpandableStringEnum<IpAddressType> {
    /** Static value IPv4 for IpAddressType. */
    public static final IpAddressType IPV4 = fromString("IPv4");

    /** Static value IPv6 for IpAddressType. */
    public static final IpAddressType IPV6 = fromString("IPv6");

    /**
     * Creates a new instance of IpAddressType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public IpAddressType() {
    }

    /**
     * Creates or finds a IpAddressType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding IpAddressType.
     */
    @JsonCreator
    public static IpAddressType fromString(String name) {
        return fromString(name, IpAddressType.class);
    }

    /**
     * Gets known IpAddressType values.
     *
     * @return known IpAddressType values.
     */
    public static Collection<IpAddressType> values() {
        return values(IpAddressType.class);
    }
}
