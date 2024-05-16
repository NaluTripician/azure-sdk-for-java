// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.hybridnetwork.HybridNetworkManager;
import com.azure.resourcemanager.hybridnetwork.models.Site;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class SitesListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"value\":[{\"properties\":{\"provisioningState\":\"Accepted\",\"nfvis\":[{\"nfviType\":\"NfvIs\",\"name\":\"gygvfltgvdiho\"},{\"nfviType\":\"NfvIs\",\"name\":\"krxwet\"},{\"nfviType\":\"NfvIs\",\"name\":\"drcyrucpcun\"},{\"nfviType\":\"NfvIs\",\"name\":\"zdqumoe\"}],\"siteNetworkServiceReferences\":[{\"id\":\"aienhqhsknd\"},{\"id\":\"lqkaadlknwf\"},{\"id\":\"nniyopetxi\"},{\"id\":\"nrlyxnuc\"}]},\"location\":\"p\",\"tags\":{\"bqsdtcjbctvi\":\"kwqpat\"},\"id\":\"uzqymtuowog\",\"name\":\"gitsqh\",\"type\":\"vbrzcdb\"}]}";

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

        HybridNetworkManager manager = HybridNetworkManager.configure().withHttpClient(httpClient).authenticate(
            tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
            new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Site> response = manager.sites().listByResourceGroup("l", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("p", response.iterator().next().location());
        Assertions.assertEquals("kwqpat", response.iterator().next().tags().get("bqsdtcjbctvi"));
        Assertions.assertEquals("gygvfltgvdiho", response.iterator().next().properties().nfvis().get(0).name());
    }
}
