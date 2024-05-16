// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The configuration settings of the token store.
 */
@Fluent
public final class TokenStore {
    /*
     * <code>true</code> to durably store platform-specific security tokens that are obtained during login flows;
     * otherwise, <code>false</code>.
     * The default is <code>false</code>.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /*
     * The number of hours after session token expiration that a session token can be used to
     * call the token refresh API. The default is 72 hours.
     */
    @JsonProperty(value = "tokenRefreshExtensionHours")
    private Double tokenRefreshExtensionHours;

    /*
     * The configuration settings of the storage of the tokens if blob storage is used.
     */
    @JsonProperty(value = "azureBlobStorage")
    private BlobStorageTokenStore azureBlobStorage;

    /**
     * Creates an instance of TokenStore class.
     */
    public TokenStore() {
    }

    /**
     * Get the enabled property: &lt;code&gt;true&lt;/code&gt; to durably store platform-specific security tokens that
     * are obtained during login flows; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * The default is &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: &lt;code&gt;true&lt;/code&gt; to durably store platform-specific security tokens that
     * are obtained during login flows; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * The default is &lt;code&gt;false&lt;/code&gt;.
     * 
     * @param enabled the enabled value to set.
     * @return the TokenStore object itself.
     */
    public TokenStore withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the tokenRefreshExtensionHours property: The number of hours after session token expiration that a session
     * token can be used to
     * call the token refresh API. The default is 72 hours.
     * 
     * @return the tokenRefreshExtensionHours value.
     */
    public Double tokenRefreshExtensionHours() {
        return this.tokenRefreshExtensionHours;
    }

    /**
     * Set the tokenRefreshExtensionHours property: The number of hours after session token expiration that a session
     * token can be used to
     * call the token refresh API. The default is 72 hours.
     * 
     * @param tokenRefreshExtensionHours the tokenRefreshExtensionHours value to set.
     * @return the TokenStore object itself.
     */
    public TokenStore withTokenRefreshExtensionHours(Double tokenRefreshExtensionHours) {
        this.tokenRefreshExtensionHours = tokenRefreshExtensionHours;
        return this;
    }

    /**
     * Get the azureBlobStorage property: The configuration settings of the storage of the tokens if blob storage is
     * used.
     * 
     * @return the azureBlobStorage value.
     */
    public BlobStorageTokenStore azureBlobStorage() {
        return this.azureBlobStorage;
    }

    /**
     * Set the azureBlobStorage property: The configuration settings of the storage of the tokens if blob storage is
     * used.
     * 
     * @param azureBlobStorage the azureBlobStorage value to set.
     * @return the TokenStore object itself.
     */
    public TokenStore withAzureBlobStorage(BlobStorageTokenStore azureBlobStorage) {
        this.azureBlobStorage = azureBlobStorage;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (azureBlobStorage() != null) {
            azureBlobStorage().validate();
        }
    }
}
