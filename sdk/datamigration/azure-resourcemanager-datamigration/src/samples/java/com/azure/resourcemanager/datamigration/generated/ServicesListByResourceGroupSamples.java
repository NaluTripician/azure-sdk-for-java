// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.generated;

/** Samples for Services ListByResourceGroup. */
public final class ServicesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/datamigration/resource-manager/Microsoft.DataMigration/stable/2018-04-19/examples/Services_ListByResourceGroup.json
     */
    /**
     * Sample code: Services_ListByResourceGroup.
     *
     * @param manager Entry point to DataMigrationManager.
     */
    public static void servicesListByResourceGroup(
        com.azure.resourcemanager.datamigration.DataMigrationManager manager) {
        manager.services().listByResourceGroup("DmsSdkRg", com.azure.core.util.Context.NONE);
    }
}
