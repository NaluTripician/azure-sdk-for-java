// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

/** Samples for Labs ListVhds. */
public final class LabsListVhdsSamples {
    /*
     * x-ms-original-file: specification/devtestlabs/resource-manager/Microsoft.DevTestLab/stable/2018-09-15/examples/Labs_ListVhds.json
     */
    /**
     * Sample code: Labs_ListVhds.
     *
     * @param manager Entry point to DevTestLabsManager.
     */
    public static void labsListVhds(com.azure.resourcemanager.devtestlabs.DevTestLabsManager manager) {
        manager.labs().listVhds("resourceGroupName", "{labName}", com.azure.core.util.Context.NONE);
    }
}
