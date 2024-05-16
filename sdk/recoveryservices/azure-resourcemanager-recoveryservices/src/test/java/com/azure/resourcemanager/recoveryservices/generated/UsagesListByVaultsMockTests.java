// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.recoveryservices.RecoveryServicesManager;
import com.azure.resourcemanager.recoveryservices.models.UsagesUnit;
import com.azure.resourcemanager.recoveryservices.models.VaultUsage;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class UsagesListByVaultsMockTests {
    @Test
    public void testListByVaults() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"unit\":\"CountPerSecond\",\"quotaPeriod\":\"wj\",\"nextResetTime\":\"2021-06-03T21:25:15Z\",\"currentValue\":3850222588525127321,\"limit\":8142571261357347670,\"name\":{\"value\":\"kdlfoa\",\"localizedValue\":\"gkfpaga\"}}]}";

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

        RecoveryServicesManager manager =
            RecoveryServicesManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<VaultUsage> response =
            manager.usages().listByVaults("bw", "ujhemmsbvdkcrodt", com.azure.core.util.Context.NONE);

        Assertions.assertEquals(UsagesUnit.COUNT_PER_SECOND, response.iterator().next().unit());
        Assertions.assertEquals("wj", response.iterator().next().quotaPeriod());
        Assertions
            .assertEquals(OffsetDateTime.parse("2021-06-03T21:25:15Z"), response.iterator().next().nextResetTime());
        Assertions.assertEquals(3850222588525127321L, response.iterator().next().currentValue());
        Assertions.assertEquals(8142571261357347670L, response.iterator().next().limit());
        Assertions.assertEquals("kdlfoa", response.iterator().next().name().value());
        Assertions.assertEquals("gkfpaga", response.iterator().next().name().localizedValue());
    }
}
