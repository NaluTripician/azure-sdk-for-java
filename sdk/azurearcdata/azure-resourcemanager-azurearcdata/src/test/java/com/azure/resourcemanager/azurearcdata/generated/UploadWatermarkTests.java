// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurearcdata.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.azurearcdata.models.UploadWatermark;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class UploadWatermarkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UploadWatermark model =
            BinaryData
                .fromString(
                    "{\"metrics\":\"2021-10-25T12:28:17Z\",\"logs\":\"2021-10-31T17:40:20Z\",\"usages\":\"2021-09-30T03:16:16Z\"}")
                .toObject(UploadWatermark.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-25T12:28:17Z"), model.metrics());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-31T17:40:20Z"), model.logs());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-30T03:16:16Z"), model.usages());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UploadWatermark model =
            new UploadWatermark()
                .withMetrics(OffsetDateTime.parse("2021-10-25T12:28:17Z"))
                .withLogs(OffsetDateTime.parse("2021-10-31T17:40:20Z"))
                .withUsages(OffsetDateTime.parse("2021-09-30T03:16:16Z"));
        model = BinaryData.fromObject(model).toObject(UploadWatermark.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-25T12:28:17Z"), model.metrics());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-31T17:40:20Z"), model.logs());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-30T03:16:16Z"), model.usages());
    }
}
