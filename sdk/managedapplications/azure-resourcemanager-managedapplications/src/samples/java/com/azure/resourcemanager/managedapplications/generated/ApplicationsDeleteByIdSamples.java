// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedapplications.generated;

/** Samples for Applications DeleteById. */
public final class ApplicationsDeleteByIdSamples {
    /*
     * x-ms-original-file: specification/solutions/resource-manager/Microsoft.Solutions/stable/2021-07-01/examples/deleteApplicationById.json
     */
    /**
     * Sample code: Deletes the managed application.
     *
     * @param manager Entry point to ApplicationManager.
     */
    public static void deletesTheManagedApplication(
        com.azure.resourcemanager.managedapplications.ApplicationManager manager) {
        manager
            .applications()
            .deleteById(
                "subscriptions/subid/resourceGroups/rg/providers/Microsoft.Solutions/applications/myManagedApplication",
                com.azure.core.util.Context.NONE);
    }
}
