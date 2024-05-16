// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.NetworkInterfaceInner;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkInterfacesList;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class NetworkInterfacesListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkInterfacesList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"physicalIdentifier\":\"qdseipnquwzxhrp\",\"connectedTo\":\"odlhkfktl\",\"interfaceType\":\"Data\",\"ipv4Address\":\"objopnou\",\"ipv6Address\":\"qezkqxs\",\"provisioningState\":\"Succeeded\",\"administrativeState\":\"MAT\",\"annotation\":\"gfcvcewbwq\"},\"id\":\"dgsjsat\",\"name\":\"rncmazdfsqxh\",\"type\":\"qmr\"},{\"properties\":{\"physicalIdentifier\":\"parn\",\"connectedTo\":\"grszrbwtdrcwg\",\"interfaceType\":\"Management\",\"ipv4Address\":\"xzlh\",\"ipv6Address\":\"ix\",\"provisioningState\":\"Updating\",\"administrativeState\":\"Enabled\",\"annotation\":\"zjrmhpfywvyld\"},\"id\":\"pzfzxsoxinunjlz\",\"name\":\"drocqsxytq\",\"type\":\"tcmiwd\"},{\"properties\":{\"physicalIdentifier\":\"svnmeylajamcajy\",\"connectedTo\":\"tpzcr\",\"interfaceType\":\"Management\",\"ipv4Address\":\"leyn\",\"ipv6Address\":\"nhkigg\",\"provisioningState\":\"Accepted\",\"administrativeState\":\"Enabled\",\"annotation\":\"hvubhgzphetxdqc\"},\"id\":\"yctajqz\",\"name\":\"vale\",\"type\":\"xb\"},{\"properties\":{\"physicalIdentifier\":\"i\",\"connectedTo\":\"sd\",\"interfaceType\":\"Management\",\"ipv4Address\":\"sbfpzvoikvntwcz\",\"ipv6Address\":\"wushlcxpbl\",\"provisioningState\":\"Succeeded\",\"administrativeState\":\"Disabled\",\"annotation\":\"p\"},\"id\":\"kissaidqzsaa\",\"name\":\"qdsgptotxj\",\"type\":\"fiafc\"}],\"nextLink\":\"r\"}")
                .toObject(NetworkInterfacesList.class);
        Assertions.assertEquals("gfcvcewbwq", model.value().get(0).annotation());
        Assertions.assertEquals("r", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkInterfacesList model =
            new NetworkInterfacesList()
                .withValue(
                    Arrays
                        .asList(
                            new NetworkInterfaceInner().withAnnotation("gfcvcewbwq"),
                            new NetworkInterfaceInner().withAnnotation("zjrmhpfywvyld"),
                            new NetworkInterfaceInner().withAnnotation("hvubhgzphetxdqc"),
                            new NetworkInterfaceInner().withAnnotation("p")))
                .withNextLink("r");
        model = BinaryData.fromObject(model).toObject(NetworkInterfacesList.class);
        Assertions.assertEquals("gfcvcewbwq", model.value().get(0).annotation());
        Assertions.assertEquals("r", model.nextLink());
    }
}
