// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * The details of the authorization for the resource.
 */
@Fluent
public final class ResourceAuthorization implements JsonSerializable<ResourceAuthorization> {
    /*
     * The scope of the authorization.
     */
    private String scope;

    /*
     * The action being requested.
     */
    private String action;

    /*
     * The evidence for the authorization.
     */
    private Map<String, String> evidence;

    /**
     * Creates an instance of ResourceAuthorization class.
     */
    public ResourceAuthorization() {
    }

    /**
     * Get the scope property: The scope of the authorization.
     * 
     * @return the scope value.
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * Set the scope property: The scope of the authorization.
     * 
     * @param scope the scope value to set.
     * @return the ResourceAuthorization object itself.
     */
    public ResourceAuthorization setScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get the action property: The action being requested.
     * 
     * @return the action value.
     */
    public String getAction() {
        return this.action;
    }

    /**
     * Set the action property: The action being requested.
     * 
     * @param action the action value to set.
     * @return the ResourceAuthorization object itself.
     */
    public ResourceAuthorization setAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * Get the evidence property: The evidence for the authorization.
     * 
     * @return the evidence value.
     */
    public Map<String, String> getEvidence() {
        return this.evidence;
    }

    /**
     * Set the evidence property: The evidence for the authorization.
     * 
     * @param evidence the evidence value to set.
     * @return the ResourceAuthorization object itself.
     */
    public ResourceAuthorization setEvidence(Map<String, String> evidence) {
        this.evidence = evidence;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("scope", this.scope);
        jsonWriter.writeStringField("action", this.action);
        jsonWriter.writeMapField("evidence", this.evidence, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ResourceAuthorization from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ResourceAuthorization if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ResourceAuthorization.
     */
    public static ResourceAuthorization fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ResourceAuthorization deserializedResourceAuthorization = new ResourceAuthorization();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("scope".equals(fieldName)) {
                    deserializedResourceAuthorization.scope = reader.getString();
                } else if ("action".equals(fieldName)) {
                    deserializedResourceAuthorization.action = reader.getString();
                } else if ("evidence".equals(fieldName)) {
                    Map<String, String> evidence = reader.readMap(reader1 -> reader1.getString());
                    deserializedResourceAuthorization.evidence = evidence;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedResourceAuthorization;
        });
    }
}
