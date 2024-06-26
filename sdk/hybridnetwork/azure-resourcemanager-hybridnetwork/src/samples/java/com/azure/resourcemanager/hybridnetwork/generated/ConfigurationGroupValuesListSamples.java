// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.generated;

/**
 * Samples for ConfigurationGroupValues List.
 */
public final class ConfigurationGroupValuesListSamples {
    /*
     * x-ms-original-file:
     * specification/hybridnetwork/resource-manager/Microsoft.HybridNetwork/stable/2023-09-01/examples/
     * ConfigurationGroupValueListBySubscription.json
     */
    /**
     * Sample code: List all hybrid network sites in a subscription.
     * 
     * @param manager Entry point to HybridNetworkManager.
     */
    public static void
        listAllHybridNetworkSitesInASubscription(com.azure.resourcemanager.hybridnetwork.HybridNetworkManager manager) {
        manager.configurationGroupValues().list(com.azure.core.util.Context.NONE);
    }
}
