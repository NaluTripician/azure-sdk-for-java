// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.mobilenetwork.MobileNetworkManager;
import com.azure.resourcemanager.mobilenetwork.models.AsyncOperationStatus;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class PacketCapturesStopMockTests {
    @Test
    public void testStop() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"id\":\"tixo\",\"name\":\"fqyinljqepqw\",\"status\":\"ixmonstshiyxg\",\"resourceId\":\"lfcldu\",\"startTime\":\"2021-03-30T02:54:32Z\",\"endTime\":\"2021-10-18T23:01:08Z\",\"percentComplete\":18.709508916398665,\"properties\":\"datawcobie\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito.when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito.when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito.when(httpClient.send(httpRequest.capture(), Mockito.any())).thenReturn(Mono.defer(() -> {
            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
            return Mono.just(httpResponse);
        }));

        MobileNetworkManager manager = MobileNetworkManager.configure().withHttpClient(httpClient).authenticate(
            tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
            new AzureProfile("", "", AzureEnvironment.AZURE));

        AsyncOperationStatus response = manager.packetCaptures().stop("gicgaaoepttaq", "tdewemxswvruu", "zzjgehkfki",
            com.azure.core.util.Context.NONE);

        Assertions.assertEquals("tixo", response.id());
        Assertions.assertEquals("fqyinljqepqw", response.name());
        Assertions.assertEquals("ixmonstshiyxg", response.status());
        Assertions.assertEquals("lfcldu", response.resourceId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-30T02:54:32Z"), response.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-18T23:01:08Z"), response.endTime());
        Assertions.assertEquals(18.709508916398665D, response.percentComplete());
    }
}
