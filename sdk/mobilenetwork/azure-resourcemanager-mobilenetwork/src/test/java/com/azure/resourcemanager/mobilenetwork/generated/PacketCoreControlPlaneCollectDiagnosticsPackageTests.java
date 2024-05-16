// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mobilenetwork.models.PacketCoreControlPlaneCollectDiagnosticsPackage;
import org.junit.jupiter.api.Assertions;

public final class PacketCoreControlPlaneCollectDiagnosticsPackageTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PacketCoreControlPlaneCollectDiagnosticsPackage model
            = BinaryData.fromString("{\"storageAccountBlobUrl\":\"kfpbs\"}")
                .toObject(PacketCoreControlPlaneCollectDiagnosticsPackage.class);
        Assertions.assertEquals("kfpbs", model.storageAccountBlobUrl());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PacketCoreControlPlaneCollectDiagnosticsPackage model
            = new PacketCoreControlPlaneCollectDiagnosticsPackage().withStorageAccountBlobUrl("kfpbs");
        model = BinaryData.fromObject(model).toObject(PacketCoreControlPlaneCollectDiagnosticsPackage.class);
        Assertions.assertEquals("kfpbs", model.storageAccountBlobUrl());
    }
}
