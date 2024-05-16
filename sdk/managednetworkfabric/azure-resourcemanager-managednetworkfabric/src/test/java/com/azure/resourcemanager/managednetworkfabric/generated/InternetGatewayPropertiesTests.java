// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.InternetGatewayProperties;
import com.azure.resourcemanager.managednetworkfabric.models.GatewayType;
import org.junit.jupiter.api.Assertions;

public final class InternetGatewayPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InternetGatewayProperties model =
            BinaryData
                .fromString(
                    "{\"ipv4Address\":\"qyn\",\"port\":775860156,\"type\":\"Workload\",\"networkFabricControllerId\":\"sfaq\",\"provisioningState\":\"Failed\",\"internetGatewayRuleId\":\"wryshwd\",\"annotation\":\"vbxgkqusyb\"}")
                .toObject(InternetGatewayProperties.class);
        Assertions.assertEquals("vbxgkqusyb", model.annotation());
        Assertions.assertEquals(GatewayType.WORKLOAD, model.type());
        Assertions.assertEquals("sfaq", model.networkFabricControllerId());
        Assertions.assertEquals("wryshwd", model.internetGatewayRuleId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InternetGatewayProperties model =
            new InternetGatewayProperties()
                .withAnnotation("vbxgkqusyb")
                .withType(GatewayType.WORKLOAD)
                .withNetworkFabricControllerId("sfaq")
                .withInternetGatewayRuleId("wryshwd");
        model = BinaryData.fromObject(model).toObject(InternetGatewayProperties.class);
        Assertions.assertEquals("vbxgkqusyb", model.annotation());
        Assertions.assertEquals(GatewayType.WORKLOAD, model.type());
        Assertions.assertEquals("sfaq", model.networkFabricControllerId());
        Assertions.assertEquals("wryshwd", model.internetGatewayRuleId());
    }
}
