// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated;

import com.azure.core.util.Context;

/** Samples for Databases Get. */
public final class DatabasesGetSamples {
    /*
     * x-ms-original-file: specification/mysql/resource-manager/Microsoft.DBforMySQL/stable/2017-12-01/examples/DatabaseGet.json
     */
    /**
     * Sample code: DatabaseGet.
     *
     * @param manager Entry point to MySqlManager.
     */
    public static void databaseGet(com.azure.resourcemanager.mysql.MySqlManager manager) {
        manager.databases().getWithResponse("TestGroup", "testserver", "db1", Context.NONE);
    }
}
