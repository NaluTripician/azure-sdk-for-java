// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated;

/** Samples for GenerateDetailedCostReportOperationStatus Get. */
public final class GenerateDetailedCostReportOperationStatusGetSamples {
    /*
     * x-ms-original-file: specification/cost-management/resource-manager/Microsoft.CostManagement/stable/2022-10-01/examples/GenerateDetailedCostReportOperationStatusBySubscriptionScope.json
     */
    /**
     * Sample code: Get details of the operation status.
     *
     * @param manager Entry point to CostManagementManager.
     */
    public static void getDetailsOfTheOperationStatus(
        com.azure.resourcemanager.costmanagement.CostManagementManager manager) {
        manager
            .generateDetailedCostReportOperationStatus()
            .getWithResponse(
                "00000000-0000-0000-0000-000000000000",
                "subscriptions/00000000-0000-0000-0000-000000000000",
                com.azure.core.util.Context.NONE);
    }
}
