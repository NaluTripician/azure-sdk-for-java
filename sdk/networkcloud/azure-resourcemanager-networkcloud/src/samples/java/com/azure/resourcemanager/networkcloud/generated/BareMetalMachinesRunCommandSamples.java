// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.resourcemanager.networkcloud.models.BareMetalMachineRunCommandParameters;
import java.util.Arrays;

/** Samples for BareMetalMachines RunCommand. */
public final class BareMetalMachinesRunCommandSamples {
    /*
     * x-ms-original-file: specification/networkcloud/resource-manager/Microsoft.NetworkCloud/preview/2022-12-12-preview/examples/BareMetalMachines_RunCommand.json
     */
    /**
     * Sample code: Run command on bare metal machine.
     *
     * @param manager Entry point to NetworkCloudManager.
     */
    public static void runCommandOnBareMetalMachine(
        com.azure.resourcemanager.networkcloud.NetworkCloudManager manager) {
        manager
            .bareMetalMachines()
            .runCommand(
                "resourceGroupName",
                "bareMetalMachineName",
                new BareMetalMachineRunCommandParameters()
                    .withArguments(Arrays.asList("--argument1", "argument2"))
                    .withLimitTimeSeconds(60L)
                    .withScript("cHdkCg=="),
                com.azure.core.util.Context.NONE);
    }
}
