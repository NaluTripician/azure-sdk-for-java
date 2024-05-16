// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iothub.models.ArmUserIdentity;

public final class ArmUserIdentityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ArmUserIdentity model =
            BinaryData
                .fromString("{\"principalId\":\"tfhvpesapskrdqmh\",\"clientId\":\"dhtldwkyz\"}")
                .toObject(ArmUserIdentity.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ArmUserIdentity model = new ArmUserIdentity();
        model = BinaryData.fromObject(model).toObject(ArmUserIdentity.class);
    }
}
