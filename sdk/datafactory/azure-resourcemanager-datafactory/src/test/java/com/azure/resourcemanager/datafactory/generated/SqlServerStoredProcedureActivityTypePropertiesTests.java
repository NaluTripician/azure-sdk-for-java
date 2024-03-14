// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.SqlServerStoredProcedureActivityTypeProperties;

public final class SqlServerStoredProcedureActivityTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SqlServerStoredProcedureActivityTypeProperties model = BinaryData
            .fromString("{\"storedProcedureName\":\"datamfbl\",\"storedProcedureParameters\":\"dataekoux\"}")
            .toObject(SqlServerStoredProcedureActivityTypeProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SqlServerStoredProcedureActivityTypeProperties model = new SqlServerStoredProcedureActivityTypeProperties()
            .withStoredProcedureName("datamfbl").withStoredProcedureParameters("dataekoux");
        model = BinaryData.fromObject(model).toObject(SqlServerStoredProcedureActivityTypeProperties.class);
    }
}
