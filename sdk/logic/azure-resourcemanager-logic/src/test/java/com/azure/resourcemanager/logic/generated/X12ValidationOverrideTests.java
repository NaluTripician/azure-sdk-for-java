// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.logic.models.TrailingSeparatorPolicy;
import com.azure.resourcemanager.logic.models.X12ValidationOverride;
import org.junit.jupiter.api.Assertions;

public final class X12ValidationOverrideTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        X12ValidationOverride model =
            BinaryData
                .fromString(
                    "{\"messageId\":\"vldspa\",\"validateEDITypes\":false,\"validateXSDTypes\":true,\"allowLeadingAndTrailingSpacesAndZeroes\":false,\"validateCharacterSet\":false,\"trimLeadingAndTrailingSpacesAndZeroes\":true,\"trailingSeparatorPolicy\":\"NotAllowed\"}")
                .toObject(X12ValidationOverride.class);
        Assertions.assertEquals("vldspa", model.messageId());
        Assertions.assertEquals(false, model.validateEdiTypes());
        Assertions.assertEquals(true, model.validateXsdTypes());
        Assertions.assertEquals(false, model.allowLeadingAndTrailingSpacesAndZeroes());
        Assertions.assertEquals(false, model.validateCharacterSet());
        Assertions.assertEquals(true, model.trimLeadingAndTrailingSpacesAndZeroes());
        Assertions.assertEquals(TrailingSeparatorPolicy.NOT_ALLOWED, model.trailingSeparatorPolicy());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        X12ValidationOverride model =
            new X12ValidationOverride()
                .withMessageId("vldspa")
                .withValidateEdiTypes(false)
                .withValidateXsdTypes(true)
                .withAllowLeadingAndTrailingSpacesAndZeroes(false)
                .withValidateCharacterSet(false)
                .withTrimLeadingAndTrailingSpacesAndZeroes(true)
                .withTrailingSeparatorPolicy(TrailingSeparatorPolicy.NOT_ALLOWED);
        model = BinaryData.fromObject(model).toObject(X12ValidationOverride.class);
        Assertions.assertEquals("vldspa", model.messageId());
        Assertions.assertEquals(false, model.validateEdiTypes());
        Assertions.assertEquals(true, model.validateXsdTypes());
        Assertions.assertEquals(false, model.allowLeadingAndTrailingSpacesAndZeroes());
        Assertions.assertEquals(false, model.validateCharacterSet());
        Assertions.assertEquals(true, model.trimLeadingAndTrailingSpacesAndZeroes());
        Assertions.assertEquals(TrailingSeparatorPolicy.NOT_ALLOWED, model.trailingSeparatorPolicy());
    }
}
