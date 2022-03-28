// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * By default, Event Grid expects events to be in the Event Grid event schema. Specifying an input schema mapping
 * enables publishing to Event Grid using a custom input schema. Currently, the only supported type of
 * InputSchemaMapping is 'JsonInputSchemaMapping'.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "inputSchemaMappingType",
    defaultImpl = InputSchemaMapping.class)
@JsonTypeName("InputSchemaMapping")
@JsonSubTypes({@JsonSubTypes.Type(name = "Json", value = JsonInputSchemaMapping.class)})
@Immutable
public class InputSchemaMapping {
    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
