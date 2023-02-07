// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.reservations.fluent.models.CurrentQuotaLimitBaseInner;
import com.azure.resourcemanager.reservations.models.QuotaLimits;
import com.azure.resourcemanager.reservations.models.QuotaProperties;
import com.azure.resourcemanager.reservations.models.ResourceType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class QuotaLimitsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        QuotaLimits model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"limit\":988494266,\"currentValue\":1400063393,\"unit\":\"qudf\",\"resourceType\":\"serviceSpecific\",\"quotaPeriod\":\"aaabjyvayff\",\"properties\":\"datarzrtuzqogsex\"},\"id\":\"evfdnwnwm\",\"name\":\"wzsyyceuzs\",\"type\":\"i\"}],\"nextLink\":\"ud\"}")
                .toObject(QuotaLimits.class);
        Assertions.assertEquals(988494266, model.value().get(0).properties().limit());
        Assertions.assertEquals("qudf", model.value().get(0).properties().unit());
        Assertions.assertEquals(ResourceType.SERVICE_SPECIFIC, model.value().get(0).properties().resourceType());
        Assertions.assertEquals("ud", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        QuotaLimits model =
            new QuotaLimits()
                .withValue(
                    Arrays
                        .asList(
                            new CurrentQuotaLimitBaseInner()
                                .withProperties(
                                    new QuotaProperties()
                                        .withLimit(988494266)
                                        .withUnit("qudf")
                                        .withResourceType(ResourceType.SERVICE_SPECIFIC)
                                        .withProperties("datarzrtuzqogsex"))))
                .withNextLink("ud");
        model = BinaryData.fromObject(model).toObject(QuotaLimits.class);
        Assertions.assertEquals(988494266, model.value().get(0).properties().limit());
        Assertions.assertEquals("qudf", model.value().get(0).properties().unit());
        Assertions.assertEquals(ResourceType.SERVICE_SPECIFIC, model.value().get(0).properties().resourceType());
        Assertions.assertEquals("ud", model.nextLink());
    }
}
