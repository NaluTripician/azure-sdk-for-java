// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of ContainerAppsSourceControls.
 */
public interface ContainerAppsSourceControls {
    /**
     * Get the Container App SourceControls in a given resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param containerAppName Name of the Container App.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Container App SourceControls in a given resource group as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<SourceControl> listByContainerApp(String resourceGroupName, String containerAppName);

    /**
     * Get the Container App SourceControls in a given resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param containerAppName Name of the Container App.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Container App SourceControls in a given resource group as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<SourceControl> listByContainerApp(String resourceGroupName, String containerAppName, Context context);

    /**
     * Get a SourceControl of a Container App.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param containerAppName Name of the Container App.
     * @param sourceControlName Name of the Container App SourceControl.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SourceControl of a Container App along with {@link Response}.
     */
    Response<SourceControl> getWithResponse(String resourceGroupName, String containerAppName, String sourceControlName,
        Context context);

    /**
     * Get a SourceControl of a Container App.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param containerAppName Name of the Container App.
     * @param sourceControlName Name of the Container App SourceControl.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SourceControl of a Container App.
     */
    SourceControl get(String resourceGroupName, String containerAppName, String sourceControlName);

    /**
     * Delete a Container App SourceControl.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param containerAppName Name of the Container App.
     * @param sourceControlName Name of the Container App SourceControl.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String containerAppName, String sourceControlName);

    /**
     * Delete a Container App SourceControl.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param containerAppName Name of the Container App.
     * @param sourceControlName Name of the Container App SourceControl.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String containerAppName, String sourceControlName, Context context);

    /**
     * Get a SourceControl of a Container App.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SourceControl of a Container App along with {@link Response}.
     */
    SourceControl getById(String id);

    /**
     * Get a SourceControl of a Container App.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SourceControl of a Container App along with {@link Response}.
     */
    Response<SourceControl> getByIdWithResponse(String id, Context context);

    /**
     * Delete a Container App SourceControl.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete a Container App SourceControl.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new SourceControl resource.
     * 
     * @param name resource name.
     * @return the first stage of the new SourceControl definition.
     */
    SourceControl.DefinitionStages.Blank define(String name);
}
