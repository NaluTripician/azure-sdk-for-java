// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.NetezzaTableDataset;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class NetezzaTableDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetezzaTableDataset model = BinaryData.fromString(
            "{\"type\":\"zrinlpxngzzx\",\"typeProperties\":{\"tableName\":\"datanlsyia\",\"table\":\"dataistcjhatclpp\",\"schema\":\"datastmrycpanapfa\"},\"description\":\"gqnzmzctbxzjkpif\",\"structure\":\"datacvbdozwbsk\",\"schema\":\"dataafzsq\",\"linkedServiceName\":{\"referenceName\":\"binpxmiwtkqifpv\",\"parameters\":{\"buxtwgbawshra\":\"datakcdnzoxl\",\"ugqcglmadfztof\":\"dataq\",\"ayfmcerfxfeiqbas\":\"datavqlauuag\"}},\"parameters\":{\"o\":{\"type\":\"Int\",\"defaultValue\":\"dataipssv\"},\"pdqqbtok\":{\"type\":\"Int\",\"defaultValue\":\"datacqcjozzjku\"},\"rhwetto\":{\"type\":\"SecureString\",\"defaultValue\":\"datauzxllbpw\"}},\"annotations\":[\"dataz\",\"dataxyvtkzbhizxp\"],\"folder\":{\"name\":\"dmwnfhmjusuqn\"},\"\":{\"nirmidtvhjc\":\"datahvlxudheka\"}}")
            .toObject(NetezzaTableDataset.class);
        Assertions.assertEquals("gqnzmzctbxzjkpif", model.description());
        Assertions.assertEquals("binpxmiwtkqifpv", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.INT, model.parameters().get("o").type());
        Assertions.assertEquals("dmwnfhmjusuqn", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetezzaTableDataset model = new NetezzaTableDataset().withDescription("gqnzmzctbxzjkpif")
            .withStructure("datacvbdozwbsk")
            .withSchema("dataafzsq")
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("binpxmiwtkqifpv")
                .withParameters(mapOf("buxtwgbawshra", "datakcdnzoxl", "ugqcglmadfztof", "dataq", "ayfmcerfxfeiqbas",
                    "datavqlauuag")))
            .withParameters(mapOf("o",
                new ParameterSpecification().withType(ParameterType.INT).withDefaultValue("dataipssv"), "pdqqbtok",
                new ParameterSpecification().withType(ParameterType.INT).withDefaultValue("datacqcjozzjku"), "rhwetto",
                new ParameterSpecification().withType(ParameterType.SECURE_STRING).withDefaultValue("datauzxllbpw")))
            .withAnnotations(Arrays.asList("dataz", "dataxyvtkzbhizxp"))
            .withFolder(new DatasetFolder().withName("dmwnfhmjusuqn"))
            .withTableName("datanlsyia")
            .withTable("dataistcjhatclpp")
            .withSchemaTypePropertiesSchema("datastmrycpanapfa");
        model = BinaryData.fromObject(model).toObject(NetezzaTableDataset.class);
        Assertions.assertEquals("gqnzmzctbxzjkpif", model.description());
        Assertions.assertEquals("binpxmiwtkqifpv", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.INT, model.parameters().get("o").type());
        Assertions.assertEquals("dmwnfhmjusuqn", model.folder().name());
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
