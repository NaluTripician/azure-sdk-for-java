// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.Context;

/** Samples for VerifiedPartners List. */
public final class VerifiedPartnersListSamples {
    /*
     * x-ms-original-file: specification/eventgrid/resource-manager/Microsoft.EventGrid/preview/2021-10-15-preview/examples/VerifiedPartners_List.json
     */
    /**
     * Sample code: VerifiedPartners_List.
     *
     * @param manager Entry point to EventGridManager.
     */
    public static void verifiedPartnersList(com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        manager.verifiedPartners().list(null, null, Context.NONE);
    }
}
