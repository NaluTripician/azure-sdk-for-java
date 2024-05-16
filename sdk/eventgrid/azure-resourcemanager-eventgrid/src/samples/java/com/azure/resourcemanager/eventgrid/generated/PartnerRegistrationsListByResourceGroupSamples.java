// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

/**
 * Samples for PartnerRegistrations ListByResourceGroup.
 */
public final class PartnerRegistrationsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/eventgrid/resource-manager/Microsoft.EventGrid/preview/2024-06-01-preview/examples/PartnerRegistrations_ListByResourceGroup.json
     */
    /**
     * Sample code: PartnerRegistrations_ListByResourceGroup.
     * 
     * @param manager Entry point to EventGridManager.
     */
    public static void
        partnerRegistrationsListByResourceGroup(com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        manager.partnerRegistrations().listByResourceGroup("examplerg", null, null, com.azure.core.util.Context.NONE);
    }
}
