// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DistcpSettings;
import com.azure.resourcemanager.datafactory.models.HdfsSource;

public final class HdfsSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HdfsSource model = BinaryData.fromString(
            "{\"type\":\"HdfsSource\",\"recursive\":\"dataskzw\",\"distcpSettings\":{\"resourceManagerEndpoint\":\"datah\",\"tempScriptPath\":\"datavhzrxcae\",\"distcpOptions\":\"dataxoavlwwpvjrnjwvc\"},\"sourceRetryCount\":\"datarqlceflgsndur\",\"sourceRetryWait\":\"dataozjwm\",\"maxConcurrentConnections\":\"datadehjloz\",\"disableMetricsCollection\":\"datawokuxedpqwzzzi\",\"\":{\"ve\":\"dataxjgxrhajrubcvu\",\"uclkbw\":\"datadfmdjnfeealp\",\"vkhfzldzz\":\"datamwdrvkbcsvn\"}}")
            .toObject(HdfsSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HdfsSource model = new HdfsSource().withSourceRetryCount("datarqlceflgsndur").withSourceRetryWait("dataozjwm")
            .withMaxConcurrentConnections("datadehjloz").withDisableMetricsCollection("datawokuxedpqwzzzi")
            .withRecursive("dataskzw").withDistcpSettings(new DistcpSettings().withResourceManagerEndpoint("datah")
                .withTempScriptPath("datavhzrxcae").withDistcpOptions("dataxoavlwwpvjrnjwvc"));
        model = BinaryData.fromObject(model).toObject(HdfsSource.class);
    }
}
