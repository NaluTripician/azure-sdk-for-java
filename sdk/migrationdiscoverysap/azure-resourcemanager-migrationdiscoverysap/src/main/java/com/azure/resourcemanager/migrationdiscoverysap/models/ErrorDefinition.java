// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.migrationdiscoverysap.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Error definition.
 */
@Immutable
public final class ErrorDefinition {
    /*
     * Service specific error code which serves as the substatus for the HTTP error code.
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private String code;

    /*
     * Description of the error.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /*
     * Description of the recommendation.
     */
    @JsonProperty(value = "recommendation", access = JsonProperty.Access.WRITE_ONLY)
    private String recommendation;

    /*
     * Internal error details.
     */
    @JsonProperty(value = "details", access = JsonProperty.Access.WRITE_ONLY)
    private List<ErrorDefinition> details;

    /**
     * Creates an instance of ErrorDefinition class.
     */
    public ErrorDefinition() {
    }

    /**
     * Get the code property: Service specific error code which serves as the substatus for the HTTP error code.
     * 
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Get the message property: Description of the error.
     * 
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Get the recommendation property: Description of the recommendation.
     * 
     * @return the recommendation value.
     */
    public String recommendation() {
        return this.recommendation;
    }

    /**
     * Get the details property: Internal error details.
     * 
     * @return the details value.
     */
    public List<ErrorDefinition> details() {
        return this.details;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (details() != null) {
            details().forEach(e -> e.validate());
        }
    }
}
