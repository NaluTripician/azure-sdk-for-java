// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.appcontainers.ContainerAppsApiManager;
import com.azure.resourcemanager.appcontainers.models.Diagnostics;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class JobsGetDetectorWithResponseMockTests {
    @Test
    public void testGetDetectorWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"properties\":{\"metadata\":{\"id\":\"hbuubpy\",\"name\":\"wtjoxz\",\"description\":\"wfqchvcz\",\"author\":\"j\",\"category\":\"cta\",\"supportTopicList\":[{\"id\":\"rtpqpemhz\",\"pesId\":\"krepdqhqyhwqwem\"},{\"id\":\"qabckmzeoxin\",\"pesId\":\"re\"}],\"analysisTypes\":[\"whlpuzjpceezn\",\"angp\",\"bfaxyxzlbc\"],\"type\":\"hm\",\"score\":3.0061007},\"dataset\":[{\"table\":{\"tableName\":\"ndktxfv\",\"columns\":[{},{},{},{}],\"rows\":[\"dataqgpkrie\"]},\"renderingProperties\":{\"type\":1132775916,\"title\":\"xx\",\"description\":\"wzkyf\",\"isVisible\":true}},{\"table\":{\"tableName\":\"wxeiicrmpepk\",\"columns\":[{},{},{},{}],\"rows\":[\"dataxijvskwsdgkjgyac\"]},\"renderingProperties\":{\"type\":1775384365,\"title\":\"kwefc\",\"description\":\"inwoqartwyxq\",\"isVisible\":false}},{\"table\":{\"tableName\":\"vatdavuqmcbymsf\",\"columns\":[{},{}],\"rows\":[\"datauvjezcjumvps\",\"datamioyo\"]},\"renderingProperties\":{\"type\":671724843,\"title\":\"iqwnnraclibbfq\",\"description\":\"pkl\",\"isVisible\":false}},{\"table\":{\"tableName\":\"nhautwukexzgpmnm\",\"columns\":[{},{},{},{}],\"rows\":[\"dataqilwgdfpfqfpcvs\",\"dataclg\",\"datarvwerfwxbsmtb\"]},\"renderingProperties\":{\"type\":273842551,\"title\":\"hci\",\"description\":\"wdv\",\"isVisible\":true}}],\"status\":{\"message\":\"kqhs\",\"statusId\":811287506},\"dataProviderMetadata\":{\"providerName\":\"wpq\",\"propertyBag\":[{\"name\":\"uwyqwdq\",\"value\":\"mghg\"},{\"name\":\"z\",\"value\":\"lujkhn\"},{\"name\":\"mrnkfmkhcqtwml\",\"value\":\"jnqtqe\"},{\"name\":\"j\",\"value\":\"vragpokddx\"}]}},\"id\":\"hhkvguavtptbk\",\"name\":\"wkqyns\",\"type\":\"gbvoffbkk\"}";

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

        ContainerAppsApiManager manager = ContainerAppsApiManager.configure().withHttpClient(httpClient).authenticate(
            tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
            new AzureProfile("", "", AzureEnvironment.AZURE));

        Diagnostics response = manager.jobs()
            .getDetectorWithResponse("qayfl", "iyu", "snuudtelvhyibdr", com.azure.core.util.Context.NONE).getValue();

        Assertions.assertEquals("whlpuzjpceezn", response.properties().metadata().analysisTypes().get(0));
        Assertions.assertEquals("ndktxfv", response.properties().dataset().get(0).table().tableName());
        Assertions.assertEquals(1132775916, response.properties().dataset().get(0).renderingProperties().type());
        Assertions.assertEquals("xx", response.properties().dataset().get(0).renderingProperties().title());
        Assertions.assertEquals("wzkyf", response.properties().dataset().get(0).renderingProperties().description());
        Assertions.assertEquals(true, response.properties().dataset().get(0).renderingProperties().isVisible());
        Assertions.assertEquals("kqhs", response.properties().status().message());
        Assertions.assertEquals(811287506, response.properties().status().statusId());
        Assertions.assertEquals("wpq", response.properties().dataProviderMetadata().providerName());
        Assertions.assertEquals("uwyqwdq", response.properties().dataProviderMetadata().propertyBag().get(0).name());
        Assertions.assertEquals("mghg", response.properties().dataProviderMetadata().propertyBag().get(0).value());
    }
}
