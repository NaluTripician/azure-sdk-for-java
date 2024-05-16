// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

/** Samples for ProductGroup CheckEntityExists. */
public final class ProductGroupCheckEntityExistsSamples {
    /*
     * x-ms-original-file: specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2022-08-01/examples/ApiManagementHeadProductGroup.json
     */
    /**
     * Sample code: ApiManagementHeadProductGroup.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementHeadProductGroup(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .productGroups()
            .checkEntityExistsWithResponse(
                "rg1",
                "apimService1",
                "5931a75ae4bbd512a88c680b",
                "59306a29e4bbd510dc24e5f9",
                com.azure.core.util.Context.NONE);
    }
}
