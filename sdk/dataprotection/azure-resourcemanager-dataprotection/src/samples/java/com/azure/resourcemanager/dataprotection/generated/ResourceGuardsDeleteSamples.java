// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

/**
 * Samples for ResourceGuards Delete.
 */
public final class ResourceGuardsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/dataprotection/resource-manager/Microsoft.DataProtection/stable/2023-11-01/examples/
     * ResourceGuardCRUD/DeleteResourceGuard.json
     */
    /**
     * Sample code: Delete ResourceGuard.
     * 
     * @param manager Entry point to DataProtectionManager.
     */
    public static void deleteResourceGuard(com.azure.resourcemanager.dataprotection.DataProtectionManager manager) {
        manager.resourceGuards().deleteByResourceGroupWithResponse("SampleResourceGroup", "swaggerExample",
            com.azure.core.util.Context.NONE);
    }
}
