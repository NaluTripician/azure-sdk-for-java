// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.generated;

/**
 * Samples for Experiments Cancel.
 */
public final class ExperimentsCancelSamples {
    /*
     * x-ms-original-file:
     * specification/chaos/resource-manager/Microsoft.Chaos/stable/2024-01-01/examples/CancelExperiment.json
     */
    /**
     * Sample code: Cancel a running Experiment.
     * 
     * @param manager Entry point to ChaosManager.
     */
    public static void cancelARunningExperiment(com.azure.resourcemanager.chaos.ChaosManager manager) {
        manager.experiments().cancel("exampleRG", "exampleExperiment", com.azure.core.util.Context.NONE);
    }
}
