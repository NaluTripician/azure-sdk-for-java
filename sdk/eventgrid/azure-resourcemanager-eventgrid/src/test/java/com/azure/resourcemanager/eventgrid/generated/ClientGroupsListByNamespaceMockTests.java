// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.eventgrid.EventGridManager;
import com.azure.resourcemanager.eventgrid.models.ClientGroup;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ClientGroupsListByNamespaceMockTests {
    @Test
    public void testListByNamespace() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"description\":\"vpaklozkxbz\",\"query\":\"ejpl\",\"provisioningState\":\"Canceled\"},\"id\":\"bttt\",\"name\":\"gs\",\"type\":\"xunrswgkpjhboy\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        EventGridManager manager = EventGridManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<ClientGroup> response = manager.clientGroups()
            .listByNamespace("etjdvqydieqqkwa", "uwdxvqzxoebwgj", "bibanbau", 319172782,
                com.azure.core.util.Context.NONE);

        Assertions.assertEquals("vpaklozkxbz", response.iterator().next().description());
        Assertions.assertEquals("ejpl", response.iterator().next().query());
    }
}
