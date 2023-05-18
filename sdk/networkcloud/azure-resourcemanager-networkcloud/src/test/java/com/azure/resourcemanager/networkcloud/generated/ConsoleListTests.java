// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.fluent.models.ConsoleInner;
import com.azure.resourcemanager.networkcloud.models.ConsoleEnabled;
import com.azure.resourcemanager.networkcloud.models.ConsoleList;
import com.azure.resourcemanager.networkcloud.models.ExtendedLocation;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ConsoleListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ConsoleList model =
            BinaryData
                .fromString(
                    "{\"nextLink\":\"v\",\"value\":[{\"extendedLocation\":{\"name\":\"slcqxypokkh\",\"type\":\"inqcymczngnbdxxe\"},\"properties\":{\"detailedStatus\":\"Error\",\"detailedStatusMessage\":\"nvudbchaqdtvqecr\",\"enabled\":\"True\",\"expiration\":\"2021-07-29T21:58:39Z\",\"privateLinkServiceId\":\"xdtddmflhuytxzv\",\"provisioningState\":\"Canceled\",\"virtualMachineAccessId\":\"pxbannovvoxc\"},\"location\":\"tprwnw\",\"tags\":{\"tlyo\":\"ev\",\"bcrymodizrx\":\"rrrouuxvnsa\",\"pmkmlmvevfx\":\"lobdxna\"},\"id\":\"op\",\"name\":\"hbzxli\",\"type\":\"hrdd\"}]}")
                .toObject(ConsoleList.class);
        Assertions.assertEquals("v", model.nextLink());
        Assertions.assertEquals("tprwnw", model.value().get(0).location());
        Assertions.assertEquals("ev", model.value().get(0).tags().get("tlyo"));
        Assertions.assertEquals("slcqxypokkh", model.value().get(0).extendedLocation().name());
        Assertions.assertEquals("inqcymczngnbdxxe", model.value().get(0).extendedLocation().type());
        Assertions.assertEquals(ConsoleEnabled.TRUE, model.value().get(0).enabled());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-29T21:58:39Z"), model.value().get(0).expiration());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ConsoleList model =
            new ConsoleList()
                .withNextLink("v")
                .withValue(
                    Arrays
                        .asList(
                            new ConsoleInner()
                                .withLocation("tprwnw")
                                .withTags(mapOf("tlyo", "ev", "bcrymodizrx", "rrrouuxvnsa", "pmkmlmvevfx", "lobdxna"))
                                .withExtendedLocation(
                                    new ExtendedLocation().withName("slcqxypokkh").withType("inqcymczngnbdxxe"))
                                .withEnabled(ConsoleEnabled.TRUE)
                                .withExpiration(OffsetDateTime.parse("2021-07-29T21:58:39Z"))));
        model = BinaryData.fromObject(model).toObject(ConsoleList.class);
        Assertions.assertEquals("v", model.nextLink());
        Assertions.assertEquals("tprwnw", model.value().get(0).location());
        Assertions.assertEquals("ev", model.value().get(0).tags().get("tlyo"));
        Assertions.assertEquals("slcqxypokkh", model.value().get(0).extendedLocation().name());
        Assertions.assertEquals("inqcymczngnbdxxe", model.value().get(0).extendedLocation().type());
        Assertions.assertEquals(ConsoleEnabled.TRUE, model.value().get(0).enabled());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-29T21:58:39Z"), model.value().get(0).expiration());
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
