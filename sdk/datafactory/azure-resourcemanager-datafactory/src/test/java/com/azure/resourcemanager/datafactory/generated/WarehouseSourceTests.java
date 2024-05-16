// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SqlPartitionSettings;
import com.azure.resourcemanager.datafactory.models.WarehouseSource;

public final class WarehouseSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WarehouseSource model = BinaryData.fromString(
            "{\"type\":\"dkj\",\"sqlReaderQuery\":\"datafkinidyjffpuuyk\",\"sqlReaderStoredProcedureName\":\"databpn\",\"storedProcedureParameters\":\"datamlctnnsjc\",\"isolationLevel\":\"dataijvaxu\",\"partitionOption\":\"datazzp\",\"partitionSettings\":{\"partitionColumnName\":\"dataaaxglxhbnqye\",\"partitionUpperBound\":\"datanlen\",\"partitionLowerBound\":\"dataykebtvnedcclpbh\"},\"queryTimeout\":\"dataiehooxqkcayy\",\"additionalColumns\":\"datanllkyiqjtxvxgrf\",\"sourceRetryCount\":\"datavhivvoczsry\",\"sourceRetryWait\":\"datavii\",\"maxConcurrentConnections\":\"datajqpsbbxke\",\"disableMetricsCollection\":\"datamqnuyu\",\"\":{\"ekhfdlbcucwfc\":\"datan\",\"tkv\":\"dataugtcccydldavozmi\"}}")
            .toObject(WarehouseSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WarehouseSource model = new WarehouseSource().withSourceRetryCount("datavhivvoczsry")
            .withSourceRetryWait("datavii")
            .withMaxConcurrentConnections("datajqpsbbxke")
            .withDisableMetricsCollection("datamqnuyu")
            .withQueryTimeout("dataiehooxqkcayy")
            .withAdditionalColumns("datanllkyiqjtxvxgrf")
            .withSqlReaderQuery("datafkinidyjffpuuyk")
            .withSqlReaderStoredProcedureName("databpn")
            .withStoredProcedureParameters("datamlctnnsjc")
            .withIsolationLevel("dataijvaxu")
            .withPartitionOption("datazzp")
            .withPartitionSettings(new SqlPartitionSettings().withPartitionColumnName("dataaaxglxhbnqye")
                .withPartitionUpperBound("datanlen")
                .withPartitionLowerBound("dataykebtvnedcclpbh"));
        model = BinaryData.fromObject(model).toObject(WarehouseSource.class);
    }
}
