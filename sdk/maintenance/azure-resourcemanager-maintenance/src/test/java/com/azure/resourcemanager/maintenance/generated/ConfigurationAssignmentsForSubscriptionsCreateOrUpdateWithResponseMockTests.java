// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.maintenance.MaintenanceManager;
import com.azure.resourcemanager.maintenance.models.ConfigurationAssignment;
import com.azure.resourcemanager.maintenance.models.ConfigurationAssignmentFilterProperties;
import com.azure.resourcemanager.maintenance.models.TagOperators;
import com.azure.resourcemanager.maintenance.models.TagSettingsProperties;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ConfigurationAssignmentsForSubscriptionsCreateOrUpdateWithResponseMockTests {
    @Test
    public void testCreateOrUpdateWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"location\":\"eg\",\"properties\":{\"maintenanceConfigurationId\":\"lzxwhcansy\",\"resourceId\":\"yqhlwigdivbkbx\",\"filter\":{\"resourceTypes\":[\"ajuwas\",\"vdaeyyguxakjsq\"],\"resourceGroups\":[\"bezkgimsidxasic\",\"dyvvjskgfmocwahp\",\"gat\",\"eaahhvjhhn\"],\"osTypes\":[\"ybbjjidjksyx\",\"yxvxevblbjed\"],\"locations\":[\"lageuaulxun\",\"mjbnk\"],\"tagSettings\":{\"tags\":{\"iymerteeammxqi\":[\"enlsvxeizzgwkln\",\"rmffeyc\",\"ckt\"],\"a\":[\"kkzddrtkgdojbmx\"],\"xtxsuwprtujw\":[\"efdeesve\",\"uij\"]},\"filterOperator\":\"All\"}}},\"id\":\"djibabxvitit\",\"name\":\"tzeexav\",\"type\":\"xtfglecdmdqb\"}";

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

        MaintenanceManager manager =
            MaintenanceManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        ConfigurationAssignment response =
            manager
                .configurationAssignmentsForSubscriptions()
                .define("nzqodfvpg")
                .withRegion("oxgsgbpfgzdjtx")
                .withMaintenanceConfigurationId("lbqvgaqvlgafcqu")
                .withResourceId("dvetnws")
                .withFilter(
                    new ConfigurationAssignmentFilterProperties()
                        .withResourceTypes(Arrays.asList("nwlduycvuzhyrmew", "pmvekdxukuqg", "jjxundxgke"))
                        .withResourceGroups(Arrays.asList("hhzjhfj", "hvvmuvgpmun", "qsxvmhf", "uzjyihsasbhudypo"))
                        .withOsTypes(Arrays.asList("emslynsqyrp", "oobrlttyms"))
                        .withLocations(Arrays.asList("gqdnfwqzd", "gtilax", "nfhqlyvijouwivk"))
                        .withTagSettings(
                            new TagSettingsProperties()
                                .withTags(
                                    mapOf(
                                        "vcpwpgclrc",
                                        Arrays.asList("nbixxrti"),
                                        "pdnqqskawaoqvmmb",
                                        Arrays.asList("tso", "frkenxpmyyefrp")))
                                .withFilterOperator(TagOperators.ALL)))
                .create();

        Assertions.assertEquals("eg", response.location());
        Assertions.assertEquals("lzxwhcansy", response.maintenanceConfigurationId());
        Assertions.assertEquals("yqhlwigdivbkbx", response.resourceId());
        Assertions.assertEquals("ajuwas", response.filter().resourceTypes().get(0));
        Assertions.assertEquals("bezkgimsidxasic", response.filter().resourceGroups().get(0));
        Assertions.assertEquals("ybbjjidjksyx", response.filter().osTypes().get(0));
        Assertions.assertEquals("lageuaulxun", response.filter().locations().get(0));
        Assertions.assertEquals("enlsvxeizzgwkln", response.filter().tagSettings().tags().get("iymerteeammxqi").get(0));
        Assertions.assertEquals(TagOperators.ALL, response.filter().tagSettings().filterOperator());
    }

    // Use "Map.of" if available
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
