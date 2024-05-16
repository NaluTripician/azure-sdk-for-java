/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies the ephemeral Disk Settings for the operating system disk used by
 * the compute node (VM).
 */
public class DiffDiskSettings {
    /**
     * Specifies the ephemeral disk placement for operating system disk for all
     * VMs in the pool.
     * This property can be used by user in the request to choose the location
     * e.g., cache disk space for Ephemeral OS disk provisioning. For more
     * information on Ephemeral OS disk size requirements, please refer to
     * Ephemeral OS disk size requirements for Windows VMs at
     * https://docs.microsoft.com/en-us/azure/virtual-machines/windows/ephemeral-os-disks#size-requirements
     * and Linux VMs at
     * https://docs.microsoft.com/en-us/azure/virtual-machines/linux/ephemeral-os-disks#size-requirements.
     * Possible values include: 'CacheDisk'.
     */
    @JsonProperty(value = "placement")
    private DiffDiskPlacement placement;

    /**
     * Get this property can be used by user in the request to choose the location e.g., cache disk space for Ephemeral OS disk provisioning. For more information on Ephemeral OS disk size requirements, please refer to Ephemeral OS disk size requirements for Windows VMs at https://docs.microsoft.com/en-us/azure/virtual-machines/windows/ephemeral-os-disks#size-requirements and Linux VMs at https://docs.microsoft.com/en-us/azure/virtual-machines/linux/ephemeral-os-disks#size-requirements. Possible values include: 'CacheDisk'.
     *
     * @return the placement value
     */
    public DiffDiskPlacement placement() {
        return this.placement;
    }

    /**
     * Set this property can be used by user in the request to choose the location e.g., cache disk space for Ephemeral OS disk provisioning. For more information on Ephemeral OS disk size requirements, please refer to Ephemeral OS disk size requirements for Windows VMs at https://docs.microsoft.com/en-us/azure/virtual-machines/windows/ephemeral-os-disks#size-requirements and Linux VMs at https://docs.microsoft.com/en-us/azure/virtual-machines/linux/ephemeral-os-disks#size-requirements. Possible values include: 'CacheDisk'.
     *
     * @param placement the placement value to set
     * @return the DiffDiskSettings object itself.
     */
    public DiffDiskSettings withPlacement(DiffDiskPlacement placement) {
        this.placement = placement;
        return this;
    }

}
