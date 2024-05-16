// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dynatrace.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dynatrace.models.IdentityProperties;
import com.azure.resourcemanager.dynatrace.models.ManagedIdentityType;
import com.azure.resourcemanager.dynatrace.models.UserAssignedIdentity;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class IdentityPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IdentityProperties model =
            BinaryData
                .fromString(
                    "{\"tenantId\":\"wyahuxinpmqnja\",\"principalId\":\"ixjsprozvcputeg\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{\"ozkrwfndiodjpslw\":{\"clientId\":\"fdatsc\",\"principalId\":\"dvpjhulsuuvmk\"},\"hbcryffdfdosyge\":{\"clientId\":\"jdpvwryo\",\"principalId\":\"psoacctazakljl\"},\"hqtrgqjbpf\":{\"clientId\":\"paojakhmsbzjh\",\"principalId\":\"rzevdphlxaol\"}}}")
                .toObject(IdentityProperties.class);
        Assertions.assertEquals(ManagedIdentityType.USER_ASSIGNED, model.type());
        Assertions.assertEquals("fdatsc", model.userAssignedIdentities().get("ozkrwfndiodjpslw").clientId());
        Assertions.assertEquals("dvpjhulsuuvmk", model.userAssignedIdentities().get("ozkrwfndiodjpslw").principalId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IdentityProperties model =
            new IdentityProperties()
                .withType(ManagedIdentityType.USER_ASSIGNED)
                .withUserAssignedIdentities(
                    mapOf(
                        "ozkrwfndiodjpslw",
                        new UserAssignedIdentity().withClientId("fdatsc").withPrincipalId("dvpjhulsuuvmk"),
                        "hbcryffdfdosyge",
                        new UserAssignedIdentity().withClientId("jdpvwryo").withPrincipalId("psoacctazakljl"),
                        "hqtrgqjbpf",
                        new UserAssignedIdentity().withClientId("paojakhmsbzjh").withPrincipalId("rzevdphlxaol")));
        model = BinaryData.fromObject(model).toObject(IdentityProperties.class);
        Assertions.assertEquals(ManagedIdentityType.USER_ASSIGNED, model.type());
        Assertions.assertEquals("fdatsc", model.userAssignedIdentities().get("ozkrwfndiodjpslw").clientId());
        Assertions.assertEquals("dvpjhulsuuvmk", model.userAssignedIdentities().get("ozkrwfndiodjpslw").principalId());
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
