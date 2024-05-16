// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalog.generated;

import com.azure.analytics.purview.catalog.GlossaryClient;
import com.azure.analytics.purview.catalog.GlossaryClientBuilder;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class GlossaryGetGlossaryCategory {
    public static void main(String[] args) {
        GlossaryClient glossaryClient =
                new GlossaryClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("{Endpoint}")
                        .buildClient();
        // BEGIN:com.azure.analytics.purview.catalog.generated.glossarygetglossarycategory.glossarygetglossarycategory
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                glossaryClient.getGlossaryCategoryWithResponse("ed7458f0-9463-48a5-b5c6-4f785fb34e12", requestOptions);
        // END:com.azure.analytics.purview.catalog.generated.glossarygetglossarycategory.glossarygetglossarycategory
    }
}
