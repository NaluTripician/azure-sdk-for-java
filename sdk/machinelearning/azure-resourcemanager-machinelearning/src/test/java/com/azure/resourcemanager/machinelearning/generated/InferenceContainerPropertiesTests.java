// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.InferenceContainerProperties;
import com.azure.resourcemanager.machinelearning.models.Route;
import org.junit.jupiter.api.Assertions;

public final class InferenceContainerPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InferenceContainerProperties model =
            BinaryData
                .fromString(
                    "{\"livenessRoute\":{\"path\":\"xgqddrih\",\"port\":1351999302},\"readinessRoute\":{\"path\":\"oqcaaewdaomdj\",\"port\":68062218},\"scoringRoute\":{\"path\":\"jxxkzbrmsgei\",\"port\":1985792970}}")
                .toObject(InferenceContainerProperties.class);
        Assertions.assertEquals("xgqddrih", model.livenessRoute().path());
        Assertions.assertEquals(1351999302, model.livenessRoute().port());
        Assertions.assertEquals("oqcaaewdaomdj", model.readinessRoute().path());
        Assertions.assertEquals(68062218, model.readinessRoute().port());
        Assertions.assertEquals("jxxkzbrmsgei", model.scoringRoute().path());
        Assertions.assertEquals(1985792970, model.scoringRoute().port());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InferenceContainerProperties model =
            new InferenceContainerProperties()
                .withLivenessRoute(new Route().withPath("xgqddrih").withPort(1351999302))
                .withReadinessRoute(new Route().withPath("oqcaaewdaomdj").withPort(68062218))
                .withScoringRoute(new Route().withPath("jxxkzbrmsgei").withPort(1985792970));
        model = BinaryData.fromObject(model).toObject(InferenceContainerProperties.class);
        Assertions.assertEquals("xgqddrih", model.livenessRoute().path());
        Assertions.assertEquals(1351999302, model.livenessRoute().port());
        Assertions.assertEquals("oqcaaewdaomdj", model.readinessRoute().path());
        Assertions.assertEquals(68062218, model.readinessRoute().port());
        Assertions.assertEquals("jxxkzbrmsgei", model.scoringRoute().path());
        Assertions.assertEquals(1985792970, model.scoringRoute().port());
    }
}
