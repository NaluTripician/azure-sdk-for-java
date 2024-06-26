// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.quota.QuotaManager;
import com.azure.resourcemanager.quota.models.GroupQuotaSubscriptionId;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class GroupQuotaSubscriptionsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"subscriptionId\":\"izpost\",\"provisioningState\":\"Failed\"},\"id\":\"fbunrmfqjhhk\",\"name\":\"bpvjymjhx\",\"type\":\"j\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        QuotaManager manager = QuotaManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        GroupQuotaSubscriptionId response = manager.groupQuotaSubscriptions()
            .getWithResponse("z", "ahzxctobgbk", com.azure.core.util.Context.NONE)
            .getValue();

    }
}
