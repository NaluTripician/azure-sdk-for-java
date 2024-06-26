// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/** A policy that defines actions to execute when exception are triggered. */
@Fluent
public final class ExceptionPolicy {
    /**
     * Create new instance
     */
    public ExceptionPolicy() {
    }

    /*
     * The Id of the exception policy
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The name of the exception policy.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A collection of exception rules on the exception policy.
     */
    @JsonProperty(value = "exceptionRules")
    private List<ExceptionRule> exceptionRules;

    /**
     * Get the id property: The Id of the exception policy.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the name property: The name of the exception policy.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the exception policy.
     *
     * @param name the name value to set.
     * @return the ExceptionPolicy object itself.
     */
    public ExceptionPolicy setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the exceptionRules property: A collection of exception rules on the exception policy.
     *
     * @return the exceptionRules value.
     */
    public List<ExceptionRule> getExceptionRules() {
        return this.exceptionRules;
    }

    /*
     * The entity tag for this resource.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Get the etag property: The entity tag for this resource.
     *
     * @return the etag value.
     */
    public String getEtag() {
        return this.etag;
    }

    /**
     * Set the exceptionRules property: A collection of exception rules on the exception policy.
     *
     * @param exceptionRules the exceptionRules value to set.
     * @return the ExceptionPolicy object itself.
     */
    public ExceptionPolicy setExceptionRules(List<ExceptionRule> exceptionRules) {
        this.exceptionRules = exceptionRules;
        return this;
    }
}
