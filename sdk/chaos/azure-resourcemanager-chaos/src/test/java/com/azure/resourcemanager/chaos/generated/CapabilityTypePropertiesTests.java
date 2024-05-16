// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.chaos.fluent.models.CapabilityTypeProperties;
import com.azure.resourcemanager.chaos.models.CapabilityTypePropertiesRuntimeProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class CapabilityTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CapabilityTypeProperties model = BinaryData.fromString(
            "{\"publisher\":\"gcue\",\"targetType\":\"umkdosvqwhbmd\",\"displayName\":\"bjf\",\"description\":\"gmbmbexppbh\",\"parametersSchema\":\"qrolfpf\",\"urn\":\"algbquxigjyjg\",\"kind\":\"aoyfhrtxilnerkuj\",\"azureRbacActions\":[\"l\",\"juvf\",\"awrlyx\"],\"azureRbacDataActions\":[\"cpr\",\"nwbxgjvtbvpyssz\"],\"runtimeProperties\":{\"kind\":\"uj\"}}")
            .toObject(CapabilityTypeProperties.class);
        Assertions.assertEquals("l", model.azureRbacActions().get(0));
        Assertions.assertEquals("cpr", model.azureRbacDataActions().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CapabilityTypeProperties model
            = new CapabilityTypeProperties().withAzureRbacActions(Arrays.asList("l", "juvf", "awrlyx"))
                .withAzureRbacDataActions(Arrays.asList("cpr", "nwbxgjvtbvpyssz"))
                .withRuntimeProperties(new CapabilityTypePropertiesRuntimeProperties());
        model = BinaryData.fromObject(model).toObject(CapabilityTypeProperties.class);
        Assertions.assertEquals("l", model.azureRbacActions().get(0));
        Assertions.assertEquals("cpr", model.azureRbacDataActions().get(0));
    }
}
