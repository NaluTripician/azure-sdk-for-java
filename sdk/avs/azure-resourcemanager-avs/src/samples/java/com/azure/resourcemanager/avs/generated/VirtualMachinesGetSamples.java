// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

/** Samples for VirtualMachines Get. */
public final class VirtualMachinesGetSamples {
    /*
     * x-ms-original-file: specification/vmware/resource-manager/Microsoft.AVS/stable/2023-03-01/examples/VirtualMachines_Get.json
     */
    /**
     * Sample code: GetVirtualMachine.
     *
     * @param manager Entry point to AvsManager.
     */
    public static void getVirtualMachine(com.azure.resourcemanager.avs.AvsManager manager) {
        manager
            .virtualMachines()
            .getWithResponse("group1", "cloud1", "cluster1", "vm-209", com.azure.core.util.Context.NONE);
    }
}
