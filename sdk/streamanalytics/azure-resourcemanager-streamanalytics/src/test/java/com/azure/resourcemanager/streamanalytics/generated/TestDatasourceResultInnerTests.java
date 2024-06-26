// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.streamanalytics.fluent.models.TestDatasourceResultInner;

public final class TestDatasourceResultInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TestDatasourceResultInner model
            = BinaryData.fromString("{\"status\":\"TestSucceeded\"}").toObject(TestDatasourceResultInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TestDatasourceResultInner model = new TestDatasourceResultInner();
        model = BinaryData.fromObject(model).toObject(TestDatasourceResultInner.class);
    }
}
