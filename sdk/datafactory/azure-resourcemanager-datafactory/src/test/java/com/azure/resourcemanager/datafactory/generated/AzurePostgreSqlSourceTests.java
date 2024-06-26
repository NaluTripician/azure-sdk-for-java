// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzurePostgreSqlSource;

public final class AzurePostgreSqlSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzurePostgreSqlSource model = BinaryData.fromString(
            "{\"type\":\"mjazqlmigkx\",\"query\":\"datakditkwokefde\",\"queryTimeout\":\"datafnsy\",\"additionalColumns\":\"dataytrwyojhmgvm\",\"sourceRetryCount\":\"datashadnholkoyxms\",\"sourceRetryWait\":\"datadsqwvzunrqvu\",\"maxConcurrentConnections\":\"dataxs\",\"disableMetricsCollection\":\"dataqzdfjwo\",\"\":{\"hwaepg\":\"dataifrmoftilhoye\",\"qmfvzubmhsxtryy\":\"datadircdtkvorif\",\"uovturdhnnmhriz\":\"datavwm\",\"tnbvueizua\":\"datamptsygq\"}}")
            .toObject(AzurePostgreSqlSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzurePostgreSqlSource model = new AzurePostgreSqlSource().withSourceRetryCount("datashadnholkoyxms")
            .withSourceRetryWait("datadsqwvzunrqvu")
            .withMaxConcurrentConnections("dataxs")
            .withDisableMetricsCollection("dataqzdfjwo")
            .withQueryTimeout("datafnsy")
            .withAdditionalColumns("dataytrwyojhmgvm")
            .withQuery("datakditkwokefde");
        model = BinaryData.fromObject(model).toObject(AzurePostgreSqlSource.class);
    }
}
