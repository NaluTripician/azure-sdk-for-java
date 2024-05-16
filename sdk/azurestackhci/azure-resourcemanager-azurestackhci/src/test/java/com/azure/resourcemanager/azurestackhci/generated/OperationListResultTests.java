// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.azurestackhci.models.OperationListResult;

public final class OperationListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"name\":\"dcc\",\"isDataAction\":false,\"display\":{\"provider\":\"cnyejhkryhtnapcz\",\"resource\":\"okjye\",\"operation\":\"kvnipjoxz\",\"description\":\"chgejspodm\"},\"origin\":\"system\",\"actionType\":\"Internal\"},{\"name\":\"eho\",\"isDataAction\":false,\"display\":{\"provider\":\"uxinpmqnjaq\",\"resource\":\"xj\",\"operation\":\"r\",\"description\":\"vcputegj\"},\"origin\":\"system\",\"actionType\":\"Internal\"},{\"name\":\"t\",\"isDataAction\":true,\"display\":{\"provider\":\"pjhulsuuvmkj\",\"resource\":\"k\",\"operation\":\"f\",\"description\":\"iodjp\"},\"origin\":\"user\",\"actionType\":\"Internal\"}],\"nextLink\":\"pvwryoqpsoacc\"}")
                .toObject(OperationListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationListResult model = new OperationListResult();
        model = BinaryData.fromObject(model).toObject(OperationListResult.class);
    }
}
