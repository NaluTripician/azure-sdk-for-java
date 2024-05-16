// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.healthcareapis.HealthcareApisManager;
import com.azure.resourcemanager.healthcareapis.models.IotFhirDestination;
import com.azure.resourcemanager.healthcareapis.models.IotIdentityResolutionType;
import com.azure.resourcemanager.healthcareapis.models.IotMappingProperties;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class IotConnectorFhirDestinationsCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        String responseStr
            = "{\"properties\":{\"resourceIdentityResolutionType\":\"Lookup\",\"fhirServiceResourceId\":\"izxfpxt\",\"fhirMapping\":{\"content\":\"datascjavftju\"},\"provisioningState\":\"Succeeded\"},\"location\":\"k\",\"etag\":\"gg\",\"id\":\"wpijrajci\",\"name\":\"m\",\"type\":\"ghfcfiwrxgkneuvy\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        HealthcareApisManager manager = HealthcareApisManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        IotFhirDestination response = manager.iotConnectorFhirDestinations()
            .define("hwwn")
            .withExistingIotconnector("oaimlnw", "aaomylweazu", "cse")
            .withResourceIdentityResolutionType(IotIdentityResolutionType.LOOKUP)
            .withFhirServiceResourceId("hlf")
            .withFhirMapping(new IotMappingProperties().withContent("datawpchwahf"))
            .withRegion("fepgfew")
            .withEtag("wlyxgncxyk")
            .create();

        Assertions.assertEquals("gg", response.etag());
        Assertions.assertEquals("k", response.location());
        Assertions.assertEquals(IotIdentityResolutionType.LOOKUP, response.resourceIdentityResolutionType());
        Assertions.assertEquals("izxfpxt", response.fhirServiceResourceId());
    }
}
