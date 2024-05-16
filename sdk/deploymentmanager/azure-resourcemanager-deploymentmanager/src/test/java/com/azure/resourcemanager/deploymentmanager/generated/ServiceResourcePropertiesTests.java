// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.deploymentmanager.fluent.models.ServiceResourceProperties;
import org.junit.jupiter.api.Assertions;

public final class ServiceResourcePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServiceResourceProperties model =
            BinaryData
                .fromString("{\"targetLocation\":\"lusarh\",\"targetSubscriptionId\":\"ofcqhsm\"}")
                .toObject(ServiceResourceProperties.class);
        Assertions.assertEquals("lusarh", model.targetLocation());
        Assertions.assertEquals("ofcqhsm", model.targetSubscriptionId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServiceResourceProperties model =
            new ServiceResourceProperties().withTargetLocation("lusarh").withTargetSubscriptionId("ofcqhsm");
        model = BinaryData.fromObject(model).toObject(ServiceResourceProperties.class);
        Assertions.assertEquals("lusarh", model.targetLocation());
        Assertions.assertEquals("ofcqhsm", model.targetSubscriptionId());
    }
}
