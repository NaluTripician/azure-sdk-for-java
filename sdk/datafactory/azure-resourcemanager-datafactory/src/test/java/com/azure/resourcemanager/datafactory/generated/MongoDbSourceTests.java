// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.MongoDbSource;

public final class MongoDbSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MongoDbSource model = BinaryData.fromString(
            "{\"type\":\"MongoDbSource\",\"query\":\"datarbgnyvypu\",\"additionalColumns\":\"dataxhowwe\",\"sourceRetryCount\":\"datayw\",\"sourceRetryWait\":\"datahiuwv\",\"maxConcurrentConnections\":\"datagejytqnzrcbh\",\"disableMetricsCollection\":\"datahctjvlwfnzgz\",\"\":{\"fuhsmuclxgcedus\":\"datayvytydrdcwbaiaq\",\"vykagsxhzhervv\":\"datayq\",\"zrvf\":\"dataibrolqxloed\",\"fgwuj\":\"datafsyq\"}}")
            .toObject(MongoDbSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MongoDbSource model = new MongoDbSource().withSourceRetryCount("datayw").withSourceRetryWait("datahiuwv")
            .withMaxConcurrentConnections("datagejytqnzrcbh").withDisableMetricsCollection("datahctjvlwfnzgz")
            .withQuery("datarbgnyvypu").withAdditionalColumns("dataxhowwe");
        model = BinaryData.fromObject(model).toObject(MongoDbSource.class);
    }
}
