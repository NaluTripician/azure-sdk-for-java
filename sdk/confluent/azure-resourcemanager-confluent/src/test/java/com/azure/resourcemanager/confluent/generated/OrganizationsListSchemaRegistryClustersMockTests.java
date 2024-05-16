// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confluent.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.confluent.ConfluentManager;
import com.azure.resourcemanager.confluent.models.SchemaRegistryClusterRecord;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class OrganizationsListSchemaRegistryClustersMockTests {
    @Test
    public void testListSchemaRegistryClusters() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"value\":[{\"kind\":\"fdn\",\"id\":\"ydvfvfcjnae\",\"properties\":{\"metadata\":{\"self\":\"vhmgorffukis\",\"resourceName\":\"w\",\"createdTimestamp\":\"hwplefaxvx\",\"updatedTimestamp\":\"cbtgnhnz\",\"deletedTimestamp\":\"qxtjjfzqlqhyca\"},\"spec\":{\"name\":\"ggxdb\",\"httpEndpoint\":\"smieknlra\",\"package\":\"aawiuagydwqfb\",\"region\":{\"id\":\"rfgi\",\"related\":\"tcojocqwo\",\"resourceName\":\"nzjvusfzldm\"},\"environment\":{\"id\":\"xylfsb\",\"related\":\"adpysownbt\",\"resourceName\":\"bugrj\"},\"cloud\":\"to\"},\"status\":{\"phase\":\"isofieypefojyqd\"}}}]}";

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

        ConfluentManager manager = ConfluentManager.configure().withHttpClient(httpClient).authenticate(
            tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
            new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<SchemaRegistryClusterRecord> response = manager.organizations().listSchemaRegistryClusters(
            "pavehhr", "kbunzoz", "dhcxgkmoy", 1670062911, "dyuib", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("fdn", response.iterator().next().kind());
        Assertions.assertEquals("ydvfvfcjnae", response.iterator().next().id());
        Assertions.assertEquals("vhmgorffukis", response.iterator().next().metadata().self());
        Assertions.assertEquals("w", response.iterator().next().metadata().resourceName());
        Assertions.assertEquals("hwplefaxvx", response.iterator().next().metadata().createdTimestamp());
        Assertions.assertEquals("cbtgnhnz", response.iterator().next().metadata().updatedTimestamp());
        Assertions.assertEquals("qxtjjfzqlqhyca", response.iterator().next().metadata().deletedTimestamp());
        Assertions.assertEquals("ggxdb", response.iterator().next().spec().name());
        Assertions.assertEquals("smieknlra", response.iterator().next().spec().httpEndpoint());
        Assertions.assertEquals("aawiuagydwqfb", response.iterator().next().spec().packageProperty());
        Assertions.assertEquals("rfgi", response.iterator().next().spec().region().id());
        Assertions.assertEquals("tcojocqwo", response.iterator().next().spec().region().related());
        Assertions.assertEquals("nzjvusfzldm", response.iterator().next().spec().region().resourceName());
        Assertions.assertEquals("xylfsb", response.iterator().next().spec().environment().id());
        Assertions.assertEquals("adpysownbt", response.iterator().next().spec().environment().related());
        Assertions.assertEquals("bugrj", response.iterator().next().spec().environment().resourceName());
        Assertions.assertEquals("to", response.iterator().next().spec().cloud());
        Assertions.assertEquals("isofieypefojyqd", response.iterator().next().status().phase());
    }
}
