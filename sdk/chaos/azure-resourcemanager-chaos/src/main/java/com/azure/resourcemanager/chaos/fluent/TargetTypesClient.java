// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.chaos.fluent.models.TargetTypeInner;

/**
 * An instance of this class provides access to all the operations defined in TargetTypesClient.
 */
public interface TargetTypesClient {
    /**
     * Get a list of Target Type resources for given location.
     * 
     * @param locationName String that represents a Location resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Target Type resources for given location as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<TargetTypeInner> list(String locationName);

    /**
     * Get a list of Target Type resources for given location.
     * 
     * @param locationName String that represents a Location resource name.
     * @param continuationToken String that sets the continuation token.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Target Type resources for given location as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<TargetTypeInner> list(String locationName, String continuationToken, Context context);

    /**
     * Get a Target Type resources for given location.
     * 
     * @param locationName String that represents a Location resource name.
     * @param targetTypeName String that represents a Target Type resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Target Type resources for given location along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<TargetTypeInner> getWithResponse(String locationName, String targetTypeName, Context context);

    /**
     * Get a Target Type resources for given location.
     * 
     * @param locationName String that represents a Location resource name.
     * @param targetTypeName String that represents a Target Type resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Target Type resources for given location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TargetTypeInner get(String locationName, String targetTypeName);
}
