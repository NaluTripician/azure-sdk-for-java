// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The configuration settings of the login flow of the custom Open ID Connect provider.
 */
@Fluent
public final class OpenIdConnectLogin {
    /*
     * The name of the claim that contains the users name.
     */
    @JsonProperty(value = "nameClaimType")
    private String nameClaimType;

    /*
     * A list of the scopes that should be requested while authenticating.
     */
    @JsonProperty(value = "scopes")
    private List<String> scopes;

    /**
     * Creates an instance of OpenIdConnectLogin class.
     */
    public OpenIdConnectLogin() {
    }

    /**
     * Get the nameClaimType property: The name of the claim that contains the users name.
     * 
     * @return the nameClaimType value.
     */
    public String nameClaimType() {
        return this.nameClaimType;
    }

    /**
     * Set the nameClaimType property: The name of the claim that contains the users name.
     * 
     * @param nameClaimType the nameClaimType value to set.
     * @return the OpenIdConnectLogin object itself.
     */
    public OpenIdConnectLogin withNameClaimType(String nameClaimType) {
        this.nameClaimType = nameClaimType;
        return this;
    }

    /**
     * Get the scopes property: A list of the scopes that should be requested while authenticating.
     * 
     * @return the scopes value.
     */
    public List<String> scopes() {
        return this.scopes;
    }

    /**
     * Set the scopes property: A list of the scopes that should be requested while authenticating.
     * 
     * @param scopes the scopes value to set.
     * @return the OpenIdConnectLogin object itself.
     */
    public OpenIdConnectLogin withScopes(List<String> scopes) {
        this.scopes = scopes;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
