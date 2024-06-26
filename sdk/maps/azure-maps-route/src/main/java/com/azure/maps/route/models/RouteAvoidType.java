// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.route.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RouteAvoidType. */
public final class RouteAvoidType extends ExpandableStringEnum<RouteAvoidType> {
    /** Static value tollRoads for RouteAvoidType. */
    public static final RouteAvoidType TOLL_ROADS = fromString("tollRoads");

    /** Static value motorways for RouteAvoidType. */
    public static final RouteAvoidType MOTORWAYS = fromString("motorways");

    /** Static value ferries for RouteAvoidType. */
    public static final RouteAvoidType FERRIES = fromString("ferries");

    /** Static value unpavedRoads for RouteAvoidType. */
    public static final RouteAvoidType UNPAVED_ROADS = fromString("unpavedRoads");

    /** Static value carpools for RouteAvoidType. */
    public static final RouteAvoidType CARPOOLS = fromString("carpools");

    /** Static value alreadyUsedRoads for RouteAvoidType. */
    public static final RouteAvoidType ALREADY_USED_ROADS = fromString("alreadyUsedRoads");

    /** Static value borderCrossings for RouteAvoidType. */
    public static final RouteAvoidType BORDER_CROSSINGS = fromString("borderCrossings");

    /**
     * Creates or finds a RouteAvoidType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RouteAvoidType.
     */
    @JsonCreator
    public static RouteAvoidType fromString(String name) {
        return fromString(name, RouteAvoidType.class);
    }

    /**
     * Gets known RouteAvoidType values.
     *
     * @return known RouteAvoidType values.
     */
    public static Collection<RouteAvoidType> values() {
        return values(RouteAvoidType.class);
    }
}
