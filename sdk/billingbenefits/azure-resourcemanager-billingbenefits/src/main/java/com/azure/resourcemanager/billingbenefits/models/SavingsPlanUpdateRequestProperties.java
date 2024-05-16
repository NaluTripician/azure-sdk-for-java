// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billingbenefits.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Savings plan patch request. */
@Fluent
public final class SavingsPlanUpdateRequestProperties {
    /*
     * Display name
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Type of the Applied Scope.
     */
    @JsonProperty(value = "appliedScopeType")
    private AppliedScopeType appliedScopeType;

    /*
     * Properties specific to applied scope type. Not required if not applicable.
     */
    @JsonProperty(value = "appliedScopeProperties")
    private AppliedScopeProperties appliedScopeProperties;

    /*
     * Setting this to true will automatically purchase a new benefit on the expiration date time.
     */
    @JsonProperty(value = "renew")
    private Boolean renew;

    /*
     * The renewProperties property.
     */
    @JsonProperty(value = "renewProperties")
    private RenewProperties renewProperties;

    /** Creates an instance of SavingsPlanUpdateRequestProperties class. */
    public SavingsPlanUpdateRequestProperties() {
    }

    /**
     * Get the displayName property: Display name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Display name.
     *
     * @param displayName the displayName value to set.
     * @return the SavingsPlanUpdateRequestProperties object itself.
     */
    public SavingsPlanUpdateRequestProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the appliedScopeType property: Type of the Applied Scope.
     *
     * @return the appliedScopeType value.
     */
    public AppliedScopeType appliedScopeType() {
        return this.appliedScopeType;
    }

    /**
     * Set the appliedScopeType property: Type of the Applied Scope.
     *
     * @param appliedScopeType the appliedScopeType value to set.
     * @return the SavingsPlanUpdateRequestProperties object itself.
     */
    public SavingsPlanUpdateRequestProperties withAppliedScopeType(AppliedScopeType appliedScopeType) {
        this.appliedScopeType = appliedScopeType;
        return this;
    }

    /**
     * Get the appliedScopeProperties property: Properties specific to applied scope type. Not required if not
     * applicable.
     *
     * @return the appliedScopeProperties value.
     */
    public AppliedScopeProperties appliedScopeProperties() {
        return this.appliedScopeProperties;
    }

    /**
     * Set the appliedScopeProperties property: Properties specific to applied scope type. Not required if not
     * applicable.
     *
     * @param appliedScopeProperties the appliedScopeProperties value to set.
     * @return the SavingsPlanUpdateRequestProperties object itself.
     */
    public SavingsPlanUpdateRequestProperties withAppliedScopeProperties(
        AppliedScopeProperties appliedScopeProperties) {
        this.appliedScopeProperties = appliedScopeProperties;
        return this;
    }

    /**
     * Get the renew property: Setting this to true will automatically purchase a new benefit on the expiration date
     * time.
     *
     * @return the renew value.
     */
    public Boolean renew() {
        return this.renew;
    }

    /**
     * Set the renew property: Setting this to true will automatically purchase a new benefit on the expiration date
     * time.
     *
     * @param renew the renew value to set.
     * @return the SavingsPlanUpdateRequestProperties object itself.
     */
    public SavingsPlanUpdateRequestProperties withRenew(Boolean renew) {
        this.renew = renew;
        return this;
    }

    /**
     * Get the renewProperties property: The renewProperties property.
     *
     * @return the renewProperties value.
     */
    public RenewProperties renewProperties() {
        return this.renewProperties;
    }

    /**
     * Set the renewProperties property: The renewProperties property.
     *
     * @param renewProperties the renewProperties value to set.
     * @return the SavingsPlanUpdateRequestProperties object itself.
     */
    public SavingsPlanUpdateRequestProperties withRenewProperties(RenewProperties renewProperties) {
        this.renewProperties = renewProperties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (appliedScopeProperties() != null) {
            appliedScopeProperties().validate();
        }
        if (renewProperties() != null) {
            renewProperties().validate();
        }
    }
}
