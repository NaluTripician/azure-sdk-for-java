// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.weather.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The TemperatureSummary model. */
@Fluent
public final class TemperatureSummary {
    /*
     * Summary of temperature fluctuations over the past 6 hours.
     */
    @JsonProperty(value = "pastSixHours")
    private PastHoursTemperature pastSixHours;

    /*
     * Summary of temperature fluctuations over the past 12 hours.
     */
    @JsonProperty(value = "pastTwelveHours")
    private PastHoursTemperature pastTwelveHours;

    /*
     * Summary of temperature fluctuations over the past 24 hours.
     */
    @JsonProperty(value = "pastTwentyFourHours")
    private PastHoursTemperature pastTwentyFourHours;

    /** Set default TemperatureSummary constructor to private */
    private TemperatureSummary() {}

    /**
     * Get the pastSixHours property: Summary of temperature fluctuations over the past 6 hours.
     *
     * @return the pastSixHours value.
     */
    public PastHoursTemperature getPastSixHours() {
        return this.pastSixHours;
    }

    /**
     * Get the pastTwelveHours property: Summary of temperature fluctuations over the past 12 hours.
     *
     * @return the pastTwelveHours value.
     */
    public PastHoursTemperature getPastTwelveHours() {
        return this.pastTwelveHours;
    }

    /**
     * Get the pastTwentyFourHours property: Summary of temperature fluctuations over the past 24 hours.
     *
     * @return the pastTwentyFourHours value.
     */
    public PastHoursTemperature getPastTwentyFourHours() {
        return this.pastTwentyFourHours;
    }
}
