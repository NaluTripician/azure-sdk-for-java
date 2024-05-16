// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedapplications.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managedapplications.models.JitAuthorizationPolicies;
import org.junit.jupiter.api.Assertions;

public final class JitAuthorizationPoliciesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        JitAuthorizationPolicies model =
            BinaryData
                .fromString("{\"principalId\":\"nvowgujju\",\"roleDefinitionId\":\"wdkcglhsl\"}")
                .toObject(JitAuthorizationPolicies.class);
        Assertions.assertEquals("nvowgujju", model.principalId());
        Assertions.assertEquals("wdkcglhsl", model.roleDefinitionId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        JitAuthorizationPolicies model =
            new JitAuthorizationPolicies().withPrincipalId("nvowgujju").withRoleDefinitionId("wdkcglhsl");
        model = BinaryData.fromObject(model).toObject(JitAuthorizationPolicies.class);
        Assertions.assertEquals("nvowgujju", model.principalId());
        Assertions.assertEquals("wdkcglhsl", model.roleDefinitionId());
    }
}
