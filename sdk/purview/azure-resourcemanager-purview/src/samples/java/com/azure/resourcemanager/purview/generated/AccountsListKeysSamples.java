// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.purview.generated;

/** Samples for Accounts ListKeys. */
public final class AccountsListKeysSamples {
    /*
     * x-ms-original-file: specification/purview/resource-manager/Microsoft.Purview/stable/2021-07-01/examples/Accounts_ListKeys.json
     */
    /**
     * Sample code: Accounts_ListKeys.
     *
     * @param manager Entry point to PurviewManager.
     */
    public static void accountsListKeys(com.azure.resourcemanager.purview.PurviewManager manager) {
        manager.accounts().listKeysWithResponse("SampleResourceGroup", "account1", com.azure.core.util.Context.NONE);
    }
}
