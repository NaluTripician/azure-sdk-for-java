// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

/** Samples for BillingRoleDefinitions GetByInvoiceSection. */
public final class BillingRoleDefinitionsGetByInvoiceSectionSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2020-05-01/examples/InvoiceSectionRoleDefinition.json
     */
    /**
     * Sample code: InvoiceSectionRoleDefinition.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void invoiceSectionRoleDefinition(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .billingRoleDefinitions()
            .getByInvoiceSectionWithResponse(
                "{billingAccountName}",
                "{billingProfileName}",
                "{invoiceSectionName}",
                "{billingRoleDefinitionName}",
                com.azure.core.util.Context.NONE);
    }
}
