// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

/**
 * Samples for Slices Get.
 */
public final class SlicesGetSamples {
    /*
     * x-ms-original-file:
     * specification/mobilenetwork/resource-manager/Microsoft.MobileNetwork/stable/2024-02-01/examples/SliceGet.json
     */
    /**
     * Sample code: Get network slice.
     * 
     * @param manager Entry point to MobileNetworkManager.
     */
    public static void getNetworkSlice(com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager) {
        manager.slices().getWithResponse("rg1", "testMobileNetwork", "testSlice", com.azure.core.util.Context.NONE);
    }
}
