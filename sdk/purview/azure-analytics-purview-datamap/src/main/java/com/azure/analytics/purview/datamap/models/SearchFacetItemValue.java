// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.analytics.purview.datamap.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The content of a search facet result item.
 */
@Immutable
public final class SearchFacetItemValue implements JsonSerializable<SearchFacetItemValue> {
    /*
     * The count of the facet item.
     */
    @Generated
    private Integer count;

    /*
     * The name of the facet item.
     */
    @Generated
    private String value;

    /**
     * Creates an instance of SearchFacetItemValue class.
     */
    @Generated
    private SearchFacetItemValue() {
    }

    /**
     * Get the count property: The count of the facet item.
     * 
     * @return the count value.
     */
    @Generated
    public Integer getCount() {
        return this.count;
    }

    /**
     * Get the value property: The name of the facet item.
     * 
     * @return the value value.
     */
    @Generated
    public String getValue() {
        return this.value;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeNumberField("count", this.count);
        jsonWriter.writeStringField("value", this.value);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SearchFacetItemValue from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SearchFacetItemValue if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SearchFacetItemValue.
     */
    @Generated
    public static SearchFacetItemValue fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SearchFacetItemValue deserializedSearchFacetItemValue = new SearchFacetItemValue();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("count".equals(fieldName)) {
                    deserializedSearchFacetItemValue.count = reader.getNullable(JsonReader::getInt);
                } else if ("value".equals(fieldName)) {
                    deserializedSearchFacetItemValue.value = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSearchFacetItemValue;
        });
    }
}
