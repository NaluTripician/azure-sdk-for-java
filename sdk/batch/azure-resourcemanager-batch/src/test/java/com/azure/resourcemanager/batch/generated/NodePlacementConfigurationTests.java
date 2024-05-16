// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.models.NodePlacementConfiguration;
import com.azure.resourcemanager.batch.models.NodePlacementPolicyType;
import org.junit.jupiter.api.Assertions;

public final class NodePlacementConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NodePlacementConfiguration model
            = BinaryData.fromString("{\"policy\":\"Regional\"}").toObject(NodePlacementConfiguration.class);
        Assertions.assertEquals(NodePlacementPolicyType.REGIONAL, model.policy());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NodePlacementConfiguration model
            = new NodePlacementConfiguration().withPolicy(NodePlacementPolicyType.REGIONAL);
        model = BinaryData.fromObject(model).toObject(NodePlacementConfiguration.class);
        Assertions.assertEquals(NodePlacementPolicyType.REGIONAL, model.policy());
    }
}
