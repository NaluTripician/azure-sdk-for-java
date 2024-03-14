// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.MicrosoftAccessSink;

public final class MicrosoftAccessSinkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MicrosoftAccessSink model = BinaryData.fromString(
            "{\"type\":\"MicrosoftAccessSink\",\"preCopyScript\":\"datailyxpqxnlifhjym\",\"writeBatchSize\":\"datajliivyatyzwy\",\"writeBatchTimeout\":\"dataaycjphozymcypdbu\",\"sinkRetryCount\":\"datanktlzngidgwsc\",\"sinkRetryWait\":\"datamhgzapcgdk\",\"maxConcurrentConnections\":\"dataa\",\"disableMetricsCollection\":\"datacpohlfvsb\",\"\":{\"bjbbyoud\":\"datag\",\"mcumuomdlspsb\":\"datatdlkucxtyufsouh\"}}")
            .toObject(MicrosoftAccessSink.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MicrosoftAccessSink model = new MicrosoftAccessSink().withWriteBatchSize("datajliivyatyzwy")
            .withWriteBatchTimeout("dataaycjphozymcypdbu").withSinkRetryCount("datanktlzngidgwsc")
            .withSinkRetryWait("datamhgzapcgdk").withMaxConcurrentConnections("dataa")
            .withDisableMetricsCollection("datacpohlfvsb").withPreCopyScript("datailyxpqxnlifhjym");
        model = BinaryData.fromObject(model).toObject(MicrosoftAccessSink.class);
    }
}
