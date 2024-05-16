// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.machinelearning.models.ManagedServiceIdentity;
import com.azure.resourcemanager.machinelearning.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.machinelearning.models.PrivateEndpointConnectionListResult;
import com.azure.resourcemanager.machinelearning.models.Sku;
import com.azure.resourcemanager.machinelearning.models.SkuTier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class PrivateEndpointConnectionListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateEndpointConnectionListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"provisioningState\":\"Succeeded\"},\"identity\":{\"principalId\":\"a16b0819-56bd-4218-8f63-1a6e43318690\",\"tenantId\":\"e99cad70-8299-4702-98fd-698d21448ff7\",\"type\":\"SystemAssigned,UserAssigned\",\"userAssignedIdentities\":{}},\"location\":\"k\",\"tags\":{\"kphywpnvjto\":\"dhbt\"},\"sku\":{\"name\":\"ermclfplphoxuscr\",\"tier\":\"Basic\",\"size\":\"ye\",\"family\":\"bjtazqugxywpmu\",\"capacity\":737814385},\"id\":\"zwfqkqujidsuyon\",\"name\":\"bglaocqxtccm\",\"type\":\"yudxytlmoy\"},{\"properties\":{\"provisioningState\":\"Creating\"},\"identity\":{\"principalId\":\"170fc112-1b20-4f58-819c-51041af9f532\",\"tenantId\":\"7ad71cc8-ee0b-4afa-8b0e-bab53c22c7f4\",\"type\":\"None\",\"userAssignedIdentities\":{}},\"location\":\"txhdzh\",\"tags\":{\"sbkyvpycanuzbp\":\"jbhckfrlhr\"},\"sku\":{\"name\":\"afkuwb\",\"tier\":\"Basic\",\"size\":\"bmehh\",\"family\":\"yvjusrtslhsp\",\"capacity\":1857421626},\"id\":\"maofmxagkv\",\"name\":\"melmqkrha\",\"type\":\"vljua\"},{\"properties\":{\"provisioningState\":\"Deleting\"},\"identity\":{\"principalId\":\"7ee1c31e-ec49-456e-8ea8-78f4129f7b6f\",\"tenantId\":\"0b889b39-707f-4b57-839f-013c448bcd09\",\"type\":\"None\",\"userAssignedIdentities\":{}},\"location\":\"alaexqpvfadmwsrc\",\"tags\":{\"zlfmisgwbnbbeld\":\"xpvgo\",\"ali\":\"wkz\"},\"sku\":{\"name\":\"rqhakauha\",\"tier\":\"Standard\",\"size\":\"wxosowzxcug\",\"family\":\"jooxdjebw\",\"capacity\":741000017},\"id\":\"wfvovbv\",\"name\":\"euecivyhzceuoj\",\"type\":\"jrwjueiotwm\"},{\"properties\":{\"provisioningState\":\"Creating\"},\"identity\":{\"principalId\":\"f58ea4b5-f02e-496b-a143-d4e796072a44\",\"tenantId\":\"ccb2ecc9-f620-4ad9-9e68-75414abeb40c\",\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{}},\"location\":\"rjaw\",\"tags\":{\"fbkp\":\"gxhnisk\",\"lwn\":\"cg\"},\"sku\":{\"name\":\"hjdauwhvylwz\",\"tier\":\"Standard\",\"size\":\"xujznbmpowu\",\"family\":\"rzqlveu\",\"capacity\":1056372950},\"id\":\"j\",\"name\":\"khfxobbcswsrt\",\"type\":\"riplrbpbewtg\"}]}")
                .toObject(PrivateEndpointConnectionListResult.class);
        Assertions
            .assertEquals(
                ManagedServiceIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED, model.value().get(0).identity().type());
        Assertions.assertEquals("k", model.value().get(0).location());
        Assertions.assertEquals("dhbt", model.value().get(0).tags().get("kphywpnvjto"));
        Assertions.assertEquals("ermclfplphoxuscr", model.value().get(0).sku().name());
        Assertions.assertEquals(SkuTier.BASIC, model.value().get(0).sku().tier());
        Assertions.assertEquals("ye", model.value().get(0).sku().size());
        Assertions.assertEquals("bjtazqugxywpmu", model.value().get(0).sku().family());
        Assertions.assertEquals(737814385, model.value().get(0).sku().capacity());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateEndpointConnectionListResult model =
            new PrivateEndpointConnectionListResult()
                .withValue(
                    Arrays
                        .asList(
                            new PrivateEndpointConnectionInner()
                                .withIdentity(
                                    new ManagedServiceIdentity()
                                        .withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED)
                                        .withUserAssignedIdentities(mapOf()))
                                .withLocation("k")
                                .withTags(mapOf("kphywpnvjto", "dhbt"))
                                .withSku(
                                    new Sku()
                                        .withName("ermclfplphoxuscr")
                                        .withTier(SkuTier.BASIC)
                                        .withSize("ye")
                                        .withFamily("bjtazqugxywpmu")
                                        .withCapacity(737814385)),
                            new PrivateEndpointConnectionInner()
                                .withIdentity(
                                    new ManagedServiceIdentity()
                                        .withType(ManagedServiceIdentityType.NONE)
                                        .withUserAssignedIdentities(mapOf()))
                                .withLocation("txhdzh")
                                .withTags(mapOf("sbkyvpycanuzbp", "jbhckfrlhr"))
                                .withSku(
                                    new Sku()
                                        .withName("afkuwb")
                                        .withTier(SkuTier.BASIC)
                                        .withSize("bmehh")
                                        .withFamily("yvjusrtslhsp")
                                        .withCapacity(1857421626)),
                            new PrivateEndpointConnectionInner()
                                .withIdentity(
                                    new ManagedServiceIdentity()
                                        .withType(ManagedServiceIdentityType.NONE)
                                        .withUserAssignedIdentities(mapOf()))
                                .withLocation("alaexqpvfadmwsrc")
                                .withTags(mapOf("zlfmisgwbnbbeld", "xpvgo", "ali", "wkz"))
                                .withSku(
                                    new Sku()
                                        .withName("rqhakauha")
                                        .withTier(SkuTier.STANDARD)
                                        .withSize("wxosowzxcug")
                                        .withFamily("jooxdjebw")
                                        .withCapacity(741000017)),
                            new PrivateEndpointConnectionInner()
                                .withIdentity(
                                    new ManagedServiceIdentity()
                                        .withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED)
                                        .withUserAssignedIdentities(mapOf()))
                                .withLocation("rjaw")
                                .withTags(mapOf("fbkp", "gxhnisk", "lwn", "cg"))
                                .withSku(
                                    new Sku()
                                        .withName("hjdauwhvylwz")
                                        .withTier(SkuTier.STANDARD)
                                        .withSize("xujznbmpowu")
                                        .withFamily("rzqlveu")
                                        .withCapacity(1056372950))));
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionListResult.class);
        Assertions
            .assertEquals(
                ManagedServiceIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED, model.value().get(0).identity().type());
        Assertions.assertEquals("k", model.value().get(0).location());
        Assertions.assertEquals("dhbt", model.value().get(0).tags().get("kphywpnvjto"));
        Assertions.assertEquals("ermclfplphoxuscr", model.value().get(0).sku().name());
        Assertions.assertEquals(SkuTier.BASIC, model.value().get(0).sku().tier());
        Assertions.assertEquals("ye", model.value().get(0).sku().size());
        Assertions.assertEquals("bjtazqugxywpmu", model.value().get(0).sku().family());
        Assertions.assertEquals(737814385, model.value().get(0).sku().capacity());
    }

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
