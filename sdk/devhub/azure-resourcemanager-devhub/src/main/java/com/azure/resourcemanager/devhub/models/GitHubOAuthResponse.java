// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devhub.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.devhub.fluent.models.GitHubOAuthResponseInner;

/** An immutable client-side representation of GitHubOAuthResponse. */
public interface GitHubOAuthResponse {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the username property: user making request.
     *
     * @return the username value.
     */
    String username();

    /**
     * Gets the inner com.azure.resourcemanager.devhub.fluent.models.GitHubOAuthResponseInner object.
     *
     * @return the inner object.
     */
    GitHubOAuthResponseInner innerModel();
}
