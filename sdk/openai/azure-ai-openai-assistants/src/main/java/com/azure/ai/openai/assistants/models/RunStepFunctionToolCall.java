// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.assistants.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * A record of a call to a function tool, issued by the model in evaluation of a defined tool, that represents the
 * inputs
 * and output consumed and emitted by the specified function.
 */
@Immutable
public final class RunStepFunctionToolCall extends RunStepToolCall {

    /*
     * The detailed information about the function called by the model.
     */
    @Generated
    private final RunStepFunctionToolCallDetails function;

    /**
     * Creates an instance of RunStepFunctionToolCall class.
     *
     * @param id the id value to set.
     * @param function the function value to set.
     */
    @Generated
    private RunStepFunctionToolCall(String id, RunStepFunctionToolCallDetails function) {
        super(id);
        this.function = function;
    }

    /**
     * Get the function property: The detailed information about the function called by the model.
     *
     * @return the function value.
     */
    @Generated
    public RunStepFunctionToolCallDetails getFunction() {
        return this.function;
    }

    /*
     * The object type.
     */
    @Generated
    private String type = "function";

    /**
     * Get the type property: The object type.
     *
     * @return the type value.
     */
    @Generated
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", getId());
        jsonWriter.writeJsonField("function", this.function);
        jsonWriter.writeStringField("type", this.type);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RunStepFunctionToolCall from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of RunStepFunctionToolCall if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RunStepFunctionToolCall.
     */
    @Generated
    public static RunStepFunctionToolCall fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String id = null;
            RunStepFunctionToolCallDetails function = null;
            String type = "function";
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("id".equals(fieldName)) {
                    id = reader.getString();
                } else if ("function".equals(fieldName)) {
                    function = RunStepFunctionToolCallDetails.fromJson(reader);
                } else if ("type".equals(fieldName)) {
                    type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            RunStepFunctionToolCall deserializedRunStepFunctionToolCall = new RunStepFunctionToolCall(id, function);
            deserializedRunStepFunctionToolCall.type = type;
            return deserializedRunStepFunctionToolCall;
        });
    }
}
