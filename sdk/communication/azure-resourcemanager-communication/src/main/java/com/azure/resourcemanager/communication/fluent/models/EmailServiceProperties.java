// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.communication.models.EmailServicesProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A class that describes the properties of the EmailService.
 */
@Fluent
public final class EmailServiceProperties {
    /*
     * Provisioning state of the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private EmailServicesProvisioningState provisioningState;

    /*
     * The location where the email service stores its data at rest.
     */
    @JsonProperty(value = "dataLocation", required = true)
    private String dataLocation;

    /**
     * Creates an instance of EmailServiceProperties class.
     */
    public EmailServiceProperties() {
    }

    /**
     * Get the provisioningState property: Provisioning state of the resource.
     * 
     * @return the provisioningState value.
     */
    public EmailServicesProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the dataLocation property: The location where the email service stores its data at rest.
     * 
     * @return the dataLocation value.
     */
    public String dataLocation() {
        return this.dataLocation;
    }

    /**
     * Set the dataLocation property: The location where the email service stores its data at rest.
     * 
     * @param dataLocation the dataLocation value to set.
     * @return the EmailServiceProperties object itself.
     */
    public EmailServiceProperties withDataLocation(String dataLocation) {
        this.dataLocation = dataLocation;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dataLocation() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property dataLocation in model EmailServiceProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(EmailServiceProperties.class);
}
