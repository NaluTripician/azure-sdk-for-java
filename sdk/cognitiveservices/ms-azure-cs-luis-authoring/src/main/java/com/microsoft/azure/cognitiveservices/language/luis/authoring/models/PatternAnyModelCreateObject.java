/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.authoring.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Model object for creating a Pattern.Any entity model.
 */
public class PatternAnyModelCreateObject {
    /**
     * The model name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The Pattern.Any explicit list.
     */
    @JsonProperty(value = "explicitList")
    private List<String> explicitList;

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
     * @return the PatternAnyModelCreateObject object itself.
     */
    public PatternAnyModelCreateObject withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the explicitList value.
     *
     * @return the explicitList value
     */
    public List<String> explicitList() {
        return this.explicitList;
    }

    /**
     * Set the explicitList value.
     *
     * @param explicitList the explicitList value to set
     * @return the PatternAnyModelCreateObject object itself.
     */
    public PatternAnyModelCreateObject withExplicitList(List<String> explicitList) {
        this.explicitList = explicitList;
        return this;
    }

}
