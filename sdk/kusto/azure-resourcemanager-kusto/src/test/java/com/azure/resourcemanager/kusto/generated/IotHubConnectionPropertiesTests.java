// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.fluent.models.IotHubConnectionProperties;
import com.azure.resourcemanager.kusto.models.DatabaseRouting;
import com.azure.resourcemanager.kusto.models.IotHubDataFormat;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class IotHubConnectionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IotHubConnectionProperties model =
            BinaryData
                .fromString(
                    "{\"iotHubResourceId\":\"stmjlxrri\",\"consumerGroup\":\"ozapeew\",\"tableName\":\"pxlktwkuziycsl\",\"mappingRuleName\":\"ufuztcktyhjtq\",\"dataFormat\":\"PARQUET\",\"eventSystemProperties\":[\"ulwm\",\"rqzz\",\"rjvpglydzgkrvqee\",\"toepryu\"],\"sharedAccessPolicyName\":\"nwy\",\"databaseRouting\":\"Single\",\"retrievalStartDate\":\"2021-01-20T06:32:43Z\",\"provisioningState\":\"Failed\"}")
                .toObject(IotHubConnectionProperties.class);
        Assertions.assertEquals("stmjlxrri", model.iotHubResourceId());
        Assertions.assertEquals("ozapeew", model.consumerGroup());
        Assertions.assertEquals("pxlktwkuziycsl", model.tableName());
        Assertions.assertEquals("ufuztcktyhjtq", model.mappingRuleName());
        Assertions.assertEquals(IotHubDataFormat.PARQUET, model.dataFormat());
        Assertions.assertEquals("ulwm", model.eventSystemProperties().get(0));
        Assertions.assertEquals("nwy", model.sharedAccessPolicyName());
        Assertions.assertEquals(DatabaseRouting.SINGLE, model.databaseRouting());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-20T06:32:43Z"), model.retrievalStartDate());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IotHubConnectionProperties model =
            new IotHubConnectionProperties()
                .withIotHubResourceId("stmjlxrri")
                .withConsumerGroup("ozapeew")
                .withTableName("pxlktwkuziycsl")
                .withMappingRuleName("ufuztcktyhjtq")
                .withDataFormat(IotHubDataFormat.PARQUET)
                .withEventSystemProperties(Arrays.asList("ulwm", "rqzz", "rjvpglydzgkrvqee", "toepryu"))
                .withSharedAccessPolicyName("nwy")
                .withDatabaseRouting(DatabaseRouting.SINGLE)
                .withRetrievalStartDate(OffsetDateTime.parse("2021-01-20T06:32:43Z"));
        model = BinaryData.fromObject(model).toObject(IotHubConnectionProperties.class);
        Assertions.assertEquals("stmjlxrri", model.iotHubResourceId());
        Assertions.assertEquals("ozapeew", model.consumerGroup());
        Assertions.assertEquals("pxlktwkuziycsl", model.tableName());
        Assertions.assertEquals("ufuztcktyhjtq", model.mappingRuleName());
        Assertions.assertEquals(IotHubDataFormat.PARQUET, model.dataFormat());
        Assertions.assertEquals("ulwm", model.eventSystemProperties().get(0));
        Assertions.assertEquals("nwy", model.sharedAccessPolicyName());
        Assertions.assertEquals(DatabaseRouting.SINGLE, model.databaseRouting());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-20T06:32:43Z"), model.retrievalStartDate());
    }
}
