// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devtestlabs.fluent.models.LabInner;
import com.azure.resourcemanager.devtestlabs.models.EnableStatus;
import com.azure.resourcemanager.devtestlabs.models.EnvironmentPermission;
import com.azure.resourcemanager.devtestlabs.models.LabAnnouncementProperties;
import com.azure.resourcemanager.devtestlabs.models.LabSupportProperties;
import com.azure.resourcemanager.devtestlabs.models.PremiumDataDisk;
import com.azure.resourcemanager.devtestlabs.models.StorageType;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class LabInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LabInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"defaultStorageAccount\":\"dkirsoodqxhcr\",\"defaultPremiumStorageAccount\":\"ohjtckw\",\"artifactsStorageAccount\":\"soifiyipjxsqw\",\"premiumDataDiskStorageAccount\":\"rjb\",\"vaultName\":\"orcjxvsnby\",\"labStorageType\":\"StandardSSD\",\"mandatoryArtifactsResourceIdsLinux\":[\"mocpc\"],\"mandatoryArtifactsResourceIdsWindows\":[\"urzafb\",\"jjgpb\",\"oq\"],\"createdDate\":\"2021-03-12T03:38:31Z\",\"premiumDataDisks\":\"Disabled\",\"environmentPermission\":\"Reader\",\"announcement\":{\"title\":\"qidtqajzyu\",\"markdown\":\"kudjkrlkhb\",\"enabled\":\"Enabled\",\"expirationDate\":\"2021-02-23T09:32:58Z\",\"expired\":false,\"provisioningState\":\"qex\",\"uniqueIdentifier\":\"ocxscpaierhhbcs\"},\"support\":{\"enabled\":\"Disabled\",\"markdown\":\"a\"},\"vmCreationResourceGroup\":\"j\",\"publicIpId\":\"dxob\",\"loadBalancerId\":\"dxkqpx\",\"networkSecurityGroupId\":\"ajionpimexgstxg\",\"extendedProperties\":{\"aajrm\":\"dg\",\"clwhijcoejctbz\":\"djwzrlov\",\"bkbfkgukdkex\":\"qsqsy\",\"ocjjxhvpmouexh\":\"ppofmxaxcfjpgdd\"},\"provisioningState\":\"xibqeojnx\",\"uniqueIdentifier\":\"zvddntwndeicbtwn\"},\"location\":\"zao\",\"tags\":{\"qkwpyeicxmqc\":\"hrhcffcyddglmjth\",\"pbobjo\":\"wqvhkhixuigdt\",\"w\":\"hm\",\"a\":\"a\"},\"id\":\"hrzayvvtpgvdf\",\"name\":\"iotkftutqxl\",\"type\":\"gxlefgugnxkrxd\"}")
                .toObject(LabInner.class);
        Assertions.assertEquals("zao", model.location());
        Assertions.assertEquals("hrhcffcyddglmjth", model.tags().get("qkwpyeicxmqc"));
        Assertions.assertEquals(StorageType.STANDARD_SSD, model.labStorageType());
        Assertions.assertEquals("mocpc", model.mandatoryArtifactsResourceIdsLinux().get(0));
        Assertions.assertEquals("urzafb", model.mandatoryArtifactsResourceIdsWindows().get(0));
        Assertions.assertEquals(PremiumDataDisk.DISABLED, model.premiumDataDisks());
        Assertions.assertEquals(EnvironmentPermission.READER, model.environmentPermission());
        Assertions.assertEquals("qidtqajzyu", model.announcement().title());
        Assertions.assertEquals("kudjkrlkhb", model.announcement().markdown());
        Assertions.assertEquals(EnableStatus.ENABLED, model.announcement().enabled());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-23T09:32:58Z"), model.announcement().expirationDate());
        Assertions.assertEquals(false, model.announcement().expired());
        Assertions.assertEquals(EnableStatus.DISABLED, model.support().enabled());
        Assertions.assertEquals("a", model.support().markdown());
        Assertions.assertEquals("dg", model.extendedProperties().get("aajrm"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LabInner model =
            new LabInner()
                .withLocation("zao")
                .withTags(mapOf("qkwpyeicxmqc", "hrhcffcyddglmjth", "pbobjo", "wqvhkhixuigdt", "w", "hm", "a", "a"))
                .withLabStorageType(StorageType.STANDARD_SSD)
                .withMandatoryArtifactsResourceIdsLinux(Arrays.asList("mocpc"))
                .withMandatoryArtifactsResourceIdsWindows(Arrays.asList("urzafb", "jjgpb", "oq"))
                .withPremiumDataDisks(PremiumDataDisk.DISABLED)
                .withEnvironmentPermission(EnvironmentPermission.READER)
                .withAnnouncement(
                    new LabAnnouncementProperties()
                        .withTitle("qidtqajzyu")
                        .withMarkdown("kudjkrlkhb")
                        .withEnabled(EnableStatus.ENABLED)
                        .withExpirationDate(OffsetDateTime.parse("2021-02-23T09:32:58Z"))
                        .withExpired(false))
                .withSupport(new LabSupportProperties().withEnabled(EnableStatus.DISABLED).withMarkdown("a"))
                .withExtendedProperties(
                    mapOf(
                        "aajrm",
                        "dg",
                        "clwhijcoejctbz",
                        "djwzrlov",
                        "bkbfkgukdkex",
                        "qsqsy",
                        "ocjjxhvpmouexh",
                        "ppofmxaxcfjpgdd"));
        model = BinaryData.fromObject(model).toObject(LabInner.class);
        Assertions.assertEquals("zao", model.location());
        Assertions.assertEquals("hrhcffcyddglmjth", model.tags().get("qkwpyeicxmqc"));
        Assertions.assertEquals(StorageType.STANDARD_SSD, model.labStorageType());
        Assertions.assertEquals("mocpc", model.mandatoryArtifactsResourceIdsLinux().get(0));
        Assertions.assertEquals("urzafb", model.mandatoryArtifactsResourceIdsWindows().get(0));
        Assertions.assertEquals(PremiumDataDisk.DISABLED, model.premiumDataDisks());
        Assertions.assertEquals(EnvironmentPermission.READER, model.environmentPermission());
        Assertions.assertEquals("qidtqajzyu", model.announcement().title());
        Assertions.assertEquals("kudjkrlkhb", model.announcement().markdown());
        Assertions.assertEquals(EnableStatus.ENABLED, model.announcement().enabled());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-23T09:32:58Z"), model.announcement().expirationDate());
        Assertions.assertEquals(false, model.announcement().expired());
        Assertions.assertEquals(EnableStatus.DISABLED, model.support().enabled());
        Assertions.assertEquals("a", model.support().markdown());
        Assertions.assertEquals("dg", model.extendedProperties().get("aajrm"));
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
