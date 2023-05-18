// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.resourcemanager.networkcloud.models.BareMetalMachineHardwareValidationCategory;
import com.azure.resourcemanager.networkcloud.models.BareMetalMachineValidateHardwareParameters;

/** Samples for BareMetalMachines ValidateHardware. */
public final class BareMetalMachinesValidateHardwareSamples {
    /*
     * x-ms-original-file: specification/networkcloud/resource-manager/Microsoft.NetworkCloud/preview/2022-12-12-preview/examples/BareMetalMachines_ValidateHardware.json
     */
    /**
     * Sample code: Validate the bare metal machine hardware.
     *
     * @param manager Entry point to NetworkCloudManager.
     */
    public static void validateTheBareMetalMachineHardware(
        com.azure.resourcemanager.networkcloud.NetworkCloudManager manager) {
        manager
            .bareMetalMachines()
            .validateHardware(
                "resourceGroupName",
                "bareMetalMachineName",
                new BareMetalMachineValidateHardwareParameters()
                    .withValidationCategory(BareMetalMachineHardwareValidationCategory.BASIC_VALIDATION),
                com.azure.core.util.Context.NONE);
    }
}
