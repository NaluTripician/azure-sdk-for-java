// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

/** Samples for User Get. */
public final class UserGetSamples {
    /*
     * x-ms-original-file: specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2022-08-01/examples/ApiManagementGetUser.json
     */
    /**
     * Sample code: ApiManagementGetUser.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementGetUser(com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .users()
            .getWithResponse("rg1", "apimService1", "5931a75ae4bbd512a88c680b", com.azure.core.util.Context.NONE);
    }
}
