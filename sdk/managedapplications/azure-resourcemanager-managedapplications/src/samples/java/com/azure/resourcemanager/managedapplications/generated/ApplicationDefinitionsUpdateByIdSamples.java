// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedapplications.generated;

import com.azure.resourcemanager.managedapplications.models.ApplicationDefinitionPatchable;
import java.util.HashMap;
import java.util.Map;

/** Samples for ApplicationDefinitions UpdateById. */
public final class ApplicationDefinitionsUpdateByIdSamples {
    /*
     * x-ms-original-file: specification/solutions/resource-manager/Microsoft.Solutions/stable/2021-07-01/examples/updateApplicationDefinition.json
     */
    /**
     * Sample code: Update managed application definition.
     *
     * @param manager Entry point to ApplicationManager.
     */
    public static void updateManagedApplicationDefinition(
        com.azure.resourcemanager.managedapplications.ApplicationManager manager) {
        manager
            .applicationDefinitions()
            .updateByIdWithResponse(
                "rg",
                "myManagedApplicationDef",
                new ApplicationDefinitionPatchable().withTags(mapOf("department", "Finance")),
                com.azure.core.util.Context.NONE);
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
