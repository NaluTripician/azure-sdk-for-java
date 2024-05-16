// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billingbenefits.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.billingbenefits.fluent.models.SavingsPlanOrderAliasModelInner;

/** An immutable client-side representation of SavingsPlanOrderAliasModel. */
public interface SavingsPlanOrderAliasModel {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the sku property: Savings plan SKU.
     *
     * @return the sku value.
     */
    Sku sku();

    /**
     * Gets the kind property: Resource provider kind.
     *
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the displayName property: Display name.
     *
     * @return the displayName value.
     */
    String displayName();

    /**
     * Gets the savingsPlanOrderId property: Identifier of the savings plan created.
     *
     * @return the savingsPlanOrderId value.
     */
    String savingsPlanOrderId();

    /**
     * Gets the provisioningState property: Provisioning state.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the billingScopeId property: Subscription that will be charged for purchasing the benefit.
     *
     * @return the billingScopeId value.
     */
    String billingScopeId();

    /**
     * Gets the term property: Represent benefit term in ISO 8601 format.
     *
     * @return the term value.
     */
    Term term();

    /**
     * Gets the billingPlan property: Represents the billing plan in ISO 8601 format. Required only for monthly billing
     * plans.
     *
     * @return the billingPlan value.
     */
    BillingPlan billingPlan();

    /**
     * Gets the appliedScopeType property: Type of the Applied Scope.
     *
     * @return the appliedScopeType value.
     */
    AppliedScopeType appliedScopeType();

    /**
     * Gets the appliedScopeProperties property: Properties specific to applied scope type. Not required if not
     * applicable.
     *
     * @return the appliedScopeProperties value.
     */
    AppliedScopeProperties appliedScopeProperties();

    /**
     * Gets the commitment property: Commitment towards the benefit.
     *
     * @return the commitment value.
     */
    Commitment commitment();

    /**
     * Gets the inner com.azure.resourcemanager.billingbenefits.fluent.models.SavingsPlanOrderAliasModelInner object.
     *
     * @return the inner object.
     */
    SavingsPlanOrderAliasModelInner innerModel();
}
