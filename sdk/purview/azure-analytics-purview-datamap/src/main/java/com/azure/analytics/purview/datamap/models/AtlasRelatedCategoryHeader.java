// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.analytics.purview.datamap.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The header of the related category.
 */
@Fluent
public final class AtlasRelatedCategoryHeader implements JsonSerializable<AtlasRelatedCategoryHeader> {
    /*
     * The GUID of the category.
     */
    @Generated
    private String categoryGuid;

    /*
     * The description of the category header.
     */
    @Generated
    private String description;

    /*
     * The display text.
     */
    @Generated
    private String displayText;

    /*
     * The GUID of the parent category.
     */
    @Generated
    private String parentCategoryGuid;

    /*
     * The GUID of the relationship.
     */
    @Generated
    private String relationGuid;

    /**
     * Creates an instance of AtlasRelatedCategoryHeader class.
     */
    @Generated
    public AtlasRelatedCategoryHeader() {
    }

    /**
     * Get the categoryGuid property: The GUID of the category.
     * 
     * @return the categoryGuid value.
     */
    @Generated
    public String getCategoryGuid() {
        return this.categoryGuid;
    }

    /**
     * Set the categoryGuid property: The GUID of the category.
     * 
     * @param categoryGuid the categoryGuid value to set.
     * @return the AtlasRelatedCategoryHeader object itself.
     */
    @Generated
    public AtlasRelatedCategoryHeader setCategoryGuid(String categoryGuid) {
        this.categoryGuid = categoryGuid;
        return this;
    }

    /**
     * Get the description property: The description of the category header.
     * 
     * @return the description value.
     */
    @Generated
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: The description of the category header.
     * 
     * @param description the description value to set.
     * @return the AtlasRelatedCategoryHeader object itself.
     */
    @Generated
    public AtlasRelatedCategoryHeader setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the displayText property: The display text.
     * 
     * @return the displayText value.
     */
    @Generated
    public String getDisplayText() {
        return this.displayText;
    }

    /**
     * Set the displayText property: The display text.
     * 
     * @param displayText the displayText value to set.
     * @return the AtlasRelatedCategoryHeader object itself.
     */
    @Generated
    public AtlasRelatedCategoryHeader setDisplayText(String displayText) {
        this.displayText = displayText;
        return this;
    }

    /**
     * Get the parentCategoryGuid property: The GUID of the parent category.
     * 
     * @return the parentCategoryGuid value.
     */
    @Generated
    public String getParentCategoryGuid() {
        return this.parentCategoryGuid;
    }

    /**
     * Set the parentCategoryGuid property: The GUID of the parent category.
     * 
     * @param parentCategoryGuid the parentCategoryGuid value to set.
     * @return the AtlasRelatedCategoryHeader object itself.
     */
    @Generated
    public AtlasRelatedCategoryHeader setParentCategoryGuid(String parentCategoryGuid) {
        this.parentCategoryGuid = parentCategoryGuid;
        return this;
    }

    /**
     * Get the relationGuid property: The GUID of the relationship.
     * 
     * @return the relationGuid value.
     */
    @Generated
    public String getRelationGuid() {
        return this.relationGuid;
    }

    /**
     * Set the relationGuid property: The GUID of the relationship.
     * 
     * @param relationGuid the relationGuid value to set.
     * @return the AtlasRelatedCategoryHeader object itself.
     */
    @Generated
    public AtlasRelatedCategoryHeader setRelationGuid(String relationGuid) {
        this.relationGuid = relationGuid;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("categoryGuid", this.categoryGuid);
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeStringField("displayText", this.displayText);
        jsonWriter.writeStringField("parentCategoryGuid", this.parentCategoryGuid);
        jsonWriter.writeStringField("relationGuid", this.relationGuid);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AtlasRelatedCategoryHeader from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AtlasRelatedCategoryHeader if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AtlasRelatedCategoryHeader.
     */
    @Generated
    public static AtlasRelatedCategoryHeader fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AtlasRelatedCategoryHeader deserializedAtlasRelatedCategoryHeader = new AtlasRelatedCategoryHeader();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("categoryGuid".equals(fieldName)) {
                    deserializedAtlasRelatedCategoryHeader.categoryGuid = reader.getString();
                } else if ("description".equals(fieldName)) {
                    deserializedAtlasRelatedCategoryHeader.description = reader.getString();
                } else if ("displayText".equals(fieldName)) {
                    deserializedAtlasRelatedCategoryHeader.displayText = reader.getString();
                } else if ("parentCategoryGuid".equals(fieldName)) {
                    deserializedAtlasRelatedCategoryHeader.parentCategoryGuid = reader.getString();
                } else if ("relationGuid".equals(fieldName)) {
                    deserializedAtlasRelatedCategoryHeader.relationGuid = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAtlasRelatedCategoryHeader;
        });
    }
}
