// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.DiagnosticsStatus;
import org.junit.jupiter.api.Assertions;

public final class DiagnosticsStatusTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DiagnosticsStatus model = BinaryData.fromString("{\"message\":\"dpsovwxznptgo\",\"statusId\":935021144}")
            .toObject(DiagnosticsStatus.class);
        Assertions.assertEquals("dpsovwxznptgo", model.message());
        Assertions.assertEquals(935021144, model.statusId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DiagnosticsStatus model = new DiagnosticsStatus().withMessage("dpsovwxznptgo").withStatusId(935021144);
        model = BinaryData.fromObject(model).toObject(DiagnosticsStatus.class);
        Assertions.assertEquals("dpsovwxznptgo", model.message());
        Assertions.assertEquals(935021144, model.statusId());
    }
}
