// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.devcenter.fluent.models.CatalogInner;

/**
 * Resource collection API of Catalogs.
 */
public interface Catalogs {
    /**
     * Lists catalogs for a devcenter.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return results of the catalog list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Catalog> listByDevCenter(String resourceGroupName, String devCenterName);

    /**
     * Lists catalogs for a devcenter.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param top The maximum number of resources to return from the operation. Example: '$top=10'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return results of the catalog list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Catalog> listByDevCenter(String resourceGroupName, String devCenterName, Integer top,
        Context context);

    /**
     * Gets a catalog.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param catalogName The name of the Catalog.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a catalog along with {@link Response}.
     */
    Response<Catalog> getWithResponse(String resourceGroupName, String devCenterName, String catalogName,
        Context context);

    /**
     * Gets a catalog.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param catalogName The name of the Catalog.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a catalog.
     */
    Catalog get(String resourceGroupName, String devCenterName, String catalogName);

    /**
     * Creates or updates a catalog.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param catalogName The name of the Catalog.
     * @param body Represents a catalog.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a catalog.
     */
    Catalog createOrUpdate(String resourceGroupName, String devCenterName, String catalogName, CatalogInner body);

    /**
     * Creates or updates a catalog.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param catalogName The name of the Catalog.
     * @param body Represents a catalog.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a catalog.
     */
    Catalog createOrUpdate(String resourceGroupName, String devCenterName, String catalogName, CatalogInner body,
        Context context);

    /**
     * Partially updates a catalog.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param catalogName The name of the Catalog.
     * @param body Updatable catalog properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a catalog.
     */
    Catalog update(String resourceGroupName, String devCenterName, String catalogName, CatalogUpdate body);

    /**
     * Partially updates a catalog.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param catalogName The name of the Catalog.
     * @param body Updatable catalog properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a catalog.
     */
    Catalog update(String resourceGroupName, String devCenterName, String catalogName, CatalogUpdate body,
        Context context);

    /**
     * Deletes a catalog resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param catalogName The name of the Catalog.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String devCenterName, String catalogName);

    /**
     * Deletes a catalog resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param catalogName The name of the Catalog.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String devCenterName, String catalogName, Context context);

    /**
     * Gets catalog synchronization error details.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param catalogName The name of the Catalog.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return catalog synchronization error details along with {@link Response}.
     */
    Response<SyncErrorDetails> getSyncErrorDetailsWithResponse(String resourceGroupName, String devCenterName,
        String catalogName, Context context);

    /**
     * Gets catalog synchronization error details.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param catalogName The name of the Catalog.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return catalog synchronization error details.
     */
    SyncErrorDetails getSyncErrorDetails(String resourceGroupName, String devCenterName, String catalogName);

    /**
     * Syncs templates for a template source.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param catalogName The name of the Catalog.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void sync(String resourceGroupName, String devCenterName, String catalogName);

    /**
     * Syncs templates for a template source.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param catalogName The name of the Catalog.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void sync(String resourceGroupName, String devCenterName, String catalogName, Context context);

    /**
     * Connects a catalog to enable syncing.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param catalogName The name of the Catalog.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void connect(String resourceGroupName, String devCenterName, String catalogName);

    /**
     * Connects a catalog to enable syncing.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param catalogName The name of the Catalog.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void connect(String resourceGroupName, String devCenterName, String catalogName, Context context);
}
