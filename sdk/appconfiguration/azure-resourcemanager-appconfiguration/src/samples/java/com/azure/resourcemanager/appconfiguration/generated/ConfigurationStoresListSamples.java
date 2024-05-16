// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.generated;

/** Samples for ConfigurationStores List. */
public final class ConfigurationStoresListSamples {
    /*
     * x-ms-original-file: specification/appconfiguration/resource-manager/Microsoft.AppConfiguration/stable/2023-03-01/examples/ConfigurationStoresList.json
     */
    /**
     * Sample code: ConfigurationStores_List.
     *
     * @param manager Entry point to AppConfigurationManager.
     */
    public static void configurationStoresList(
        com.azure.resourcemanager.appconfiguration.AppConfigurationManager manager) {
        manager.configurationStores().list(null, com.azure.core.util.Context.NONE);
    }
}
