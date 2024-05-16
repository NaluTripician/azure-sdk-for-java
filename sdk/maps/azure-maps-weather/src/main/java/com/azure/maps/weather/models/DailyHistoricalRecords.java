// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.weather.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The DailyHistoricalRecords model. */
@Fluent
public final class DailyHistoricalRecords {
    /*
     * Date and time of the current observation displayed in ISO 8601 format, for example, 2019-10-27T19:39:57-08:00.
     */
    @JsonProperty(value = "date")
    private OffsetDateTime timestamp;

    /*
     * Temperature value.
     */
    @JsonProperty(value = "temperature")
    private WeatherValueYearMaxMinAvg temperature;

    /*
     * Maximum amount of precipitation (liquid equivalent) that has fallen.
     */
    @JsonProperty(value = "precipitation")
    private WeatherValueYearMax precipitation;

    /*
     * Maximum snowfall.
     */
    @JsonProperty(value = "snowfall")
    private WeatherValueYearMax snowfall;

    /** Set default DailyHistoricalRecords constructor to private */
    private DailyHistoricalRecords() {}

    /**
     * Get the timestamp property: Date and time of the current observation displayed in ISO 8601 format, for example,
     * 2019-10-27T19:39:57-08:00.
     *
     * @return the timestamp value.
     */
    public OffsetDateTime getTimestamp() {
        return this.timestamp;
    }

    /**
     * Get the temperature property: Temperature value.
     *
     * @return the temperature value.
     */
    public WeatherValueYearMaxMinAvg getTemperature() {
        return this.temperature;
    }

    /**
     * Get the precipitation property: Maximum amount of precipitation (liquid equivalent) that has fallen.
     *
     * @return the precipitation value.
     */
    public WeatherValueYearMax getPrecipitation() {
        return this.precipitation;
    }

    /**
     * Get the snowfall property: Maximum snowfall.
     *
     * @return the snowfall value.
     */
    public WeatherValueYearMax getSnowfall() {
        return this.snowfall;
    }
}
