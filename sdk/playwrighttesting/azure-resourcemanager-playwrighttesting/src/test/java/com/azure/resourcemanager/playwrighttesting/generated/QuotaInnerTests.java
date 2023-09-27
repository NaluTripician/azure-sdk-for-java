// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.playwrighttesting.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.playwrighttesting.fluent.models.QuotaInner;
import com.azure.resourcemanager.playwrighttesting.models.FreeTrialProperties;

public final class QuotaInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        QuotaInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"freeTrial\":{\"accountId\":\"uvamiheognarxzxt\",\"createdAt\":\"2021-08-08T21:36:05Z\",\"expiryAt\":\"2021-07-28T01:15:26Z\",\"allocatedValue\":1638968400,\"usedValue\":1544576839,\"state\":\"Active\"},\"provisioningState\":\"Canceled\"},\"id\":\"evcciqihnhun\",\"name\":\"bwjzr\",\"type\":\"fygxgispemvtzfk\"}")
                .toObject(QuotaInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        QuotaInner model = new QuotaInner().withFreeTrial(new FreeTrialProperties());
        model = BinaryData.fromObject(model).toObject(QuotaInner.class);
    }
}
