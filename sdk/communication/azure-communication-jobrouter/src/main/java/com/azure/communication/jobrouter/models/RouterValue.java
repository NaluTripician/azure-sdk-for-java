// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Wrapper class for labels. Supports String, int, double and boolean types.
 *
 * If multiple values are set only one value will be used with following precedence.
 *
 * 1. stringValue.
 * 2. intValue.
 * 3. doubleValue.
 * 4. boolValue.
 */
@Immutable
public final class RouterValue {

    /**
     * String Value to pass to server.
     */
    @JsonProperty(value = "stringValue", access = JsonProperty.Access.READ_WRITE)
    private String stringValue;

    /**
     * Integer Value to pass to server.
     */
    @JsonProperty(value = "intValue", access = JsonProperty.Access.READ_WRITE)
    private Integer intValue;

    /**
     * Double Value to pass to server.
     */
    @JsonProperty(value = "doubleValue", access = JsonProperty.Access.READ_WRITE)
    private Double doubleValue;

    /**
     * Boolean Value to pass to server.
     */
    @JsonProperty(value = "boolValue", access = JsonProperty.Access.READ_WRITE)
    private Boolean boolValue;

    /**
     * Constructor
     * @param stringValue stringValue.
     * @param intValue intValue.
     * @param doubleValue doubleValue.
     * @param boolValue boolValue.
     */
    @JsonCreator
    RouterValue(@JsonProperty(value = "stringValue") String stringValue,
                       @JsonProperty(value = "intValue") Integer intValue,
                       @JsonProperty(value = "doubleValue") Double doubleValue,
                       @JsonProperty(value = "boolValue") Boolean boolValue) {
        this.stringValue = stringValue;
        this.intValue = intValue;
        this.doubleValue = doubleValue;
        this.boolValue = boolValue;
    }

    /**
     * String constructor.
     * @param stringValue stringValue.
     */
    public RouterValue(String stringValue) {
        this(stringValue, null, null, null);
    }

    /**
     * Constructor for intValue.
     * @param intValue intValue.
     */
    public RouterValue(Integer intValue) {
        this(null, intValue, null, null);
    }

    /**
     * DoubleValue constructor.
     * @param doubleValue doubleValue.
     */
    public RouterValue(Double doubleValue) {
        this(null, null, doubleValue, null);
    }

    /**
     * BoolValue constructor.
     * @param boolValue boolValue
     */
    public RouterValue(Boolean boolValue) {
        this(null, null, null, boolValue);
    }

    /**
     * Returns stringValue
     * @return stringValue.
     */
    public String getStringValue() {
        return stringValue;
    }

    /**
     * Returns intValue.
     * @return intValue
     */
    public Integer getIntValue() {
        return intValue;
    }

    /**
     * Returns doubleValue.
     * @return doubleValue
     */
    public Double getDoubleValue() {
        return doubleValue;
    }

    /**
     * Returns boolValue.
     * @return boolValue.
     */
    public Boolean getBooleanValue() {
        return boolValue;
    }
}
