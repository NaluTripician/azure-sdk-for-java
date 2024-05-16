// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.kubernetesconfiguration.fluent.models.ExtensionInner;

/** Resource collection API of Extensions. */
public interface Extensions {
    /**
     * Create a new Kubernetes Cluster Extension.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterRp The Kubernetes cluster RP - i.e. Microsoft.ContainerService, Microsoft.Kubernetes,
     *     Microsoft.HybridContainerService.
     * @param clusterResourceName The Kubernetes cluster resource name - i.e. managedClusters, connectedClusters,
     *     provisionedClusters.
     * @param clusterName The name of the kubernetes cluster.
     * @param extensionName Name of the Extension.
     * @param extension Properties necessary to Create an Extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Extension object.
     */
    Extension create(
        String resourceGroupName,
        String clusterRp,
        String clusterResourceName,
        String clusterName,
        String extensionName,
        ExtensionInner extension);

    /**
     * Create a new Kubernetes Cluster Extension.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterRp The Kubernetes cluster RP - i.e. Microsoft.ContainerService, Microsoft.Kubernetes,
     *     Microsoft.HybridContainerService.
     * @param clusterResourceName The Kubernetes cluster resource name - i.e. managedClusters, connectedClusters,
     *     provisionedClusters.
     * @param clusterName The name of the kubernetes cluster.
     * @param extensionName Name of the Extension.
     * @param extension Properties necessary to Create an Extension.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Extension object.
     */
    Extension create(
        String resourceGroupName,
        String clusterRp,
        String clusterResourceName,
        String clusterName,
        String extensionName,
        ExtensionInner extension,
        Context context);

    /**
     * Gets Kubernetes Cluster Extension.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterRp The Kubernetes cluster RP - i.e. Microsoft.ContainerService, Microsoft.Kubernetes,
     *     Microsoft.HybridContainerService.
     * @param clusterResourceName The Kubernetes cluster resource name - i.e. managedClusters, connectedClusters,
     *     provisionedClusters.
     * @param clusterName The name of the kubernetes cluster.
     * @param extensionName Name of the Extension.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return kubernetes Cluster Extension along with {@link Response}.
     */
    Response<Extension> getWithResponse(
        String resourceGroupName,
        String clusterRp,
        String clusterResourceName,
        String clusterName,
        String extensionName,
        Context context);

    /**
     * Gets Kubernetes Cluster Extension.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterRp The Kubernetes cluster RP - i.e. Microsoft.ContainerService, Microsoft.Kubernetes,
     *     Microsoft.HybridContainerService.
     * @param clusterResourceName The Kubernetes cluster resource name - i.e. managedClusters, connectedClusters,
     *     provisionedClusters.
     * @param clusterName The name of the kubernetes cluster.
     * @param extensionName Name of the Extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return kubernetes Cluster Extension.
     */
    Extension get(
        String resourceGroupName,
        String clusterRp,
        String clusterResourceName,
        String clusterName,
        String extensionName);

    /**
     * Delete a Kubernetes Cluster Extension. This will cause the Agent to Uninstall the extension from the cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterRp The Kubernetes cluster RP - i.e. Microsoft.ContainerService, Microsoft.Kubernetes,
     *     Microsoft.HybridContainerService.
     * @param clusterResourceName The Kubernetes cluster resource name - i.e. managedClusters, connectedClusters,
     *     provisionedClusters.
     * @param clusterName The name of the kubernetes cluster.
     * @param extensionName Name of the Extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String resourceGroupName,
        String clusterRp,
        String clusterResourceName,
        String clusterName,
        String extensionName);

    /**
     * Delete a Kubernetes Cluster Extension. This will cause the Agent to Uninstall the extension from the cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterRp The Kubernetes cluster RP - i.e. Microsoft.ContainerService, Microsoft.Kubernetes,
     *     Microsoft.HybridContainerService.
     * @param clusterResourceName The Kubernetes cluster resource name - i.e. managedClusters, connectedClusters,
     *     provisionedClusters.
     * @param clusterName The name of the kubernetes cluster.
     * @param extensionName Name of the Extension.
     * @param forceDelete Delete the extension resource in Azure - not the normal asynchronous delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String resourceGroupName,
        String clusterRp,
        String clusterResourceName,
        String clusterName,
        String extensionName,
        Boolean forceDelete,
        Context context);

    /**
     * Patch an existing Kubernetes Cluster Extension.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterRp The Kubernetes cluster RP - i.e. Microsoft.ContainerService, Microsoft.Kubernetes,
     *     Microsoft.HybridContainerService.
     * @param clusterResourceName The Kubernetes cluster resource name - i.e. managedClusters, connectedClusters,
     *     provisionedClusters.
     * @param clusterName The name of the kubernetes cluster.
     * @param extensionName Name of the Extension.
     * @param patchExtension Properties to Patch in an existing Extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Extension object.
     */
    Extension update(
        String resourceGroupName,
        String clusterRp,
        String clusterResourceName,
        String clusterName,
        String extensionName,
        PatchExtension patchExtension);

    /**
     * Patch an existing Kubernetes Cluster Extension.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterRp The Kubernetes cluster RP - i.e. Microsoft.ContainerService, Microsoft.Kubernetes,
     *     Microsoft.HybridContainerService.
     * @param clusterResourceName The Kubernetes cluster resource name - i.e. managedClusters, connectedClusters,
     *     provisionedClusters.
     * @param clusterName The name of the kubernetes cluster.
     * @param extensionName Name of the Extension.
     * @param patchExtension Properties to Patch in an existing Extension.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Extension object.
     */
    Extension update(
        String resourceGroupName,
        String clusterRp,
        String clusterResourceName,
        String clusterName,
        String extensionName,
        PatchExtension patchExtension,
        Context context);

    /**
     * List all Extensions in the cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterRp The Kubernetes cluster RP - i.e. Microsoft.ContainerService, Microsoft.Kubernetes,
     *     Microsoft.HybridContainerService.
     * @param clusterResourceName The Kubernetes cluster resource name - i.e. managedClusters, connectedClusters,
     *     provisionedClusters.
     * @param clusterName The name of the kubernetes cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list Extensions as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Extension> list(
        String resourceGroupName, String clusterRp, String clusterResourceName, String clusterName);

    /**
     * List all Extensions in the cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterRp The Kubernetes cluster RP - i.e. Microsoft.ContainerService, Microsoft.Kubernetes,
     *     Microsoft.HybridContainerService.
     * @param clusterResourceName The Kubernetes cluster resource name - i.e. managedClusters, connectedClusters,
     *     provisionedClusters.
     * @param clusterName The name of the kubernetes cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list Extensions as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Extension> list(
        String resourceGroupName, String clusterRp, String clusterResourceName, String clusterName, Context context);
}
