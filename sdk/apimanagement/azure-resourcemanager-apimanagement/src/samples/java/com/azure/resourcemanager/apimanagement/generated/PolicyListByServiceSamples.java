// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

/** Samples for Policy ListByService. */
public final class PolicyListByServiceSamples {
    /*
     * x-ms-original-file: specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2022-08-01/examples/ApiManagementListPolicies.json
     */
    /**
     * Sample code: ApiManagementListPolicies.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementListPolicies(com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.policies().listByServiceWithResponse("rg1", "apimService1", com.azure.core.util.Context.NONE);
    }
}
