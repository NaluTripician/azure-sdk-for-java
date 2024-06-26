// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.weather.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Quarter of the day. */
public final class DayQuarter extends ExpandableStringEnum<DayQuarter> {
    /** Static value 0 for DayQuarter. */
    public static final DayQuarter FIRST_QUARTER = fromInt(0);

    /** Static value 1 for DayQuarter. */
    public static final DayQuarter SECOND_QUARTER = fromInt(1);

    /** Static value 2 for DayQuarter. */
    public static final DayQuarter THIRD_QUARTER = fromInt(2);

    /** Static value 3 for DayQuarter. */
    public static final DayQuarter FORTH_QUARTER = fromInt(3);

    /**
     * Creates or finds a DayQuarter from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DayQuarter.
     */
    @JsonCreator
    public static DayQuarter fromInt(int name) {
        return fromString(String.valueOf(name), DayQuarter.class);
    }

    /**
     * Gets known DayQuarter values.
     *
     * @return known DayQuarter values.
     */
    public static Collection<DayQuarter> values() {
        return values(DayQuarter.class);
    }
}
