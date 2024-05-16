// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.logic.LogicManager;
import com.azure.resourcemanager.logic.models.IntegrationAccountMap;
import com.azure.resourcemanager.logic.models.IntegrationAccountMapPropertiesParametersSchema;
import com.azure.resourcemanager.logic.models.MapType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class IntegrationAccountMapsCreateOrUpdateWithResponseMockTests {
    @Test
    public void testCreateOrUpdateWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"mapType\":\"NotSpecified\",\"parametersSchema\":{\"ref\":\"vtojrulfuctejr\"},\"createdTime\":\"2021-12-07T06:33:03Z\",\"changedTime\":\"2021-09-10T11:37:03Z\",\"content\":\"hxlyubqjrostvrje\",\"contentType\":\"tzzbeq\",\"contentLink\":{\"uri\":\"rxalxrdha\",\"contentVersion\":\"rwrsnrhpqatiwk\",\"contentSize\":575751252969177352,\"metadata\":\"datakvvcsemsvuvdjkq\"},\"metadata\":\"datatqmm\"},\"location\":\"ivrjjxnwxdc\",\"tags\":{\"gfquwz\":\"jxlehzlx\"},\"id\":\"w\",\"name\":\"ibelwcerwkw\",\"type\":\"pjxljtxb\"}";

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

        LogicManager manager =
            LogicManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        IntegrationAccountMap response =
            manager
                .integrationAccountMaps()
                .define("hmbfntumeezbxv")
                .withRegion("lyotg")
                .withExistingIntegrationAccount("t", "htukfac")
                .withMapType(MapType.XSLT)
                .withTags(mapOf("qor", "xns", "eetqujxcxxq", "genmvceb", "ojmrvvxwjongzse", "dcqjkedwqurc"))
                .withParametersSchema(new IntegrationAccountMapPropertiesParametersSchema().withRef("uvwc"))
                .withContent("t")
                .withContentType("zwxuqgovsx")
                .withMetadata("datawazhpabaco")
                .create();

        Assertions.assertEquals("ivrjjxnwxdc", response.location());
        Assertions.assertEquals("jxlehzlx", response.tags().get("gfquwz"));
        Assertions.assertEquals(MapType.NOT_SPECIFIED, response.mapType());
        Assertions.assertEquals("vtojrulfuctejr", response.parametersSchema().ref());
        Assertions.assertEquals("hxlyubqjrostvrje", response.content());
        Assertions.assertEquals("tzzbeq", response.contentType());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
