// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.NameAvailabilityInner;
import org.junit.jupiter.api.Assertions;

public final class NameAvailabilityInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NameAvailabilityInner model
            = BinaryData.fromString("{\"message\":\"crkvcikhnv\",\"nameAvailable\":false,\"reason\":\"gxqquezik\"}")
                .toObject(NameAvailabilityInner.class);
        Assertions.assertEquals("crkvcikhnv", model.message());
        Assertions.assertEquals(false, model.nameAvailable());
        Assertions.assertEquals("gxqquezik", model.reason());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NameAvailabilityInner model
            = new NameAvailabilityInner().withMessage("crkvcikhnv").withNameAvailable(false).withReason("gxqquezik");
        model = BinaryData.fromObject(model).toObject(NameAvailabilityInner.class);
        Assertions.assertEquals("crkvcikhnv", model.message());
        Assertions.assertEquals(false, model.nameAvailable());
        Assertions.assertEquals("gxqquezik", model.reason());
    }
}
