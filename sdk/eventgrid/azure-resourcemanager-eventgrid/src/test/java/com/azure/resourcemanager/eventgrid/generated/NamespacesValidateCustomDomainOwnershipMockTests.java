// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.eventgrid.EventGridManager;
import com.azure.resourcemanager.eventgrid.models.CustomDomainIdentityType;
import com.azure.resourcemanager.eventgrid.models.CustomDomainOwnershipValidationResult;
import com.azure.resourcemanager.eventgrid.models.CustomDomainValidationState;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class NamespacesValidateCustomDomainOwnershipMockTests {
    @Test
    public void testValidateCustomDomainOwnership() throws Exception {
        String responseStr
            = "{\"customDomainsForTopicsConfiguration\":[{\"fullyQualifiedDomainName\":\"aqotnndxolousdv\",\"validationState\":\"Pending\",\"identity\":{\"type\":\"SystemAssigned\",\"userAssignedIdentity\":\"wz\"},\"certificateUrl\":\"rp\",\"expectedTxtRecordName\":\"fu\",\"expectedTxtRecordValue\":\"yctsdbtqgkuj\"},{\"fullyQualifiedDomainName\":\"sooxrqw\",\"validationState\":\"ErrorRetrievingDnsRecord\",\"identity\":{\"type\":\"SystemAssigned\",\"userAssignedIdentity\":\"gapdyarikeej\"},\"certificateUrl\":\"dfhtwmmkfqbriqul\",\"expectedTxtRecordName\":\"trj\",\"expectedTxtRecordValue\":\"qkvyhzokpoyuohu\"}],\"customDomainsForTopicSpacesConfiguration\":[{\"fullyQualifiedDomainName\":\"na\",\"validationState\":\"ErrorRetrievingDnsRecord\",\"identity\":{\"type\":\"UserAssigned\",\"userAssignedIdentity\":\"ejnglpwsadaxjsum\"},\"certificateUrl\":\"ezcoioyj\",\"expectedTxtRecordName\":\"fqzwqdnxkeed\",\"expectedTxtRecordValue\":\"wmywxfqzkvemy\"},{\"fullyQualifiedDomainName\":\"dpczaqpqifd\",\"validationState\":\"Pending\",\"identity\":{\"type\":\"UserAssigned\",\"userAssignedIdentity\":\"xzuisamona\"},\"certificateUrl\":\"izexroqsqj\",\"expectedTxtRecordName\":\"rmthsplwst\",\"expectedTxtRecordValue\":\"srgxfq\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        EventGridManager manager = EventGridManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        CustomDomainOwnershipValidationResult response = manager.namespaces()
            .validateCustomDomainOwnership("znsvlrd", "movpimyndnoxax", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("aqotnndxolousdv",
            response.customDomainsForTopicsConfiguration().get(0).fullyQualifiedDomainName());
        Assertions.assertEquals(CustomDomainValidationState.PENDING,
            response.customDomainsForTopicsConfiguration().get(0).validationState());
        Assertions.assertEquals(CustomDomainIdentityType.SYSTEM_ASSIGNED,
            response.customDomainsForTopicsConfiguration().get(0).identity().type());
        Assertions.assertEquals("wz",
            response.customDomainsForTopicsConfiguration().get(0).identity().userAssignedIdentity());
        Assertions.assertEquals("rp", response.customDomainsForTopicsConfiguration().get(0).certificateUrl());
        Assertions.assertEquals("fu", response.customDomainsForTopicsConfiguration().get(0).expectedTxtRecordName());
        Assertions.assertEquals("yctsdbtqgkuj",
            response.customDomainsForTopicsConfiguration().get(0).expectedTxtRecordValue());
        Assertions.assertEquals("na",
            response.customDomainsForTopicSpacesConfiguration().get(0).fullyQualifiedDomainName());
        Assertions.assertEquals(CustomDomainValidationState.ERROR_RETRIEVING_DNS_RECORD,
            response.customDomainsForTopicSpacesConfiguration().get(0).validationState());
        Assertions.assertEquals(CustomDomainIdentityType.USER_ASSIGNED,
            response.customDomainsForTopicSpacesConfiguration().get(0).identity().type());
        Assertions.assertEquals("ejnglpwsadaxjsum",
            response.customDomainsForTopicSpacesConfiguration().get(0).identity().userAssignedIdentity());
        Assertions.assertEquals("ezcoioyj",
            response.customDomainsForTopicSpacesConfiguration().get(0).certificateUrl());
        Assertions.assertEquals("fqzwqdnxkeed",
            response.customDomainsForTopicSpacesConfiguration().get(0).expectedTxtRecordName());
        Assertions.assertEquals("wmywxfqzkvemy",
            response.customDomainsForTopicSpacesConfiguration().get(0).expectedTxtRecordValue());
    }
}
