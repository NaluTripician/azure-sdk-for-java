// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.chaos.fluent.models.CapabilityProperties;

public final class CapabilityPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CapabilityProperties model = BinaryData.fromString(
            "{\"publisher\":\"wczbys\",\"targetType\":\"pqxu\",\"description\":\"vyq\",\"parametersSchema\":\"wby\",\"urn\":\"k\"}")
            .toObject(CapabilityProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CapabilityProperties model = new CapabilityProperties();
        model = BinaryData.fromObject(model).toObject(CapabilityProperties.class);
    }
}
