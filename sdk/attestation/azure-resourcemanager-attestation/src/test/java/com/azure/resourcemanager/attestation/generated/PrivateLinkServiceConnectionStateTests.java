// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.attestation.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.attestation.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.attestation.models.PrivateLinkServiceConnectionState;
import org.junit.jupiter.api.Assertions;

public final class PrivateLinkServiceConnectionStateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateLinkServiceConnectionState model =
            BinaryData
                .fromString(
                    "{\"status\":\"Pending\",\"description\":\"ojakhmsbzjhcrze\",\"actionsRequired\":\"phlxa\"}")
                .toObject(PrivateLinkServiceConnectionState.class);
        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.PENDING, model.status());
        Assertions.assertEquals("ojakhmsbzjhcrze", model.description());
        Assertions.assertEquals("phlxa", model.actionsRequired());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateLinkServiceConnectionState model =
            new PrivateLinkServiceConnectionState()
                .withStatus(PrivateEndpointServiceConnectionStatus.PENDING)
                .withDescription("ojakhmsbzjhcrze")
                .withActionsRequired("phlxa");
        model = BinaryData.fromObject(model).toObject(PrivateLinkServiceConnectionState.class);
        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.PENDING, model.status());
        Assertions.assertEquals("ojakhmsbzjhcrze", model.description());
        Assertions.assertEquals("phlxa", model.actionsRequired());
    }
}
