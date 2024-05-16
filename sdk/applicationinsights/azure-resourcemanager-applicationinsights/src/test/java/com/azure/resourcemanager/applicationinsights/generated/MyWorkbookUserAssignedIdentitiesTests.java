// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.applicationinsights.models.MyWorkbookUserAssignedIdentities;

public final class MyWorkbookUserAssignedIdentitiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MyWorkbookUserAssignedIdentities model =
            BinaryData
                .fromString("{\"principalId\":\"jvp\",\"tenantId\":\"qgxy\"}")
                .toObject(MyWorkbookUserAssignedIdentities.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MyWorkbookUserAssignedIdentities model = new MyWorkbookUserAssignedIdentities();
        model = BinaryData.fromObject(model).toObject(MyWorkbookUserAssignedIdentities.class);
    }
}
