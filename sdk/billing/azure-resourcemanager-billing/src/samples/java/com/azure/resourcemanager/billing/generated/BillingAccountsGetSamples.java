// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

/** Samples for BillingAccounts Get. */
public final class BillingAccountsGetSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2020-05-01/examples/BillingAccountWithExpand.json
     */
    /**
     * Sample code: BillingAccountWithExpand.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void billingAccountWithExpand(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .billingAccounts()
            .getWithResponse(
                "{billingAccountName}",
                "soldTo,billingProfiles,billingProfiles/invoiceSections",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2020-05-01/examples/BillingAccount.json
     */
    /**
     * Sample code: BillingAccounts.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void billingAccounts(com.azure.resourcemanager.billing.BillingManager manager) {
        manager.billingAccounts().getWithResponse("{billingAccountName}", null, com.azure.core.util.Context.NONE);
    }
}
