// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.redis.models.DefaultName;

/** Samples for PatchSchedules Get. */
public final class PatchSchedulesGetSamples {
    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/stable/2021-06-01/examples/RedisCachePatchSchedulesGet.json
     */
    /**
     * Sample code: RedisCachePatchSchedulesGet.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void redisCachePatchSchedulesGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .redisCaches()
            .manager()
            .serviceClient()
            .getPatchSchedules()
            .getWithResponse("rg1", "cache1", DefaultName.DEFAULT, Context.NONE);
    }
}
