// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apicenter.generated;

/**
 * Samples for Workspaces List.
 */
public final class WorkspacesListSamples {
    /*
     * x-ms-original-file:
     * specification/apicenter/resource-manager/Microsoft.ApiCenter/stable/2024-03-01/examples/Workspaces_List.json
     */
    /**
     * Sample code: Workspaces_ListByService.
     * 
     * @param manager Entry point to ApiCenterManager.
     */
    public static void workspacesListByService(com.azure.resourcemanager.apicenter.ApiCenterManager manager) {
        manager.workspaces().list("contoso-resources", "contoso", null, com.azure.core.util.Context.NONE);
    }
}
