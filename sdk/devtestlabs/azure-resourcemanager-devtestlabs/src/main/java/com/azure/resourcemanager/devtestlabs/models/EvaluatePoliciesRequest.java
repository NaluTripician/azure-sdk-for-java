// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Request body for evaluating a policy set. */
@Fluent
public final class EvaluatePoliciesRequest {
    /*
     * Policies to evaluate.
     */
    @JsonProperty(value = "policies")
    private List<EvaluatePoliciesProperties> policies;

    /** Creates an instance of EvaluatePoliciesRequest class. */
    public EvaluatePoliciesRequest() {
    }

    /**
     * Get the policies property: Policies to evaluate.
     *
     * @return the policies value.
     */
    public List<EvaluatePoliciesProperties> policies() {
        return this.policies;
    }

    /**
     * Set the policies property: Policies to evaluate.
     *
     * @param policies the policies value to set.
     * @return the EvaluatePoliciesRequest object itself.
     */
    public EvaluatePoliciesRequest withPolicies(List<EvaluatePoliciesProperties> policies) {
        this.policies = policies;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (policies() != null) {
            policies().forEach(e -> e.validate());
        }
    }
}
