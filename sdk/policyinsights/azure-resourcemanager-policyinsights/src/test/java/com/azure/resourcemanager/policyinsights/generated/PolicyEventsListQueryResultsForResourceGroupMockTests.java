// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Context;
import com.azure.resourcemanager.policyinsights.PolicyInsightsManager;
import com.azure.resourcemanager.policyinsights.models.PolicyEvent;
import com.azure.resourcemanager.policyinsights.models.PolicyEventsResourceType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class PolicyEventsListQueryResultsForResourceGroupMockTests {
    @Test
    public void testListQueryResultsForResourceGroup() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"@odata.id\":\"ajlyjtlvofqzhv\",\"@odata.context\":\"ibyfmo\",\"timestamp\":\"2021-08-08T19:27:36Z\",\"resourceId\":\"kjpvdwxf\",\"policyAssignmentId\":\"iivwzjbhyzsxjrka\",\"policyDefinitionId\":\"trnegvmnvuqeqvld\",\"effectiveParameters\":\"astjbkkdmflvestm\",\"isCompliant\":true,\"subscriptionId\":\"ril\",\"resourceType\":\"apeewchpxlkt\",\"resourceLocation\":\"uziycsl\",\"resourceGroup\":\"ufuztcktyhjtq\",\"resourceTags\":\"cgzulwmmrqzzr\",\"policyAssignmentName\":\"vpglydz\",\"policyAssignmentOwner\":\"rvqeevtoepryutn\",\"policyAssignmentParameters\":\"tpzdmovzvfvaawzq\",\"policyAssignmentScope\":\"f\",\"policyDefinitionName\":\"z\",\"policyDefinitionAction\":\"iglaecx\",\"policyDefinitionCategory\":\"t\",\"policySetDefinitionId\":\"okpvzm\",\"policySetDefinitionName\":\"t\",\"policySetDefinitionOwner\":\"dgxobfircl\",\"policySetDefinitionCategory\":\"kciayzri\",\"policySetDefinitionParameters\":\"hya\",\"managementGroupIds\":\"vjlboxqvk\",\"policyDefinitionReferenceId\":\"mxho\",\"complianceState\":\"ynhdwdigum\",\"tenantId\":\"raauzzpt\",\"principalOid\":\"zysdzh\",\"components\":[{\"id\":\"vaiqyuvvf\",\"type\":\"kphhq\",\"name\":\"kvylauyavl\",\"timestamp\":\"2021-04-17T07:31:38Z\",\"tenantId\":\"csttijfybvpoekr\",\"principalOid\":\"sgbdhuz\",\"policyDefinitionAction\":\"njdgkynscliq\",\"\":{}},{\"id\":\"xnkomtkubo\",\"type\":\"pnvdxz\",\"name\":\"ihfrbbcevqa\",\"timestamp\":\"2021-01-25T14:16:29Z\",\"tenantId\":\"dhlfkqojpykvgt\",\"principalOid\":\"cnifm\",\"policyDefinitionAction\":\"sdymbrn\",\"\":{}},{\"id\":\"m\",\"type\":\"a\",\"name\":\"g\",\"timestamp\":\"2021-03-01T05:25:04Z\",\"tenantId\":\"cxvdfffwafqrouda\",\"principalOid\":\"avehhrvkbunzo\",\"policyDefinitionAction\":\"dhcxgkmoy\",\"\":{}},{\"id\":\"uibhmfdnbzydvfv\",\"type\":\"jnaeois\",\"name\":\"hmgorffukiscv\",\"timestamp\":\"2021-11-03T20:02:22Z\",\"tenantId\":\"wplefaxvxil\",\"principalOid\":\"tg\",\"policyDefinitionAction\":\"nzeyqxtjj\",\"\":{}}],\"\":{}}]}";

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

        PolicyInsightsManager manager =
            PolicyInsightsManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<PolicyEvent> response =
            manager
                .policyEvents()
                .listQueryResultsForResourceGroup(
                    PolicyEventsResourceType.DEFAULT,
                    "mdjvlpj",
                    "xkzb",
                    979350903,
                    "sgeivsiy",
                    "zkdnc",
                    OffsetDateTime.parse("2021-11-26T19:10:35Z"),
                    OffsetDateTime.parse("2021-11-18T13:01:59Z"),
                    "onbzoggculapzwy",
                    "pgogtqxepny",
                    "b",
                    Context.NONE);

        Assertions.assertEquals(OffsetDateTime.parse("2021-08-08T19:27:36Z"), response.iterator().next().timestamp());
        Assertions.assertEquals("kjpvdwxf", response.iterator().next().resourceId());
        Assertions.assertEquals("iivwzjbhyzsxjrka", response.iterator().next().policyAssignmentId());
        Assertions.assertEquals("trnegvmnvuqeqvld", response.iterator().next().policyDefinitionId());
        Assertions.assertEquals("astjbkkdmflvestm", response.iterator().next().effectiveParameters());
        Assertions.assertEquals(true, response.iterator().next().isCompliant());
        Assertions.assertEquals("ril", response.iterator().next().subscriptionId());
        Assertions.assertEquals("apeewchpxlkt", response.iterator().next().resourceType());
        Assertions.assertEquals("uziycsl", response.iterator().next().resourceLocation());
        Assertions.assertEquals("ufuztcktyhjtq", response.iterator().next().resourceGroup());
        Assertions.assertEquals("cgzulwmmrqzzr", response.iterator().next().resourceTags());
        Assertions.assertEquals("vpglydz", response.iterator().next().policyAssignmentName());
        Assertions.assertEquals("rvqeevtoepryutn", response.iterator().next().policyAssignmentOwner());
        Assertions.assertEquals("tpzdmovzvfvaawzq", response.iterator().next().policyAssignmentParameters());
        Assertions.assertEquals("f", response.iterator().next().policyAssignmentScope());
        Assertions.assertEquals("z", response.iterator().next().policyDefinitionName());
        Assertions.assertEquals("iglaecx", response.iterator().next().policyDefinitionAction());
        Assertions.assertEquals("t", response.iterator().next().policyDefinitionCategory());
        Assertions.assertEquals("okpvzm", response.iterator().next().policySetDefinitionId());
        Assertions.assertEquals("t", response.iterator().next().policySetDefinitionName());
        Assertions.assertEquals("dgxobfircl", response.iterator().next().policySetDefinitionOwner());
        Assertions.assertEquals("kciayzri", response.iterator().next().policySetDefinitionCategory());
        Assertions.assertEquals("hya", response.iterator().next().policySetDefinitionParameters());
        Assertions.assertEquals("vjlboxqvk", response.iterator().next().managementGroupIds());
        Assertions.assertEquals("mxho", response.iterator().next().policyDefinitionReferenceId());
        Assertions.assertEquals("ynhdwdigum", response.iterator().next().complianceState());
        Assertions.assertEquals("raauzzpt", response.iterator().next().tenantId());
        Assertions.assertEquals("zysdzh", response.iterator().next().principalOid());
        Assertions.assertEquals("vaiqyuvvf", response.iterator().next().components().get(0).id());
        Assertions.assertEquals("kphhq", response.iterator().next().components().get(0).type());
        Assertions.assertEquals("kvylauyavl", response.iterator().next().components().get(0).name());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-04-17T07:31:38Z"),
                response.iterator().next().components().get(0).timestamp());
        Assertions.assertEquals("csttijfybvpoekr", response.iterator().next().components().get(0).tenantId());
        Assertions.assertEquals("sgbdhuz", response.iterator().next().components().get(0).principalOid());
        Assertions
            .assertEquals("njdgkynscliq", response.iterator().next().components().get(0).policyDefinitionAction());
    }
}
