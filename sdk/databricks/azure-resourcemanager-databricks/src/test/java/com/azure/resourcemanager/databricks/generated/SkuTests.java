// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databricks.models.Sku;
import org.junit.jupiter.api.Assertions;

public final class SkuTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Sku model = BinaryData.fromString("{\"name\":\"gzjaoyfhrtxilne\",\"tier\":\"ujysvle\"}").toObject(Sku.class);
        Assertions.assertEquals("gzjaoyfhrtxilne", model.name());
        Assertions.assertEquals("ujysvle", model.tier());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Sku model = new Sku().withName("gzjaoyfhrtxilne").withTier("ujysvle");
        model = BinaryData.fromObject(model).toObject(Sku.class);
        Assertions.assertEquals("gzjaoyfhrtxilne", model.name());
        Assertions.assertEquals("ujysvle", model.tier());
    }
}
