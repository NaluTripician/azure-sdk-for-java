// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.automation.fluent.models.HybridRunbookWorkerInner;
import com.azure.resourcemanager.automation.models.HybridRunbookWorkerCreateParameters;
import com.azure.resourcemanager.automation.models.HybridRunbookWorkerMoveParameters;

/** An instance of this class provides access to all the operations defined in HybridRunbookWorkersClient. */
public interface HybridRunbookWorkersClient {
    /**
     * Delete a hybrid runbook worker.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param hybridRunbookWorkerGroupName The hybrid runbook worker group name.
     * @param hybridRunbookWorkerId The hybrid runbook worker id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(
        String resourceGroupName,
        String automationAccountName,
        String hybridRunbookWorkerGroupName,
        String hybridRunbookWorkerId);

    /**
     * Delete a hybrid runbook worker.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param hybridRunbookWorkerGroupName The hybrid runbook worker group name.
     * @param hybridRunbookWorkerId The hybrid runbook worker id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName,
        String automationAccountName,
        String hybridRunbookWorkerGroupName,
        String hybridRunbookWorkerId,
        Context context);

    /**
     * Retrieve a hybrid runbook worker.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param hybridRunbookWorkerGroupName The hybrid runbook worker group name.
     * @param hybridRunbookWorkerId The hybrid runbook worker id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of hybrid runbook worker.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    HybridRunbookWorkerInner get(
        String resourceGroupName,
        String automationAccountName,
        String hybridRunbookWorkerGroupName,
        String hybridRunbookWorkerId);

    /**
     * Retrieve a hybrid runbook worker.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param hybridRunbookWorkerGroupName The hybrid runbook worker group name.
     * @param hybridRunbookWorkerId The hybrid runbook worker id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of hybrid runbook worker along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<HybridRunbookWorkerInner> getWithResponse(
        String resourceGroupName,
        String automationAccountName,
        String hybridRunbookWorkerGroupName,
        String hybridRunbookWorkerId,
        Context context);

    /**
     * Create a hybrid runbook worker.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param hybridRunbookWorkerGroupName The hybrid runbook worker group name.
     * @param hybridRunbookWorkerId The hybrid runbook worker id.
     * @param hybridRunbookWorkerCreationParameters The create or update parameters for hybrid runbook worker.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of hybrid runbook worker.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    HybridRunbookWorkerInner create(
        String resourceGroupName,
        String automationAccountName,
        String hybridRunbookWorkerGroupName,
        String hybridRunbookWorkerId,
        HybridRunbookWorkerCreateParameters hybridRunbookWorkerCreationParameters);

    /**
     * Create a hybrid runbook worker.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param hybridRunbookWorkerGroupName The hybrid runbook worker group name.
     * @param hybridRunbookWorkerId The hybrid runbook worker id.
     * @param hybridRunbookWorkerCreationParameters The create or update parameters for hybrid runbook worker.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of hybrid runbook worker along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<HybridRunbookWorkerInner> createWithResponse(
        String resourceGroupName,
        String automationAccountName,
        String hybridRunbookWorkerGroupName,
        String hybridRunbookWorkerId,
        HybridRunbookWorkerCreateParameters hybridRunbookWorkerCreationParameters,
        Context context);

    /**
     * Move a hybrid worker to a different group.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param hybridRunbookWorkerGroupName The hybrid runbook worker group name.
     * @param hybridRunbookWorkerId The hybrid runbook worker id.
     * @param hybridRunbookWorkerMoveParameters The hybrid runbook worker move parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void move(
        String resourceGroupName,
        String automationAccountName,
        String hybridRunbookWorkerGroupName,
        String hybridRunbookWorkerId,
        HybridRunbookWorkerMoveParameters hybridRunbookWorkerMoveParameters);

    /**
     * Move a hybrid worker to a different group.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param hybridRunbookWorkerGroupName The hybrid runbook worker group name.
     * @param hybridRunbookWorkerId The hybrid runbook worker id.
     * @param hybridRunbookWorkerMoveParameters The hybrid runbook worker move parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> moveWithResponse(
        String resourceGroupName,
        String automationAccountName,
        String hybridRunbookWorkerGroupName,
        String hybridRunbookWorkerId,
        HybridRunbookWorkerMoveParameters hybridRunbookWorkerMoveParameters,
        Context context);

    /**
     * Retrieve a list of hybrid runbook workers.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param hybridRunbookWorkerGroupName The hybrid runbook worker group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the list hybrid runbook workers as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<HybridRunbookWorkerInner> listByHybridRunbookWorkerGroup(
        String resourceGroupName, String automationAccountName, String hybridRunbookWorkerGroupName);

    /**
     * Retrieve a list of hybrid runbook workers.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param hybridRunbookWorkerGroupName The hybrid runbook worker group name.
     * @param filter The filter to apply on the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the list hybrid runbook workers as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<HybridRunbookWorkerInner> listByHybridRunbookWorkerGroup(
        String resourceGroupName,
        String automationAccountName,
        String hybridRunbookWorkerGroupName,
        String filter,
        Context context);
}
