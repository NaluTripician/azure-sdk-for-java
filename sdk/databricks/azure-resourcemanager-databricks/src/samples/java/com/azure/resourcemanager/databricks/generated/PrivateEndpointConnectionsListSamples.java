// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.generated;

/** Samples for PrivateEndpointConnections List. */
public final class PrivateEndpointConnectionsListSamples {
    /*
     * x-ms-original-file: specification/databricks/resource-manager/Microsoft.Databricks/stable/2023-02-01/examples/ListPrivateEndpointConnections.json
     */
    /**
     * Sample code: List private endpoint connections.
     *
     * @param manager Entry point to AzureDatabricksManager.
     */
    public static void listPrivateEndpointConnections(
        com.azure.resourcemanager.databricks.AzureDatabricksManager manager) {
        manager.privateEndpointConnections().list("myResourceGroup", "myWorkspace", com.azure.core.util.Context.NONE);
    }
}
