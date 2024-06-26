// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.MaintenanceInner;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class MaintenanceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MaintenanceInner model = BinaryData.fromString(
            "{\"properties\":{\"maintenanceType\":\"RoutineMaintenance\",\"maintenanceState\":\"Scheduled\",\"maintenanceStartTime\":\"2021-01-11T17:56:17Z\",\"maintenanceEndTime\":\"2021-11-14T23:26:30Z\",\"maintenanceExecutionStartTime\":\"2021-12-04T11:44:33Z\",\"maintenanceExecutionEndTime\":\"2021-07-10T12:02:53Z\",\"maintenanceAvailableScheduleMinTime\":\"2020-12-27T04:23:31Z\",\"maintenanceAvailableScheduleMaxTime\":\"2021-11-09T11:24:19Z\",\"maintenanceTitle\":\"c\",\"maintenanceDescription\":\"tizzronasxif\",\"provisioningState\":\"Succeeded\"},\"id\":\"yzhftwesgogczh\",\"name\":\"nnxk\",\"type\":\"lgnyhmo\"}")
            .toObject(MaintenanceInner.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-11T17:56:17Z"), model.maintenanceStartTime());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MaintenanceInner model
            = new MaintenanceInner().withMaintenanceStartTime(OffsetDateTime.parse("2021-01-11T17:56:17Z"));
        model = BinaryData.fromObject(model).toObject(MaintenanceInner.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-11T17:56:17Z"), model.maintenanceStartTime());
    }
}
