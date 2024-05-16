// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.ListUsagesResult;

public final class ListUsagesResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ListUsagesResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"id\":\"rvqdra\",\"amlWorkspaceLocation\":\"jybige\",\"type\":\"qfbow\",\"unit\":\"Count\",\"currentValue\":4187351799054769848,\"limit\":8321881464692032483,\"name\":{\"value\":\"iywgqywgndrvynh\",\"localizedValue\":\"pphrcgynco\"}},{\"id\":\"ecfvmm\",\"amlWorkspaceLocation\":\"ofsx\",\"type\":\"evgbmqjq\",\"unit\":\"Count\",\"currentValue\":596965066352142059,\"limit\":4744542296757351266,\"name\":{\"value\":\"zuvccfwnfnbacfio\",\"localizedValue\":\"ebxetqgtzxdp\"}}],\"nextLink\":\"bqqwxrj\"}")
                .toObject(ListUsagesResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ListUsagesResult model = new ListUsagesResult();
        model = BinaryData.fromObject(model).toObject(ListUsagesResult.class);
    }
}
