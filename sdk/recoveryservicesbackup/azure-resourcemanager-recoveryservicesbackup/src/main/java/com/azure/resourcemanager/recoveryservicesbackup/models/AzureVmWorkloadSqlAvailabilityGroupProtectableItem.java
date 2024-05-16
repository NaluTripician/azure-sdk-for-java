// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Azure VM workload-specific protectable item representing SQL Availability Group.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "protectableItemType")
@JsonTypeName("SQLAvailabilityGroupContainer")
@Fluent
public final class AzureVmWorkloadSqlAvailabilityGroupProtectableItem extends AzureVmWorkloadProtectableItem {
    /*
     * List of the nodes in case of distributed container.
     */
    @JsonProperty(value = "nodesList")
    private List<DistributedNodesInfo> nodesList;

    /**
     * Creates an instance of AzureVmWorkloadSqlAvailabilityGroupProtectableItem class.
     */
    public AzureVmWorkloadSqlAvailabilityGroupProtectableItem() {
    }

    /**
     * Get the nodesList property: List of the nodes in case of distributed container.
     * 
     * @return the nodesList value.
     */
    public List<DistributedNodesInfo> nodesList() {
        return this.nodesList;
    }

    /**
     * Set the nodesList property: List of the nodes in case of distributed container.
     * 
     * @param nodesList the nodesList value to set.
     * @return the AzureVmWorkloadSqlAvailabilityGroupProtectableItem object itself.
     */
    public AzureVmWorkloadSqlAvailabilityGroupProtectableItem withNodesList(List<DistributedNodesInfo> nodesList) {
        this.nodesList = nodesList;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSqlAvailabilityGroupProtectableItem withParentName(String parentName) {
        super.withParentName(parentName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSqlAvailabilityGroupProtectableItem withParentUniqueName(String parentUniqueName) {
        super.withParentUniqueName(parentUniqueName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSqlAvailabilityGroupProtectableItem withServerName(String serverName) {
        super.withServerName(serverName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSqlAvailabilityGroupProtectableItem withIsAutoProtectable(Boolean isAutoProtectable) {
        super.withIsAutoProtectable(isAutoProtectable);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSqlAvailabilityGroupProtectableItem withIsAutoProtected(Boolean isAutoProtected) {
        super.withIsAutoProtected(isAutoProtected);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSqlAvailabilityGroupProtectableItem withSubinquireditemcount(Integer subinquireditemcount) {
        super.withSubinquireditemcount(subinquireditemcount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSqlAvailabilityGroupProtectableItem
        withSubprotectableitemcount(Integer subprotectableitemcount) {
        super.withSubprotectableitemcount(subprotectableitemcount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSqlAvailabilityGroupProtectableItem
        withPrebackupvalidation(PreBackupValidation prebackupvalidation) {
        super.withPrebackupvalidation(prebackupvalidation);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSqlAvailabilityGroupProtectableItem withIsProtectable(Boolean isProtectable) {
        super.withIsProtectable(isProtectable);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSqlAvailabilityGroupProtectableItem withBackupManagementType(String backupManagementType) {
        super.withBackupManagementType(backupManagementType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSqlAvailabilityGroupProtectableItem withWorkloadType(String workloadType) {
        super.withWorkloadType(workloadType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSqlAvailabilityGroupProtectableItem withFriendlyName(String friendlyName) {
        super.withFriendlyName(friendlyName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSqlAvailabilityGroupProtectableItem withProtectionState(ProtectionStatus protectionState) {
        super.withProtectionState(protectionState);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (nodesList() != null) {
            nodesList().forEach(e -> e.validate());
        }
    }
}
