// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.resourcemanager.apimanagement.fluent.models.DocumentationContractInner;

/** Contains all response data for the update operation. */
public final class DocumentationsUpdateResponse
    extends ResponseBase<DocumentationsUpdateHeaders, DocumentationContractInner> {
    /**
     * Creates an instance of DocumentationsUpdateResponse.
     *
     * @param request the request which resulted in this DocumentationsUpdateResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public DocumentationsUpdateResponse(
        HttpRequest request,
        int statusCode,
        HttpHeaders rawHeaders,
        DocumentationContractInner value,
        DocumentationsUpdateHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /**
     * Gets the deserialized response body.
     *
     * @return the deserialized response body.
     */
    @Override
    public DocumentationContractInner getValue() {
        return super.getValue();
    }
}
