// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The CustomRolloutPropertiesAutoGenerated model. */
@Fluent
public class CustomRolloutPropertiesAutoGenerated {
    /*
     * The provisioningState property.
     */
    @JsonProperty(value = "provisioningState")
    private ProvisioningState provisioningState;

    /*
     * The specification property.
     */
    @JsonProperty(value = "specification", required = true)
    private CustomRolloutPropertiesSpecification specification;

    /*
     * The status property.
     */
    @JsonProperty(value = "status")
    private CustomRolloutPropertiesStatus status;

    /** Creates an instance of CustomRolloutPropertiesAutoGenerated class. */
    public CustomRolloutPropertiesAutoGenerated() {
    }

    /**
     * Get the provisioningState property: The provisioningState property.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The provisioningState property.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the CustomRolloutPropertiesAutoGenerated object itself.
     */
    public CustomRolloutPropertiesAutoGenerated withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the specification property: The specification property.
     *
     * @return the specification value.
     */
    public CustomRolloutPropertiesSpecification specification() {
        return this.specification;
    }

    /**
     * Set the specification property: The specification property.
     *
     * @param specification the specification value to set.
     * @return the CustomRolloutPropertiesAutoGenerated object itself.
     */
    public CustomRolloutPropertiesAutoGenerated withSpecification(CustomRolloutPropertiesSpecification specification) {
        this.specification = specification;
        return this;
    }

    /**
     * Get the status property: The status property.
     *
     * @return the status value.
     */
    public CustomRolloutPropertiesStatus status() {
        return this.status;
    }

    /**
     * Set the status property: The status property.
     *
     * @param status the status value to set.
     * @return the CustomRolloutPropertiesAutoGenerated object itself.
     */
    public CustomRolloutPropertiesAutoGenerated withStatus(CustomRolloutPropertiesStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (specification() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property specification in model CustomRolloutPropertiesAutoGenerated"));
        } else {
            specification().validate();
        }
        if (status() != null) {
            status().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CustomRolloutPropertiesAutoGenerated.class);
}
