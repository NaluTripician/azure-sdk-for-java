// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.resourcemanager.kusto.models.ManagedPrivateEndpoint;

/** Samples for ManagedPrivateEndpoints Update. */
public final class ManagedPrivateEndpointsUpdateSamples {
    /*
     * x-ms-original-file: specification/azure-kusto/resource-manager/Microsoft.Kusto/stable/2023-08-15/examples/KustoManagedPrivateEndpointsUpdate.json
     */
    /**
     * Sample code: KustoManagedPrivateEndpointsUpdate.
     *
     * @param manager Entry point to KustoManager.
     */
    public static void kustoManagedPrivateEndpointsUpdate(com.azure.resourcemanager.kusto.KustoManager manager) {
        ManagedPrivateEndpoint resource =
            manager
                .managedPrivateEndpoints()
                .getWithResponse(
                    "kustorptest", "kustoCluster", "managedPrivateEndpointTest", com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withPrivateLinkResourceId(
                "/subscriptions/12345678-1234-1234-1234-123456789098/resourceGroups/kustorptest/providers/Microsoft.Storage/storageAccounts/storageAccountTest")
            .withGroupId("blob")
            .withRequestMessage("Please Approve Managed Private Endpoint Request.")
            .apply();
    }
}
