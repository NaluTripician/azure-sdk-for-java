// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for NetworkInterfaces ListEffectiveNetworkSecurityGroups. */
public final class NetworkInterfacesListEffectiveNetworkSecurityGroupsSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/NetworkInterfaceEffectiveNSGList.json
     */
    /**
     * Sample code: List network interface effective network security groups.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listNetworkInterfaceEffectiveNetworkSecurityGroups(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getNetworkInterfaces()
            .listEffectiveNetworkSecurityGroups("rg1", "nic1", Context.NONE);
    }
}
