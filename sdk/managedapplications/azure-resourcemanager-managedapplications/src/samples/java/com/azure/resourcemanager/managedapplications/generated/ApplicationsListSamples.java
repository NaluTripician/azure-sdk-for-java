// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedapplications.generated;

/** Samples for Applications List. */
public final class ApplicationsListSamples {
    /*
     * x-ms-original-file: specification/solutions/resource-manager/Microsoft.Solutions/stable/2021-07-01/examples/listApplicationsByResourceGroup.json
     */
    /**
     * Sample code: Lists all the applications within a subscription.
     *
     * @param manager Entry point to ApplicationManager.
     */
    public static void listsAllTheApplicationsWithinASubscription(
        com.azure.resourcemanager.managedapplications.ApplicationManager manager) {
        manager.applications().list(com.azure.core.util.Context.NONE);
    }
}
