// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.documentanalysis.implementation.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Contiguous region of the concatenated content property, specified as an offset and length.
 */
@Immutable
public final class DocumentSpan implements JsonSerializable<DocumentSpan> {
    /*
     * Zero-based index of the content represented by the span.
     */
    private final int offset;

    /*
     * Number of characters in the content represented by the span.
     */
    private final int length;

    /**
     * Creates an instance of DocumentSpan class.
     * 
     * @param offset the offset value to set.
     * @param length the length value to set.
     */
    public DocumentSpan(int offset, int length) {
        this.offset = offset;
        this.length = length;
    }

    /**
     * Get the offset property: Zero-based index of the content represented by the span.
     * 
     * @return the offset value.
     */
    public int getOffset() {
        return this.offset;
    }

    /**
     * Get the length property: Number of characters in the content represented by the span.
     * 
     * @return the length value.
     */
    public int getLength() {
        return this.length;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeIntField("offset", this.offset);
        jsonWriter.writeIntField("length", this.length);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DocumentSpan from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DocumentSpan if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DocumentSpan.
     */
    public static DocumentSpan fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean offsetFound = false;
            int offset = 0;
            boolean lengthFound = false;
            int length = 0;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("offset".equals(fieldName)) {
                    offset = reader.getInt();
                    offsetFound = true;
                } else if ("length".equals(fieldName)) {
                    length = reader.getInt();
                    lengthFound = true;
                } else {
                    reader.skipChildren();
                }
            }
            if (offsetFound && lengthFound) {
                return new DocumentSpan(offset, length);
            }
            List<String> missingProperties = new ArrayList<>();
            if (!offsetFound) {
                missingProperties.add("offset");
            }
            if (!lengthFound) {
                missingProperties.add("length");
            }

            throw new IllegalStateException(
                "Missing required property/properties: " + String.join(", ", missingProperties));
        });
    }
}
