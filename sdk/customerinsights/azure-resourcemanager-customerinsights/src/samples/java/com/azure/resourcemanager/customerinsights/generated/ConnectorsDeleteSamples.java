// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.generated;

/** Samples for Connectors Delete. */
public final class ConnectorsDeleteSamples {
    /*
     * x-ms-original-file: specification/customer-insights/resource-manager/Microsoft.CustomerInsights/stable/2017-04-26/examples/ConnectorsDelete.json
     */
    /**
     * Sample code: Connectors_Delete.
     *
     * @param manager Entry point to CustomerInsightsManager.
     */
    public static void connectorsDelete(com.azure.resourcemanager.customerinsights.CustomerInsightsManager manager) {
        manager.connectors().delete("TestHubRG", "sdkTestHub", "testConnector", com.azure.core.util.Context.NONE);
    }
}
