// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagepool.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storagepool.fluent.models.Sku;
import com.azure.resourcemanager.storagepool.models.Disk;
import com.azure.resourcemanager.storagepool.models.DiskPoolUpdate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DiskPoolUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DiskPoolUpdate model =
            BinaryData
                .fromString(
                    "{\"managedBy\":\"kanyktzlcuiywg\",\"managedByExtended\":[\"gndrvynh\",\"gpphrcgyn\",\"ocpecfvmmco\",\"fsxlzevgbmqjqa\"],\"properties\":{\"disks\":[{\"id\":\"pmivkwlzu\"}]},\"sku\":{\"name\":\"c\",\"tier\":\"nfnbacfionlebxe\"},\"tags\":{\"jfeallnwsub\":\"tzxdpnqbqqwx\",\"zscxaqwo\":\"snjampmng\"}}")
                .toObject(DiskPoolUpdate.class);
        Assertions.assertEquals("kanyktzlcuiywg", model.managedBy());
        Assertions.assertEquals("gndrvynh", model.managedByExtended().get(0));
        Assertions.assertEquals("c", model.sku().name());
        Assertions.assertEquals("nfnbacfionlebxe", model.sku().tier());
        Assertions.assertEquals("tzxdpnqbqqwx", model.tags().get("jfeallnwsub"));
        Assertions.assertEquals("pmivkwlzu", model.disks().get(0).id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DiskPoolUpdate model =
            new DiskPoolUpdate()
                .withManagedBy("kanyktzlcuiywg")
                .withManagedByExtended(Arrays.asList("gndrvynh", "gpphrcgyn", "ocpecfvmmco", "fsxlzevgbmqjqa"))
                .withSku(new Sku().withName("c").withTier("nfnbacfionlebxe"))
                .withTags(mapOf("jfeallnwsub", "tzxdpnqbqqwx", "zscxaqwo", "snjampmng"))
                .withDisks(Arrays.asList(new Disk().withId("pmivkwlzu")));
        model = BinaryData.fromObject(model).toObject(DiskPoolUpdate.class);
        Assertions.assertEquals("kanyktzlcuiywg", model.managedBy());
        Assertions.assertEquals("gndrvynh", model.managedByExtended().get(0));
        Assertions.assertEquals("c", model.sku().name());
        Assertions.assertEquals("nfnbacfionlebxe", model.sku().tier());
        Assertions.assertEquals("tzxdpnqbqqwx", model.tags().get("jfeallnwsub"));
        Assertions.assertEquals("pmivkwlzu", model.disks().get(0).id());
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
