// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.avs.fluent.models.ClusterUpdateProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ClusterUpdatePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterUpdateProperties model =
            BinaryData
                .fromString(
                    "{\"clusterSize\":977455104,\"hosts\":[\"zunlu\",\"hnnpr\",\"xipeilpjzuaejx\",\"ultskzbbtdz\"]}")
                .toObject(ClusterUpdateProperties.class);
        Assertions.assertEquals(977455104, model.clusterSize());
        Assertions.assertEquals("zunlu", model.hosts().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterUpdateProperties model =
            new ClusterUpdateProperties()
                .withClusterSize(977455104)
                .withHosts(Arrays.asList("zunlu", "hnnpr", "xipeilpjzuaejx", "ultskzbbtdz"));
        model = BinaryData.fromObject(model).toObject(ClusterUpdateProperties.class);
        Assertions.assertEquals(977455104, model.clusterSize());
        Assertions.assertEquals("zunlu", model.hosts().get(0));
    }
}
