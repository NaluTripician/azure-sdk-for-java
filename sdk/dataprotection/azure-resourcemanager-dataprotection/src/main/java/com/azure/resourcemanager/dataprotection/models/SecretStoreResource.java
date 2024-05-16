// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class representing a secret store resource.
 */
@Fluent
public final class SecretStoreResource {
    /*
     * Uri to get to the resource
     */
    @JsonProperty(value = "uri")
    private String uri;

    /*
     * Gets or sets the type of secret store
     */
    @JsonProperty(value = "secretStoreType", required = true)
    private SecretStoreType secretStoreType;

    /*
     * Gets or sets value stored in secret store resource
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Creates an instance of SecretStoreResource class.
     */
    public SecretStoreResource() {
    }

    /**
     * Get the uri property: Uri to get to the resource.
     * 
     * @return the uri value.
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Set the uri property: Uri to get to the resource.
     * 
     * @param uri the uri value to set.
     * @return the SecretStoreResource object itself.
     */
    public SecretStoreResource withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * Get the secretStoreType property: Gets or sets the type of secret store.
     * 
     * @return the secretStoreType value.
     */
    public SecretStoreType secretStoreType() {
        return this.secretStoreType;
    }

    /**
     * Set the secretStoreType property: Gets or sets the type of secret store.
     * 
     * @param secretStoreType the secretStoreType value to set.
     * @return the SecretStoreResource object itself.
     */
    public SecretStoreResource withSecretStoreType(SecretStoreType secretStoreType) {
        this.secretStoreType = secretStoreType;
        return this;
    }

    /**
     * Get the value property: Gets or sets value stored in secret store resource.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Gets or sets value stored in secret store resource.
     * 
     * @param value the value value to set.
     * @return the SecretStoreResource object itself.
     */
    public SecretStoreResource withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (secretStoreType() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property secretStoreType in model SecretStoreResource"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SecretStoreResource.class);
}
