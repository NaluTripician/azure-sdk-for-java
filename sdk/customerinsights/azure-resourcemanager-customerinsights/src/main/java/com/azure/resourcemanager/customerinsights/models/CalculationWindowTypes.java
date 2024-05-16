// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** The calculation window. */
public enum CalculationWindowTypes {
    /** Enum value Lifetime. */
    LIFETIME("Lifetime"),

    /** Enum value Hour. */
    HOUR("Hour"),

    /** Enum value Day. */
    DAY("Day"),

    /** Enum value Week. */
    WEEK("Week"),

    /** Enum value Month. */
    MONTH("Month");

    /** The actual serialized value for a CalculationWindowTypes instance. */
    private final String value;

    CalculationWindowTypes(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a CalculationWindowTypes instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed CalculationWindowTypes object, or null if unable to parse.
     */
    @JsonCreator
    public static CalculationWindowTypes fromString(String value) {
        if (value == null) {
            return null;
        }
        CalculationWindowTypes[] items = CalculationWindowTypes.values();
        for (CalculationWindowTypes item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /** {@inheritDoc} */
    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
