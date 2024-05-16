// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.billing.BillingManager;
import com.azure.resourcemanager.billing.models.Agreement;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class AgreementsListByBillingAccountMockTests {
    @Test
    public void testListByBillingAccount() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"agreementLink\":\"gttmvmmagoaqyl\",\"category\":\"MicrosoftCustomerAgreement\",\"acceptanceMode\":\"ClickToAccept\",\"billingProfileInfo\":{\"billingProfileId\":\"azjcgmxitpfin\",\"billingProfileDisplayName\":\"pdltkrlg\",\"indirectRelationshipOrganizationName\":\"tbdrvcqgue\"},\"effectiveDate\":\"2021-05-18T02:25:41Z\",\"expirationDate\":\"2021-08-13T12:33:46Z\",\"participants\":[],\"status\":\"qdurelyujlfyoum\"},\"id\":\"ckyeclcdigpta\",\"name\":\"brzmqxucycijoclx\",\"type\":\"utgjcyz\"}]}";

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

        BillingManager manager =
            BillingManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Agreement> response =
            manager.agreements().listByBillingAccount("aderzmw", "t", com.azure.core.util.Context.NONE);
    }
}
