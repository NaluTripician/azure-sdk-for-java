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
import com.azure.resourcemanager.mysqlflexibleserver.models.OperationProgressResult;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class OperationProgressGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"objectType\":\"OperationProgressResponseType\"},\"id\":\"i\",\"resourceId\":\"vumwmxqh\",\"name\":\"vnoamldseha\",\"status\":\"hdjhhflz\",\"percentComplete\":66.91231,\"startTime\":\"2021-01-13T01:47:16Z\",\"endTime\":\"2021-05-28T20:09:21Z\",\"operations\":[{\"id\":\"jetagltsxoatft\",\"resourceId\":\"pnpbswveflocc\",\"name\":\"mozi\",\"status\":\"m\",\"percentComplete\":5.020833,\"startTime\":\"2021-04-14T23:51:02Z\",\"endTime\":\"2021-11-19T09:15:01Z\",\"operations\":[{\"id\":\"y\",\"resourceId\":\"xcjxgrytfmpcy\",\"name\":\"lrmcaykg\",\"status\":\"noxuztrksx\",\"percentComplete\":37.622272,\"startTime\":\"2021-05-07T07:31:07Z\",\"endTime\":\"2021-01-21T22:39:06Z\",\"operations\":[{\"status\":\"znth\"},{\"status\":\"twk\"}]},{\"id\":\"srxuzvoam\",\"resourceId\":\"cqiosmgbza\",\"name\":\"xqdlyrtltlapr\",\"status\":\"tz\",\"percentComplete\":80.98418,\"startTime\":\"2021-10-09T19:13:43Z\",\"endTime\":\"2021-10-17T10:38:23Z\",\"operations\":[{\"status\":\"nbsoqeqalarv\"},{\"status\":\"agunbtgfebw\"},{\"status\":\"nbmhyree\"}]},{\"id\":\"qavbpdqmj\",\"resourceId\":\"yyzglgouwtlmjjy\",\"name\":\"j\",\"status\":\"tob\",\"percentComplete\":47.482197,\"startTime\":\"2021-05-24T14:07:59Z\",\"endTime\":\"2021-04-18T22:03:42Z\",\"operations\":[{\"status\":\"lbfjkwr\"}]},{\"id\":\"kqbh\",\"resourceId\":\"rqunjq\",\"name\":\"enx\",\"status\":\"ulkpakd\",\"percentComplete\":60.852154,\"startTime\":\"2021-10-26T11:32:42Z\",\"endTime\":\"2021-05-24T00:54:47Z\",\"operations\":[{\"status\":\"tqabpxuckpgg\"},{\"status\":\"oweyirdhlis\"},{\"status\":\"gwflq\"}]}]},{\"id\":\"zruwn\",\"resourceId\":\"xpxiwfcngjs\",\"name\":\"sii\",\"status\":\"tmkzjvkviirhgfgr\",\"percentComplete\":25.038736,\"startTime\":\"2021-05-20T10:14:07Z\",\"endTime\":\"2021-04-27T20:58:15Z\",\"operations\":[{\"id\":\"zb\",\"resourceId\":\"byvi\",\"name\":\"ctbrxkjzwrgxffm\",\"status\":\"hkwfbkgozxwop\",\"percentComplete\":12.357336,\"startTime\":\"2021-06-10T05:25:23Z\",\"endTime\":\"2021-04-25T08:18:32Z\",\"operations\":[{\"status\":\"clnapxbiygnugjkn\"},{\"status\":\"smfcttuxuuyilfl\"},{\"status\":\"oiquvrehmrnjhvs\"},{\"status\":\"jztczytqj\"}]},{\"id\":\"auunfprnjletlx\",\"resourceId\":\"rpddouifamo\",\"name\":\"z\",\"status\":\"yn\",\"percentComplete\":86.37498,\"startTime\":\"2021-09-09T09:30:34Z\",\"endTime\":\"2021-09-20T14:41:41Z\",\"operations\":[{\"status\":\"iwhxqszdtmaajq\"},{\"status\":\"huxy\"}]},{\"id\":\"vmtygj\",\"resourceId\":\"zyos\",\"name\":\"p\",\"status\":\"hckfkyjpmspbps\",\"percentComplete\":97.769455,\"startTime\":\"2021-10-10T20:16:17Z\",\"endTime\":\"2021-03-29T12:30:22Z\",\"operations\":[{\"status\":\"eyujtvczkcnyxrx\"},{\"status\":\"unjdx\"}]}]},{\"id\":\"kvxlxpa\",\"resourceId\":\"qivbgkcvkh\",\"name\":\"vuqd\",\"status\":\"lvoniy\",\"percentComplete\":89.86916,\"startTime\":\"2021-10-26T12:39:28Z\",\"endTime\":\"2021-01-27T05:34Z\",\"operations\":[{\"id\":\"xtiv\",\"resourceId\":\"knidib\",\"name\":\"jxgpnrhgovfg\",\"status\":\"ik\",\"percentComplete\":10.271984,\"startTime\":\"2021-03-05T20:29:17Z\",\"endTime\":\"2021-02-15T17:50:36Z\",\"operations\":[{\"status\":\"mzvupor\"},{\"status\":\"zdfuydzvkfvxcnqm\"}]}]}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        MySqlManager manager = MySqlManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        OperationProgressResult response = manager.operationProgress()
            .getWithResponse("hczznvf", "ycjsx", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("i", response.id());
        Assertions.assertEquals("vnoamldseha", response.name());
        Assertions.assertEquals("hdjhhflz", response.status());
        Assertions.assertEquals(66.91231F, response.percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-13T01:47:16Z"), response.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-28T20:09:21Z"), response.endTime());
        Assertions.assertEquals("jetagltsxoatft", response.operations().get(0).id());
        Assertions.assertEquals("mozi", response.operations().get(0).name());
        Assertions.assertEquals("m", response.operations().get(0).status());
        Assertions.assertEquals(5.020833F, response.operations().get(0).percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-14T23:51:02Z"), response.operations().get(0).startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-19T09:15:01Z"), response.operations().get(0).endTime());
        Assertions.assertEquals("y", response.operations().get(0).operations().get(0).id());
        Assertions.assertEquals("lrmcaykg", response.operations().get(0).operations().get(0).name());
        Assertions.assertEquals("noxuztrksx", response.operations().get(0).operations().get(0).status());
        Assertions.assertEquals(37.622272F, response.operations().get(0).operations().get(0).percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-07T07:31:07Z"),
            response.operations().get(0).operations().get(0).startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-21T22:39:06Z"),
            response.operations().get(0).operations().get(0).endTime());
        Assertions.assertEquals("znth", response.operations().get(0).operations().get(0).operations().get(0).status());
    }
}
