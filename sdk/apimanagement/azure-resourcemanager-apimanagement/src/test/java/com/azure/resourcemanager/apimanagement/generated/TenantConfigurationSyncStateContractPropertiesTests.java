// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.fluent.models.TenantConfigurationSyncStateContractProperties;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class TenantConfigurationSyncStateContractPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TenantConfigurationSyncStateContractProperties model =
            BinaryData
                .fromString(
                    "{\"branch\":\"unsbfjhhlw\",\"commitId\":\"kvegeattbzkgtzq\",\"isExport\":true,\"isSynced\":true,\"isGitEnabled\":true,\"syncDate\":\"2021-12-03T01:55:12Z\",\"configurationChangeDate\":\"2021-05-18T12:42:31Z\",\"lastOperationId\":\"sjeufjxflpd\"}")
                .toObject(TenantConfigurationSyncStateContractProperties.class);
        Assertions.assertEquals("unsbfjhhlw", model.branch());
        Assertions.assertEquals("kvegeattbzkgtzq", model.commitId());
        Assertions.assertEquals(true, model.isExport());
        Assertions.assertEquals(true, model.isSynced());
        Assertions.assertEquals(true, model.isGitEnabled());
        Assertions.assertEquals(OffsetDateTime.parse("2021-12-03T01:55:12Z"), model.syncDate());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-18T12:42:31Z"), model.configurationChangeDate());
        Assertions.assertEquals("sjeufjxflpd", model.lastOperationId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TenantConfigurationSyncStateContractProperties model =
            new TenantConfigurationSyncStateContractProperties()
                .withBranch("unsbfjhhlw")
                .withCommitId("kvegeattbzkgtzq")
                .withIsExport(true)
                .withIsSynced(true)
                .withIsGitEnabled(true)
                .withSyncDate(OffsetDateTime.parse("2021-12-03T01:55:12Z"))
                .withConfigurationChangeDate(OffsetDateTime.parse("2021-05-18T12:42:31Z"))
                .withLastOperationId("sjeufjxflpd");
        model = BinaryData.fromObject(model).toObject(TenantConfigurationSyncStateContractProperties.class);
        Assertions.assertEquals("unsbfjhhlw", model.branch());
        Assertions.assertEquals("kvegeattbzkgtzq", model.commitId());
        Assertions.assertEquals(true, model.isExport());
        Assertions.assertEquals(true, model.isSynced());
        Assertions.assertEquals(true, model.isGitEnabled());
        Assertions.assertEquals(OffsetDateTime.parse("2021-12-03T01:55:12Z"), model.syncDate());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-18T12:42:31Z"), model.configurationChangeDate());
        Assertions.assertEquals("sjeufjxflpd", model.lastOperationId());
    }
}
