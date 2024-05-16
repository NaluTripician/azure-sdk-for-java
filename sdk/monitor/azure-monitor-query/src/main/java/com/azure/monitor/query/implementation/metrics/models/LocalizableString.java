// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.query.implementation.metrics.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The localizable string class.
 */
@Fluent
public final class LocalizableString implements JsonSerializable<LocalizableString> {
    /*
     * The invariant value.
     */
    private final String value;

    /*
     * The display name.
     */
    private String localizedValue;

    /**
     * Creates an instance of LocalizableString class.
     * 
     * @param value the value value to set.
     */
    public LocalizableString(String value) {
        this.value = value;
    }

    /**
     * Get the value property: The invariant value.
     * 
     * @return the value value.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Get the localizedValue property: The display name.
     * 
     * @return the localizedValue value.
     */
    public String getLocalizedValue() {
        return this.localizedValue;
    }

    /**
     * Set the localizedValue property: The display name.
     * 
     * @param localizedValue the localizedValue value to set.
     * @return the LocalizableString object itself.
     */
    public LocalizableString setLocalizedValue(String localizedValue) {
        this.localizedValue = localizedValue;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("value", this.value);
        jsonWriter.writeStringField("localizedValue", this.localizedValue);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LocalizableString from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LocalizableString if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the LocalizableString.
     */
    public static LocalizableString fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean valueFound = false;
            String value = null;
            String localizedValue = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    value = reader.getString();
                    valueFound = true;
                } else if ("localizedValue".equals(fieldName)) {
                    localizedValue = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            if (valueFound) {
                LocalizableString deserializedLocalizableString = new LocalizableString(value);
                deserializedLocalizableString.localizedValue = localizedValue;

                return deserializedLocalizableString;
            }
            throw new IllegalStateException("Missing required property: value");
        });
    }
}
