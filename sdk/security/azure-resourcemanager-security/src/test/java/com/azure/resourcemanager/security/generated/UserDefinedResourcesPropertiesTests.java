// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.UserDefinedResourcesProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class UserDefinedResourcesPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UserDefinedResourcesProperties model = BinaryData.fromString(
            "{\"query\":\"hshxcylhkgmnsghp\",\"querySubscriptions\":[\"cphdrwjjkhvyo\",\"ac\",\"u\",\"vxnqmhrpqpd\"]}")
            .toObject(UserDefinedResourcesProperties.class);
        Assertions.assertEquals("hshxcylhkgmnsghp", model.query());
        Assertions.assertEquals("cphdrwjjkhvyo", model.querySubscriptions().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UserDefinedResourcesProperties model = new UserDefinedResourcesProperties().withQuery("hshxcylhkgmnsghp")
            .withQuerySubscriptions(Arrays.asList("cphdrwjjkhvyo", "ac", "u", "vxnqmhrpqpd"));
        model = BinaryData.fromObject(model).toObject(UserDefinedResourcesProperties.class);
        Assertions.assertEquals("hshxcylhkgmnsghp", model.query());
        Assertions.assertEquals("cphdrwjjkhvyo", model.querySubscriptions().get(0));
    }
}
