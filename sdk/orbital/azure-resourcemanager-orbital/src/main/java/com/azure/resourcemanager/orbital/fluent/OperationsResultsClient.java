// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.orbital.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.orbital.fluent.models.OperationResultInner;

/** An instance of this class provides access to all the operations defined in OperationsResultsClient. */
public interface OperationsResultsClient {
    /**
     * Returns operation results.
     *
     * @param location The name of Azure region.
     * @param operationId The ID of an ongoing async operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of operation Result Entity.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<OperationResultInner>, OperationResultInner> beginGet(String location, String operationId);

    /**
     * Returns operation results.
     *
     * @param location The name of Azure region.
     * @param operationId The ID of an ongoing async operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of operation Result Entity.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<OperationResultInner>, OperationResultInner> beginGet(
        String location, String operationId, Context context);

    /**
     * Returns operation results.
     *
     * @param location The name of Azure region.
     * @param operationId The ID of an ongoing async operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation Result Entity.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OperationResultInner get(String location, String operationId);

    /**
     * Returns operation results.
     *
     * @param location The name of Azure region.
     * @param operationId The ID of an ongoing async operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation Result Entity.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OperationResultInner get(String location, String operationId, Context context);
}
