// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.route.implementation.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for GeoJsonObjectType. */
public enum GeoJsonObjectType {
    /** Enum value Point. */
    GEO_JSON_POINT("Point"),

    /** Enum value MultiPoint. */
    GEO_JSON_MULTI_POINT("MultiPoint"),

    /** Enum value LineString. */
    GEO_JSON_LINE_STRING("LineString"),

    /** Enum value MultiLineString. */
    GEO_JSON_MULTI_LINE_STRING("MultiLineString"),

    /** Enum value Polygon. */
    GEO_JSON_POLYGON("Polygon"),

    /** Enum value MultiPolygon. */
    GEO_JSON_MULTI_POLYGON("MultiPolygon"),

    /** Enum value GeometryCollection. */
    GEO_JSON_GEOMETRY_COLLECTION("GeometryCollection"),

    /** Enum value Feature. */
    GEO_JSON_FEATURE("Feature"),

    /** Enum value FeatureCollection. */
    GEO_JSON_FEATURE_COLLECTION("FeatureCollection");

    /** The actual serialized value for a GeoJsonObjectType instance. */
    private final String value;

    GeoJsonObjectType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a GeoJsonObjectType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed GeoJsonObjectType object, or null if unable to parse.
     */
    @JsonCreator
    public static GeoJsonObjectType fromString(String value) {
        GeoJsonObjectType[] items = GeoJsonObjectType.values();
        for (GeoJsonObjectType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
