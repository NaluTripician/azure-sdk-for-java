// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loadtesting.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.loadtesting.fluent.models.CheckQuotaAvailabilityResponseInner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class CheckQuotaAvailabilityResponseInnerTests {
    @Test
    public void testDeserialize() throws Exception {
        CheckQuotaAvailabilityResponseInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"isAvailable\":true,\"availabilityStatus\":\"jpslwejd\"},\"id\":\"wryoqpsoacc\",\"name\":\"azakl\",\"type\":\"lahbcryff\"}")
                .toObject(CheckQuotaAvailabilityResponseInner.class);
        Assertions.assertEquals(true, model.isAvailable());
        Assertions.assertEquals("jpslwejd", model.availabilityStatus());
    }

    @Test
    public void testSerialize() throws Exception {
        CheckQuotaAvailabilityResponseInner model =
            new CheckQuotaAvailabilityResponseInner().withIsAvailable(true).withAvailabilityStatus("jpslwejd");
        model = BinaryData.fromObject(model).toObject(CheckQuotaAvailabilityResponseInner.class);
        Assertions.assertEquals(true, model.isAvailable());
        Assertions.assertEquals("jpslwejd", model.availabilityStatus());
    }
}
