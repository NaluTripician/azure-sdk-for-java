// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.ManagedCertificatePatch;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ManagedCertificatePatchTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagedCertificatePatch model
            = BinaryData.fromString("{\"tags\":{\"jmucftby\":\"mtrwah\"}}").toObject(ManagedCertificatePatch.class);
        Assertions.assertEquals("mtrwah", model.tags().get("jmucftby"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagedCertificatePatch model = new ManagedCertificatePatch().withTags(mapOf("jmucftby", "mtrwah"));
        model = BinaryData.fromObject(model).toObject(ManagedCertificatePatch.class);
        Assertions.assertEquals("mtrwah", model.tags().get("jmucftby"));
    }

    // Use "Map.of" if available
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
