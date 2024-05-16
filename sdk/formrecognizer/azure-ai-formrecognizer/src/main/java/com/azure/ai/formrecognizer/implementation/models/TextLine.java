// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * An object representing an extracted text line.
 */
@Fluent
public final class TextLine implements JsonSerializable<TextLine> {
    /*
     * The text content of the line.
     */
    private String text;

    /*
     * Bounding box of an extracted line.
     */
    private List<Float> boundingBox;

    /*
     * List of words in the text line.
     */
    private List<TextWord> words;

    /*
     * Text appearance properties.
     */
    private Appearance appearance;

    /**
     * Creates an instance of TextLine class.
     */
    public TextLine() {
    }

    /**
     * Get the text property: The text content of the line.
     * 
     * @return the text value.
     */
    public String getText() {
        return this.text;
    }

    /**
     * Set the text property: The text content of the line.
     * 
     * @param text the text value to set.
     * @return the TextLine object itself.
     */
    public TextLine setText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get the boundingBox property: Bounding box of an extracted line.
     * 
     * @return the boundingBox value.
     */
    public List<Float> getBoundingBox() {
        return this.boundingBox;
    }

    /**
     * Set the boundingBox property: Bounding box of an extracted line.
     * 
     * @param boundingBox the boundingBox value to set.
     * @return the TextLine object itself.
     */
    public TextLine setBoundingBox(List<Float> boundingBox) {
        this.boundingBox = boundingBox;
        return this;
    }

    /**
     * Get the words property: List of words in the text line.
     * 
     * @return the words value.
     */
    public List<TextWord> getWords() {
        return this.words;
    }

    /**
     * Set the words property: List of words in the text line.
     * 
     * @param words the words value to set.
     * @return the TextLine object itself.
     */
    public TextLine setWords(List<TextWord> words) {
        this.words = words;
        return this;
    }

    /**
     * Get the appearance property: Text appearance properties.
     * 
     * @return the appearance value.
     */
    public Appearance getAppearance() {
        return this.appearance;
    }

    /**
     * Set the appearance property: Text appearance properties.
     * 
     * @param appearance the appearance value to set.
     * @return the TextLine object itself.
     */
    public TextLine setAppearance(Appearance appearance) {
        this.appearance = appearance;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("text", this.text);
        jsonWriter.writeArrayField("boundingBox", this.boundingBox, (writer, element) -> writer.writeFloat(element));
        jsonWriter.writeArrayField("words", this.words, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("appearance", this.appearance);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TextLine from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TextLine if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the TextLine.
     */
    public static TextLine fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TextLine deserializedTextLine = new TextLine();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("text".equals(fieldName)) {
                    deserializedTextLine.text = reader.getString();
                } else if ("boundingBox".equals(fieldName)) {
                    List<Float> boundingBox = reader.readArray(reader1 -> reader1.getFloat());
                    deserializedTextLine.boundingBox = boundingBox;
                } else if ("words".equals(fieldName)) {
                    List<TextWord> words = reader.readArray(reader1 -> TextWord.fromJson(reader1));
                    deserializedTextLine.words = words;
                } else if ("appearance".equals(fieldName)) {
                    deserializedTextLine.appearance = Appearance.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTextLine;
        });
    }
}
