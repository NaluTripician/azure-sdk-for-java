// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.models.StorageApplianceEnableRemoteVendorManagementParameters;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class StorageApplianceEnableRemoteVendorManagementParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StorageApplianceEnableRemoteVendorManagementParameters model =
            BinaryData
                .fromString("{\"supportEndpoints\":[\"kczvvita\",\"gx\",\"fcsserxhtvsox\",\"lwntsjgqrs\"]}")
                .toObject(StorageApplianceEnableRemoteVendorManagementParameters.class);
        Assertions.assertEquals("kczvvita", model.supportEndpoints().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StorageApplianceEnableRemoteVendorManagementParameters model =
            new StorageApplianceEnableRemoteVendorManagementParameters()
                .withSupportEndpoints(Arrays.asList("kczvvita", "gx", "fcsserxhtvsox", "lwntsjgqrs"));
        model = BinaryData.fromObject(model).toObject(StorageApplianceEnableRemoteVendorManagementParameters.class);
        Assertions.assertEquals("kczvvita", model.supportEndpoints().get(0));
    }
}
