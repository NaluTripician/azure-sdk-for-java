// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of ExtensionMetadatas.
 */
public interface ExtensionMetadatas {
    /**
     * Gets an Extension Metadata based on location, publisher, extensionType and version.
     * 
     * @param location The location of the Extension being received.
     * @param publisher The publisher of the Extension being received.
     * @param extensionType The extensionType of the Extension being received.
     * @param version The version of the Extension being received.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Extension Metadata based on location, publisher, extensionType and version along with
     * {@link Response}.
     */
    Response<ExtensionValue> getWithResponse(String location, String publisher, String extensionType, String version,
        Context context);

    /**
     * Gets an Extension Metadata based on location, publisher, extensionType and version.
     * 
     * @param location The location of the Extension being received.
     * @param publisher The publisher of the Extension being received.
     * @param extensionType The extensionType of the Extension being received.
     * @param version The version of the Extension being received.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Extension Metadata based on location, publisher, extensionType and version.
     */
    ExtensionValue get(String location, String publisher, String extensionType, String version);

    /**
     * Gets all Extension versions based on location, publisher, extensionType.
     * 
     * @param location The location of the Extension being received.
     * @param publisher The publisher of the Extension being received.
     * @param extensionType The extensionType of the Extension being received.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Extension versions based on location, publisher, extensionType as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<ExtensionValue> list(String location, String publisher, String extensionType);

    /**
     * Gets all Extension versions based on location, publisher, extensionType.
     * 
     * @param location The location of the Extension being received.
     * @param publisher The publisher of the Extension being received.
     * @param extensionType The extensionType of the Extension being received.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Extension versions based on location, publisher, extensionType as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<ExtensionValue> list(String location, String publisher, String extensionType, Context context);
}
