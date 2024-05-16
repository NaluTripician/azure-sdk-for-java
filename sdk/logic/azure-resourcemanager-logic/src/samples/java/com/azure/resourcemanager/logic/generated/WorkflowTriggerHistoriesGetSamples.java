// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.generated;

/** Samples for WorkflowTriggerHistories Get. */
public final class WorkflowTriggerHistoriesGetSamples {
    /*
     * x-ms-original-file: specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/WorkflowTriggerHistories_Get.json
     */
    /**
     * Sample code: Get a workflow trigger history.
     *
     * @param manager Entry point to LogicManager.
     */
    public static void getAWorkflowTriggerHistory(com.azure.resourcemanager.logic.LogicManager manager) {
        manager
            .workflowTriggerHistories()
            .getWithResponse(
                "testResourceGroup",
                "testWorkflowName",
                "testTriggerName",
                "08586676746934337772206998657CU22",
                com.azure.core.util.Context.NONE);
    }
}
