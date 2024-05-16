// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.AzureRetentionRule;
import com.azure.resourcemanager.dataprotection.models.CopyOption;
import com.azure.resourcemanager.dataprotection.models.DataStoreInfoBase;
import com.azure.resourcemanager.dataprotection.models.DataStoreTypes;
import com.azure.resourcemanager.dataprotection.models.DeleteOption;
import com.azure.resourcemanager.dataprotection.models.SourceLifeCycle;
import com.azure.resourcemanager.dataprotection.models.TargetCopySetting;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AzureRetentionRuleTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureRetentionRule model = BinaryData.fromString(
            "{\"objectType\":\"AzureRetentionRule\",\"isDefault\":true,\"lifecycles\":[{\"deleteAfter\":{\"objectType\":\"DeleteOption\",\"duration\":\"cluyovwxnbkf\"},\"sourceDataStore\":{\"dataStoreType\":\"VaultStore\",\"objectType\":\"zxscyhwzdgirujb\"},\"targetDataStoreCopySettings\":[{\"copyAfter\":{\"objectType\":\"CopyOption\"},\"dataStore\":{\"dataStoreType\":\"VaultStore\",\"objectType\":\"vzzbtdcq\"}},{\"copyAfter\":{\"objectType\":\"CopyOption\"},\"dataStore\":{\"dataStoreType\":\"VaultStore\",\"objectType\":\"niyujv\"}}]},{\"deleteAfter\":{\"objectType\":\"DeleteOption\",\"duration\":\"ylwdshfssn\"},\"sourceDataStore\":{\"dataStoreType\":\"OperationalStore\",\"objectType\":\"gy\"},\"targetDataStoreCopySettings\":[{\"copyAfter\":{\"objectType\":\"CopyOption\"},\"dataStore\":{\"dataStoreType\":\"OperationalStore\",\"objectType\":\"msgaoj\"}},{\"copyAfter\":{\"objectType\":\"CopyOption\"},\"dataStore\":{\"dataStoreType\":\"ArchiveStore\",\"objectType\":\"wncot\"}},{\"copyAfter\":{\"objectType\":\"CopyOption\"},\"dataStore\":{\"dataStoreType\":\"VaultStore\",\"objectType\":\"fhir\"}}]}],\"name\":\"tymoxoftp\"}")
            .toObject(AzureRetentionRule.class);
        Assertions.assertEquals("tymoxoftp", model.name());
        Assertions.assertEquals(true, model.isDefault());
        Assertions.assertEquals("cluyovwxnbkf", model.lifecycles().get(0).deleteAfter().duration());
        Assertions.assertEquals(DataStoreTypes.VAULT_STORE,
            model.lifecycles().get(0).sourceDataStore().dataStoreType());
        Assertions.assertEquals("zxscyhwzdgirujb", model.lifecycles().get(0).sourceDataStore().objectType());
        Assertions.assertEquals(DataStoreTypes.VAULT_STORE,
            model.lifecycles().get(0).targetDataStoreCopySettings().get(0).dataStore().dataStoreType());
        Assertions.assertEquals("vzzbtdcq",
            model.lifecycles().get(0).targetDataStoreCopySettings().get(0).dataStore().objectType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureRetentionRule model = new AzureRetentionRule().withName("tymoxoftp").withIsDefault(true)
            .withLifecycles(Arrays.asList(
                new SourceLifeCycle().withDeleteAfter(new DeleteOption().withDuration("cluyovwxnbkf"))
                    .withSourceDataStore(new DataStoreInfoBase().withDataStoreType(DataStoreTypes.VAULT_STORE)
                        .withObjectType("zxscyhwzdgirujb"))
                    .withTargetDataStoreCopySettings(Arrays.asList(
                        new TargetCopySetting().withCopyAfter(new CopyOption())
                            .withDataStore(new DataStoreInfoBase().withDataStoreType(DataStoreTypes.VAULT_STORE)
                                .withObjectType("vzzbtdcq")),
                        new TargetCopySetting().withCopyAfter(new CopyOption())
                            .withDataStore(new DataStoreInfoBase().withDataStoreType(DataStoreTypes.VAULT_STORE)
                                .withObjectType("niyujv")))),
                new SourceLifeCycle().withDeleteAfter(new DeleteOption().withDuration("ylwdshfssn"))
                    .withSourceDataStore(new DataStoreInfoBase().withDataStoreType(DataStoreTypes.OPERATIONAL_STORE)
                        .withObjectType("gy"))
                    .withTargetDataStoreCopySettings(Arrays.asList(
                        new TargetCopySetting()
                            .withCopyAfter(new CopyOption())
                            .withDataStore(new DataStoreInfoBase().withDataStoreType(DataStoreTypes.OPERATIONAL_STORE)
                                .withObjectType("msgaoj")),
                        new TargetCopySetting().withCopyAfter(new CopyOption())
                            .withDataStore(new DataStoreInfoBase().withDataStoreType(DataStoreTypes.ARCHIVE_STORE)
                                .withObjectType("wncot")),
                        new TargetCopySetting().withCopyAfter(new CopyOption()).withDataStore(new DataStoreInfoBase()
                            .withDataStoreType(DataStoreTypes.VAULT_STORE).withObjectType("fhir"))))));
        model = BinaryData.fromObject(model).toObject(AzureRetentionRule.class);
        Assertions.assertEquals("tymoxoftp", model.name());
        Assertions.assertEquals(true, model.isDefault());
        Assertions.assertEquals("cluyovwxnbkf", model.lifecycles().get(0).deleteAfter().duration());
        Assertions.assertEquals(DataStoreTypes.VAULT_STORE,
            model.lifecycles().get(0).sourceDataStore().dataStoreType());
        Assertions.assertEquals("zxscyhwzdgirujb", model.lifecycles().get(0).sourceDataStore().objectType());
        Assertions.assertEquals(DataStoreTypes.VAULT_STORE,
            model.lifecycles().get(0).targetDataStoreCopySettings().get(0).dataStore().dataStoreType());
        Assertions.assertEquals("vzzbtdcq",
            model.lifecycles().get(0).targetDataStoreCopySettings().get(0).dataStore().objectType());
    }
}
