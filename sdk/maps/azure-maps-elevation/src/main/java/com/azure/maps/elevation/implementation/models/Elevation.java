// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.elevation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The elevation data. */
@Fluent
public final class Elevation {
    /*
     * A location represented as a latitude and longitude.
     */
    @JsonProperty(value = "coordinate")
    private LatLongPair coordinate;

    /*
     * The elevation value in meters.
     */
    @JsonProperty(value = "elevationInMeter", access = JsonProperty.Access.WRITE_ONLY)
    private Float elevationInMeter;

    /**
     * Get the coordinate property: A location represented as a latitude and longitude.
     *
     * @return the coordinate value.
     */
    public LatLongPair getCoordinate() {
        return this.coordinate;
    }

    /**
     * Set the coordinate property: A location represented as a latitude and longitude.
     *
     * @param coordinate the coordinate value to set.
     * @return the Elevation object itself.
     */
    public Elevation setCoordinate(LatLongPair coordinate) {
        this.coordinate = coordinate;
        return this;
    }

    /**
     * Get the elevationInMeter property: The elevation value in meters.
     *
     * @return the elevationInMeter value.
     */
    public Float getElevationInMeters() {
        return this.elevationInMeter;
    }
}
