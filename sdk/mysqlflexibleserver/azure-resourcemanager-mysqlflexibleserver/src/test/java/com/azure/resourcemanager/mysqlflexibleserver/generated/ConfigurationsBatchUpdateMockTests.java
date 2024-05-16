// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.mysqlflexibleserver.MySqlManager;
import com.azure.resourcemanager.mysqlflexibleserver.models.ConfigurationForBatchUpdate;
import com.azure.resourcemanager.mysqlflexibleserver.models.ConfigurationListForBatchUpdate;
import com.azure.resourcemanager.mysqlflexibleserver.models.ConfigurationListResult;
import com.azure.resourcemanager.mysqlflexibleserver.models.ConfigurationSource;
import com.azure.resourcemanager.mysqlflexibleserver.models.ResetAllToDefault;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ConfigurationsBatchUpdateMockTests {
    @Test
    public void testBatchUpdate() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"value\":\"vofqzhvfc\",\"currentValue\":\"yfm\",\"description\":\"uxrkjp\",\"documentationLink\":\"w\",\"defaultValue\":\"zwiivwzjbhyzs\",\"dataType\":\"rkambt\",\"allowedValues\":\"egv\",\"source\":\"user-override\",\"isReadOnly\":\"True\",\"isConfigPendingRestart\":\"False\",\"isDynamicConfig\":\"True\"},\"id\":\"spastjbkkdmf\",\"name\":\"vestmjl\",\"type\":\"rriloz\"},{\"properties\":{\"value\":\"ewchpxlktwku\",\"currentValue\":\"ycslevufuztcktyh\",\"description\":\"qedcgzulwm\",\"documentationLink\":\"qzz\",\"defaultValue\":\"jvpglydzgk\",\"dataType\":\"qeevt\",\"allowedValues\":\"pryu\",\"source\":\"user-override\",\"isReadOnly\":\"False\",\"isConfigPendingRestart\":\"True\",\"isDynamicConfig\":\"True\"},\"id\":\"vzvfvaawzqadfl\",\"name\":\"z\",\"type\":\"riglaec\"},{\"properties\":{\"value\":\"t\",\"currentValue\":\"okpvzm\",\"description\":\"t\",\"documentationLink\":\"dgxobfircl\",\"defaultValue\":\"kciayzri\",\"dataType\":\"hya\",\"allowedValues\":\"vjlboxqvk\",\"source\":\"system-default\",\"isReadOnly\":\"True\",\"isConfigPendingRestart\":\"True\",\"isDynamicConfig\":\"False\"},\"id\":\"hdwdi\",\"name\":\"umbnraauzzp\",\"type\":\"jazysdzhezwwvaiq\"},{\"properties\":{\"value\":\"vfonkphhqyikvyl\",\"currentValue\":\"yavluwmncstt\",\"description\":\"fybvpoek\",\"documentationLink\":\"gsgbdhuzq\",\"defaultValue\":\"j\",\"dataType\":\"kynscliqhzv\",\"allowedValues\":\"nk\",\"source\":\"user-override\",\"isReadOnly\":\"True\",\"isConfigPendingRestart\":\"True\",\"isDynamicConfig\":\"True\"},\"id\":\"nvdxzxhihfrbbc\",\"name\":\"vqagtltdhlf\",\"type\":\"qojpy\"}],\"nextLink\":\"gtrd\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        MySqlManager manager = MySqlManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        ConfigurationListResult response = manager.configurations()
            .batchUpdate("xkzb", "msgeivsiykzk",
                new ConfigurationListForBatchUpdate()
                    .withValue(Arrays.asList(new ConfigurationForBatchUpdate().withName("dxonbzoggculap")
                        .withValue("rpgogtqxep")
                        .withSource("lbfu")))
                    .withResetAllToDefault(ResetAllToDefault.TRUE),
                com.azure.core.util.Context.NONE);

        Assertions.assertEquals("vofqzhvfc", response.value().get(0).value());
        Assertions.assertEquals("yfm", response.value().get(0).currentValue());
        Assertions.assertEquals(ConfigurationSource.USER_OVERRIDE, response.value().get(0).source());
        Assertions.assertEquals("gtrd", response.nextLink());
    }
}
