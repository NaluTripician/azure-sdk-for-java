// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservices.fluent.models.OperationResourceInner;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class OperationResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationResourceInner model =
            BinaryData
                .fromString(
                    "{\"endTime\":\"2021-09-03T21:00:54Z\",\"id\":\"jta\",\"name\":\"ugxywpmueef\",\"status\":\"wfqkquj\",\"startTime\":\"2021-07-14T16:34:27Z\"}")
                .toObject(OperationResourceInner.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-03T21:00:54Z"), model.endTime());
        Assertions.assertEquals("jta", model.id());
        Assertions.assertEquals("ugxywpmueef", model.name());
        Assertions.assertEquals("wfqkquj", model.status());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-14T16:34:27Z"), model.startTime());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationResourceInner model =
            new OperationResourceInner()
                .withEndTime(OffsetDateTime.parse("2021-09-03T21:00:54Z"))
                .withId("jta")
                .withName("ugxywpmueef")
                .withStatus("wfqkquj")
                .withStartTime(OffsetDateTime.parse("2021-07-14T16:34:27Z"));
        model = BinaryData.fromObject(model).toObject(OperationResourceInner.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-03T21:00:54Z"), model.endTime());
        Assertions.assertEquals("jta", model.id());
        Assertions.assertEquals("ugxywpmueef", model.name());
        Assertions.assertEquals("wfqkquj", model.status());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-14T16:34:27Z"), model.startTime());
    }
}
