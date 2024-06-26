// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.videoanalyzer.models.AccessPolicyRole;
import com.azure.resourcemanager.videoanalyzer.models.AuthenticationBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Application level properties for the access policy resource. */
@Fluent
public final class AccessPolicyProperties {
    /*
     * Defines the access level granted by this policy.
     */
    @JsonProperty(value = "role")
    private AccessPolicyRole role;

    /*
     * Authentication method to be used when validating client API access.
     */
    @JsonProperty(value = "authentication")
    private AuthenticationBase authentication;

    /**
     * Get the role property: Defines the access level granted by this policy.
     *
     * @return the role value.
     */
    public AccessPolicyRole role() {
        return this.role;
    }

    /**
     * Set the role property: Defines the access level granted by this policy.
     *
     * @param role the role value to set.
     * @return the AccessPolicyProperties object itself.
     */
    public AccessPolicyProperties withRole(AccessPolicyRole role) {
        this.role = role;
        return this;
    }

    /**
     * Get the authentication property: Authentication method to be used when validating client API access.
     *
     * @return the authentication value.
     */
    public AuthenticationBase authentication() {
        return this.authentication;
    }

    /**
     * Set the authentication property: Authentication method to be used when validating client API access.
     *
     * @param authentication the authentication value to set.
     * @return the AccessPolicyProperties object itself.
     */
    public AccessPolicyProperties withAuthentication(AuthenticationBase authentication) {
        this.authentication = authentication;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (authentication() != null) {
            authentication().validate();
        }
    }
}
