// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.eventgrid.EventGridManager;
import com.azure.resourcemanager.eventgrid.models.PartnerDestination;
import com.azure.resourcemanager.eventgrid.models.PartnerDestinationActivationState;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PartnerDestinationsActivateWithResponseMockTests {
    @Test
    public void testActivateWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"partnerRegistrationImmutableId\":\"ba095bcc-2828-4c96-ab06-535a3c3735fa\",\"endpointServiceContext\":\"ermhzicsbfdjhyaa\",\"expirationTimeIfNotActivatedUtc\":\"2021-12-08T00:07:25Z\",\"provisioningState\":\"Creating\",\"activationState\":\"Activated\",\"endpointBaseUrl\":\"iglh\",\"messageForActivation\":\"zwxqtejpii\"},\"location\":\"vtozya\",\"tags\":{\"klvqzrwtrdgscn\":\"nxkbylhyyxgf\",\"on\":\"q\",\"mezyo\":\"gnwxl\",\"fve\":\"xpthceopvkvt\"},\"id\":\"obpbokhmm\",\"name\":\"cdyarnggcjfwblqh\",\"type\":\"kasmcolmugpyva\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        EventGridManager manager = EventGridManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PartnerDestination response = manager.partnerDestinations()
            .activateWithResponse("cybdueurgm", "dcpks", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("vtozya", response.location());
        Assertions.assertEquals("nxkbylhyyxgf", response.tags().get("klvqzrwtrdgscn"));
        Assertions.assertEquals(UUID.fromString("ba095bcc-2828-4c96-ab06-535a3c3735fa"),
            response.partnerRegistrationImmutableId());
        Assertions.assertEquals("ermhzicsbfdjhyaa", response.endpointServiceContext());
        Assertions.assertEquals(OffsetDateTime.parse("2021-12-08T00:07:25Z"),
            response.expirationTimeIfNotActivatedUtc());
        Assertions.assertEquals(PartnerDestinationActivationState.ACTIVATED, response.activationState());
        Assertions.assertEquals("iglh", response.endpointBaseUrl());
        Assertions.assertEquals("zwxqtejpii", response.messageForActivation());
    }
}
