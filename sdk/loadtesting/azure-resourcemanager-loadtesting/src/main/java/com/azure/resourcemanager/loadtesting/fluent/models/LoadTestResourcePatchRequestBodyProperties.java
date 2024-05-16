// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loadtesting.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.loadtesting.models.EncryptionProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Load Test resource properties. */
@Fluent
public final class LoadTestResourcePatchRequestBodyProperties {
    /*
     * Description of the resource.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * CMK Encryption property.
     */
    @JsonProperty(value = "encryption")
    private EncryptionProperties encryption;

    /** Creates an instance of LoadTestResourcePatchRequestBodyProperties class. */
    public LoadTestResourcePatchRequestBodyProperties() {
    }

    /**
     * Get the description property: Description of the resource.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of the resource.
     *
     * @param description the description value to set.
     * @return the LoadTestResourcePatchRequestBodyProperties object itself.
     */
    public LoadTestResourcePatchRequestBodyProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the encryption property: CMK Encryption property.
     *
     * @return the encryption value.
     */
    public EncryptionProperties encryption() {
        return this.encryption;
    }

    /**
     * Set the encryption property: CMK Encryption property.
     *
     * @param encryption the encryption value to set.
     * @return the LoadTestResourcePatchRequestBodyProperties object itself.
     */
    public LoadTestResourcePatchRequestBodyProperties withEncryption(EncryptionProperties encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (encryption() != null) {
            encryption().validate();
        }
    }
}
