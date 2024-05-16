// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The definition of a canonical profile property. */
@Fluent
public final class CanonicalProfileDefinitionPropertiesItem {
    /*
     * Profile name.
     */
    @JsonProperty(value = "profileName")
    private String profileName;

    /*
     * Property name of profile.
     */
    @JsonProperty(value = "profilePropertyName")
    private String profilePropertyName;

    /*
     * The rank.
     */
    @JsonProperty(value = "rank")
    private Integer rank;

    /*
     * Type of canonical property value.
     */
    @JsonProperty(value = "type")
    private CanonicalPropertyValueType type;

    /*
     * Value of the canonical property.
     */
    @JsonProperty(value = "value")
    private String value;

    /** Creates an instance of CanonicalProfileDefinitionPropertiesItem class. */
    public CanonicalProfileDefinitionPropertiesItem() {
    }

    /**
     * Get the profileName property: Profile name.
     *
     * @return the profileName value.
     */
    public String profileName() {
        return this.profileName;
    }

    /**
     * Set the profileName property: Profile name.
     *
     * @param profileName the profileName value to set.
     * @return the CanonicalProfileDefinitionPropertiesItem object itself.
     */
    public CanonicalProfileDefinitionPropertiesItem withProfileName(String profileName) {
        this.profileName = profileName;
        return this;
    }

    /**
     * Get the profilePropertyName property: Property name of profile.
     *
     * @return the profilePropertyName value.
     */
    public String profilePropertyName() {
        return this.profilePropertyName;
    }

    /**
     * Set the profilePropertyName property: Property name of profile.
     *
     * @param profilePropertyName the profilePropertyName value to set.
     * @return the CanonicalProfileDefinitionPropertiesItem object itself.
     */
    public CanonicalProfileDefinitionPropertiesItem withProfilePropertyName(String profilePropertyName) {
        this.profilePropertyName = profilePropertyName;
        return this;
    }

    /**
     * Get the rank property: The rank.
     *
     * @return the rank value.
     */
    public Integer rank() {
        return this.rank;
    }

    /**
     * Set the rank property: The rank.
     *
     * @param rank the rank value to set.
     * @return the CanonicalProfileDefinitionPropertiesItem object itself.
     */
    public CanonicalProfileDefinitionPropertiesItem withRank(Integer rank) {
        this.rank = rank;
        return this;
    }

    /**
     * Get the type property: Type of canonical property value.
     *
     * @return the type value.
     */
    public CanonicalPropertyValueType type() {
        return this.type;
    }

    /**
     * Set the type property: Type of canonical property value.
     *
     * @param type the type value to set.
     * @return the CanonicalProfileDefinitionPropertiesItem object itself.
     */
    public CanonicalProfileDefinitionPropertiesItem withType(CanonicalPropertyValueType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the value property: Value of the canonical property.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Value of the canonical property.
     *
     * @param value the value value to set.
     * @return the CanonicalProfileDefinitionPropertiesItem object itself.
     */
    public CanonicalProfileDefinitionPropertiesItem withValue(String value) {
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
