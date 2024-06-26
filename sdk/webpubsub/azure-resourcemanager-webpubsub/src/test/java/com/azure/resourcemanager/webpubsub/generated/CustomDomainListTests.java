// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.webpubsub.fluent.models.CustomDomainInner;
import com.azure.resourcemanager.webpubsub.models.CustomDomainList;
import com.azure.resourcemanager.webpubsub.models.ResourceReference;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class CustomDomainListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CustomDomainList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"provisioningState\":\"Deleting\",\"domainName\":\"xggicccnxqhuexmk\",\"customCertificate\":{\"id\":\"lstvlzywe\"}},\"id\":\"zrncsdt\",\"name\":\"lusiy\",\"type\":\"bsfgytguslfea\"},{\"properties\":{\"provisioningState\":\"Deleting\",\"domainName\":\"gq\",\"customCertificate\":{\"id\":\"yhejhzisxgfp\"}},\"id\":\"olppvksrpqvujz\",\"name\":\"aehtwd\",\"type\":\"r\"},{\"properties\":{\"provisioningState\":\"Moving\",\"domainName\":\"wib\",\"customCertificate\":{\"id\":\"cdl\"}},\"id\":\"shfwpracstwity\",\"name\":\"hevxcced\",\"type\":\"pnmdyodnwzxltjcv\"}],\"nextLink\":\"ltiugcxnavv\"}")
                .toObject(CustomDomainList.class);
        Assertions.assertEquals("xggicccnxqhuexmk", model.value().get(0).domainName());
        Assertions.assertEquals("lstvlzywe", model.value().get(0).customCertificate().id());
        Assertions.assertEquals("ltiugcxnavv", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CustomDomainList model =
            new CustomDomainList()
                .withValue(
                    Arrays
                        .asList(
                            new CustomDomainInner()
                                .withDomainName("xggicccnxqhuexmk")
                                .withCustomCertificate(new ResourceReference().withId("lstvlzywe")),
                            new CustomDomainInner()
                                .withDomainName("gq")
                                .withCustomCertificate(new ResourceReference().withId("yhejhzisxgfp")),
                            new CustomDomainInner()
                                .withDomainName("wib")
                                .withCustomCertificate(new ResourceReference().withId("cdl"))))
                .withNextLink("ltiugcxnavv");
        model = BinaryData.fromObject(model).toObject(CustomDomainList.class);
        Assertions.assertEquals("xggicccnxqhuexmk", model.value().get(0).domainName());
        Assertions.assertEquals("lstvlzywe", model.value().get(0).customCertificate().id());
        Assertions.assertEquals("ltiugcxnavv", model.nextLink());
    }
}
