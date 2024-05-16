// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.resourcemanager.devtestlabs.models.NotificationChannelEventType;
import com.azure.resourcemanager.devtestlabs.models.NotifyParameters;

/** Samples for NotificationChannels Notify. */
public final class NotificationChannelsNotifySamples {
    /*
     * x-ms-original-file: specification/devtestlabs/resource-manager/Microsoft.DevTestLab/stable/2018-09-15/examples/NotificationChannels_Notify.json
     */
    /**
     * Sample code: NotificationChannels_Notify.
     *
     * @param manager Entry point to DevTestLabsManager.
     */
    public static void notificationChannelsNotify(com.azure.resourcemanager.devtestlabs.DevTestLabsManager manager) {
        manager
            .notificationChannels()
            .notifyWithResponse(
                "resourceGroupName",
                "{labName}",
                "{notificationChannelName}",
                new NotifyParameters()
                    .withEventName(NotificationChannelEventType.AUTO_SHUTDOWN)
                    .withJsonPayload(
                        "{\"eventType\":\"AutoShutdown\",\"subscriptionId\":\"{subscriptionId}\",\"resourceGroupName\":\"resourceGroupName\",\"labName\":\"{labName}\"}"),
                com.azure.core.util.Context.NONE);
    }
}
