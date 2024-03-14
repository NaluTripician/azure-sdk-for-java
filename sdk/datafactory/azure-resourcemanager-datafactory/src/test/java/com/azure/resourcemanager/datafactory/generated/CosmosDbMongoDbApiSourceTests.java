// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.CosmosDbMongoDbApiSource;
import com.azure.resourcemanager.datafactory.models.MongoDbCursorMethodsProperties;
import java.util.HashMap;
import java.util.Map;

public final class CosmosDbMongoDbApiSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CosmosDbMongoDbApiSource model = BinaryData.fromString(
            "{\"type\":\"CosmosDbMongoDbApiSource\",\"filter\":\"dataeztmdyb\",\"cursorMethods\":{\"project\":\"dataj\",\"sort\":\"dataogtnfla\",\"skip\":\"datapghfvkqijmyqo\",\"limit\":\"datasfaoc\",\"\":{\"dpyohnmru\":\"datarr\",\"eywbhxhawkwcf\":\"datavlwhtfscoups\"}},\"batchSize\":\"dataqexd\",\"queryTimeout\":\"datacvkwwjjotfun\",\"additionalColumns\":\"datauejxvrwalekqedof\",\"sourceRetryCount\":\"databxmlai\",\"sourceRetryWait\":\"datavhlpfjibblm\",\"maxConcurrentConnections\":\"datavzdaycmene\",\"disableMetricsCollection\":\"datayzlslvgqle\",\"\":{\"t\":\"datawbbellcjd\",\"dpmy\":\"datacvddfmflwfxdkp\"}}")
            .toObject(CosmosDbMongoDbApiSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CosmosDbMongoDbApiSource model = new CosmosDbMongoDbApiSource().withSourceRetryCount("databxmlai")
            .withSourceRetryWait("datavhlpfjibblm").withMaxConcurrentConnections("datavzdaycmene")
            .withDisableMetricsCollection("datayzlslvgqle").withFilter("dataeztmdyb")
            .withCursorMethods(new MongoDbCursorMethodsProperties().withProject("dataj").withSort("dataogtnfla")
                .withSkip("datapghfvkqijmyqo").withLimit("datasfaoc").withAdditionalProperties(mapOf()))
            .withBatchSize("dataqexd").withQueryTimeout("datacvkwwjjotfun")
            .withAdditionalColumns("datauejxvrwalekqedof");
        model = BinaryData.fromObject(model).toObject(CosmosDbMongoDbApiSource.class);
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
