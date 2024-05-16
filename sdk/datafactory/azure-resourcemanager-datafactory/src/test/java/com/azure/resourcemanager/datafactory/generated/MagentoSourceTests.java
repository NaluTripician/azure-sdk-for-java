// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.MagentoSource;

public final class MagentoSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MagentoSource model = BinaryData.fromString(
            "{\"type\":\"omdlsps\",\"query\":\"datagdkpyavfcpohlfv\",\"queryTimeout\":\"dataucxtyufso\",\"additionalColumns\":\"datakmcu\",\"sourceRetryCount\":\"dataxpnyg\",\"sourceRetryWait\":\"dataqi\",\"maxConcurrentConnections\":\"datalxoxwndfuyj\",\"disableMetricsCollection\":\"datagal\",\"\":{\"oa\":\"datalzuztdwx\",\"p\":\"datab\"}}")
            .toObject(MagentoSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MagentoSource model = new MagentoSource().withSourceRetryCount("dataxpnyg")
            .withSourceRetryWait("dataqi")
            .withMaxConcurrentConnections("datalxoxwndfuyj")
            .withDisableMetricsCollection("datagal")
            .withQueryTimeout("dataucxtyufso")
            .withAdditionalColumns("datakmcu")
            .withQuery("datagdkpyavfcpohlfv");
        model = BinaryData.fromObject(model).toObject(MagentoSource.class);
    }
}
