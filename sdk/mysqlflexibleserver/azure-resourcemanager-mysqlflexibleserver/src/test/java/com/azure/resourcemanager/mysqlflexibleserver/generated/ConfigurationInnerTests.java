// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.ConfigurationInner;
import com.azure.resourcemanager.mysqlflexibleserver.models.ConfigurationSource;
import org.junit.jupiter.api.Assertions;

public final class ConfigurationInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ConfigurationInner model = BinaryData.fromString(
            "{\"properties\":{\"value\":\"mrldhu\",\"currentValue\":\"zzd\",\"description\":\"qxhocdgeablgphut\",\"documentationLink\":\"ndv\",\"defaultValue\":\"ozwyiftyhxhuro\",\"dataType\":\"tyxolniwpwc\",\"allowedValues\":\"jfkgiawxk\",\"source\":\"system-default\",\"isReadOnly\":\"False\",\"isConfigPendingRestart\":\"False\",\"isDynamicConfig\":\"True\"},\"id\":\"syyp\",\"name\":\"ddhsgcbacphe\",\"type\":\"koty\"}")
            .toObject(ConfigurationInner.class);
        Assertions.assertEquals("mrldhu", model.value());
        Assertions.assertEquals("zzd", model.currentValue());
        Assertions.assertEquals(ConfigurationSource.SYSTEM_DEFAULT, model.source());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ConfigurationInner model = new ConfigurationInner().withValue("mrldhu")
            .withCurrentValue("zzd")
            .withSource(ConfigurationSource.SYSTEM_DEFAULT);
        model = BinaryData.fromObject(model).toObject(ConfigurationInner.class);
        Assertions.assertEquals("mrldhu", model.value());
        Assertions.assertEquals("zzd", model.currentValue());
        Assertions.assertEquals(ConfigurationSource.SYSTEM_DEFAULT, model.source());
    }
}
