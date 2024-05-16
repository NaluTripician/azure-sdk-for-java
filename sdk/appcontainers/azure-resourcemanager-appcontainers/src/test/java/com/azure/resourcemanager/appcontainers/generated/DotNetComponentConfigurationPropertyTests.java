// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.DotNetComponentConfigurationProperty;
import org.junit.jupiter.api.Assertions;

public final class DotNetComponentConfigurationPropertyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DotNetComponentConfigurationProperty model
            = BinaryData.fromString("{\"propertyName\":\"gjlgvvpase\",\"value\":\"gbuxantuygdh\"}")
                .toObject(DotNetComponentConfigurationProperty.class);
        Assertions.assertEquals("gjlgvvpase", model.propertyName());
        Assertions.assertEquals("gbuxantuygdh", model.value());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DotNetComponentConfigurationProperty model
            = new DotNetComponentConfigurationProperty().withPropertyName("gjlgvvpase").withValue("gbuxantuygdh");
        model = BinaryData.fromObject(model).toObject(DotNetComponentConfigurationProperty.class);
        Assertions.assertEquals("gjlgvvpase", model.propertyName());
        Assertions.assertEquals("gbuxantuygdh", model.value());
    }
}
