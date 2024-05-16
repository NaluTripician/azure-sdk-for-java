// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.elasticsan.fluent.models.PrivateLinkResourceProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PrivateLinkResourcePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateLinkResourceProperties model = BinaryData.fromString(
            "{\"groupId\":\"sd\",\"requiredMembers\":[\"uwaboekqvke\",\"nsmvbxwyj\",\"flhhcaal\",\"jixisxyawjoyaqcs\"],\"requiredZoneNames\":[\"pkii\",\"zyexzn\",\"lixhnrztfol\",\"bnxknalaulppg\"]}")
            .toObject(PrivateLinkResourceProperties.class);
        Assertions.assertEquals("pkii", model.requiredZoneNames().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateLinkResourceProperties model = new PrivateLinkResourceProperties()
            .withRequiredZoneNames(Arrays.asList("pkii", "zyexzn", "lixhnrztfol", "bnxknalaulppg"));
        model = BinaryData.fromObject(model).toObject(PrivateLinkResourceProperties.class);
        Assertions.assertEquals("pkii", model.requiredZoneNames().get(0));
    }
}
