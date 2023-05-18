// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

/** Samples for L2Networks GetByResourceGroup. */
public final class L2NetworksGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/networkcloud/resource-manager/Microsoft.NetworkCloud/preview/2022-12-12-preview/examples/L2Networks_Get.json
     */
    /**
     * Sample code: Get L2 network.
     *
     * @param manager Entry point to NetworkCloudManager.
     */
    public static void getL2Network(com.azure.resourcemanager.networkcloud.NetworkCloudManager manager) {
        manager
            .l2Networks()
            .getByResourceGroupWithResponse("resourceGroupName", "l2NetworkName", com.azure.core.util.Context.NONE);
    }
}
