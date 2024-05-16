/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.authoring.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Model object for updating a regular expression entity model.
 */
public class RegexModelUpdateObject {
    /**
     * The regular expression entity pattern.
     */
    @JsonProperty(value = "regexPattern")
    private String regexPattern;

    /**
     * The model name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get the regexPattern value.
     *
     * @return the regexPattern value
     */
    public String regexPattern() {
        return this.regexPattern;
    }

    /**
     * Set the regexPattern value.
     *
     * @param regexPattern the regexPattern value to set
     * @return the RegexModelUpdateObject object itself.
     */
    public RegexModelUpdateObject withRegexPattern(String regexPattern) {
        this.regexPattern = regexPattern;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the RegexModelUpdateObject object itself.
     */
    public RegexModelUpdateObject withName(String name) {
        this.name = name;
        return this;
    }

}
