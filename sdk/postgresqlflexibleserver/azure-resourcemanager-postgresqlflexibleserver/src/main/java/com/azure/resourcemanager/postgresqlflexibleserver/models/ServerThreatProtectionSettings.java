// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of ServerThreatProtectionSettings.
 */
public interface ServerThreatProtectionSettings {
    /**
     * Get a list of server's Threat Protection state.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of server's Threat Protection state as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ServerThreatProtectionSettingsModel> listByServer(String resourceGroupName, String serverName);

    /**
     * Get a list of server's Threat Protection state.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of server's Threat Protection state as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ServerThreatProtectionSettingsModel> listByServer(String resourceGroupName, String serverName,
        Context context);

    /**
     * Get a server's Advanced Threat Protection settings.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param threatProtectionName The name of the Threat Protection state.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server's Advanced Threat Protection settings along with {@link Response}.
     */
    Response<ServerThreatProtectionSettingsModel> getWithResponse(String resourceGroupName, String serverName,
        ThreatProtectionName threatProtectionName, Context context);

    /**
     * Get a server's Advanced Threat Protection settings.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param threatProtectionName The name of the Threat Protection state.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server's Advanced Threat Protection settings.
     */
    ServerThreatProtectionSettingsModel get(String resourceGroupName, String serverName,
        ThreatProtectionName threatProtectionName);

    /**
     * Get a server's Advanced Threat Protection settings.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server's Advanced Threat Protection settings along with {@link Response}.
     */
    ServerThreatProtectionSettingsModel getById(String id);

    /**
     * Get a server's Advanced Threat Protection settings.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server's Advanced Threat Protection settings along with {@link Response}.
     */
    Response<ServerThreatProtectionSettingsModel> getByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new ServerThreatProtectionSettingsModel resource.
     * 
     * @param name resource name.
     * @return the first stage of the new ServerThreatProtectionSettingsModel definition.
     */
    ServerThreatProtectionSettingsModel.DefinitionStages.Blank define(ThreatProtectionName name);
}
