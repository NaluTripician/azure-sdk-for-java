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
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupResourceVaultConfigResource;
import com.azure.resourcemanager.recoveryservicesbackup.models.EnhancedSecurityState;
import com.azure.resourcemanager.recoveryservicesbackup.models.SoftDeleteFeatureState;
import com.azure.resourcemanager.recoveryservicesbackup.models.StorageType;
import com.azure.resourcemanager.recoveryservicesbackup.models.StorageTypeState;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class BackupResourceVaultConfigsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"properties\":{\"storageModelType\":\"ZoneRedundant\",\"storageType\":\"ZoneRedundant\",\"storageTypeState\":\"Locked\",\"enhancedSecurityState\":\"Enabled\",\"softDeleteFeatureState\":\"AlwaysON\",\"softDeleteRetentionPeriodInDays\":529739852,\"resourceGuardOperationRequests\":[\"spxlzde\"],\"isSoftDeleteFeatureStateEditable\":true},\"eTag\":\"ijwai\",\"location\":\"fanraybfu\",\"tags\":{\"h\":\"rojsydg\",\"ca\":\"dkygywezski\",\"ixqcahyhxalybxaw\":\"ygzmxieqvdsmak\"},\"id\":\"ijpodtblxpkkwj\",\"name\":\"jodqhykincn\",\"type\":\"emehllizh\"}";

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

        BackupResourceVaultConfigResource response = manager.backupResourceVaultConfigs()
            .getWithResponse("styoua", "bewreswmowegmmut", com.azure.core.util.Context.NONE).getValue();

        Assertions.assertEquals("fanraybfu", response.location());
        Assertions.assertEquals("rojsydg", response.tags().get("h"));
        Assertions.assertEquals(StorageType.ZONE_REDUNDANT, response.properties().storageModelType());
        Assertions.assertEquals(StorageType.ZONE_REDUNDANT, response.properties().storageType());
        Assertions.assertEquals(StorageTypeState.LOCKED, response.properties().storageTypeState());
        Assertions.assertEquals(EnhancedSecurityState.ENABLED, response.properties().enhancedSecurityState());
        Assertions.assertEquals(SoftDeleteFeatureState.ALWAYS_ON, response.properties().softDeleteFeatureState());
        Assertions.assertEquals(529739852, response.properties().softDeleteRetentionPeriodInDays());
        Assertions.assertEquals("spxlzde", response.properties().resourceGuardOperationRequests().get(0));
        Assertions.assertEquals(true, response.properties().isSoftDeleteFeatureStateEditable());
        Assertions.assertEquals("ijwai", response.etag());
    }
}
