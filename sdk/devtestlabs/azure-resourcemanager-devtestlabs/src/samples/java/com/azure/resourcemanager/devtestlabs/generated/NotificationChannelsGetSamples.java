// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

/** Samples for NotificationChannels Get. */
public final class NotificationChannelsGetSamples {
    /*
     * x-ms-original-file: specification/devtestlabs/resource-manager/Microsoft.DevTestLab/stable/2018-09-15/examples/NotificationChannels_Get.json
     */
    /**
     * Sample code: NotificationChannels_Get.
     *
     * @param manager Entry point to DevTestLabsManager.
     */
    public static void notificationChannelsGet(com.azure.resourcemanager.devtestlabs.DevTestLabsManager manager) {
        manager
            .notificationChannels()
            .getWithResponse(
                "resourceGroupName", "{labName}", "{notificationChannelName}", null, com.azure.core.util.Context.NONE);
    }
}
