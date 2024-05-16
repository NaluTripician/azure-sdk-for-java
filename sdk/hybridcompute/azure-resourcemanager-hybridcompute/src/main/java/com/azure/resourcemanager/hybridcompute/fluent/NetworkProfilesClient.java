// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.hybridcompute.fluent.models.NetworkProfileInner;

/**
 * An instance of this class provides access to all the operations defined in NetworkProfilesClient.
 */
public interface NetworkProfilesClient {
    /**
     * The operation to get network information of hybrid machine.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param machineName The name of the hybrid machine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the network information on this machine along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<NetworkProfileInner> getWithResponse(String resourceGroupName, String machineName, Context context);

    /**
     * The operation to get network information of hybrid machine.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param machineName The name of the hybrid machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the network information on this machine.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkProfileInner get(String resourceGroupName, String machineName);
}
