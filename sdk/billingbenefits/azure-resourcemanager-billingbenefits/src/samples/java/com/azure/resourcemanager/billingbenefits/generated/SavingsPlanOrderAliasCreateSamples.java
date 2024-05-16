// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billingbenefits.generated;

import com.azure.resourcemanager.billingbenefits.fluent.models.SavingsPlanOrderAliasModelInner;
import com.azure.resourcemanager.billingbenefits.models.AppliedScopeProperties;
import com.azure.resourcemanager.billingbenefits.models.AppliedScopeType;
import com.azure.resourcemanager.billingbenefits.models.BillingPlan;
import com.azure.resourcemanager.billingbenefits.models.Commitment;
import com.azure.resourcemanager.billingbenefits.models.CommitmentGrain;
import com.azure.resourcemanager.billingbenefits.models.Sku;
import com.azure.resourcemanager.billingbenefits.models.Term;

/** Samples for SavingsPlanOrderAlias Create. */
public final class SavingsPlanOrderAliasCreateSamples {
    /*
     * x-ms-original-file: specification/billingbenefits/resource-manager/Microsoft.BillingBenefits/stable/2022-11-01/examples/SavingsPlanOrderAliasCreate.json
     */
    /**
     * Sample code: SavingsPlanOrderAliasCreate.
     *
     * @param manager Entry point to BillingBenefitsManager.
     */
    public static void savingsPlanOrderAliasCreate(
        com.azure.resourcemanager.billingbenefits.BillingBenefitsManager manager) {
        manager
            .savingsPlanOrderAlias()
            .create(
                "spAlias123",
                new SavingsPlanOrderAliasModelInner()
                    .withSku(new Sku().withName("Compute_Savings_Plan"))
                    .withDisplayName("Compute_SavingsPlan_10-28-2022_16-38")
                    .withBillingScopeId("/subscriptions/30000000-0000-0000-0000-000000000000")
                    .withTerm(Term.P3Y)
                    .withBillingPlan(BillingPlan.P1M)
                    .withAppliedScopeType(AppliedScopeType.SHARED)
                    .withCommitment(
                        new Commitment()
                            .withCurrencyCode("fakeTokenPlaceholder")
                            .withAmount(0.001D)
                            .withGrain(CommitmentGrain.HOURLY)),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/billingbenefits/resource-manager/Microsoft.BillingBenefits/stable/2022-11-01/examples/SavingsPlanOrderAliasCreateSingleScope.json
     */
    /**
     * Sample code: SavingsPlanOrderAliasCreateSingleScope.
     *
     * @param manager Entry point to BillingBenefitsManager.
     */
    public static void savingsPlanOrderAliasCreateSingleScope(
        com.azure.resourcemanager.billingbenefits.BillingBenefitsManager manager) {
        manager
            .savingsPlanOrderAlias()
            .create(
                "spAlias123",
                new SavingsPlanOrderAliasModelInner()
                    .withSku(new Sku().withName("Compute_Savings_Plan"))
                    .withDisplayName("Compute_SavingsPlan_10-28-2022_16-38")
                    .withBillingScopeId(
                        "/providers/Microsoft.Billing/billingAccounts/1234567/billingSubscriptions/30000000-0000-0000-0000-000000000000")
                    .withTerm(Term.P3Y)
                    .withBillingPlan(BillingPlan.P1M)
                    .withAppliedScopeType(AppliedScopeType.SINGLE)
                    .withAppliedScopeProperties(
                        new AppliedScopeProperties()
                            .withSubscriptionId("/subscriptions/30000000-0000-0000-0000-000000000000"))
                    .withCommitment(
                        new Commitment()
                            .withCurrencyCode("fakeTokenPlaceholder")
                            .withAmount(0.001D)
                            .withGrain(CommitmentGrain.HOURLY)),
                com.azure.core.util.Context.NONE);
    }
}
