// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.sharing.generated;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.util.BinaryData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public final class ReceivedSharesListDetachedTests extends PurviewShareClientTestBase {
    @Test
    @Disabled
    public void testReceivedSharesListDetachedTests() {
        RequestOptions requestOptions = new RequestOptions().addQueryParam("filter", "Name eq 'testName'");
        PagedIterable<BinaryData> response = receivedSharesClient.listDetachedReceivedShares(requestOptions);
        Assertions.assertEquals(200, response.iterableByPage().iterator().next().getStatusCode());
        Assertions.assertEquals(
                "Wed, 12 July 2022 18:04:32 GMT",
                response.iterableByPage().iterator().next().getHeaders().get("Date").getValue());
        Assertions.assertEquals(
                "25c78f97-0b0a-4fe9-ad39-883a482265cd",
                response.iterableByPage().iterator().next().getHeaders().get("x-ms-correlation-request-id").getValue());
        Assertions.assertEquals(
                BinaryData.fromString(
                                "{\"type\":\"receivedShares\",\"id\":\"0D67B9C8-A6C6-4990-9EDE-12EA059D3002\",\"properties\":{\"assetLocation\":\"eastus\",\"assetStoreKind\":\"BlobAccount\",\"createdAt\":\"2022-07-12T18:18:50.7095202Z\",\"displayName\":\"receivedShareName1\",\"receiverEmail\":\"janedoe@fabrikam.com\",\"receiverName\":null,\"receiverTenantName\":null,\"senderEmail\":\"ali.smith@contoso.com\",\"senderName\":\"Ali Smith\",\"senderTenantName\":\"Contoso\",\"sentShareDescription\":\"description\",\"shareStatus\":\"Detached\",\"sharedAt\":\"2022-07-12T18:17:56.1065304Z\",\"state\":\"Succeeded\"},\"shareKind\":\"InPlace\"}")
                        .toObject(Object.class),
                response.iterator().next().toObject(Object.class));
    }
}
