// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dashboard.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dashboard.models.AvailablePromotion;
import com.azure.resourcemanager.dashboard.models.MarketplaceTrialQuota;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class MarketplaceTrialQuotaTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MarketplaceTrialQuota model = BinaryData.fromString(
            "{\"availablePromotion\":\"None\",\"grafanaResourceId\":\"objoghmewu\",\"trialStartAt\":\"2021-01-02T08:53:50Z\",\"trialEndAt\":\"2021-01-27T21:23:24Z\"}")
            .toObject(MarketplaceTrialQuota.class);
        Assertions.assertEquals(AvailablePromotion.NONE, model.availablePromotion());
        Assertions.assertEquals("objoghmewu", model.grafanaResourceId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-02T08:53:50Z"), model.trialStartAt());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-27T21:23:24Z"), model.trialEndAt());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MarketplaceTrialQuota model = new MarketplaceTrialQuota().withAvailablePromotion(AvailablePromotion.NONE)
            .withGrafanaResourceId("objoghmewu").withTrialStartAt(OffsetDateTime.parse("2021-01-02T08:53:50Z"))
            .withTrialEndAt(OffsetDateTime.parse("2021-01-27T21:23:24Z"));
        model = BinaryData.fromObject(model).toObject(MarketplaceTrialQuota.class);
        Assertions.assertEquals(AvailablePromotion.NONE, model.availablePromotion());
        Assertions.assertEquals("objoghmewu", model.grafanaResourceId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-02T08:53:50Z"), model.trialStartAt());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-27T21:23:24Z"), model.trialEndAt());
    }
}
