// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.providerhub.fluent.models.ProviderRegistrationInner;
import java.util.List;

/** Resource collection API of ProviderRegistrations. */
public interface ProviderRegistrations {
    /**
     * Gets the provider registration details.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the provider registration details along with {@link Response}.
     */
    Response<ProviderRegistration> getWithResponse(String providerNamespace, Context context);

    /**
     * Gets the provider registration details.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the provider registration details.
     */
    ProviderRegistration get(String providerNamespace);

    /**
     * Creates or updates the provider registration.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param properties The provider registration properties supplied to the CreateOrUpdate operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    ProviderRegistration createOrUpdate(String providerNamespace, ProviderRegistrationInner properties);

    /**
     * Creates or updates the provider registration.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param properties The provider registration properties supplied to the CreateOrUpdate operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    ProviderRegistration createOrUpdate(
        String providerNamespace, ProviderRegistrationInner properties, Context context);

    /**
     * Deletes a provider registration.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(String providerNamespace, Context context);

    /**
     * Deletes a provider registration.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String providerNamespace);

    /**
     * Gets the list of the provider registrations in the subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of the provider registrations in the subscription as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<ProviderRegistration> list();

    /**
     * Gets the list of the provider registrations in the subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of the provider registrations in the subscription as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<ProviderRegistration> list(Context context);

    /**
     * Generates the operations api for the given provider.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of OperationsDefinition along with {@link Response}.
     */
    Response<List<OperationsDefinition>> generateOperationsWithResponse(String providerNamespace, Context context);

    /**
     * Generates the operations api for the given provider.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of OperationsDefinition.
     */
    List<OperationsDefinition> generateOperations(String providerNamespace);
}
