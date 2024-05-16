// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.developer.devcenter.generated;

import com.azure.core.util.polling.LongRunningOperationStatus;
import com.azure.core.util.polling.SyncPoller;
import com.azure.developer.devcenter.models.DevCenterOperationDetails;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
public final class StopsADevBoxTests extends DevCenterClientTestBase {
    @Test
    @Disabled
    public void testStopsADevBoxTests() {
        // method invocation
        SyncPoller<DevCenterOperationDetails, Void> response
            = devBoxesClient.beginStopDevBox("myProject", "me", "MyDevBox", true);

        // response assertion
        Assertions.assertEquals(LongRunningOperationStatus.SUCCESSFULLY_COMPLETED,
            response.waitForCompletion().getStatus());
    }
}
