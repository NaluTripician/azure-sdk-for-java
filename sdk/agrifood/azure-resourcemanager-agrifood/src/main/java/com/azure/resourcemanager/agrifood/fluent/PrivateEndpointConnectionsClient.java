// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.agrifood.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.agrifood.fluent.models.PrivateEndpointConnectionInner;

/** An instance of this class provides access to all the operations defined in PrivateEndpointConnectionsClient. */
public interface PrivateEndpointConnectionsClient {
    /**
     * Approves or Rejects a Private endpoint connection request.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param farmBeatsResourceName FarmBeats resource name.
     * @param privateEndpointConnectionName Private endpoint connection name.
     * @param body Request object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Private Endpoint Connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionInner createOrUpdate(
        String resourceGroupName,
        String farmBeatsResourceName,
        String privateEndpointConnectionName,
        PrivateEndpointConnectionInner body);

    /**
     * Approves or Rejects a Private endpoint connection request.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param farmBeatsResourceName FarmBeats resource name.
     * @param privateEndpointConnectionName Private endpoint connection name.
     * @param body Request object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Private Endpoint Connection resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateEndpointConnectionInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String farmBeatsResourceName,
        String privateEndpointConnectionName,
        PrivateEndpointConnectionInner body,
        Context context);

    /**
     * Get Private endpoint connection object.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param farmBeatsResourceName FarmBeats resource name.
     * @param privateEndpointConnectionName Private endpoint connection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private endpoint connection object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionInner get(
        String resourceGroupName, String farmBeatsResourceName, String privateEndpointConnectionName);

    /**
     * Get Private endpoint connection object.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param farmBeatsResourceName FarmBeats resource name.
     * @param privateEndpointConnectionName Private endpoint connection name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private endpoint connection object along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateEndpointConnectionInner> getWithResponse(
        String resourceGroupName, String farmBeatsResourceName, String privateEndpointConnectionName, Context context);

    /**
     * Delete Private endpoint connection request.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param farmBeatsResourceName FarmBeats resource name.
     * @param privateEndpointConnectionName Private endpoint connection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String farmBeatsResourceName, String privateEndpointConnectionName);

    /**
     * Delete Private endpoint connection request.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param farmBeatsResourceName FarmBeats resource name.
     * @param privateEndpointConnectionName Private endpoint connection name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String farmBeatsResourceName, String privateEndpointConnectionName, Context context);

    /**
     * Delete Private endpoint connection request.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param farmBeatsResourceName FarmBeats resource name.
     * @param privateEndpointConnectionName Private endpoint connection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String farmBeatsResourceName, String privateEndpointConnectionName);

    /**
     * Delete Private endpoint connection request.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param farmBeatsResourceName FarmBeats resource name.
     * @param privateEndpointConnectionName Private endpoint connection name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(
        String resourceGroupName, String farmBeatsResourceName, String privateEndpointConnectionName, Context context);

    /**
     * Get list of Private endpoint connections.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param farmBeatsResourceName FarmBeats resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Private endpoint connections as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PrivateEndpointConnectionInner> listByResource(
        String resourceGroupName, String farmBeatsResourceName);

    /**
     * Get list of Private endpoint connections.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param farmBeatsResourceName FarmBeats resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Private endpoint connections as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PrivateEndpointConnectionInner> listByResource(
        String resourceGroupName, String farmBeatsResourceName, Context context);
}
