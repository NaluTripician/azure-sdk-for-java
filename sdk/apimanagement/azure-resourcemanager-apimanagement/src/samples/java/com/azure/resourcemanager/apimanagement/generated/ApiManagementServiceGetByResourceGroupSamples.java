// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

/** Samples for ApiManagementService GetByResourceGroup. */
public final class ApiManagementServiceGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2022-08-01/examples/ApiManagementServiceGetMultiRegionInternalVnet.json
     */
    /**
     * Sample code: ApiManagementServiceGetMultiRegionInternalVnet.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementServiceGetMultiRegionInternalVnet(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .apiManagementServices()
            .getByResourceGroupWithResponse("rg1", "apimService1", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2022-08-01/examples/ApiManagementServiceGetServiceHavingMsi.json
     */
    /**
     * Sample code: ApiManagementServiceGetServiceHavingMsi.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementServiceGetServiceHavingMsi(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .apiManagementServices()
            .getByResourceGroupWithResponse("rg1", "apimService1", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2022-08-01/examples/ApiManagementServiceGetService.json
     */
    /**
     * Sample code: ApiManagementServiceGetService.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementServiceGetService(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .apiManagementServices()
            .getByResourceGroupWithResponse("rg1", "apimService1", com.azure.core.util.Context.NONE);
    }
}
