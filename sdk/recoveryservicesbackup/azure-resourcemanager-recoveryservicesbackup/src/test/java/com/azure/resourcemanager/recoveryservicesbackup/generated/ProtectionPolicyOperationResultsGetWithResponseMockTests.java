// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionPolicyResource;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ProtectionPolicyOperationResultsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"properties\":{\"backupManagementType\":\"ProtectionPolicy\",\"protectedItemsCount\":1320591219,\"resourceGuardOperationRequests\":[\"eboywhczzqrhm\",\"gqbedygi\",\"rzwnyk\"]},\"eTag\":\"djchlr\",\"location\":\"pwctofl\",\"tags\":{\"g\":\"acdhztxkbr\",\"fj\":\"rwjiyew\"},\"id\":\"rwq\",\"name\":\"xet\",\"type\":\"gcwvrrmdqntycna\"}";

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

        RecoveryServicesBackupManager manager = RecoveryServicesBackupManager.configure().withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        ProtectionPolicyResource response = manager.protectionPolicyOperationResults()
            .getWithResponse("fftedousnktj", "gravaqogfkbebauz", "qbtxxwpf", "njzudr", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("pwctofl", response.location());
        Assertions.assertEquals("acdhztxkbr", response.tags().get("g"));
        Assertions.assertEquals(1320591219, response.properties().protectedItemsCount());
        Assertions.assertEquals("eboywhczzqrhm", response.properties().resourceGuardOperationRequests().get(0));
        Assertions.assertEquals("djchlr", response.etag());
    }
}
