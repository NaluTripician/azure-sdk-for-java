// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

/** Samples for DataConnections Get. */
public final class DataConnectionsGetSamples {
    /*
     * x-ms-original-file: specification/azure-kusto/resource-manager/Microsoft.Kusto/stable/2023-08-15/examples/KustoDataConnectionsEventGridGet.json
     */
    /**
     * Sample code: KustoDataConnectionsEventGridGet.
     *
     * @param manager Entry point to KustoManager.
     */
    public static void kustoDataConnectionsEventGridGet(com.azure.resourcemanager.kusto.KustoManager manager) {
        manager
            .dataConnections()
            .getWithResponse(
                "kustorptest",
                "kustoCluster",
                "KustoDatabase8",
                "dataConnectionTest",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/azure-kusto/resource-manager/Microsoft.Kusto/stable/2023-08-15/examples/KustoDataConnectionsCosmosDbGet.json
     */
    /**
     * Sample code: KustoDataConnectionsCosmosDbGet.
     *
     * @param manager Entry point to KustoManager.
     */
    public static void kustoDataConnectionsCosmosDbGet(com.azure.resourcemanager.kusto.KustoManager manager) {
        manager
            .dataConnections()
            .getWithResponse(
                "kustorptest",
                "kustoCluster",
                "KustoDatabase1",
                "dataConnectionTest",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/azure-kusto/resource-manager/Microsoft.Kusto/stable/2023-08-15/examples/KustoDataConnectionsGet.json
     */
    /**
     * Sample code: KustoDataConnectionsGet.
     *
     * @param manager Entry point to KustoManager.
     */
    public static void kustoDataConnectionsGet(com.azure.resourcemanager.kusto.KustoManager manager) {
        manager
            .dataConnections()
            .getWithResponse(
                "kustorptest",
                "kustoCluster",
                "KustoDatabase8",
                "dataConnectionTest",
                com.azure.core.util.Context.NONE);
    }
}
