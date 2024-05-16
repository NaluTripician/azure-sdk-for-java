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
import java.util.List;
import java.util.Map;

/**
 * AtlasRelationshipDef is a TypeDef that defines a relationship.
 * As with other typeDefs the AtlasRelationshipDef has a name. Once created the
 * RelationshipDef has a guid.
 * The name and the guid are the 2 ways that the
 * RelationshipDef is identified.
 * RelationshipDefs have 2 ends, each of which
 * specify cardinality, an EntityDef type name and name and optionally
 * whether the
 * end is a container.
 * RelationshipDefs can have AttributeDefs - though only
 * primitive types are allowed.
 * RelationshipDefs have a relationshipCategory
 * specifying the UML type of relationship required
 * The way EntityDefs and
 * RelationshipDefs are intended to be used is that EntityDefs will define
 * AttributeDefs these AttributeDefs
 * will not specify an EntityDef type name as
 * their types.
 * RelationshipDefs introduce new attributes to the entity
 * instances. For example
 * EntityDef A might have attributes attr1,attr2,attr3
 * 
 * EntityDef B might have attributes attr4,attr5,attr6
 * RelationshipDef
 * AtoB might define 2 ends
 * 
 * end1: type A, name attr7
 * end2: type B, name attr8
 * 
 * When an instance of EntityDef A is created, it
 * will have attributes attr1,attr2,attr3,attr7
 * When an instance of EntityDef
 * B is created, it will have attributes attr4,attr5,attr6,attr8
 * 
 * In this way
 * relationshipDefs can be authored separately from entityDefs and can inject
 * relationship attributes into
 * the entity instances.
 */
@Fluent
public final class AtlasRelationshipDef implements JsonSerializable<AtlasRelationshipDef> {
    /*
     * The enum of type category.
     */
    @Generated
    private TypeCategory category;

    /*
     * The created time of the record.
     */
    @Generated
    private Long createTime;

    /*
     * The user who created the record.
     */
    @Generated
    private String createdBy;

    /*
     * The date format.
     */
    @Generated
    private DateFormat dateFormatter;

    /*
     * The description of the type definition.
     */
    @Generated
    private String description;

    /*
     * The GUID of the type definition.
     */
    @Generated
    private String guid;

    /*
     * The name of the type definition.
     */
    @Generated
    private String name;

    /*
     * The options for the type definition.
     */
    @Generated
    private Map<String, String> options;

    /*
     * The service type.
     */
    @Generated
    private String serviceType;

    /*
     * The version of the type.
     */
    @Generated
    private String typeVersion;

    /*
     * The update time of the record.
     */
    @Generated
    private Long updateTime;

    /*
     * The user who updated the record.
     */
    @Generated
    private String updatedBy;

    /*
     * The version of the record.
     */
    @Generated
    private Long version;

    /*
     * ETag for concurrency control.
     */
    @Generated
    private String lastModifiedTS;

    /*
     * An array of attribute definitions.
     */
    @Generated
    private List<AtlasAttributeDef> attributeDefs;

    /*
     * The relationshipEndDef represents an end of the relationship. The end of the
     * relationship is defined by a type, an
     * attribute name, cardinality and whether
     * it  is the container end of the relationship.
     */
    @Generated
    private AtlasRelationshipEndDef endDef1;

    /*
     * The relationshipEndDef represents an end of the relationship. The end of the
     * relationship is defined by a type, an
     * attribute name, cardinality and whether
     * it  is the container end of the relationship.
     */
    @Generated
    private AtlasRelationshipEndDef endDef2;

    /*
     * The Relationship category determines the style of relationship around
     * containment and lifecycle.
     * UML terminology is used for the values.
     * ASSOCIATION is a relationship with no containment. 
     * COMPOSITION and AGGREGATION are containment relationships.
     * The difference being in the lifecycles of the container and its children. 
     * In the COMPOSITION case, the children cannot exist without the container.
     * For AGGREGATION, the life cycles of the container and children are totally independent.
     */
    @Generated
    private RelationshipCategory relationshipCategory;

    /*
     * The label of the relationship.
     */
    @Generated
    private String relationshipLabel;

    /**
     * Creates an instance of AtlasRelationshipDef class.
     */
    @Generated
    public AtlasRelationshipDef() {
    }

    /**
     * Get the category property: The enum of type category.
     * 
     * @return the category value.
     */
    @Generated
    public TypeCategory getCategory() {
        return this.category;
    }

    /**
     * Set the category property: The enum of type category.
     * 
     * @param category the category value to set.
     * @return the AtlasRelationshipDef object itself.
     */
    @Generated
    public AtlasRelationshipDef setCategory(TypeCategory category) {
        this.category = category;
        return this;
    }

    /**
     * Get the createTime property: The created time of the record.
     * 
     * @return the createTime value.
     */
    @Generated
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * Set the createTime property: The created time of the record.
     * 
     * @param createTime the createTime value to set.
     * @return the AtlasRelationshipDef object itself.
     */
    @Generated
    public AtlasRelationshipDef setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * Get the createdBy property: The user who created the record.
     * 
     * @return the createdBy value.
     */
    @Generated
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Set the createdBy property: The user who created the record.
     * 
     * @param createdBy the createdBy value to set.
     * @return the AtlasRelationshipDef object itself.
     */
    @Generated
    public AtlasRelationshipDef setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Get the dateFormatter property: The date format.
     * 
     * @return the dateFormatter value.
     */
    @Generated
    public DateFormat getDateFormatter() {
        return this.dateFormatter;
    }

    /**
     * Set the dateFormatter property: The date format.
     * 
     * @param dateFormatter the dateFormatter value to set.
     * @return the AtlasRelationshipDef object itself.
     */
    @Generated
    public AtlasRelationshipDef setDateFormatter(DateFormat dateFormatter) {
        this.dateFormatter = dateFormatter;
        return this;
    }

    /**
     * Get the description property: The description of the type definition.
     * 
     * @return the description value.
     */
    @Generated
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: The description of the type definition.
     * 
     * @param description the description value to set.
     * @return the AtlasRelationshipDef object itself.
     */
    @Generated
    public AtlasRelationshipDef setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the guid property: The GUID of the type definition.
     * 
     * @return the guid value.
     */
    @Generated
    public String getGuid() {
        return this.guid;
    }

    /**
     * Set the guid property: The GUID of the type definition.
     * 
     * @param guid the guid value to set.
     * @return the AtlasRelationshipDef object itself.
     */
    @Generated
    public AtlasRelationshipDef setGuid(String guid) {
        this.guid = guid;
        return this;
    }

    /**
     * Get the name property: The name of the type definition.
     * 
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the type definition.
     * 
     * @param name the name value to set.
     * @return the AtlasRelationshipDef object itself.
     */
    @Generated
    public AtlasRelationshipDef setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the options property: The options for the type definition.
     * 
     * @return the options value.
     */
    @Generated
    public Map<String, String> getOptions() {
        return this.options;
    }

    /**
     * Set the options property: The options for the type definition.
     * 
     * @param options the options value to set.
     * @return the AtlasRelationshipDef object itself.
     */
    @Generated
    public AtlasRelationshipDef setOptions(Map<String, String> options) {
        this.options = options;
        return this;
    }

    /**
     * Get the serviceType property: The service type.
     * 
     * @return the serviceType value.
     */
    @Generated
    public String getServiceType() {
        return this.serviceType;
    }

    /**
     * Set the serviceType property: The service type.
     * 
     * @param serviceType the serviceType value to set.
     * @return the AtlasRelationshipDef object itself.
     */
    @Generated
    public AtlasRelationshipDef setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * Get the typeVersion property: The version of the type.
     * 
     * @return the typeVersion value.
     */
    @Generated
    public String getTypeVersion() {
        return this.typeVersion;
    }

    /**
     * Set the typeVersion property: The version of the type.
     * 
     * @param typeVersion the typeVersion value to set.
     * @return the AtlasRelationshipDef object itself.
     */
    @Generated
    public AtlasRelationshipDef setTypeVersion(String typeVersion) {
        this.typeVersion = typeVersion;
        return this;
    }

    /**
     * Get the updateTime property: The update time of the record.
     * 
     * @return the updateTime value.
     */
    @Generated
    public Long getUpdateTime() {
        return this.updateTime;
    }

    /**
     * Set the updateTime property: The update time of the record.
     * 
     * @param updateTime the updateTime value to set.
     * @return the AtlasRelationshipDef object itself.
     */
    @Generated
    public AtlasRelationshipDef setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * Get the updatedBy property: The user who updated the record.
     * 
     * @return the updatedBy value.
     */
    @Generated
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Set the updatedBy property: The user who updated the record.
     * 
     * @param updatedBy the updatedBy value to set.
     * @return the AtlasRelationshipDef object itself.
     */
    @Generated
    public AtlasRelationshipDef setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    /**
     * Get the version property: The version of the record.
     * 
     * @return the version value.
     */
    @Generated
    public Long getVersion() {
        return this.version;
    }

    /**
     * Set the version property: The version of the record.
     * 
     * @param version the version value to set.
     * @return the AtlasRelationshipDef object itself.
     */
    @Generated
    public AtlasRelationshipDef setVersion(Long version) {
        this.version = version;
        return this;
    }

    /**
     * Get the lastModifiedTS property: ETag for concurrency control.
     * 
     * @return the lastModifiedTS value.
     */
    @Generated
    public String getLastModifiedTS() {
        return this.lastModifiedTS;
    }

    /**
     * Set the lastModifiedTS property: ETag for concurrency control.
     * 
     * @param lastModifiedTS the lastModifiedTS value to set.
     * @return the AtlasRelationshipDef object itself.
     */
    @Generated
    public AtlasRelationshipDef setLastModifiedTS(String lastModifiedTS) {
        this.lastModifiedTS = lastModifiedTS;
        return this;
    }

    /**
     * Get the attributeDefs property: An array of attribute definitions.
     * 
     * @return the attributeDefs value.
     */
    @Generated
    public List<AtlasAttributeDef> getAttributeDefs() {
        return this.attributeDefs;
    }

    /**
     * Set the attributeDefs property: An array of attribute definitions.
     * 
     * @param attributeDefs the attributeDefs value to set.
     * @return the AtlasRelationshipDef object itself.
     */
    @Generated
    public AtlasRelationshipDef setAttributeDefs(List<AtlasAttributeDef> attributeDefs) {
        this.attributeDefs = attributeDefs;
        return this;
    }

    /**
     * Get the endDef1 property: The relationshipEndDef represents an end of the relationship. The end of the
     * relationship is defined by a type, an
     * attribute name, cardinality and whether
     * it is the container end of the relationship.
     * 
     * @return the endDef1 value.
     */
    @Generated
    public AtlasRelationshipEndDef getEndDef1() {
        return this.endDef1;
    }

    /**
     * Set the endDef1 property: The relationshipEndDef represents an end of the relationship. The end of the
     * relationship is defined by a type, an
     * attribute name, cardinality and whether
     * it is the container end of the relationship.
     * 
     * @param endDef1 the endDef1 value to set.
     * @return the AtlasRelationshipDef object itself.
     */
    @Generated
    public AtlasRelationshipDef setEndDef1(AtlasRelationshipEndDef endDef1) {
        this.endDef1 = endDef1;
        return this;
    }

    /**
     * Get the endDef2 property: The relationshipEndDef represents an end of the relationship. The end of the
     * relationship is defined by a type, an
     * attribute name, cardinality and whether
     * it is the container end of the relationship.
     * 
     * @return the endDef2 value.
     */
    @Generated
    public AtlasRelationshipEndDef getEndDef2() {
        return this.endDef2;
    }

    /**
     * Set the endDef2 property: The relationshipEndDef represents an end of the relationship. The end of the
     * relationship is defined by a type, an
     * attribute name, cardinality and whether
     * it is the container end of the relationship.
     * 
     * @param endDef2 the endDef2 value to set.
     * @return the AtlasRelationshipDef object itself.
     */
    @Generated
    public AtlasRelationshipDef setEndDef2(AtlasRelationshipEndDef endDef2) {
        this.endDef2 = endDef2;
        return this;
    }

    /**
     * Get the relationshipCategory property: The Relationship category determines the style of relationship around
     * containment and lifecycle.
     * UML terminology is used for the values.
     * ASSOCIATION is a relationship with no containment.
     * COMPOSITION and AGGREGATION are containment relationships.
     * The difference being in the lifecycles of the container and its children.
     * In the COMPOSITION case, the children cannot exist without the container.
     * For AGGREGATION, the life cycles of the container and children are totally independent.
     * 
     * @return the relationshipCategory value.
     */
    @Generated
    public RelationshipCategory getRelationshipCategory() {
        return this.relationshipCategory;
    }

    /**
     * Set the relationshipCategory property: The Relationship category determines the style of relationship around
     * containment and lifecycle.
     * UML terminology is used for the values.
     * ASSOCIATION is a relationship with no containment.
     * COMPOSITION and AGGREGATION are containment relationships.
     * The difference being in the lifecycles of the container and its children.
     * In the COMPOSITION case, the children cannot exist without the container.
     * For AGGREGATION, the life cycles of the container and children are totally independent.
     * 
     * @param relationshipCategory the relationshipCategory value to set.
     * @return the AtlasRelationshipDef object itself.
     */
    @Generated
    public AtlasRelationshipDef setRelationshipCategory(RelationshipCategory relationshipCategory) {
        this.relationshipCategory = relationshipCategory;
        return this;
    }

    /**
     * Get the relationshipLabel property: The label of the relationship.
     * 
     * @return the relationshipLabel value.
     */
    @Generated
    public String getRelationshipLabel() {
        return this.relationshipLabel;
    }

    /**
     * Set the relationshipLabel property: The label of the relationship.
     * 
     * @param relationshipLabel the relationshipLabel value to set.
     * @return the AtlasRelationshipDef object itself.
     */
    @Generated
    public AtlasRelationshipDef setRelationshipLabel(String relationshipLabel) {
        this.relationshipLabel = relationshipLabel;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("category", this.category == null ? null : this.category.toString());
        jsonWriter.writeNumberField("createTime", this.createTime);
        jsonWriter.writeStringField("createdBy", this.createdBy);
        jsonWriter.writeJsonField("dateFormatter", this.dateFormatter);
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeStringField("guid", this.guid);
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeMapField("options", this.options, (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("serviceType", this.serviceType);
        jsonWriter.writeStringField("typeVersion", this.typeVersion);
        jsonWriter.writeNumberField("updateTime", this.updateTime);
        jsonWriter.writeStringField("updatedBy", this.updatedBy);
        jsonWriter.writeNumberField("version", this.version);
        jsonWriter.writeStringField("lastModifiedTS", this.lastModifiedTS);
        jsonWriter.writeArrayField("attributeDefs", this.attributeDefs, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("endDef1", this.endDef1);
        jsonWriter.writeJsonField("endDef2", this.endDef2);
        jsonWriter.writeStringField("relationshipCategory",
            this.relationshipCategory == null ? null : this.relationshipCategory.toString());
        jsonWriter.writeStringField("relationshipLabel", this.relationshipLabel);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AtlasRelationshipDef from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AtlasRelationshipDef if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AtlasRelationshipDef.
     */
    @Generated
    public static AtlasRelationshipDef fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AtlasRelationshipDef deserializedAtlasRelationshipDef = new AtlasRelationshipDef();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("category".equals(fieldName)) {
                    deserializedAtlasRelationshipDef.category = TypeCategory.fromString(reader.getString());
                } else if ("createTime".equals(fieldName)) {
                    deserializedAtlasRelationshipDef.createTime = reader.getNullable(JsonReader::getLong);
                } else if ("createdBy".equals(fieldName)) {
                    deserializedAtlasRelationshipDef.createdBy = reader.getString();
                } else if ("dateFormatter".equals(fieldName)) {
                    deserializedAtlasRelationshipDef.dateFormatter = DateFormat.fromJson(reader);
                } else if ("description".equals(fieldName)) {
                    deserializedAtlasRelationshipDef.description = reader.getString();
                } else if ("guid".equals(fieldName)) {
                    deserializedAtlasRelationshipDef.guid = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedAtlasRelationshipDef.name = reader.getString();
                } else if ("options".equals(fieldName)) {
                    Map<String, String> options = reader.readMap(reader1 -> reader1.getString());
                    deserializedAtlasRelationshipDef.options = options;
                } else if ("serviceType".equals(fieldName)) {
                    deserializedAtlasRelationshipDef.serviceType = reader.getString();
                } else if ("typeVersion".equals(fieldName)) {
                    deserializedAtlasRelationshipDef.typeVersion = reader.getString();
                } else if ("updateTime".equals(fieldName)) {
                    deserializedAtlasRelationshipDef.updateTime = reader.getNullable(JsonReader::getLong);
                } else if ("updatedBy".equals(fieldName)) {
                    deserializedAtlasRelationshipDef.updatedBy = reader.getString();
                } else if ("version".equals(fieldName)) {
                    deserializedAtlasRelationshipDef.version = reader.getNullable(JsonReader::getLong);
                } else if ("lastModifiedTS".equals(fieldName)) {
                    deserializedAtlasRelationshipDef.lastModifiedTS = reader.getString();
                } else if ("attributeDefs".equals(fieldName)) {
                    List<AtlasAttributeDef> attributeDefs
                        = reader.readArray(reader1 -> AtlasAttributeDef.fromJson(reader1));
                    deserializedAtlasRelationshipDef.attributeDefs = attributeDefs;
                } else if ("endDef1".equals(fieldName)) {
                    deserializedAtlasRelationshipDef.endDef1 = AtlasRelationshipEndDef.fromJson(reader);
                } else if ("endDef2".equals(fieldName)) {
                    deserializedAtlasRelationshipDef.endDef2 = AtlasRelationshipEndDef.fromJson(reader);
                } else if ("relationshipCategory".equals(fieldName)) {
                    deserializedAtlasRelationshipDef.relationshipCategory
                        = RelationshipCategory.fromString(reader.getString());
                } else if ("relationshipLabel".equals(fieldName)) {
                    deserializedAtlasRelationshipDef.relationshipLabel = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAtlasRelationshipDef;
        });
    }
}
