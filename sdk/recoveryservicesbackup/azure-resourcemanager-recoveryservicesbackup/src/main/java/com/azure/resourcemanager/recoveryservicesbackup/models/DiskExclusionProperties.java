// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The DiskExclusionProperties model.
 */
@Fluent
public final class DiskExclusionProperties {
    /*
     * List of Disks' Logical Unit Numbers (LUN) to be used for VM Protection.
     */
    @JsonProperty(value = "diskLunList")
    private List<Integer> diskLunList;

    /*
     * Flag to indicate whether DiskLunList is to be included/ excluded from backup.
     */
    @JsonProperty(value = "isInclusionList")
    private Boolean isInclusionList;

    /**
     * Creates an instance of DiskExclusionProperties class.
     */
    public DiskExclusionProperties() {
    }

    /**
     * Get the diskLunList property: List of Disks' Logical Unit Numbers (LUN) to be used for VM Protection.
     * 
     * @return the diskLunList value.
     */
    public List<Integer> diskLunList() {
        return this.diskLunList;
    }

    /**
     * Set the diskLunList property: List of Disks' Logical Unit Numbers (LUN) to be used for VM Protection.
     * 
     * @param diskLunList the diskLunList value to set.
     * @return the DiskExclusionProperties object itself.
     */
    public DiskExclusionProperties withDiskLunList(List<Integer> diskLunList) {
        this.diskLunList = diskLunList;
        return this;
    }

    /**
     * Get the isInclusionList property: Flag to indicate whether DiskLunList is to be included/ excluded from backup.
     * 
     * @return the isInclusionList value.
     */
    public Boolean isInclusionList() {
        return this.isInclusionList;
    }

    /**
     * Set the isInclusionList property: Flag to indicate whether DiskLunList is to be included/ excluded from backup.
     * 
     * @param isInclusionList the isInclusionList value to set.
     * @return the DiskExclusionProperties object itself.
     */
    public DiskExclusionProperties withIsInclusionList(Boolean isInclusionList) {
        this.isInclusionList = isInclusionList;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
