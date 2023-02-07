// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.reservations.ReservationsManager;
import com.azure.resourcemanager.reservations.models.ChangeDirectoryRequest;
import com.azure.resourcemanager.reservations.models.ChangeDirectoryResponse;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ReservationOrdersChangeDirectoryWithResponseMockTests {
    @Test
    public void testChangeDirectoryWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"reservationOrder\":{\"id\":\"ih\",\"name\":\"qg\",\"isSucceeded\":true,\"error\":\"fqntcyp\"},\"reservations\":[{\"id\":\"foimwkslircizjxv\",\"name\":\"fceacvlhvygd\",\"isSucceeded\":false,\"error\":\"mrtwna\"}]}";

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

        ReservationsManager manager =
            ReservationsManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        ChangeDirectoryResponse response =
            manager
                .reservationOrders()
                .changeDirectoryWithResponse(
                    "lw",
                    new ChangeDirectoryRequest().withDestinationTenantId("esutrgjupauutpw"),
                    com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("ih", response.reservationOrder().id());
        Assertions.assertEquals("qg", response.reservationOrder().name());
        Assertions.assertEquals(true, response.reservationOrder().isSucceeded());
        Assertions.assertEquals("fqntcyp", response.reservationOrder().error());
        Assertions.assertEquals("foimwkslircizjxv", response.reservations().get(0).id());
        Assertions.assertEquals("fceacvlhvygd", response.reservations().get(0).name());
        Assertions.assertEquals(false, response.reservations().get(0).isSucceeded());
        Assertions.assertEquals("mrtwna", response.reservations().get(0).error());
    }
}
