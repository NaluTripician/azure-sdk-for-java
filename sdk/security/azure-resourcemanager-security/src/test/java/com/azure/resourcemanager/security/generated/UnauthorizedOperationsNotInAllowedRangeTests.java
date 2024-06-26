// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.UnauthorizedOperationsNotInAllowedRange;
import java.time.Duration;
import org.junit.jupiter.api.Assertions;

public final class UnauthorizedOperationsNotInAllowedRangeTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UnauthorizedOperationsNotInAllowedRange model = BinaryData.fromString(
            "{\"ruleType\":\"UnauthorizedOperationsNotInAllowedRange\",\"timeWindowSize\":\"PT4H24M17S\",\"minThreshold\":364824427,\"maxThreshold\":763832979,\"displayName\":\"mdzxp\",\"description\":\"tpvdva\",\"isEnabled\":true}")
            .toObject(UnauthorizedOperationsNotInAllowedRange.class);
        Assertions.assertEquals(true, model.isEnabled());
        Assertions.assertEquals(364824427, model.minThreshold());
        Assertions.assertEquals(763832979, model.maxThreshold());
        Assertions.assertEquals(Duration.parse("PT4H24M17S"), model.timeWindowSize());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UnauthorizedOperationsNotInAllowedRange model
            = new UnauthorizedOperationsNotInAllowedRange().withIsEnabled(true)
                .withMinThreshold(364824427)
                .withMaxThreshold(763832979)
                .withTimeWindowSize(Duration.parse("PT4H24M17S"));
        model = BinaryData.fromObject(model).toObject(UnauthorizedOperationsNotInAllowedRange.class);
        Assertions.assertEquals(true, model.isEnabled());
        Assertions.assertEquals(364824427, model.minThreshold());
        Assertions.assertEquals(763832979, model.maxThreshold());
        Assertions.assertEquals(Duration.parse("PT4H24M17S"), model.timeWindowSize());
    }
}
