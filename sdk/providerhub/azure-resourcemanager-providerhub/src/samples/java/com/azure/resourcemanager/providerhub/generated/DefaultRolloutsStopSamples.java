// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.generated;

/** Samples for DefaultRollouts Stop. */
public final class DefaultRolloutsStopSamples {
    /*
     * x-ms-original-file: specification/providerhub/resource-manager/Microsoft.ProviderHub/stable/2020-11-20/examples/DefaultRollouts_Stop.json
     */
    /**
     * Sample code: DefaultRollouts_Stop.
     *
     * @param manager Entry point to ProviderHubManager.
     */
    public static void defaultRolloutsStop(com.azure.resourcemanager.providerhub.ProviderHubManager manager) {
        manager.defaultRollouts().stopWithResponse("Microsoft.Contoso", "2020week10", com.azure.core.util.Context.NONE);
    }
}
