// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ClusterAvailableUpgradeVersion represents the various cluster upgrade parameters. */
@Immutable
public final class ClusterAvailableUpgradeVersion {
    /*
     * The indicator of whether the control plane will be impacted during the upgrade.
     */
    @JsonProperty(value = "controlImpact", access = JsonProperty.Access.WRITE_ONLY)
    private ControlImpact controlImpact;

    /*
     * The expected duration needed for this upgrade.
     */
    @JsonProperty(value = "expectedDuration", access = JsonProperty.Access.WRITE_ONLY)
    private String expectedDuration;

    /*
     * The impact description including the specific details and release notes.
     */
    @JsonProperty(value = "impactDescription", access = JsonProperty.Access.WRITE_ONLY)
    private String impactDescription;

    /*
     * The last date the version of the platform is supported.
     */
    @JsonProperty(value = "supportExpiryDate", access = JsonProperty.Access.WRITE_ONLY)
    private String supportExpiryDate;

    /*
     * The target version this cluster will be upgraded to.
     */
    @JsonProperty(value = "targetClusterVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String targetClusterVersion;

    /*
     * The indicator of whether the workload will be impacted during the upgrade.
     */
    @JsonProperty(value = "workloadImpact", access = JsonProperty.Access.WRITE_ONLY)
    private WorkloadImpact workloadImpact;

    /** Creates an instance of ClusterAvailableUpgradeVersion class. */
    public ClusterAvailableUpgradeVersion() {
    }

    /**
     * Get the controlImpact property: The indicator of whether the control plane will be impacted during the upgrade.
     *
     * @return the controlImpact value.
     */
    public ControlImpact controlImpact() {
        return this.controlImpact;
    }

    /**
     * Get the expectedDuration property: The expected duration needed for this upgrade.
     *
     * @return the expectedDuration value.
     */
    public String expectedDuration() {
        return this.expectedDuration;
    }

    /**
     * Get the impactDescription property: The impact description including the specific details and release notes.
     *
     * @return the impactDescription value.
     */
    public String impactDescription() {
        return this.impactDescription;
    }

    /**
     * Get the supportExpiryDate property: The last date the version of the platform is supported.
     *
     * @return the supportExpiryDate value.
     */
    public String supportExpiryDate() {
        return this.supportExpiryDate;
    }

    /**
     * Get the targetClusterVersion property: The target version this cluster will be upgraded to.
     *
     * @return the targetClusterVersion value.
     */
    public String targetClusterVersion() {
        return this.targetClusterVersion;
    }

    /**
     * Get the workloadImpact property: The indicator of whether the workload will be impacted during the upgrade.
     *
     * @return the workloadImpact value.
     */
    public WorkloadImpact workloadImpact() {
        return this.workloadImpact;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
