// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mariadb.fluent.models.PerformanceTierPropertiesInner;
import com.azure.resourcemanager.mariadb.models.PerformanceTierListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PerformanceTierListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PerformanceTierListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"id\":\"fu\",\"maxBackupRetentionDays\":94424945,\"minBackupRetentionDays\":1445775245,\"maxStorageMB\":680550088,\"minLargeStorageMB\":397485144,\"maxLargeStorageMB\":1569730572,\"minStorageMB\":1076562523,\"serviceLevelObjectives\":[]},{\"id\":\"ozmyzydagfu\",\"maxBackupRetentionDays\":906864290,\"minBackupRetentionDays\":1852056449,\"maxStorageMB\":427242708,\"minLargeStorageMB\":269303909,\"maxLargeStorageMB\":962649448,\"minStorageMB\":1627689194,\"serviceLevelObjectives\":[]},{\"id\":\"xw\",\"maxBackupRetentionDays\":2101673805,\"minBackupRetentionDays\":512563876,\"maxStorageMB\":157080092,\"minLargeStorageMB\":1243889101,\"maxLargeStorageMB\":854764023,\"minStorageMB\":1524544291,\"serviceLevelObjectives\":[]},{\"id\":\"yocf\",\"maxBackupRetentionDays\":1075133602,\"minBackupRetentionDays\":1510965337,\"maxStorageMB\":1143177413,\"minLargeStorageMB\":376493890,\"maxLargeStorageMB\":666664165,\"minStorageMB\":30564685,\"serviceLevelObjectives\":[]}]}")
                .toObject(PerformanceTierListResult.class);
        Assertions.assertEquals("fu", model.value().get(0).id());
        Assertions.assertEquals(94424945, model.value().get(0).maxBackupRetentionDays());
        Assertions.assertEquals(1445775245, model.value().get(0).minBackupRetentionDays());
        Assertions.assertEquals(680550088, model.value().get(0).maxStorageMB());
        Assertions.assertEquals(397485144, model.value().get(0).minLargeStorageMB());
        Assertions.assertEquals(1569730572, model.value().get(0).maxLargeStorageMB());
        Assertions.assertEquals(1076562523, model.value().get(0).minStorageMB());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PerformanceTierListResult model =
            new PerformanceTierListResult()
                .withValue(
                    Arrays
                        .asList(
                            new PerformanceTierPropertiesInner()
                                .withId("fu")
                                .withMaxBackupRetentionDays(94424945)
                                .withMinBackupRetentionDays(1445775245)
                                .withMaxStorageMB(680550088)
                                .withMinLargeStorageMB(397485144)
                                .withMaxLargeStorageMB(1569730572)
                                .withMinStorageMB(1076562523)
                                .withServiceLevelObjectives(Arrays.asList()),
                            new PerformanceTierPropertiesInner()
                                .withId("ozmyzydagfu")
                                .withMaxBackupRetentionDays(906864290)
                                .withMinBackupRetentionDays(1852056449)
                                .withMaxStorageMB(427242708)
                                .withMinLargeStorageMB(269303909)
                                .withMaxLargeStorageMB(962649448)
                                .withMinStorageMB(1627689194)
                                .withServiceLevelObjectives(Arrays.asList()),
                            new PerformanceTierPropertiesInner()
                                .withId("xw")
                                .withMaxBackupRetentionDays(2101673805)
                                .withMinBackupRetentionDays(512563876)
                                .withMaxStorageMB(157080092)
                                .withMinLargeStorageMB(1243889101)
                                .withMaxLargeStorageMB(854764023)
                                .withMinStorageMB(1524544291)
                                .withServiceLevelObjectives(Arrays.asList()),
                            new PerformanceTierPropertiesInner()
                                .withId("yocf")
                                .withMaxBackupRetentionDays(1075133602)
                                .withMinBackupRetentionDays(1510965337)
                                .withMaxStorageMB(1143177413)
                                .withMinLargeStorageMB(376493890)
                                .withMaxLargeStorageMB(666664165)
                                .withMinStorageMB(30564685)
                                .withServiceLevelObjectives(Arrays.asList())));
        model = BinaryData.fromObject(model).toObject(PerformanceTierListResult.class);
        Assertions.assertEquals("fu", model.value().get(0).id());
        Assertions.assertEquals(94424945, model.value().get(0).maxBackupRetentionDays());
        Assertions.assertEquals(1445775245, model.value().get(0).minBackupRetentionDays());
        Assertions.assertEquals(680550088, model.value().get(0).maxStorageMB());
        Assertions.assertEquals(397485144, model.value().get(0).minLargeStorageMB());
        Assertions.assertEquals(1569730572, model.value().get(0).maxLargeStorageMB());
        Assertions.assertEquals(1076562523, model.value().get(0).minStorageMB());
    }
}
