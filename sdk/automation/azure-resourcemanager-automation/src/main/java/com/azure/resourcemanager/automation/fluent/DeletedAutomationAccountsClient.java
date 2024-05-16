// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.automation.fluent.models.DeletedAutomationAccountListResultInner;

/** An instance of this class provides access to all the operations defined in DeletedAutomationAccountsClient. */
public interface DeletedAutomationAccountsClient {
    /**
     * Retrieve deleted automation account.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the list deleted automation account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DeletedAutomationAccountListResultInner listBySubscription();

    /**
     * Retrieve deleted automation account.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the list deleted automation account along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DeletedAutomationAccountListResultInner> listBySubscriptionWithResponse(Context context);
}
