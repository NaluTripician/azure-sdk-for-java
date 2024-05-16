// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.models.AccessControl;
import com.azure.resourcemanager.mediaservices.models.DefaultAction;
import com.azure.resourcemanager.mediaservices.models.KeyDelivery;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class KeyDeliveryTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        KeyDelivery model =
            BinaryData
                .fromString(
                    "{\"accessControl\":{\"defaultAction\":\"Deny\",\"ipAllowList\":[\"cbtwnpzaoqvuh\",\"hcffcyddglmjthjq\",\"wpyeicxmqciwqvh\"]}}")
                .toObject(KeyDelivery.class);
        Assertions.assertEquals(DefaultAction.DENY, model.accessControl().defaultAction());
        Assertions.assertEquals("cbtwnpzaoqvuh", model.accessControl().ipAllowList().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        KeyDelivery model =
            new KeyDelivery()
                .withAccessControl(
                    new AccessControl()
                        .withDefaultAction(DefaultAction.DENY)
                        .withIpAllowList(Arrays.asList("cbtwnpzaoqvuh", "hcffcyddglmjthjq", "wpyeicxmqciwqvh")));
        model = BinaryData.fromObject(model).toObject(KeyDelivery.class);
        Assertions.assertEquals(DefaultAction.DENY, model.accessControl().defaultAction());
        Assertions.assertEquals("cbtwnpzaoqvuh", model.accessControl().ipAllowList().get(0));
    }
}
