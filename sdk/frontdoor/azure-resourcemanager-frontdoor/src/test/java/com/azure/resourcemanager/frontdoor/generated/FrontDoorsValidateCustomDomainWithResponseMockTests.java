// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.frontdoor.FrontDoorManager;
import com.azure.resourcemanager.frontdoor.models.ValidateCustomDomainInput;
import com.azure.resourcemanager.frontdoor.models.ValidateCustomDomainOutput;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class FrontDoorsValidateCustomDomainWithResponseMockTests {
    @Test
    public void testValidateCustomDomainWithResponse() throws Exception {
        String responseStr
            = "{\"customDomainValidated\":false,\"reason\":\"uslvyjtcvuwkasi\",\"message\":\"esfuught\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        FrontDoorManager manager = FrontDoorManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        ValidateCustomDomainOutput response = manager.frontDoors()
            .validateCustomDomainWithResponse("nrd", "jxtxrdc", new ValidateCustomDomainInput().withHostname("tjvidt"),
                com.azure.core.util.Context.NONE)
            .getValue();

    }
}
