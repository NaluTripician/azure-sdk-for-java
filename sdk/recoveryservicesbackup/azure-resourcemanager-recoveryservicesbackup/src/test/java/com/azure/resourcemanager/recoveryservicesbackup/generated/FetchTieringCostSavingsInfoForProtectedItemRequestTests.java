// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.FetchTieringCostSavingsInfoForProtectedItemRequest;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointTierType;
import org.junit.jupiter.api.Assertions;

public final class FetchTieringCostSavingsInfoForProtectedItemRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FetchTieringCostSavingsInfoForProtectedItemRequest model = BinaryData.fromString(
            "{\"objectType\":\"FetchTieringCostSavingsInfoForProtectedItemRequest\",\"containerName\":\"vx\",\"protectedItemName\":\"cwxhmpej\",\"sourceTierType\":\"ArchivedRP\",\"targetTierType\":\"Invalid\"}")
            .toObject(FetchTieringCostSavingsInfoForProtectedItemRequest.class);
        Assertions.assertEquals(RecoveryPointTierType.ARCHIVED_RP, model.sourceTierType());
        Assertions.assertEquals(RecoveryPointTierType.INVALID, model.targetTierType());
        Assertions.assertEquals("vx", model.containerName());
        Assertions.assertEquals("cwxhmpej", model.protectedItemName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FetchTieringCostSavingsInfoForProtectedItemRequest model
            = new FetchTieringCostSavingsInfoForProtectedItemRequest()
                .withSourceTierType(RecoveryPointTierType.ARCHIVED_RP).withTargetTierType(RecoveryPointTierType.INVALID)
                .withContainerName("vx").withProtectedItemName("cwxhmpej");
        model = BinaryData.fromObject(model).toObject(FetchTieringCostSavingsInfoForProtectedItemRequest.class);
        Assertions.assertEquals(RecoveryPointTierType.ARCHIVED_RP, model.sourceTierType());
        Assertions.assertEquals(RecoveryPointTierType.INVALID, model.targetTierType());
        Assertions.assertEquals("vx", model.containerName());
        Assertions.assertEquals("cwxhmpej", model.protectedItemName());
    }
}
