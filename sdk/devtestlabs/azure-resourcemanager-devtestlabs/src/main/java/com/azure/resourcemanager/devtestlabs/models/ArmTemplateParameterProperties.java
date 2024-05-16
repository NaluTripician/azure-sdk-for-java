// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of an Azure Resource Manager template parameter. */
@Fluent
public final class ArmTemplateParameterProperties {
    /*
     * The name of the template parameter.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The value of the template parameter.
     */
    @JsonProperty(value = "value")
    private String value;

    /** Creates an instance of ArmTemplateParameterProperties class. */
    public ArmTemplateParameterProperties() {
    }

    /**
     * Get the name property: The name of the template parameter.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the template parameter.
     *
     * @param name the name value to set.
     * @return the ArmTemplateParameterProperties object itself.
     */
    public ArmTemplateParameterProperties withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: The value of the template parameter.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: The value of the template parameter.
     *
     * @param value the value value to set.
     * @return the ArmTemplateParameterProperties object itself.
     */
    public ArmTemplateParameterProperties withValue(String value) {
        this.value = value;
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
