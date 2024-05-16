// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

/**
 * Samples for LocalRules ResetCounters.
 */
public final class LocalRulesResetCountersSamples {
    /*
     * x-ms-original-file:
     * specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/stable/2023-09-01/examples/
     * LocalRules_resetCounters_MaximumSet_Gen.json
     */
    /**
     * Sample code: LocalRules_resetCounters_MaximumSet_Gen.
     * 
     * @param manager Entry point to PaloAltoNetworksNgfwManager.
     */
    public static void localRulesResetCountersMaximumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager) {
        manager.localRules().resetCountersWithResponse("firewall-rg", "lrs1", "1", "firewall1",
            com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/stable/2023-09-01/examples/
     * LocalRules_resetCounters_MinimumSet_Gen.json
     */
    /**
     * Sample code: LocalRules_resetCounters_MinimumSet_Gen.
     * 
     * @param manager Entry point to PaloAltoNetworksNgfwManager.
     */
    public static void localRulesResetCountersMinimumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager) {
        manager.localRules().resetCountersWithResponse("firewall-rg", "lrs1", "1", null,
            com.azure.core.util.Context.NONE);
    }
}
