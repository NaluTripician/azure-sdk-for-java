// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.hybridnetwork.fluent.models.ProxyArtifactListOverviewInner;
import com.azure.resourcemanager.hybridnetwork.fluent.models.ProxyArtifactVersionsListOverviewInner;
import com.azure.resourcemanager.hybridnetwork.models.ArtifactChangeState;

/**
 * An instance of this class provides access to all the operations defined in ProxyArtifactsClient.
 */
public interface ProxyArtifactsClient {
    /**
     * Lists all the available artifacts in the parent Artifact Store.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param publisherName The name of the publisher.
     * @param artifactStoreName The name of the artifact store.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the proxy artifact list result as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ProxyArtifactListOverviewInner> list(String resourceGroupName, String publisherName,
        String artifactStoreName);

    /**
     * Lists all the available artifacts in the parent Artifact Store.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param publisherName The name of the publisher.
     * @param artifactStoreName The name of the artifact store.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the proxy artifact list result as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ProxyArtifactListOverviewInner> list(String resourceGroupName, String publisherName,
        String artifactStoreName, Context context);

    /**
     * Get a Artifact overview information.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param publisherName The name of the publisher.
     * @param artifactStoreName The name of the artifact store.
     * @param artifactName The name of the artifact.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Artifact overview information as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ProxyArtifactVersionsListOverviewInner> get(String resourceGroupName, String publisherName,
        String artifactStoreName, String artifactName);

    /**
     * Get a Artifact overview information.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param publisherName The name of the publisher.
     * @param artifactStoreName The name of the artifact store.
     * @param artifactName The name of the artifact.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Artifact overview information as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ProxyArtifactVersionsListOverviewInner> get(String resourceGroupName, String publisherName,
        String artifactStoreName, String artifactName, Context context);

    /**
     * Change artifact state defined in artifact store.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param publisherName The name of the publisher.
     * @param artifactStoreName The name of the artifact store.
     * @param artifactName The name of the artifact.
     * @param artifactVersionName The name of the artifact version.
     * @param parameters Parameters supplied to update the state of artifact manifest.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the proxy artifact overview.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ProxyArtifactVersionsListOverviewInner>, ProxyArtifactVersionsListOverviewInner>
        beginUpdateState(String resourceGroupName, String publisherName, String artifactStoreName, String artifactName,
            String artifactVersionName, ArtifactChangeState parameters);

    /**
     * Change artifact state defined in artifact store.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param publisherName The name of the publisher.
     * @param artifactStoreName The name of the artifact store.
     * @param artifactName The name of the artifact.
     * @param artifactVersionName The name of the artifact version.
     * @param parameters Parameters supplied to update the state of artifact manifest.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the proxy artifact overview.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ProxyArtifactVersionsListOverviewInner>, ProxyArtifactVersionsListOverviewInner>
        beginUpdateState(String resourceGroupName, String publisherName, String artifactStoreName, String artifactName,
            String artifactVersionName, ArtifactChangeState parameters, Context context);

    /**
     * Change artifact state defined in artifact store.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param publisherName The name of the publisher.
     * @param artifactStoreName The name of the artifact store.
     * @param artifactName The name of the artifact.
     * @param artifactVersionName The name of the artifact version.
     * @param parameters Parameters supplied to update the state of artifact manifest.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the proxy artifact overview.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProxyArtifactVersionsListOverviewInner updateState(String resourceGroupName, String publisherName,
        String artifactStoreName, String artifactName, String artifactVersionName, ArtifactChangeState parameters);

    /**
     * Change artifact state defined in artifact store.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param publisherName The name of the publisher.
     * @param artifactStoreName The name of the artifact store.
     * @param artifactName The name of the artifact.
     * @param artifactVersionName The name of the artifact version.
     * @param parameters Parameters supplied to update the state of artifact manifest.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the proxy artifact overview.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProxyArtifactVersionsListOverviewInner updateState(String resourceGroupName, String publisherName,
        String artifactStoreName, String artifactName, String artifactVersionName, ArtifactChangeState parameters,
        Context context);
}
