// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.migrationdiscoverysap.generated;

import com.azure.resourcemanager.migrationdiscoverysap.models.SapDiscoverySite;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for SapDiscoverySites Update.
 */
public final class SapDiscoverySitesUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/SAPDiscoverySites/preview/2023-10-01-preview/
     * examples/SAPDiscoverySites_Update.json
     */
    /**
     * Sample code: Updates a SAP Migration discovery site resource.
     * 
     * @param manager Entry point to MigrationDiscoverySapManager.
     */
    public static void updatesASAPMigrationDiscoverySiteResource(
        com.azure.resourcemanager.migrationdiscoverysap.MigrationDiscoverySapManager manager) {
        SapDiscoverySite resource = manager.sapDiscoverySites()
            .getByResourceGroupWithResponse("test-rg", "SampleSite", com.azure.core.util.Context.NONE).getValue();
        resource.update().withTags(mapOf("tag1", "value1")).apply();
    }

    // Use "Map.of" if available
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
