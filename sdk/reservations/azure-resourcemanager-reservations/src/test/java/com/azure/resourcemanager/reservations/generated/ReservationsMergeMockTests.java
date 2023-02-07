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
import com.azure.resourcemanager.reservations.models.AppliedScopeType;
import com.azure.resourcemanager.reservations.models.InstanceFlexibility;
import com.azure.resourcemanager.reservations.models.Kind;
import com.azure.resourcemanager.reservations.models.MergeRequest;
import com.azure.resourcemanager.reservations.models.ProvisioningState;
import com.azure.resourcemanager.reservations.models.ReservationBillingPlan;
import com.azure.resourcemanager.reservations.models.ReservationResponse;
import com.azure.resourcemanager.reservations.models.ReservationTerm;
import com.azure.resourcemanager.reservations.models.ReservedResourceType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ReservationsMergeMockTests {
    @Test
    public void testMerge() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "[{\"location\":\"gfpelolppvksrpqv\",\"etag\":2128211402,\"sku\":{\"name\":\"ehtwdwrft\"},\"properties\":{\"reservedResourceType\":\"Databricks\",\"instanceFlexibility\":\"Off\",\"displayName\":\"dl\",\"appliedScopes\":[\"hfwpracstwit\",\"khevxccedc\",\"nmdyodnwzxl\",\"jc\"],\"appliedScopeType\":\"ManagementGroup\",\"archived\":true,\"capabilities\":\"ugcxnavvwxq\",\"quantity\":165046754,\"provisioningState\":\"PendingBilling\",\"effectiveDateTime\":\"2021-05-22T21:00:43Z\",\"benefitStartTime\":\"2021-09-23T12:45:02Z\",\"lastUpdatedDateTime\":\"2021-06-28T16:16:43Z\",\"expiryDateTime\":\"2021-08-23T07:03:36Z\",\"reviewDateTime\":\"2021-02-11T03:05:15Z\",\"skuDescription\":\"vfgbvfvpdboda\",\"billingPlan\":\"Upfront\",\"displayProvisioningState\":\"q\",\"provisioningSubState\":\"krribdeibqi\",\"purchaseDateTime\":\"2021-05-03T06:31:18Z\",\"billingScopeId\":\"zwmk\",\"renew\":true,\"renewSource\":\"jpjorwkqnyhgb\",\"renewDestination\":\"tjivfxzsjabib\",\"term\":\"P5Y\",\"userFriendlyAppliedScopeType\":\"wfsdjpvkvpbj\",\"userFriendlyRenewState\":\"kzbzkdvncjabudu\"},\"kind\":\"Microsoft.Compute\",\"id\":\"mokzhjjklf\",\"name\":\"hmouwqlgzrfze\",\"type\":\"yebizikayuh\"}]";

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

        List<ReservationResponse> response =
            manager
                .reservations()
                .merge(
                    "zrncsdt",
                    new MergeRequest().withSources(Arrays.asList("iypbsfgytgusl", "eadcygqukyhejhz")),
                    com.azure.core.util.Context.NONE);

        Assertions.assertEquals("gfpelolppvksrpqv", response.get(0).location());
        Assertions.assertEquals(2128211402, response.get(0).etag());
        Assertions.assertEquals("ehtwdwrft", response.get(0).sku().name());
        Assertions.assertEquals(ReservedResourceType.DATABRICKS, response.get(0).properties().reservedResourceType());
        Assertions.assertEquals(InstanceFlexibility.OFF, response.get(0).properties().instanceFlexibility());
        Assertions.assertEquals("dl", response.get(0).properties().displayName());
        Assertions.assertEquals("hfwpracstwit", response.get(0).properties().appliedScopes().get(0));
        Assertions.assertEquals(AppliedScopeType.MANAGEMENT_GROUP, response.get(0).properties().appliedScopeType());
        Assertions.assertEquals(true, response.get(0).properties().archived());
        Assertions.assertEquals("ugcxnavvwxq", response.get(0).properties().capabilities());
        Assertions.assertEquals(165046754, response.get(0).properties().quantity());
        Assertions.assertEquals(ProvisioningState.PENDING_BILLING, response.get(0).properties().provisioningState());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-05-22T21:00:43Z"), response.get(0).properties().effectiveDateTime());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-09-23T12:45:02Z"), response.get(0).properties().benefitStartTime());
        Assertions
            .assertEquals(OffsetDateTime.parse("2021-08-23T07:03:36Z"), response.get(0).properties().expiryDateTime());
        Assertions
            .assertEquals(OffsetDateTime.parse("2021-02-11T03:05:15Z"), response.get(0).properties().reviewDateTime());
        Assertions.assertEquals("vfgbvfvpdboda", response.get(0).properties().skuDescription());
        Assertions.assertEquals(ReservationBillingPlan.UPFRONT, response.get(0).properties().billingPlan());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-05-03T06:31:18Z"), response.get(0).properties().purchaseDateTime());
        Assertions.assertEquals("zwmk", response.get(0).properties().billingScopeId());
        Assertions.assertEquals(true, response.get(0).properties().renew());
        Assertions.assertEquals("jpjorwkqnyhgb", response.get(0).properties().renewSource());
        Assertions.assertEquals("tjivfxzsjabib", response.get(0).properties().renewDestination());
        Assertions.assertEquals(ReservationTerm.P5Y, response.get(0).properties().term());
        Assertions.assertEquals(Kind.MICROSOFT_COMPUTE, response.get(0).kind());
    }
}
