// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mobilenetwork.models.SdfDirection;
import com.azure.resourcemanager.mobilenetwork.models.ServiceDataFlowTemplate;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ServiceDataFlowTemplateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServiceDataFlowTemplate model = BinaryData.fromString(
            "{\"templateName\":\"dunyg\",\"direction\":\"Downlink\",\"protocol\":[\"idb\",\"fatpxllrxcyjmoa\",\"su\",\"arm\"],\"remoteIpList\":[\"dmjsjqb\",\"hhyxxrw\",\"yc\",\"duhpk\"],\"ports\":[\"ymareqnajxqugj\",\"ky\"]}")
            .toObject(ServiceDataFlowTemplate.class);
        Assertions.assertEquals("dunyg", model.templateName());
        Assertions.assertEquals(SdfDirection.DOWNLINK, model.direction());
        Assertions.assertEquals("idb", model.protocol().get(0));
        Assertions.assertEquals("dmjsjqb", model.remoteIpList().get(0));
        Assertions.assertEquals("ymareqnajxqugj", model.ports().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServiceDataFlowTemplate model = new ServiceDataFlowTemplate().withTemplateName("dunyg")
            .withDirection(SdfDirection.DOWNLINK).withProtocol(Arrays.asList("idb", "fatpxllrxcyjmoa", "su", "arm"))
            .withRemoteIpList(Arrays.asList("dmjsjqb", "hhyxxrw", "yc", "duhpk"))
            .withPorts(Arrays.asList("ymareqnajxqugj", "ky"));
        model = BinaryData.fromObject(model).toObject(ServiceDataFlowTemplate.class);
        Assertions.assertEquals("dunyg", model.templateName());
        Assertions.assertEquals(SdfDirection.DOWNLINK, model.direction());
        Assertions.assertEquals("idb", model.protocol().get(0));
        Assertions.assertEquals("dmjsjqb", model.remoteIpList().get(0));
        Assertions.assertEquals("ymareqnajxqugj", model.ports().get(0));
    }
}
