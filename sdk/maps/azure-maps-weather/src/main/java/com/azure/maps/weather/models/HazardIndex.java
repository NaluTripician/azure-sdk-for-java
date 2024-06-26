// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.weather.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * A severity/hazard index. * `0` - No hazard. * `1` - Be informed, be aware. * `2` - Pay attention, be prepared. * `3`
 * - Take action. * `4` - Life threatening, emergency.
 */
public final class HazardIndex extends ExpandableStringEnum<HazardIndex> {
    /** Static value 0 for HazardIndex. */
    public static final HazardIndex NO_HAZARD = fromInt(0);

    /** Static value 1 for HazardIndex. */
    public static final HazardIndex INFORMED = fromInt(1);

    /** Static value 2 for HazardIndex. */
    public static final HazardIndex PAY_ATTENTION = fromInt(2);

    /** Static value 3 for HazardIndex. */
    public static final HazardIndex TAKE_ACTION = fromInt(3);

    /** Static value 4 for HazardIndex. */
    public static final HazardIndex EMERGENCY = fromInt(4);

    /**
     * Creates or finds a HazardIndex from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding HazardIndex.
     */
    @JsonCreator
    public static HazardIndex fromInt(int name) {
        return fromString(String.valueOf(name), HazardIndex.class);
    }

    /**
     * Gets known HazardIndex values.
     *
     * @return known HazardIndex values.
     */
    public static Collection<HazardIndex> values() {
        return values(HazardIndex.class);
    }
}
