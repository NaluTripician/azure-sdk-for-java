// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.models.ClusterIdentity;
import com.azure.resourcemanager.hdinsight.models.ResourceIdentityType;
import com.azure.resourcemanager.hdinsight.models.UserAssignedIdentity;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ClusterIdentityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterIdentity model =
            BinaryData
                .fromString(
                    "{\"principalId\":\"ni\",\"tenantId\":\"x\",\"type\":\"None\",\"userAssignedIdentities\":{\"uwprzql\":{\"principalId\":\"gklwn\",\"clientId\":\"hjdauwhvylwz\",\"tenantId\":\"dhxujznbmpo\"}}}")
                .toObject(ClusterIdentity.class);
        Assertions.assertEquals(ResourceIdentityType.NONE, model.type());
        Assertions.assertEquals("dhxujznbmpo", model.userAssignedIdentities().get("uwprzql").tenantId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterIdentity model =
            new ClusterIdentity()
                .withType(ResourceIdentityType.NONE)
                .withUserAssignedIdentities(mapOf("uwprzql", new UserAssignedIdentity().withTenantId("dhxujznbmpo")));
        model = BinaryData.fromObject(model).toObject(ClusterIdentity.class);
        Assertions.assertEquals(ResourceIdentityType.NONE, model.type());
        Assertions.assertEquals("dhxujznbmpo", model.userAssignedIdentities().get("uwprzql").tenantId());
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
