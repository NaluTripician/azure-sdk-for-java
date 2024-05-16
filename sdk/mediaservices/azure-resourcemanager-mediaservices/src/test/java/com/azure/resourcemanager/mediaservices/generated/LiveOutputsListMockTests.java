// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.mediaservices.MediaServicesManager;
import com.azure.resourcemanager.mediaservices.models.LiveOutput;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class LiveOutputsListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"description\":\"ujr\",\"assetName\":\"lfojuidjp\",\"archiveWindowLength\":\"PT202H7M42S\",\"rewindWindowLength\":\"PT131H6M38S\",\"manifestName\":\"c\",\"hls\":{\"fragmentsPerTsSegment\":1596965336},\"outputSnapTime\":2515376851931822820,\"created\":\"2021-11-04T10:37:28Z\",\"lastModified\":\"2021-07-05T01:59:03Z\",\"provisioningState\":\"ejetjklntik\",\"resourceState\":\"Creating\"},\"id\":\"k\",\"name\":\"bqzolxr\",\"type\":\"vhqjwtrhtgvg\"}]}";

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

        MediaServicesManager manager =
            MediaServicesManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<LiveOutput> response =
            manager.liveOutputs().list("gbwidqlvh", "koveof", "zrvjfnmjmvlwyzgi", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("ujr", response.iterator().next().description());
        Assertions.assertEquals("lfojuidjp", response.iterator().next().assetName());
        Assertions.assertEquals(Duration.parse("PT202H7M42S"), response.iterator().next().archiveWindowLength());
        Assertions.assertEquals(Duration.parse("PT131H6M38S"), response.iterator().next().rewindWindowLength());
        Assertions.assertEquals("c", response.iterator().next().manifestName());
        Assertions.assertEquals(1596965336, response.iterator().next().hls().fragmentsPerTsSegment());
        Assertions.assertEquals(2515376851931822820L, response.iterator().next().outputSnapTime());
    }
}
