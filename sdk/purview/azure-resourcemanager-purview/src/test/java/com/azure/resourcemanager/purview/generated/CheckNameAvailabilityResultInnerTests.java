// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.purview.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.purview.fluent.models.CheckNameAvailabilityResultInner;
import com.azure.resourcemanager.purview.models.Reason;
import org.junit.jupiter.api.Assertions;

public final class CheckNameAvailabilityResultInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CheckNameAvailabilityResultInner model =
            BinaryData
                .fromString("{\"message\":\"r\",\"nameAvailable\":false,\"reason\":\"Invalid\"}")
                .toObject(CheckNameAvailabilityResultInner.class);
        Assertions.assertEquals("r", model.message());
        Assertions.assertEquals(false, model.nameAvailable());
        Assertions.assertEquals(Reason.INVALID, model.reason());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CheckNameAvailabilityResultInner model =
            new CheckNameAvailabilityResultInner().withMessage("r").withNameAvailable(false).withReason(Reason.INVALID);
        model = BinaryData.fromObject(model).toObject(CheckNameAvailabilityResultInner.class);
        Assertions.assertEquals("r", model.message());
        Assertions.assertEquals(false, model.nameAvailable());
        Assertions.assertEquals(Reason.INVALID, model.reason());
    }
}
