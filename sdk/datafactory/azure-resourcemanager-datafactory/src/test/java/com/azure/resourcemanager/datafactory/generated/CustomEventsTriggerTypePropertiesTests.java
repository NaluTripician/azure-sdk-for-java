// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.CustomEventsTriggerTypeProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class CustomEventsTriggerTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CustomEventsTriggerTypeProperties model = BinaryData.fromString(
            "{\"subjectBeginsWith\":\"hkm\",\"subjectEndsWith\":\"raoytkkqoaazvmn\",\"events\":[\"datadzfypdsrfpihvij\",\"datajtkpocqboyjjfx\"],\"scope\":\"njduyotqb\"}")
            .toObject(CustomEventsTriggerTypeProperties.class);
        Assertions.assertEquals("hkm", model.subjectBeginsWith());
        Assertions.assertEquals("raoytkkqoaazvmn", model.subjectEndsWith());
        Assertions.assertEquals("njduyotqb", model.scope());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CustomEventsTriggerTypeProperties model = new CustomEventsTriggerTypeProperties().withSubjectBeginsWith("hkm")
            .withSubjectEndsWith("raoytkkqoaazvmn")
            .withEvents(Arrays.asList("datadzfypdsrfpihvij", "datajtkpocqboyjjfx")).withScope("njduyotqb");
        model = BinaryData.fromObject(model).toObject(CustomEventsTriggerTypeProperties.class);
        Assertions.assertEquals("hkm", model.subjectBeginsWith());
        Assertions.assertEquals("raoytkkqoaazvmn", model.subjectEndsWith());
        Assertions.assertEquals("njduyotqb", model.scope());
    }
}
