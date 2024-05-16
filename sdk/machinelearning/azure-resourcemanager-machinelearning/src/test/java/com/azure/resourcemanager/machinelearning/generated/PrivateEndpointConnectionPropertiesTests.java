// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.fluent.models.PrivateEndpointConnectionProperties;
import com.azure.resourcemanager.machinelearning.models.PrivateEndpoint;
import com.azure.resourcemanager.machinelearning.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.machinelearning.models.PrivateLinkServiceConnectionState;
import org.junit.jupiter.api.Assertions;

public final class PrivateEndpointConnectionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateEndpointConnectionProperties model =
            BinaryData
                .fromString(
                    "{\"privateEndpoint\":{\"id\":\"bpf\",\"subnetArmId\":\"s\"},\"privateLinkServiceConnectionState\":{\"status\":\"Pending\",\"description\":\"v\",\"actionsRequired\":\"jrwzox\"},\"provisioningState\":\"Creating\"}")
                .toObject(PrivateEndpointConnectionProperties.class);
        Assertions
            .assertEquals(
                PrivateEndpointServiceConnectionStatus.PENDING, model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("v", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("jrwzox", model.privateLinkServiceConnectionState().actionsRequired());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateEndpointConnectionProperties model =
            new PrivateEndpointConnectionProperties()
                .withPrivateEndpoint(new PrivateEndpoint())
                .withPrivateLinkServiceConnectionState(
                    new PrivateLinkServiceConnectionState()
                        .withStatus(PrivateEndpointServiceConnectionStatus.PENDING)
                        .withDescription("v")
                        .withActionsRequired("jrwzox"));
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionProperties.class);
        Assertions
            .assertEquals(
                PrivateEndpointServiceConnectionStatus.PENDING, model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("v", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("jrwzox", model.privateLinkServiceConnectionState().actionsRequired());
    }
}
