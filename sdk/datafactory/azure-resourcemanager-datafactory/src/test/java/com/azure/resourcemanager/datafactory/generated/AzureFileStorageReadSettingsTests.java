// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureFileStorageReadSettings;

public final class AzureFileStorageReadSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureFileStorageReadSettings model = BinaryData.fromString(
            "{\"type\":\"AzureFileStorageReadSettings\",\"recursive\":\"datajldwxdqt\",\"wildcardFolderPath\":\"datatgn\",\"wildcardFileName\":\"databjvmdkgvu\",\"prefix\":\"datamlsuuhwuox\",\"fileListPath\":\"datai\",\"enablePartitionDiscovery\":\"datazzjo\",\"partitionRootPath\":\"dataygzjrkslqba\",\"deleteFilesAfterCompletion\":\"databjxxcruleim\",\"modifiedDatetimeStart\":\"dataxoign\",\"modifiedDatetimeEnd\":\"datamjmpgzetuvfp\",\"maxConcurrentConnections\":\"datajpmeptnqsnpa\",\"disableMetricsCollection\":\"datasprrvjwbeeolm\",\"\":{\"fk\":\"dataqol\",\"aphlwmivazfnb\":\"datadwzvhtgfdy\"}}")
            .toObject(AzureFileStorageReadSettings.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureFileStorageReadSettings model = new AzureFileStorageReadSettings()
            .withMaxConcurrentConnections("datajpmeptnqsnpa").withDisableMetricsCollection("datasprrvjwbeeolm")
            .withRecursive("datajldwxdqt").withWildcardFolderPath("datatgn").withWildcardFileName("databjvmdkgvu")
            .withPrefix("datamlsuuhwuox").withFileListPath("datai").withEnablePartitionDiscovery("datazzjo")
            .withPartitionRootPath("dataygzjrkslqba").withDeleteFilesAfterCompletion("databjxxcruleim")
            .withModifiedDatetimeStart("dataxoign").withModifiedDatetimeEnd("datamjmpgzetuvfp");
        model = BinaryData.fromObject(model).toObject(AzureFileStorageReadSettings.class);
    }
}
