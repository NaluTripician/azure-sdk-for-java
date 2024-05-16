// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.HBaseObjectDataset;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class HBaseObjectDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HBaseObjectDataset model = BinaryData.fromString(
            "{\"type\":\"qz\",\"typeProperties\":{\"tableName\":\"databfcdikqnxydgzf\"},\"description\":\"spa\",\"structure\":\"datavs\",\"schema\":\"dataeronzeafkx\",\"linkedServiceName\":{\"referenceName\":\"muwdbvytqavou\",\"parameters\":{\"iw\":\"datadeuqxlvzpfdkaxg\",\"bmrrmtr\":\"datagopqlktt\",\"rjzwawpewajccs\":\"datagjmpd\"}},\"parameters\":{\"guzprpxhhboigzxk\":{\"type\":\"String\",\"defaultValue\":\"datauijtickzo\"}},\"annotations\":[\"datalrzhtocjzfppexu\",\"dataatzw\",\"datakjwg\"],\"folder\":{\"name\":\"vjcmimbmswskbb\"},\"\":{\"lodaqrbkpo\":\"datayp\",\"valcrqaxlmbrtvtg\":\"dataffsobg\"}}")
            .toObject(HBaseObjectDataset.class);
        Assertions.assertEquals("spa", model.description());
        Assertions.assertEquals("muwdbvytqavou", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.STRING, model.parameters().get("guzprpxhhboigzxk").type());
        Assertions.assertEquals("vjcmimbmswskbb", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HBaseObjectDataset model = new HBaseObjectDataset().withDescription("spa")
            .withStructure("datavs")
            .withSchema("dataeronzeafkx")
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("muwdbvytqavou")
                .withParameters(
                    mapOf("iw", "datadeuqxlvzpfdkaxg", "bmrrmtr", "datagopqlktt", "rjzwawpewajccs", "datagjmpd")))
            .withParameters(mapOf("guzprpxhhboigzxk",
                new ParameterSpecification().withType(ParameterType.STRING).withDefaultValue("datauijtickzo")))
            .withAnnotations(Arrays.asList("datalrzhtocjzfppexu", "dataatzw", "datakjwg"))
            .withFolder(new DatasetFolder().withName("vjcmimbmswskbb"))
            .withTableName("databfcdikqnxydgzf");
        model = BinaryData.fromObject(model).toObject(HBaseObjectDataset.class);
        Assertions.assertEquals("spa", model.description());
        Assertions.assertEquals("muwdbvytqavou", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.STRING, model.parameters().get("guzprpxhhboigzxk").type());
        Assertions.assertEquals("vjcmimbmswskbb", model.folder().name());
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
