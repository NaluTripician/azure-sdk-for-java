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
 * A citation within the message that points to a file located at a specific path.
 */
@Immutable
public final class MessageTextFilePathAnnotation extends MessageTextAnnotation {

    /*
     * A URL for the file that's generated when the assistant used the code_interpreter tool to generate a file.
     */
    @Generated
    private final MessageTextFilePathDetails filePath;

    /**
     * Creates an instance of MessageTextFilePathAnnotation class.
     *
     * @param text the text value to set.
     * @param startIndex the startIndex value to set.
     * @param endIndex the endIndex value to set.
     * @param filePath the filePath value to set.
     */
    @Generated
    private MessageTextFilePathAnnotation(String text, int startIndex, int endIndex,
        MessageTextFilePathDetails filePath) {
        super(text, startIndex, endIndex);
        this.filePath = filePath;
    }

    /**
     * Get the filePath property: A URL for the file that's generated when the assistant used the code_interpreter tool
     * to generate a file.
     *
     * @return the filePath value.
     */
    @Generated
    public MessageTextFilePathDetails getFilePath() {
        return this.filePath;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("text", getText());
        jsonWriter.writeIntField("start_index", getStartIndex());
        jsonWriter.writeIntField("end_index", getEndIndex());
        jsonWriter.writeJsonField("file_path", this.filePath);
        jsonWriter.writeStringField("type", this.type);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MessageTextFilePathAnnotation from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of MessageTextFilePathAnnotation if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MessageTextFilePathAnnotation.
     */
    @Generated
    public static MessageTextFilePathAnnotation fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String text = null;
            int startIndex = 0;
            int endIndex = 0;
            MessageTextFilePathDetails filePath = null;
            String type = "file_path";
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("text".equals(fieldName)) {
                    text = reader.getString();
                } else if ("start_index".equals(fieldName)) {
                    startIndex = reader.getInt();
                } else if ("end_index".equals(fieldName)) {
                    endIndex = reader.getInt();
                } else if ("file_path".equals(fieldName)) {
                    filePath = MessageTextFilePathDetails.fromJson(reader);
                } else if ("type".equals(fieldName)) {
                    type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            MessageTextFilePathAnnotation deserializedMessageTextFilePathAnnotation
                = new MessageTextFilePathAnnotation(text, startIndex, endIndex, filePath);
            deserializedMessageTextFilePathAnnotation.type = type;
            return deserializedMessageTextFilePathAnnotation;
        });
    }

    /*
     * The object type.
     */
    @Generated
    private String type = "file_path";

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
}
