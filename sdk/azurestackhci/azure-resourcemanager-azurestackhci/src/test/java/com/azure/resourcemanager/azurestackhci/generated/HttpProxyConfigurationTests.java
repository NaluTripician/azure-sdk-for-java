// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.azurestackhci.models.HttpProxyConfiguration;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class HttpProxyConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HttpProxyConfiguration model =
            BinaryData
                .fromString(
                    "{\"httpProxy\":\"sgwbnbbeld\",\"httpsProxy\":\"k\",\"noProxy\":[\"liourqhak\"],\"trustedCa\":\"hashsfwxosow\"}")
                .toObject(HttpProxyConfiguration.class);
        Assertions.assertEquals("sgwbnbbeld", model.httpProxy());
        Assertions.assertEquals("k", model.httpsProxy());
        Assertions.assertEquals("liourqhak", model.noProxy().get(0));
        Assertions.assertEquals("hashsfwxosow", model.trustedCa());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HttpProxyConfiguration model =
            new HttpProxyConfiguration()
                .withHttpProxy("sgwbnbbeld")
                .withHttpsProxy("k")
                .withNoProxy(Arrays.asList("liourqhak"))
                .withTrustedCa("hashsfwxosow");
        model = BinaryData.fromObject(model).toObject(HttpProxyConfiguration.class);
        Assertions.assertEquals("sgwbnbbeld", model.httpProxy());
        Assertions.assertEquals("k", model.httpsProxy());
        Assertions.assertEquals("liourqhak", model.noProxy().get(0));
        Assertions.assertEquals("hashsfwxosow", model.trustedCa());
    }
}
