// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

/** Samples for AccessControlLists ListByResourceGroup. */
public final class AccessControlListsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/managednetworkfabric/resource-manager/Microsoft.ManagedNetworkFabric/stable/2023-06-15/examples/AccessControlLists_ListByResourceGroup_MaximumSet_Gen.json
     */
    /**
     * Sample code: AccessControlLists_ListByResourceGroup_MaximumSet_Gen.
     *
     * @param manager Entry point to ManagedNetworkFabricManager.
     */
    public static void accessControlListsListByResourceGroupMaximumSetGen(
        com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager manager) {
        manager.accessControlLists().listByResourceGroup("example-rg", com.azure.core.util.Context.NONE);
    }
}
