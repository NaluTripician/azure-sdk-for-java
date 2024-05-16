// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mixedreality.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.mixedreality.MixedRealityManager;
import com.azure.resourcemanager.mixedreality.models.CheckNameAvailabilityRequest;
import com.azure.resourcemanager.mixedreality.models.CheckNameAvailabilityResponse;
import com.azure.resourcemanager.mixedreality.models.NameUnavailableReason;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ResourceProvidersCheckNameAvailabilityLocalWithResponseMockTests {
    @Test
    public void testCheckNameAvailabilityLocalWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr = "{\"nameAvailable\":false,\"reason\":\"Invalid\",\"message\":\"tfdygpfqb\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        MixedRealityManager manager =
            MixedRealityManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        CheckNameAvailabilityResponse response =
            manager
                .resourceProviders()
                .checkNameAvailabilityLocalWithResponse(
                    "qwwncw",
                    new CheckNameAvailabilityRequest().withName("zhxgktrmgucn").withType("pkteo"),
                    com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals(false, response.nameAvailable());
        Assertions.assertEquals(NameUnavailableReason.INVALID, response.reason());
        Assertions.assertEquals("tfdygpfqb", response.message());
    }
}
