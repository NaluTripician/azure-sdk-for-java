// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The deployment status summary for all deployments created by the remediation. */
@Immutable
public final class RemediationDeploymentSummary {
    /*
     * The number of deployments required by the remediation.
     */
    @JsonProperty(value = "totalDeployments", access = JsonProperty.Access.WRITE_ONLY)
    private Integer totalDeployments;

    /*
     * The number of deployments required by the remediation that have succeeded.
     */
    @JsonProperty(value = "successfulDeployments", access = JsonProperty.Access.WRITE_ONLY)
    private Integer successfulDeployments;

    /*
     * The number of deployments required by the remediation that have failed.
     */
    @JsonProperty(value = "failedDeployments", access = JsonProperty.Access.WRITE_ONLY)
    private Integer failedDeployments;

    /** Creates an instance of RemediationDeploymentSummary class. */
    public RemediationDeploymentSummary() {
    }

    /**
     * Get the totalDeployments property: The number of deployments required by the remediation.
     *
     * @return the totalDeployments value.
     */
    public Integer totalDeployments() {
        return this.totalDeployments;
    }

    /**
     * Get the successfulDeployments property: The number of deployments required by the remediation that have
     * succeeded.
     *
     * @return the successfulDeployments value.
     */
    public Integer successfulDeployments() {
        return this.successfulDeployments;
    }

    /**
     * Get the failedDeployments property: The number of deployments required by the remediation that have failed.
     *
     * @return the failedDeployments value.
     */
    public Integer failedDeployments() {
        return this.failedDeployments;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
