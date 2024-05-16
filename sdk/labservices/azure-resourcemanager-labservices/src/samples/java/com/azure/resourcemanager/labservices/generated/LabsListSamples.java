// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.generated;

import com.azure.core.util.Context;

/** Samples for Labs List. */
public final class LabsListSamples {
    /*
     * x-ms-original-file: specification/labservices/resource-manager/Microsoft.LabServices/stable/2022-08-01/examples/Labs/listLabs.json
     */
    /**
     * Sample code: listLabs.
     *
     * @param manager Entry point to LabServicesManager.
     */
    public static void listLabs(com.azure.resourcemanager.labservices.LabServicesManager manager) {
        manager.labs().list(null, Context.NONE);
    }
}
