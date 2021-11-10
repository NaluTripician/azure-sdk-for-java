// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.Context;

/** Samples for Addons Get. */
public final class AddonsGetSamples {
    /*
     * x-ms-original-file: specification/vmware/resource-manager/Microsoft.AVS/stable/2021-12-01/examples/Addons_Get_SRM.json
     */
    /**
     * Sample code: Addons_Get_SRM.
     *
     * @param manager Entry point to AvsManager.
     */
    public static void addonsGetSRM(com.azure.resourcemanager.avs.AvsManager manager) {
        manager.addons().getWithResponse("group1", "cloud1", "srm", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/vmware/resource-manager/Microsoft.AVS/stable/2021-12-01/examples/Addons_Get_VR.json
     */
    /**
     * Sample code: Addons_Get_VR.
     *
     * @param manager Entry point to AvsManager.
     */
    public static void addonsGetVR(com.azure.resourcemanager.avs.AvsManager manager) {
        manager.addons().getWithResponse("group1", "cloud1", "vr", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/vmware/resource-manager/Microsoft.AVS/stable/2021-12-01/examples/Addons_Get_HCX.json
     */
    /**
     * Sample code: Addons_Get_HCX.
     *
     * @param manager Entry point to AvsManager.
     */
    public static void addonsGetHCX(com.azure.resourcemanager.avs.AvsManager manager) {
        manager.addons().getWithResponse("group1", "cloud1", "hcx", Context.NONE);
    }
}
