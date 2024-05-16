// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.connectedvmware.models.InventoryItemProperties;
import org.junit.jupiter.api.Assertions;

public final class InventoryItemPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InventoryItemProperties model =
            BinaryData
                .fromString(
                    "{\"inventoryType\":\"InventoryItemProperties\",\"managedResourceId\":\"zvhxnk\",\"moRefId\":\"tkubotppn\",\"moName\":\"xz\",\"provisioningState\":\"Deleting\"}")
                .toObject(InventoryItemProperties.class);
        Assertions.assertEquals("zvhxnk", model.managedResourceId());
        Assertions.assertEquals("tkubotppn", model.moRefId());
        Assertions.assertEquals("xz", model.moName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InventoryItemProperties model =
            new InventoryItemProperties().withManagedResourceId("zvhxnk").withMoRefId("tkubotppn").withMoName("xz");
        model = BinaryData.fromObject(model).toObject(InventoryItemProperties.class);
        Assertions.assertEquals("zvhxnk", model.managedResourceId());
        Assertions.assertEquals("tkubotppn", model.moRefId());
        Assertions.assertEquals("xz", model.moName());
    }
}
