// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of Usages.
 */
public interface Usages {
    /**
     * Get the current usage of a resource.
     * 
     * @param resourceName Resource name for a given resource provider. For example:
     * - SKU name for Microsoft.Compute
     * - SKU or TotalLowPriorityCores for Microsoft.MachineLearningServices
     * For Microsoft.Network PublicIPAddresses.
     * @param scope The target Azure resource URI. For example,
     * `/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/qms-test/providers/Microsoft.Batch/batchAccounts/testAccount/`.
     * This is the target Azure resource URI for the List GET operation. If a `{resourceName}` is added after `/quotas`,
     * then it's the target Azure resource URI in the GET operation for the specific resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current usage of a resource.
     */
    Response<CurrentUsagesBase> getWithResponse(String resourceName, String scope, Context context);

    /**
     * Get the current usage of a resource.
     * 
     * @param resourceName Resource name for a given resource provider. For example:
     * - SKU name for Microsoft.Compute
     * - SKU or TotalLowPriorityCores for Microsoft.MachineLearningServices
     * For Microsoft.Network PublicIPAddresses.
     * @param scope The target Azure resource URI. For example,
     * `/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/qms-test/providers/Microsoft.Batch/batchAccounts/testAccount/`.
     * This is the target Azure resource URI for the List GET operation. If a `{resourceName}` is added after `/quotas`,
     * then it's the target Azure resource URI in the GET operation for the specific resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current usage of a resource.
     */
    CurrentUsagesBase get(String resourceName, String scope);

    /**
     * Get a list of current usage for all resources for the scope specified.
     * 
     * @param scope The target Azure resource URI. For example,
     * `/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/qms-test/providers/Microsoft.Batch/batchAccounts/testAccount/`.
     * This is the target Azure resource URI for the List GET operation. If a `{resourceName}` is added after `/quotas`,
     * then it's the target Azure resource URI in the GET operation for the specific resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of current usage for all resources for the scope specified as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<CurrentUsagesBase> list(String scope);

    /**
     * Get a list of current usage for all resources for the scope specified.
     * 
     * @param scope The target Azure resource URI. For example,
     * `/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/qms-test/providers/Microsoft.Batch/batchAccounts/testAccount/`.
     * This is the target Azure resource URI for the List GET operation. If a `{resourceName}` is added after `/quotas`,
     * then it's the target Azure resource URI in the GET operation for the specific resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of current usage for all resources for the scope specified as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<CurrentUsagesBase> list(String scope, Context context);
}
