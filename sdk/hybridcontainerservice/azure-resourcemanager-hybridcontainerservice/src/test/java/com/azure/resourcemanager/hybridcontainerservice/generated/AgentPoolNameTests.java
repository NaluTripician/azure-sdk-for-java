// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcontainerservice.models.AgentPoolName;
import org.junit.jupiter.api.Assertions;

public final class AgentPoolNameTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AgentPoolName model = BinaryData.fromString("{\"name\":\"glzufc\"}").toObject(AgentPoolName.class);
        Assertions.assertEquals("glzufc", model.name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AgentPoolName model = new AgentPoolName().withName("glzufc");
        model = BinaryData.fromObject(model).toObject(AgentPoolName.class);
        Assertions.assertEquals("glzufc", model.name());
    }
}
