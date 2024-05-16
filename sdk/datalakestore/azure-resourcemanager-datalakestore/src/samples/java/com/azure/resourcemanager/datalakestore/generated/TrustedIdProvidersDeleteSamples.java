// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakestore.generated;

/** Samples for TrustedIdProviders Delete. */
public final class TrustedIdProvidersDeleteSamples {
    /*
     * x-ms-original-file: specification/datalake-store/resource-manager/Microsoft.DataLakeStore/stable/2016-11-01/examples/TrustedIdProviders_Delete.json
     */
    /**
     * Sample code: Deletes the specified trusted identity provider from the specified Data Lake Store account.
     *
     * @param manager Entry point to DataLakeStoreManager.
     */
    public static void deletesTheSpecifiedTrustedIdentityProviderFromTheSpecifiedDataLakeStoreAccount(
        com.azure.resourcemanager.datalakestore.DataLakeStoreManager manager) {
        manager
            .trustedIdProviders()
            .deleteWithResponse(
                "contosorg", "contosoadla", "test_trusted_id_provider_name", com.azure.core.util.Context.NONE);
    }
}
