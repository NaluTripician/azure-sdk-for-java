// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.qumulo.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.qumulo.models.UserDetails;
import org.junit.jupiter.api.Assertions;

public final class UserDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UserDetails model = BinaryData.fromString("{\"email\":\"lluwfzitonpeq\"}").toObject(UserDetails.class);
        Assertions.assertEquals("lluwfzitonpeq", model.email());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UserDetails model = new UserDetails().withEmail("lluwfzitonpeq");
        model = BinaryData.fromObject(model).toObject(UserDetails.class);
        Assertions.assertEquals("lluwfzitonpeq", model.email());
    }
}
