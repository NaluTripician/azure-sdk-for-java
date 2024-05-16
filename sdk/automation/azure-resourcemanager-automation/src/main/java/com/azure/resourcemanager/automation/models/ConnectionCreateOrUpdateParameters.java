// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.automation.fluent.models.ConnectionCreateOrUpdateProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The parameters supplied to the create or update connection operation. */
@Fluent
public final class ConnectionCreateOrUpdateParameters {
    /*
     * Gets or sets the name of the connection.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Gets or sets the properties of the connection.
     */
    @JsonProperty(value = "properties", required = true)
    private ConnectionCreateOrUpdateProperties innerProperties = new ConnectionCreateOrUpdateProperties();

    /**
     * Get the name property: Gets or sets the name of the connection.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Gets or sets the name of the connection.
     *
     * @param name the name value to set.
     * @return the ConnectionCreateOrUpdateParameters object itself.
     */
    public ConnectionCreateOrUpdateParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the innerProperties property: Gets or sets the properties of the connection.
     *
     * @return the innerProperties value.
     */
    private ConnectionCreateOrUpdateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the description property: Gets or sets the description of the connection.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: Gets or sets the description of the connection.
     *
     * @param description the description value to set.
     * @return the ConnectionCreateOrUpdateParameters object itself.
     */
    public ConnectionCreateOrUpdateParameters withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectionCreateOrUpdateProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the connectionType property: Gets or sets the connectionType of the connection.
     *
     * @return the connectionType value.
     */
    public ConnectionTypeAssociationProperty connectionType() {
        return this.innerProperties() == null ? null : this.innerProperties().connectionType();
    }

    /**
     * Set the connectionType property: Gets or sets the connectionType of the connection.
     *
     * @param connectionType the connectionType value to set.
     * @return the ConnectionCreateOrUpdateParameters object itself.
     */
    public ConnectionCreateOrUpdateParameters withConnectionType(ConnectionTypeAssociationProperty connectionType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectionCreateOrUpdateProperties();
        }
        this.innerProperties().withConnectionType(connectionType);
        return this;
    }

    /**
     * Get the fieldDefinitionValues property: Gets or sets the field definition properties of the connection.
     *
     * @return the fieldDefinitionValues value.
     */
    public Map<String, String> fieldDefinitionValues() {
        return this.innerProperties() == null ? null : this.innerProperties().fieldDefinitionValues();
    }

    /**
     * Set the fieldDefinitionValues property: Gets or sets the field definition properties of the connection.
     *
     * @param fieldDefinitionValues the fieldDefinitionValues value to set.
     * @return the ConnectionCreateOrUpdateParameters object itself.
     */
    public ConnectionCreateOrUpdateParameters withFieldDefinitionValues(Map<String, String> fieldDefinitionValues) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectionCreateOrUpdateProperties();
        }
        this.innerProperties().withFieldDefinitionValues(fieldDefinitionValues);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property name in model ConnectionCreateOrUpdateParameters"));
        }
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model ConnectionCreateOrUpdateParameters"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ConnectionCreateOrUpdateParameters.class);
}
