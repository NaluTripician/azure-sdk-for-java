// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devhub.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Resource tags. */
@Fluent
public final class TagsObject {
    /*
     * Dictionary of <string>
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /** Creates an instance of TagsObject class. */
    public TagsObject() {
    }

    /**
     * Get the tags property: Dictionary of &lt;string&gt;.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Dictionary of &lt;string&gt;.
     *
     * @param tags the tags value to set.
     * @return the TagsObject object itself.
     */
    public TagsObject withTags(Map<String, String> tags) {
        this.tags = tags;
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
