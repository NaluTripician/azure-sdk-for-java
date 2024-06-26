// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.models.IdentityInfo;
import com.azure.resourcemanager.eventgrid.models.IdentityType;
import com.azure.resourcemanager.eventgrid.models.SystemTopicUpdateParameters;
import com.azure.resourcemanager.eventgrid.models.UserIdentityProperties;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SystemTopicUpdateParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SystemTopicUpdateParameters model = BinaryData.fromString(
            "{\"tags\":{\"sg\":\"yiaseqchkrttzraz\",\"nbwzohmnrxxbso\":\"kiuemv\",\"gnzxojpslsvj\":\"klinhmdptysprq\"},\"identity\":{\"type\":\"SystemAssigned\",\"principalId\":\"fiqwoy\",\"tenantId\":\"vapcoh\",\"userAssignedIdentities\":{\"cawetzqddt\":{\"principalId\":\"qpqojxcxzrzd\",\"clientId\":\"dzbenri\"},\"mizvgbgatzuuvbx\":{\"principalId\":\"fljhznamtua\",\"clientId\":\"zwcjjncqtj\"},\"lx\":{\"principalId\":\"rebwggahtt\",\"clientId\":\"swvajqfu\"},\"ryxameblydyvkfkm\":{\"principalId\":\"qzasunwqrjzfrgqh\",\"clientId\":\"hcmbuocnjrohmbp\"}}}}")
            .toObject(SystemTopicUpdateParameters.class);
        Assertions.assertEquals("yiaseqchkrttzraz", model.tags().get("sg"));
        Assertions.assertEquals(IdentityType.SYSTEM_ASSIGNED, model.identity().type());
        Assertions.assertEquals("fiqwoy", model.identity().principalId());
        Assertions.assertEquals("vapcoh", model.identity().tenantId());
        Assertions.assertEquals("qpqojxcxzrzd",
            model.identity().userAssignedIdentities().get("cawetzqddt").principalId());
        Assertions.assertEquals("dzbenri", model.identity().userAssignedIdentities().get("cawetzqddt").clientId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SystemTopicUpdateParameters model = new SystemTopicUpdateParameters()
            .withTags(mapOf("sg", "yiaseqchkrttzraz", "nbwzohmnrxxbso", "kiuemv", "gnzxojpslsvj", "klinhmdptysprq"))
            .withIdentity(new IdentityInfo().withType(IdentityType.SYSTEM_ASSIGNED)
                .withPrincipalId("fiqwoy")
                .withTenantId("vapcoh")
                .withUserAssignedIdentities(mapOf("cawetzqddt",
                    new UserIdentityProperties().withPrincipalId("qpqojxcxzrzd").withClientId("dzbenri"),
                    "mizvgbgatzuuvbx",
                    new UserIdentityProperties().withPrincipalId("fljhznamtua").withClientId("zwcjjncqtj"), "lx",
                    new UserIdentityProperties().withPrincipalId("rebwggahtt").withClientId("swvajqfu"),
                    "ryxameblydyvkfkm",
                    new UserIdentityProperties().withPrincipalId("qzasunwqrjzfrgqh").withClientId("hcmbuocnjrohmbp"))));
        model = BinaryData.fromObject(model).toObject(SystemTopicUpdateParameters.class);
        Assertions.assertEquals("yiaseqchkrttzraz", model.tags().get("sg"));
        Assertions.assertEquals(IdentityType.SYSTEM_ASSIGNED, model.identity().type());
        Assertions.assertEquals("fiqwoy", model.identity().principalId());
        Assertions.assertEquals("vapcoh", model.identity().tenantId());
        Assertions.assertEquals("qpqojxcxzrzd",
            model.identity().userAssignedIdentities().get("cawetzqddt").principalId());
        Assertions.assertEquals("dzbenri", model.identity().userAssignedIdentities().get("cawetzqddt").clientId());
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
