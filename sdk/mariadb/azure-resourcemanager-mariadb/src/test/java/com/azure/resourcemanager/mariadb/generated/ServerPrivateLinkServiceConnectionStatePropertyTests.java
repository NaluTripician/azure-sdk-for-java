// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mariadb.models.PrivateLinkServiceConnectionStateStatus;
import com.azure.resourcemanager.mariadb.models.ServerPrivateLinkServiceConnectionStateProperty;
import org.junit.jupiter.api.Assertions;

public final class ServerPrivateLinkServiceConnectionStatePropertyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServerPrivateLinkServiceConnectionStateProperty model =
            BinaryData
                .fromString("{\"status\":\"Pending\",\"description\":\"odjpslwejd\",\"actionsRequired\":\"None\"}")
                .toObject(ServerPrivateLinkServiceConnectionStateProperty.class);
        Assertions.assertEquals(PrivateLinkServiceConnectionStateStatus.PENDING, model.status());
        Assertions.assertEquals("odjpslwejd", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServerPrivateLinkServiceConnectionStateProperty model =
            new ServerPrivateLinkServiceConnectionStateProperty()
                .withStatus(PrivateLinkServiceConnectionStateStatus.PENDING)
                .withDescription("odjpslwejd");
        model = BinaryData.fromObject(model).toObject(ServerPrivateLinkServiceConnectionStateProperty.class);
        Assertions.assertEquals(PrivateLinkServiceConnectionStateStatus.PENDING, model.status());
        Assertions.assertEquals("odjpslwejd", model.description());
    }
}
