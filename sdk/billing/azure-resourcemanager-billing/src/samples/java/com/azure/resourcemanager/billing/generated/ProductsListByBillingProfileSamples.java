// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

/** Samples for Products ListByBillingProfile. */
public final class ProductsListByBillingProfileSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2020-05-01/examples/ProductsListByBillingProfile.json
     */
    /**
     * Sample code: ProductsListByBillingProfile.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void productsListByBillingProfile(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .products()
            .listByBillingProfile(
                "{billingAccountName}", "{billingProfileName}", null, com.azure.core.util.Context.NONE);
    }
}
