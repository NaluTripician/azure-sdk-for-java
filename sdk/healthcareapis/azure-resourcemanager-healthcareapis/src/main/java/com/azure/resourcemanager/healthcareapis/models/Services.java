// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of Services.
 */
public interface Services {
    /**
     * Get the metadata of a service instance.
     * 
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param resourceName The name of the service instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the metadata of a service instance along with {@link Response}.
     */
    Response<ServicesDescription> getByResourceGroupWithResponse(String resourceGroupName, String resourceName,
        Context context);

    /**
     * Get the metadata of a service instance.
     * 
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param resourceName The name of the service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the metadata of a service instance.
     */
    ServicesDescription getByResourceGroup(String resourceGroupName, String resourceName);

    /**
     * Delete a service instance.
     * 
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param resourceName The name of the service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String resourceName);

    /**
     * Delete a service instance.
     * 
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param resourceName The name of the service instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String resourceName, Context context);

    /**
     * Get all the service instances in a subscription.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the service instances in a subscription as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ServicesDescription> list();

    /**
     * Get all the service instances in a subscription.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the service instances in a subscription as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ServicesDescription> list(Context context);

    /**
     * Get all the service instances in a resource group.
     * 
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the service instances in a resource group as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ServicesDescription> listByResourceGroup(String resourceGroupName);

    /**
     * Get all the service instances in a resource group.
     * 
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the service instances in a resource group as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ServicesDescription> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Check if a service instance name is available.
     * 
     * @param checkNameAvailabilityInputs Set the name parameter in the CheckNameAvailabilityParameters structure to the
     * name of the service instance to check.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties indicating whether a given service name is available along with {@link Response}.
     */
    Response<ServicesNameAvailabilityInfo>
        checkNameAvailabilityWithResponse(CheckNameAvailabilityParameters checkNameAvailabilityInputs, Context context);

    /**
     * Check if a service instance name is available.
     * 
     * @param checkNameAvailabilityInputs Set the name parameter in the CheckNameAvailabilityParameters structure to the
     * name of the service instance to check.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties indicating whether a given service name is available.
     */
    ServicesNameAvailabilityInfo checkNameAvailability(CheckNameAvailabilityParameters checkNameAvailabilityInputs);

    /**
     * Get the metadata of a service instance.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the metadata of a service instance along with {@link Response}.
     */
    ServicesDescription getById(String id);

    /**
     * Get the metadata of a service instance.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the metadata of a service instance along with {@link Response}.
     */
    Response<ServicesDescription> getByIdWithResponse(String id, Context context);

    /**
     * Delete a service instance.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete a service instance.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new ServicesDescription resource.
     * 
     * @param name resource name.
     * @return the first stage of the new ServicesDescription definition.
     */
    ServicesDescription.DefinitionStages.Blank define(String name);
}
