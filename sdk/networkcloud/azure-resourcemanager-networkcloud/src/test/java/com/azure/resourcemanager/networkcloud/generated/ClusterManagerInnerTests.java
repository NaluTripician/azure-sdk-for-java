// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.fluent.models.ClusterManagerInner;
import com.azure.resourcemanager.networkcloud.models.ManagedResourceGroupConfiguration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ClusterManagerInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterManagerInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"analyticsWorkspaceId\":\"rkcciwwzjuqk\",\"availabilityZones\":[\"ajiwkuo\"],\"clusterVersions\":[{\"supportExpiryDate\":\"ghsauuimjmvxied\",\"targetClusterVersion\":\"gidyjrrf\"},{\"supportExpiryDate\":\"aos\",\"targetClusterVersion\":\"xc\"},{\"supportExpiryDate\":\"npc\",\"targetClusterVersion\":\"ocohslkevleg\"}],\"detailedStatus\":\"ProvisioningFailed\",\"detailedStatusMessage\":\"u\",\"fabricControllerId\":\"fmvfaxkffeiit\",\"managedResourceGroupConfiguration\":{\"location\":\"m\",\"name\":\"yvshxmz\"},\"managerExtendedLocation\":{\"name\":\"bzoggigrx\",\"type\":\"burvjxxjnspy\"},\"provisioningState\":\"Failed\",\"vmSize\":\"oenkouknvudwti\"},\"location\":\"bldngkpoc\",\"tags\":{\"xoegukgjnpiucgy\":\"z\",\"zcdrqjsdpydnfyhx\":\"evqzntypmrbp\",\"ifsjttgzfbishcb\":\"eoejzic\"},\"id\":\"hajdeyeamdpha\",\"name\":\"alpbuxwgipwhon\",\"type\":\"wkgshwa\"}")
                .toObject(ClusterManagerInner.class);
        Assertions.assertEquals("bldngkpoc", model.location());
        Assertions.assertEquals("z", model.tags().get("xoegukgjnpiucgy"));
        Assertions.assertEquals("rkcciwwzjuqk", model.analyticsWorkspaceId());
        Assertions.assertEquals("ajiwkuo", model.availabilityZones().get(0));
        Assertions.assertEquals("fmvfaxkffeiit", model.fabricControllerId());
        Assertions.assertEquals("m", model.managedResourceGroupConfiguration().location());
        Assertions.assertEquals("yvshxmz", model.managedResourceGroupConfiguration().name());
        Assertions.assertEquals("oenkouknvudwti", model.vmSize());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterManagerInner model =
            new ClusterManagerInner()
                .withLocation("bldngkpoc")
                .withTags(
                    mapOf("xoegukgjnpiucgy", "z", "zcdrqjsdpydnfyhx", "evqzntypmrbp", "ifsjttgzfbishcb", "eoejzic"))
                .withAnalyticsWorkspaceId("rkcciwwzjuqk")
                .withAvailabilityZones(Arrays.asList("ajiwkuo"))
                .withFabricControllerId("fmvfaxkffeiit")
                .withManagedResourceGroupConfiguration(
                    new ManagedResourceGroupConfiguration().withLocation("m").withName("yvshxmz"))
                .withVmSize("oenkouknvudwti");
        model = BinaryData.fromObject(model).toObject(ClusterManagerInner.class);
        Assertions.assertEquals("bldngkpoc", model.location());
        Assertions.assertEquals("z", model.tags().get("xoegukgjnpiucgy"));
        Assertions.assertEquals("rkcciwwzjuqk", model.analyticsWorkspaceId());
        Assertions.assertEquals("ajiwkuo", model.availabilityZones().get(0));
        Assertions.assertEquals("fmvfaxkffeiit", model.fabricControllerId());
        Assertions.assertEquals("m", model.managedResourceGroupConfiguration().location());
        Assertions.assertEquals("yvshxmz", model.managedResourceGroupConfiguration().name());
        Assertions.assertEquals("oenkouknvudwti", model.vmSize());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
