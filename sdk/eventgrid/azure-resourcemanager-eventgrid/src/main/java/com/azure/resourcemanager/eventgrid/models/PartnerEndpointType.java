// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PartnerEndpointType. */
public final class PartnerEndpointType extends ExpandableStringEnum<PartnerEndpointType> {
    /** Static value WebHook for PartnerEndpointType. */
    public static final PartnerEndpointType WEB_HOOK = fromString("WebHook");

    /**
     * Creates or finds a PartnerEndpointType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PartnerEndpointType.
     */
    @JsonCreator
    public static PartnerEndpointType fromString(String name) {
        return fromString(name, PartnerEndpointType.class);
    }

    /** @return known PartnerEndpointType values. */
    public static Collection<PartnerEndpointType> values() {
        return values(PartnerEndpointType.class);
    }
}
