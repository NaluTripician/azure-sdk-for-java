// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.BackupPolicyInner;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class BackupPolicyInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BackupPolicyInner model = BinaryData.fromString(
            "{\"etag\":\"vtpuqujmqlgk\",\"properties\":{\"backupPolicyId\":\"tndoaongbjc\",\"provisioningState\":\"ujitcjedftww\",\"dailyBackupsToKeep\":1066178212,\"weeklyBackupsToKeep\":565058049,\"monthlyBackupsToKeep\":229411798,\"volumesAssigned\":242462331,\"enabled\":true,\"volumeBackups\":[{\"volumeName\":\"ouicybxarzgszu\",\"backupsCount\":37759464,\"policyEnabled\":true},{\"volumeName\":\"opidoamciodh\",\"backupsCount\":1741139859,\"policyEnabled\":true},{\"volumeName\":\"hnzbonl\",\"backupsCount\":1184830478,\"policyEnabled\":true},{\"volumeName\":\"okdwb\",\"backupsCount\":1161774579,\"policyEnabled\":false}]},\"location\":\"cmrvexzt\",\"tags\":{\"lmnguxaw\":\"qgsfraoyzkoow\"},\"id\":\"aldsy\",\"name\":\"uximerqfobw\",\"type\":\"znkbykutwpfhpagm\"}")
            .toObject(BackupPolicyInner.class);
        Assertions.assertEquals("cmrvexzt", model.location());
        Assertions.assertEquals("qgsfraoyzkoow", model.tags().get("lmnguxaw"));
        Assertions.assertEquals(1066178212, model.dailyBackupsToKeep());
        Assertions.assertEquals(565058049, model.weeklyBackupsToKeep());
        Assertions.assertEquals(229411798, model.monthlyBackupsToKeep());
        Assertions.assertEquals(true, model.enabled());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BackupPolicyInner model = new BackupPolicyInner().withLocation("cmrvexzt")
            .withTags(mapOf("lmnguxaw", "qgsfraoyzkoow")).withDailyBackupsToKeep(1066178212)
            .withWeeklyBackupsToKeep(565058049).withMonthlyBackupsToKeep(229411798).withEnabled(true);
        model = BinaryData.fromObject(model).toObject(BackupPolicyInner.class);
        Assertions.assertEquals("cmrvexzt", model.location());
        Assertions.assertEquals("qgsfraoyzkoow", model.tags().get("lmnguxaw"));
        Assertions.assertEquals(1066178212, model.dailyBackupsToKeep());
        Assertions.assertEquals(565058049, model.weeklyBackupsToKeep());
        Assertions.assertEquals(229411798, model.monthlyBackupsToKeep());
        Assertions.assertEquals(true, model.enabled());
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
