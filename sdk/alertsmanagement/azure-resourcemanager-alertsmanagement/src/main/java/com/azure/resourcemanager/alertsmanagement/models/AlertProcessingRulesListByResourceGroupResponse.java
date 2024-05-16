// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.alertsmanagement.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/** Contains all response data for the listByResourceGroup operation. */
public final class AlertProcessingRulesListByResourceGroupResponse
    extends ResponseBase<AlertProcessingRulesListByResourceGroupHeaders, AlertProcessingRulesList> {
    /**
     * Creates an instance of AlertProcessingRulesListByResourceGroupResponse.
     *
     * @param request the request which resulted in this AlertProcessingRulesListByResourceGroupResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public AlertProcessingRulesListByResourceGroupResponse(
        HttpRequest request,
        int statusCode,
        HttpHeaders rawHeaders,
        AlertProcessingRulesList value,
        AlertProcessingRulesListByResourceGroupHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /**
     * Gets the deserialized response body.
     *
     * @return the deserialized response body.
     */
    @Override
    public AlertProcessingRulesList getValue() {
        return super.getValue();
    }
}
