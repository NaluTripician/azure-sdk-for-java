// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.fluent.models.RegionContractInner;
import org.junit.jupiter.api.Assertions;

public final class RegionContractInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RegionContractInner model =
            BinaryData
                .fromString("{\"name\":\"plgtpvd\",\"isMasterRegion\":false,\"isDeleted\":true}")
                .toObject(RegionContractInner.class);
        Assertions.assertEquals(false, model.isMasterRegion());
        Assertions.assertEquals(true, model.isDeleted());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RegionContractInner model = new RegionContractInner().withIsMasterRegion(false).withIsDeleted(true);
        model = BinaryData.fromObject(model).toObject(RegionContractInner.class);
        Assertions.assertEquals(false, model.isMasterRegion());
        Assertions.assertEquals(true, model.isDeleted());
    }
}
