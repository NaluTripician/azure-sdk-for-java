// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/** Contains all response data for the listNext operation. */
public final class ProductWikisOperationsListNextResponse
    extends ResponseBase<ProductWikisOperationsListNextHeaders, WikiCollection> {
    /**
     * Creates an instance of ProductWikisOperationsListNextResponse.
     *
     * @param request the request which resulted in this ProductWikisOperationsListNextResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public ProductWikisOperationsListNextResponse(
        HttpRequest request,
        int statusCode,
        HttpHeaders rawHeaders,
        WikiCollection value,
        ProductWikisOperationsListNextHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /**
     * Gets the deserialized response body.
     *
     * @return the deserialized response body.
     */
    @Override
    public WikiCollection getValue() {
        return super.getValue();
    }
}
