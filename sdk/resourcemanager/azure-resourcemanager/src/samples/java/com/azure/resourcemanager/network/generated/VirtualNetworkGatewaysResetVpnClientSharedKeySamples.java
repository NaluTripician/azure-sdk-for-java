// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for VirtualNetworkGateways ResetVpnClientSharedKey. */
public final class VirtualNetworkGatewaysResetVpnClientSharedKeySamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/VirtualNetworkGatewayResetVpnClientSharedKey.json
     */
    /**
     * Sample code: ResetVpnClientSharedKey.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void resetVpnClientSharedKey(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getVirtualNetworkGateways()
            .resetVpnClientSharedKey("rg1", "vpngw", Context.NONE);
    }
}
