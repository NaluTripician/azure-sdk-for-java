// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Connector mapping property format. */
@Fluent
public final class ConnectorMappingFormat {
    /*
     * The type mapping format.
     */
    @JsonProperty(value = "formatType", required = true)
    private String formatType = "TextFormat";

    /*
     * The character that signifies a break between columns.
     */
    @JsonProperty(value = "columnDelimiter")
    private String columnDelimiter;

    /*
     * The oData language.
     */
    @JsonProperty(value = "acceptLanguage")
    private String acceptLanguage;

    /*
     * Quote character, used to indicate enquoted fields.
     */
    @JsonProperty(value = "quoteCharacter")
    private String quoteCharacter;

    /*
     * Escape character for quotes, can be the same as the quoteCharacter.
     */
    @JsonProperty(value = "quoteEscapeCharacter")
    private String quoteEscapeCharacter;

    /*
     * Character separating array elements.
     */
    @JsonProperty(value = "arraySeparator")
    private String arraySeparator;

    /** Creates an instance of ConnectorMappingFormat class. */
    public ConnectorMappingFormat() {
        formatType = "TextFormat";
    }

    /**
     * Get the formatType property: The type mapping format.
     *
     * @return the formatType value.
     */
    public String formatType() {
        return this.formatType;
    }

    /**
     * Set the formatType property: The type mapping format.
     *
     * @param formatType the formatType value to set.
     * @return the ConnectorMappingFormat object itself.
     */
    public ConnectorMappingFormat withFormatType(String formatType) {
        this.formatType = formatType;
        return this;
    }

    /**
     * Get the columnDelimiter property: The character that signifies a break between columns.
     *
     * @return the columnDelimiter value.
     */
    public String columnDelimiter() {
        return this.columnDelimiter;
    }

    /**
     * Set the columnDelimiter property: The character that signifies a break between columns.
     *
     * @param columnDelimiter the columnDelimiter value to set.
     * @return the ConnectorMappingFormat object itself.
     */
    public ConnectorMappingFormat withColumnDelimiter(String columnDelimiter) {
        this.columnDelimiter = columnDelimiter;
        return this;
    }

    /**
     * Get the acceptLanguage property: The oData language.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Set the acceptLanguage property: The oData language.
     *
     * @param acceptLanguage the acceptLanguage value to set.
     * @return the ConnectorMappingFormat object itself.
     */
    public ConnectorMappingFormat withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /**
     * Get the quoteCharacter property: Quote character, used to indicate enquoted fields.
     *
     * @return the quoteCharacter value.
     */
    public String quoteCharacter() {
        return this.quoteCharacter;
    }

    /**
     * Set the quoteCharacter property: Quote character, used to indicate enquoted fields.
     *
     * @param quoteCharacter the quoteCharacter value to set.
     * @return the ConnectorMappingFormat object itself.
     */
    public ConnectorMappingFormat withQuoteCharacter(String quoteCharacter) {
        this.quoteCharacter = quoteCharacter;
        return this;
    }

    /**
     * Get the quoteEscapeCharacter property: Escape character for quotes, can be the same as the quoteCharacter.
     *
     * @return the quoteEscapeCharacter value.
     */
    public String quoteEscapeCharacter() {
        return this.quoteEscapeCharacter;
    }

    /**
     * Set the quoteEscapeCharacter property: Escape character for quotes, can be the same as the quoteCharacter.
     *
     * @param quoteEscapeCharacter the quoteEscapeCharacter value to set.
     * @return the ConnectorMappingFormat object itself.
     */
    public ConnectorMappingFormat withQuoteEscapeCharacter(String quoteEscapeCharacter) {
        this.quoteEscapeCharacter = quoteEscapeCharacter;
        return this;
    }

    /**
     * Get the arraySeparator property: Character separating array elements.
     *
     * @return the arraySeparator value.
     */
    public String arraySeparator() {
        return this.arraySeparator;
    }

    /**
     * Set the arraySeparator property: Character separating array elements.
     *
     * @param arraySeparator the arraySeparator value to set.
     * @return the ConnectorMappingFormat object itself.
     */
    public ConnectorMappingFormat withArraySeparator(String arraySeparator) {
        this.arraySeparator = arraySeparator;
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
