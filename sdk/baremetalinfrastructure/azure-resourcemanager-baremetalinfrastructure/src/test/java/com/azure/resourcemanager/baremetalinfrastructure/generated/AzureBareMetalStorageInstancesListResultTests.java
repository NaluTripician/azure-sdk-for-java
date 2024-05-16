// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.baremetalinfrastructure.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.baremetalinfrastructure.fluent.models.AzureBareMetalStorageInstanceInner;
import com.azure.resourcemanager.baremetalinfrastructure.models.AzureBareMetalStorageInstancesListResult;
import com.azure.resourcemanager.baremetalinfrastructure.models.ProvisioningState;
import com.azure.resourcemanager.baremetalinfrastructure.models.StorageBillingProperties;
import com.azure.resourcemanager.baremetalinfrastructure.models.StorageProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AzureBareMetalStorageInstancesListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureBareMetalStorageInstancesListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"azureBareMetalStorageInstanceUniqueIdentifier\":\"nbybkzgcwrwcl\",\"storageProperties\":{\"provisioningState\":\"Deleting\",\"offeringType\":\"jdous\",\"storageType\":\"qvkoc\",\"generation\":\"jdkwtnhxbnjb\",\"hardwareType\":\"sqrglssainq\",\"workloadType\":\"wnzlljfmppeeb\",\"storageBillingProperties\":{\"billingMode\":\"xsabkyqdu\",\"azureBareMetalStorageInstanceSize\":\"itcjczdz\"}}},\"location\":\"ndhkrw\",\"tags\":{\"eusnhutj\":\"ppdsbdkvwrwj\"},\"id\":\"ltmrldh\",\"name\":\"gjzzdatqxhocdg\",\"type\":\"ablgphuticndvk\"},{\"properties\":{\"azureBareMetalStorageInstanceUniqueIdentifier\":\"wyiftyhxhur\",\"storageProperties\":{\"provisioningState\":\"Deleting\",\"offeringType\":\"xolniwpwcukjfk\",\"storageType\":\"awxklr\",\"generation\":\"lwckbasyypnddhs\",\"hardwareType\":\"bacphejko\",\"workloadType\":\"nqgoulzndli\",\"storageBillingProperties\":{\"billingMode\":\"qkgfgibma\",\"azureBareMetalStorageInstanceSize\":\"akeqs\"}}},\"location\":\"yb\",\"tags\":{\"qytbciq\":\"e\",\"mmnkzsmodmgl\":\"ouf\",\"mutduqktaps\":\"ugpbkw\",\"rtumkdosvq\":\"wgcu\"},\"id\":\"hbmdgbbjfdd\",\"name\":\"mbmbexppbh\",\"type\":\"q\"},{\"properties\":{\"azureBareMetalStorageInstanceUniqueIdentifier\":\"lfp\",\"storageProperties\":{\"provisioningState\":\"Canceled\",\"offeringType\":\"gbquxigj\",\"storageType\":\"gzjaoyfhrtxilne\",\"generation\":\"ujysvle\",\"hardwareType\":\"vfqawrlyxwjkcpr\",\"workloadType\":\"wbxgjvt\",\"storageBillingProperties\":{\"billingMode\":\"ysszdnrujqguh\",\"azureBareMetalStorageInstanceSize\":\"ouqfprwz\"}}},\"location\":\"nguitnwuizgazxu\",\"tags\":{\"hr\":\"uckyf\",\"zwdzuh\":\"idf\"},\"id\":\"ymwisdkft\",\"name\":\"wxmnteiwao\",\"type\":\"vkmijcmmxdcuf\"}],\"nextLink\":\"srp\"}")
                .toObject(AzureBareMetalStorageInstancesListResult.class);
        Assertions.assertEquals("ndhkrw", model.value().get(0).location());
        Assertions.assertEquals("ppdsbdkvwrwj", model.value().get(0).tags().get("eusnhutj"));
        Assertions.assertEquals("nbybkzgcwrwcl", model.value().get(0).azureBareMetalStorageInstanceUniqueIdentifier());
        Assertions
            .assertEquals(ProvisioningState.DELETING, model.value().get(0).storageProperties().provisioningState());
        Assertions.assertEquals("jdous", model.value().get(0).storageProperties().offeringType());
        Assertions.assertEquals("qvkoc", model.value().get(0).storageProperties().storageType());
        Assertions.assertEquals("jdkwtnhxbnjb", model.value().get(0).storageProperties().generation());
        Assertions.assertEquals("sqrglssainq", model.value().get(0).storageProperties().hardwareType());
        Assertions.assertEquals("wnzlljfmppeeb", model.value().get(0).storageProperties().workloadType());
        Assertions
            .assertEquals(
                "xsabkyqdu", model.value().get(0).storageProperties().storageBillingProperties().billingMode());
        Assertions
            .assertEquals(
                "itcjczdz",
                model
                    .value()
                    .get(0)
                    .storageProperties()
                    .storageBillingProperties()
                    .azureBareMetalStorageInstanceSize());
        Assertions.assertEquals("srp", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureBareMetalStorageInstancesListResult model =
            new AzureBareMetalStorageInstancesListResult()
                .withValue(
                    Arrays
                        .asList(
                            new AzureBareMetalStorageInstanceInner()
                                .withLocation("ndhkrw")
                                .withTags(mapOf("eusnhutj", "ppdsbdkvwrwj"))
                                .withAzureBareMetalStorageInstanceUniqueIdentifier("nbybkzgcwrwcl")
                                .withStorageProperties(
                                    new StorageProperties()
                                        .withProvisioningState(ProvisioningState.DELETING)
                                        .withOfferingType("jdous")
                                        .withStorageType("qvkoc")
                                        .withGeneration("jdkwtnhxbnjb")
                                        .withHardwareType("sqrglssainq")
                                        .withWorkloadType("wnzlljfmppeeb")
                                        .withStorageBillingProperties(
                                            new StorageBillingProperties()
                                                .withBillingMode("xsabkyqdu")
                                                .withAzureBareMetalStorageInstanceSize("itcjczdz"))),
                            new AzureBareMetalStorageInstanceInner()
                                .withLocation("yb")
                                .withTags(
                                    mapOf(
                                        "qytbciq",
                                        "e",
                                        "mmnkzsmodmgl",
                                        "ouf",
                                        "mutduqktaps",
                                        "ugpbkw",
                                        "rtumkdosvq",
                                        "wgcu"))
                                .withAzureBareMetalStorageInstanceUniqueIdentifier("wyiftyhxhur")
                                .withStorageProperties(
                                    new StorageProperties()
                                        .withProvisioningState(ProvisioningState.DELETING)
                                        .withOfferingType("xolniwpwcukjfk")
                                        .withStorageType("awxklr")
                                        .withGeneration("lwckbasyypnddhs")
                                        .withHardwareType("bacphejko")
                                        .withWorkloadType("nqgoulzndli")
                                        .withStorageBillingProperties(
                                            new StorageBillingProperties()
                                                .withBillingMode("qkgfgibma")
                                                .withAzureBareMetalStorageInstanceSize("akeqs"))),
                            new AzureBareMetalStorageInstanceInner()
                                .withLocation("nguitnwuizgazxu")
                                .withTags(mapOf("hr", "uckyf", "zwdzuh", "idf"))
                                .withAzureBareMetalStorageInstanceUniqueIdentifier("lfp")
                                .withStorageProperties(
                                    new StorageProperties()
                                        .withProvisioningState(ProvisioningState.CANCELED)
                                        .withOfferingType("gbquxigj")
                                        .withStorageType("gzjaoyfhrtxilne")
                                        .withGeneration("ujysvle")
                                        .withHardwareType("vfqawrlyxwjkcpr")
                                        .withWorkloadType("wbxgjvt")
                                        .withStorageBillingProperties(
                                            new StorageBillingProperties()
                                                .withBillingMode("ysszdnrujqguh")
                                                .withAzureBareMetalStorageInstanceSize("ouqfprwz")))))
                .withNextLink("srp");
        model = BinaryData.fromObject(model).toObject(AzureBareMetalStorageInstancesListResult.class);
        Assertions.assertEquals("ndhkrw", model.value().get(0).location());
        Assertions.assertEquals("ppdsbdkvwrwj", model.value().get(0).tags().get("eusnhutj"));
        Assertions.assertEquals("nbybkzgcwrwcl", model.value().get(0).azureBareMetalStorageInstanceUniqueIdentifier());
        Assertions
            .assertEquals(ProvisioningState.DELETING, model.value().get(0).storageProperties().provisioningState());
        Assertions.assertEquals("jdous", model.value().get(0).storageProperties().offeringType());
        Assertions.assertEquals("qvkoc", model.value().get(0).storageProperties().storageType());
        Assertions.assertEquals("jdkwtnhxbnjb", model.value().get(0).storageProperties().generation());
        Assertions.assertEquals("sqrglssainq", model.value().get(0).storageProperties().hardwareType());
        Assertions.assertEquals("wnzlljfmppeeb", model.value().get(0).storageProperties().workloadType());
        Assertions
            .assertEquals(
                "xsabkyqdu", model.value().get(0).storageProperties().storageBillingProperties().billingMode());
        Assertions
            .assertEquals(
                "itcjczdz",
                model
                    .value()
                    .get(0)
                    .storageProperties()
                    .storageBillingProperties()
                    .azureBareMetalStorageInstanceSize());
        Assertions.assertEquals("srp", model.nextLink());
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
