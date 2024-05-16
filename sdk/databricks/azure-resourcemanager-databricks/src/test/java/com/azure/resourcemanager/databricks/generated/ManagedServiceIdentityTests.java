// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databricks.models.ManagedServiceIdentity;
import com.azure.resourcemanager.databricks.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.databricks.models.UserAssignedIdentity;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ManagedServiceIdentityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagedServiceIdentity model =
            BinaryData
                .fromString(
                    "{\"principalId\":\"df9de276-bc35-4f4b-adfa-29024408ba4e\",\"tenantId\":\"6f28171b-d601-46f5-8279-d01f67385894\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{\"uctqhjfbe\":{\"principalId\":\"ec477f0d-1fbe-48e2-8f24-0caa774edaf4\",\"clientId\":\"b2c541da-473e-49c0-a98f-e4b53201a846\"},\"cxerf\":{\"principalId\":\"d88a34b8-a22a-464b-b4d7-cb3e9672d7c8\",\"clientId\":\"7bfd5676-94e4-454c-997e-f812deae3ae6\"},\"tttxfvjrb\":{\"principalId\":\"b304f0c9-0cd3-4b1b-baf3-0615a0101f84\",\"clientId\":\"9ee8a22a-cb0b-45c6-9d6c-93553ac5b16e\"},\"hxepcyvahfnlj\":{\"principalId\":\"87556d43-cec0-4efa-8e5a-41d01c56d224\",\"clientId\":\"04020914-c081-4845-a976-1767db4cbd11\"}}}")
                .toObject(ManagedServiceIdentity.class);
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagedServiceIdentity model =
            new ManagedServiceIdentity()
                .withType(ManagedServiceIdentityType.USER_ASSIGNED)
                .withUserAssignedIdentities(
                    mapOf(
                        "uctqhjfbe",
                        new UserAssignedIdentity(),
                        "cxerf",
                        new UserAssignedIdentity(),
                        "tttxfvjrb",
                        new UserAssignedIdentity(),
                        "hxepcyvahfnlj",
                        new UserAssignedIdentity()));
        model = BinaryData.fromObject(model).toObject(ManagedServiceIdentity.class);
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, model.type());
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
