// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.FeatureLags;
import com.azure.resourcemanager.machinelearning.models.ForecastHorizon;
import com.azure.resourcemanager.machinelearning.models.ForecastingSettings;
import com.azure.resourcemanager.machinelearning.models.Seasonality;
import com.azure.resourcemanager.machinelearning.models.ShortSeriesHandlingConfiguration;
import com.azure.resourcemanager.machinelearning.models.TargetAggregationFunction;
import com.azure.resourcemanager.machinelearning.models.TargetLags;
import com.azure.resourcemanager.machinelearning.models.TargetRollingWindowSize;
import com.azure.resourcemanager.machinelearning.models.UseStl;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ForecastingSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ForecastingSettings model =
            BinaryData
                .fromString(
                    "{\"countryOrRegionForHolidays\":\"thuqolyahluq\",\"cvStepSize\":608197313,\"featureLags\":\"Auto\",\"forecastHorizon\":{\"mode\":\"ForecastHorizon\"},\"frequency\":\"rjb\",\"seasonality\":{\"mode\":\"Seasonality\"},\"shortSeriesHandlingConfig\":\"None\",\"targetAggregateFunction\":\"None\",\"targetLags\":{\"mode\":\"TargetLags\"},\"targetRollingWindowSize\":{\"mode\":\"TargetRollingWindowSize\"},\"timeColumnName\":\"zvqqugdrftbcvexr\",\"timeSeriesIdColumnNames\":[\"uowtljvfwhrea\",\"khyxvrqtvbcz\",\"ulmdgglm\",\"pjpfseykgs\"],\"useStl\":\"Season\"}")
                .toObject(ForecastingSettings.class);
        Assertions.assertEquals("thuqolyahluq", model.countryOrRegionForHolidays());
        Assertions.assertEquals(608197313, model.cvStepSize());
        Assertions.assertEquals(FeatureLags.AUTO, model.featureLags());
        Assertions.assertEquals("rjb", model.frequency());
        Assertions.assertEquals(ShortSeriesHandlingConfiguration.NONE, model.shortSeriesHandlingConfig());
        Assertions.assertEquals(TargetAggregationFunction.NONE, model.targetAggregateFunction());
        Assertions.assertEquals("zvqqugdrftbcvexr", model.timeColumnName());
        Assertions.assertEquals("uowtljvfwhrea", model.timeSeriesIdColumnNames().get(0));
        Assertions.assertEquals(UseStl.SEASON, model.useStl());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ForecastingSettings model =
            new ForecastingSettings()
                .withCountryOrRegionForHolidays("thuqolyahluq")
                .withCvStepSize(608197313)
                .withFeatureLags(FeatureLags.AUTO)
                .withForecastHorizon(new ForecastHorizon())
                .withFrequency("rjb")
                .withSeasonality(new Seasonality())
                .withShortSeriesHandlingConfig(ShortSeriesHandlingConfiguration.NONE)
                .withTargetAggregateFunction(TargetAggregationFunction.NONE)
                .withTargetLags(new TargetLags())
                .withTargetRollingWindowSize(new TargetRollingWindowSize())
                .withTimeColumnName("zvqqugdrftbcvexr")
                .withTimeSeriesIdColumnNames(Arrays.asList("uowtljvfwhrea", "khyxvrqtvbcz", "ulmdgglm", "pjpfseykgs"))
                .withUseStl(UseStl.SEASON);
        model = BinaryData.fromObject(model).toObject(ForecastingSettings.class);
        Assertions.assertEquals("thuqolyahluq", model.countryOrRegionForHolidays());
        Assertions.assertEquals(608197313, model.cvStepSize());
        Assertions.assertEquals(FeatureLags.AUTO, model.featureLags());
        Assertions.assertEquals("rjb", model.frequency());
        Assertions.assertEquals(ShortSeriesHandlingConfiguration.NONE, model.shortSeriesHandlingConfig());
        Assertions.assertEquals(TargetAggregationFunction.NONE, model.targetAggregateFunction());
        Assertions.assertEquals("zvqqugdrftbcvexr", model.timeColumnName());
        Assertions.assertEquals("uowtljvfwhrea", model.timeSeriesIdColumnNames().get(0));
        Assertions.assertEquals(UseStl.SEASON, model.useStl());
    }
}
