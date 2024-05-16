// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dnsresolver.generated;

import com.azure.core.management.SubResource;
import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dnsresolver.fluent.models.OutboundEndpointInner;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class OutboundEndpointInnerTests {
    @Test
    public void testDeserialize() {
        OutboundEndpointInner model =
            BinaryData
                .fromString(
                    "{\"etag\":\"wjfeusnhutjel\",\"properties\":{\"subnet\":{\"id\":\"rl\"},\"provisioningState\":\"Updating\",\"resourceGuid\":\"jzzd\"},\"location\":\"qxhocdgeablgphut\",\"tags\":{\"i\":\"dvkaozw\"},\"id\":\"tyhxhurokft\",\"name\":\"xolniwpwcukjfk\",\"type\":\"iawxklry\"}")
                .toObject(OutboundEndpointInner.class);
        Assertions.assertEquals("qxhocdgeablgphut", model.location());
        Assertions.assertEquals("dvkaozw", model.tags().get("i"));
        Assertions.assertEquals("rl", model.subnet().id());
    }

    @Test
    public void testSerialize() {
        OutboundEndpointInner model =
            new OutboundEndpointInner()
                .withLocation("qxhocdgeablgphut")
                .withTags(mapOf("i", "dvkaozw"))
                .withSubnet(new SubResource().withId("rl"));
        model = BinaryData.fromObject(model).toObject(OutboundEndpointInner.class);
        Assertions.assertEquals("qxhocdgeablgphut", model.location());
        Assertions.assertEquals("dvkaozw", model.tags().get("i"));
        Assertions.assertEquals("rl", model.subnet().id());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
