// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedapplications.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managedapplications.models.ApplicationAuthorization;
import org.junit.jupiter.api.Assertions;

public final class ApplicationAuthorizationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApplicationAuthorization model =
            BinaryData
                .fromString("{\"principalId\":\"wtnhxbnjbiksqr\",\"roleDefinitionId\":\"lssai\"}")
                .toObject(ApplicationAuthorization.class);
        Assertions.assertEquals("wtnhxbnjbiksqr", model.principalId());
        Assertions.assertEquals("lssai", model.roleDefinitionId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApplicationAuthorization model =
            new ApplicationAuthorization().withPrincipalId("wtnhxbnjbiksqr").withRoleDefinitionId("lssai");
        model = BinaryData.fromObject(model).toObject(ApplicationAuthorization.class);
        Assertions.assertEquals("wtnhxbnjbiksqr", model.principalId());
        Assertions.assertEquals("lssai", model.roleDefinitionId());
    }
}
