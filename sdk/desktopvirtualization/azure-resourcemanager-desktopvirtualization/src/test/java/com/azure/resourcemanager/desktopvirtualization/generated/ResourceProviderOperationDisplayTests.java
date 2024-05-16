// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.desktopvirtualization.models.ResourceProviderOperationDisplay;
import org.junit.jupiter.api.Assertions;

public final class ResourceProviderOperationDisplayTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceProviderOperationDisplay model =
            BinaryData
                .fromString(
                    "{\"provider\":\"ryrtihfxtijbpzv\",\"resource\":\"wzsymglzufcy\",\"operation\":\"ohdbihanufh\",\"description\":\"bj\"}")
                .toObject(ResourceProviderOperationDisplay.class);
        Assertions.assertEquals("ryrtihfxtijbpzv", model.provider());
        Assertions.assertEquals("wzsymglzufcy", model.resource());
        Assertions.assertEquals("ohdbihanufh", model.operation());
        Assertions.assertEquals("bj", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceProviderOperationDisplay model =
            new ResourceProviderOperationDisplay()
                .withProvider("ryrtihfxtijbpzv")
                .withResource("wzsymglzufcy")
                .withOperation("ohdbihanufh")
                .withDescription("bj");
        model = BinaryData.fromObject(model).toObject(ResourceProviderOperationDisplay.class);
        Assertions.assertEquals("ryrtihfxtijbpzv", model.provider());
        Assertions.assertEquals("wzsymglzufcy", model.resource());
        Assertions.assertEquals("ohdbihanufh", model.operation());
        Assertions.assertEquals("bj", model.description());
    }
}
