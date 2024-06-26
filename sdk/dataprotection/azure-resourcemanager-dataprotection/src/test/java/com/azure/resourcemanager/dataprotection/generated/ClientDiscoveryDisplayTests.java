// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.ClientDiscoveryDisplay;
import org.junit.jupiter.api.Assertions;

public final class ClientDiscoveryDisplayTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClientDiscoveryDisplay model = BinaryData.fromString(
            "{\"description\":\"noae\",\"operation\":\"fhyhltrpmopjmcma\",\"provider\":\"okth\",\"resource\":\"iuaod\"}")
            .toObject(ClientDiscoveryDisplay.class);
        Assertions.assertEquals("noae", model.description());
        Assertions.assertEquals("fhyhltrpmopjmcma", model.operation());
        Assertions.assertEquals("okth", model.provider());
        Assertions.assertEquals("iuaod", model.resource());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClientDiscoveryDisplay model = new ClientDiscoveryDisplay().withDescription("noae")
            .withOperation("fhyhltrpmopjmcma").withProvider("okth").withResource("iuaod");
        model = BinaryData.fromObject(model).toObject(ClientDiscoveryDisplay.class);
        Assertions.assertEquals("noae", model.description());
        Assertions.assertEquals("fhyhltrpmopjmcma", model.operation());
        Assertions.assertEquals("okth", model.provider());
        Assertions.assertEquals("iuaod", model.resource());
    }
}
