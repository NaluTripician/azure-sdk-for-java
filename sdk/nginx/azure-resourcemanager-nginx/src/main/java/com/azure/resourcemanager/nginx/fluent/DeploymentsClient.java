// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.nginx.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.nginx.fluent.models.NginxDeploymentInner;
import com.azure.resourcemanager.nginx.models.NginxDeploymentUpdateParameters;

/**
 * An instance of this class provides access to all the operations defined in DeploymentsClient.
 */
public interface DeploymentsClient {
    /**
     * Get the NGINX deployment.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of targeted NGINX deployment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the NGINX deployment along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<NginxDeploymentInner> getByResourceGroupWithResponse(String resourceGroupName, String deploymentName,
        Context context);

    /**
     * Get the NGINX deployment.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of targeted NGINX deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the NGINX deployment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NginxDeploymentInner getByResourceGroup(String resourceGroupName, String deploymentName);

    /**
     * Create or update the NGINX deployment.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of targeted NGINX deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<NginxDeploymentInner>, NginxDeploymentInner> beginCreateOrUpdate(String resourceGroupName,
        String deploymentName);

    /**
     * Create or update the NGINX deployment.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of targeted NGINX deployment.
     * @param body The body parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<NginxDeploymentInner>, NginxDeploymentInner> beginCreateOrUpdate(String resourceGroupName,
        String deploymentName, NginxDeploymentInner body, Context context);

    /**
     * Create or update the NGINX deployment.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of targeted NGINX deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NginxDeploymentInner createOrUpdate(String resourceGroupName, String deploymentName);

    /**
     * Create or update the NGINX deployment.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of targeted NGINX deployment.
     * @param body The body parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NginxDeploymentInner createOrUpdate(String resourceGroupName, String deploymentName, NginxDeploymentInner body,
        Context context);

    /**
     * Update the NGINX deployment.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of targeted NGINX deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<NginxDeploymentInner>, NginxDeploymentInner> beginUpdate(String resourceGroupName,
        String deploymentName);

    /**
     * Update the NGINX deployment.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of targeted NGINX deployment.
     * @param body The body parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<NginxDeploymentInner>, NginxDeploymentInner> beginUpdate(String resourceGroupName,
        String deploymentName, NginxDeploymentUpdateParameters body, Context context);

    /**
     * Update the NGINX deployment.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of targeted NGINX deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NginxDeploymentInner update(String resourceGroupName, String deploymentName);

    /**
     * Update the NGINX deployment.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of targeted NGINX deployment.
     * @param body The body parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NginxDeploymentInner update(String resourceGroupName, String deploymentName, NginxDeploymentUpdateParameters body,
        Context context);

    /**
     * Delete the NGINX deployment resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of targeted NGINX deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String deploymentName);

    /**
     * Delete the NGINX deployment resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of targeted NGINX deployment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String deploymentName, Context context);

    /**
     * Delete the NGINX deployment resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of targeted NGINX deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String deploymentName);

    /**
     * Delete the NGINX deployment resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of targeted NGINX deployment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String deploymentName, Context context);

    /**
     * List the NGINX deployments resources.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NginxDeploymentInner> list();

    /**
     * List the NGINX deployments resources.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NginxDeploymentInner> list(Context context);

    /**
     * List all NGINX deployments under the specified resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NginxDeploymentInner> listByResourceGroup(String resourceGroupName);

    /**
     * List all NGINX deployments under the specified resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NginxDeploymentInner> listByResourceGroup(String resourceGroupName, Context context);
}
