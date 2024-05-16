// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.generated;

import com.azure.core.util.Context;

/** Samples for Attestations Delete. */
public final class AttestationsDeleteSamples {
    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-09-01/examples/Attestations_DeleteResourceGroupScope.json
     */
    /**
     * Sample code: Delete attestation at resource group scope.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void deleteAttestationAtResourceGroupScope(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .attestations()
            .deleteByResourceGroupWithResponse("myRg", "790996e6-9871-4b1f-9cd9-ec42cd6ced1e", Context.NONE);
    }
}
