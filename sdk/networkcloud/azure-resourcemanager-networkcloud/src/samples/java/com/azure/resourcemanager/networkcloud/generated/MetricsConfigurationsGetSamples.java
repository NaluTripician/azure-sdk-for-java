// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

/** Samples for MetricsConfigurations Get. */
public final class MetricsConfigurationsGetSamples {
    /*
     * x-ms-original-file: specification/networkcloud/resource-manager/Microsoft.NetworkCloud/preview/2022-12-12-preview/examples/ClusterMetricsConfigurations_Get.json
     */
    /**
     * Sample code: Get metrics configuration of cluster.
     *
     * @param manager Entry point to NetworkCloudManager.
     */
    public static void getMetricsConfigurationOfCluster(
        com.azure.resourcemanager.networkcloud.NetworkCloudManager manager) {
        manager
            .metricsConfigurations()
            .getWithResponse("resourceGroupName", "clusterName", "default", com.azure.core.util.Context.NONE);
    }
}
