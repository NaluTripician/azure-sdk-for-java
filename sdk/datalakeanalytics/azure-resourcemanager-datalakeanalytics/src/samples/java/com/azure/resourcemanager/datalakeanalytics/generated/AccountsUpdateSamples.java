// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.generated;

import com.azure.resourcemanager.datalakeanalytics.models.AadObjectType;
import com.azure.resourcemanager.datalakeanalytics.models.DataLakeAnalyticsAccount;
import com.azure.resourcemanager.datalakeanalytics.models.FirewallAllowAzureIpsState;
import com.azure.resourcemanager.datalakeanalytics.models.FirewallState;
import com.azure.resourcemanager.datalakeanalytics.models.TierType;
import com.azure.resourcemanager.datalakeanalytics.models.UpdateComputePolicyWithAccountParameters;
import com.azure.resourcemanager.datalakeanalytics.models.UpdateFirewallRuleWithAccountParameters;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/** Samples for Accounts Update. */
public final class AccountsUpdateSamples {
    /*
     * x-ms-original-file: specification/datalake-analytics/resource-manager/Microsoft.DataLakeAnalytics/stable/2016-11-01/examples/Accounts_Update.json
     */
    /**
     * Sample code: Updates the Data Lake Analytics account object specified by the accountName with the contents of the
     * account object.
     *
     * @param manager Entry point to DataLakeAnalyticsManager.
     */
    public static void
        updatesTheDataLakeAnalyticsAccountObjectSpecifiedByTheAccountNameWithTheContentsOfTheAccountObject(
            com.azure.resourcemanager.datalakeanalytics.DataLakeAnalyticsManager manager) {
        DataLakeAnalyticsAccount resource =
            manager
                .accounts()
                .getByResourceGroupWithResponse("contosorg", "contosoadla", com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withTags(mapOf("test_key", "test_value"))
            .withComputePoliciesForUpdate(
                Arrays
                    .asList(
                        new UpdateComputePolicyWithAccountParameters()
                            .withName("test_policy")
                            .withObjectId(UUID.fromString("34adfa4f-cedf-4dc0-ba29-b6d1a69ab345"))
                            .withObjectType(AadObjectType.USER)
                            .withMaxDegreeOfParallelismPerJob(1)
                            .withMinPriorityPerJob(1)))
            .withFirewallRulesForUpdate(
                Arrays
                    .asList(
                        new UpdateFirewallRuleWithAccountParameters()
                            .withName("test_rule")
                            .withStartIpAddress("1.1.1.1")
                            .withEndIpAddress("2.2.2.2")))
            .withFirewallState(FirewallState.ENABLED)
            .withFirewallAllowAzureIps(FirewallAllowAzureIpsState.ENABLED)
            .withNewTier(TierType.CONSUMPTION)
            .withMaxJobCount(1)
            .withMaxDegreeOfParallelism(1)
            .withMaxDegreeOfParallelismPerJob(1)
            .withMinPriorityPerJob(1)
            .withQueryStoreRetention(1)
            .apply();
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
