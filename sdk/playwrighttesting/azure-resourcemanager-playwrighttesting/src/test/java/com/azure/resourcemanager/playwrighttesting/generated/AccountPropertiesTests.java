// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.playwrighttesting.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.playwrighttesting.fluent.models.AccountProperties;
import com.azure.resourcemanager.playwrighttesting.models.EnablementStatus;
import org.junit.jupiter.api.Assertions;

public final class AccountPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AccountProperties model =
            BinaryData
                .fromString(
                    "{\"dashboardUri\":\"t\",\"regionalAffinity\":\"Disabled\",\"scalableExecution\":\"Disabled\",\"reporting\":\"Disabled\",\"provisioningState\":\"Failed\"}")
                .toObject(AccountProperties.class);
        Assertions.assertEquals(EnablementStatus.DISABLED, model.regionalAffinity());
        Assertions.assertEquals(EnablementStatus.DISABLED, model.scalableExecution());
        Assertions.assertEquals(EnablementStatus.DISABLED, model.reporting());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AccountProperties model =
            new AccountProperties()
                .withRegionalAffinity(EnablementStatus.DISABLED)
                .withScalableExecution(EnablementStatus.DISABLED)
                .withReporting(EnablementStatus.DISABLED);
        model = BinaryData.fromObject(model).toObject(AccountProperties.class);
        Assertions.assertEquals(EnablementStatus.DISABLED, model.regionalAffinity());
        Assertions.assertEquals(EnablementStatus.DISABLED, model.scalableExecution());
        Assertions.assertEquals(EnablementStatus.DISABLED, model.reporting());
    }
}
