// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.OracleSink;

public final class OracleSinkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OracleSink model = BinaryData.fromString(
            "{\"type\":\"vav\",\"preCopyScript\":\"datawynslcfx\",\"writeBatchSize\":\"datariedf\",\"writeBatchTimeout\":\"datatfugppiudhylx\",\"sinkRetryCount\":\"datasumqdri\",\"sinkRetryWait\":\"dataxzcrf\",\"maxConcurrentConnections\":\"databchnh\",\"disableMetricsCollection\":\"datamgcqlufoj\",\"\":{\"zvnsnaklob\":\"datapkqhgfw\",\"jfxueqyjee\":\"datauyhmltdgxiqrgrr\",\"buglalaazncnhzqn\":\"dataytgnycnklqipnzgn\",\"galodfsbhphwt\":\"dataxkscyykrzrjjernj\"}}")
            .toObject(OracleSink.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OracleSink model = new OracleSink().withWriteBatchSize("datariedf")
            .withWriteBatchTimeout("datatfugppiudhylx")
            .withSinkRetryCount("datasumqdri")
            .withSinkRetryWait("dataxzcrf")
            .withMaxConcurrentConnections("databchnh")
            .withDisableMetricsCollection("datamgcqlufoj")
            .withPreCopyScript("datawynslcfx");
        model = BinaryData.fromObject(model).toObject(OracleSink.class);
    }
}
