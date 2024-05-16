// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for MarketplaceType. */
public enum MarketplaceType {
    /** Enum value NotSpecified. */
    NOT_SPECIFIED("NotSpecified"),

    /** Enum value AddOn. */
    ADD_ON("AddOn"),

    /** Enum value Bypass. */
    BYPASS("Bypass"),

    /** Enum value Store. */
    STORE("Store");

    /** The actual serialized value for a MarketplaceType instance. */
    private final String value;

    MarketplaceType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a MarketplaceType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed MarketplaceType object, or null if unable to parse.
     */
    @JsonCreator
    public static MarketplaceType fromString(String value) {
        if (value == null) {
            return null;
        }
        MarketplaceType[] items = MarketplaceType.values();
        for (MarketplaceType item : items) {
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
