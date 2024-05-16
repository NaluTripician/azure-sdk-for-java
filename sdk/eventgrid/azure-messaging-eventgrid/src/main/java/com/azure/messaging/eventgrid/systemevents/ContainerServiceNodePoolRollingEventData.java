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

/**
 * Schema of common properties of node pool rolling events.
 */
@Fluent
public class ContainerServiceNodePoolRollingEventData
    implements JsonSerializable<ContainerServiceNodePoolRollingEventData> {
    /*
     * The name of the node pool in the ManagedCluster resource
     */
    private String nodePoolName;

    /**
     * Creates an instance of ContainerServiceNodePoolRollingEventData class.
     */
    public ContainerServiceNodePoolRollingEventData() {
    }

    /**
     * Get the nodePoolName property: The name of the node pool in the ManagedCluster resource.
     * 
     * @return the nodePoolName value.
     */
    public String getNodePoolName() {
        return this.nodePoolName;
    }

    /**
     * Set the nodePoolName property: The name of the node pool in the ManagedCluster resource.
     * 
     * @param nodePoolName the nodePoolName value to set.
     * @return the ContainerServiceNodePoolRollingEventData object itself.
     */
    public ContainerServiceNodePoolRollingEventData setNodePoolName(String nodePoolName) {
        this.nodePoolName = nodePoolName;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("nodePoolName", this.nodePoolName);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ContainerServiceNodePoolRollingEventData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ContainerServiceNodePoolRollingEventData if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ContainerServiceNodePoolRollingEventData.
     */
    public static ContainerServiceNodePoolRollingEventData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ContainerServiceNodePoolRollingEventData deserializedContainerServiceNodePoolRollingEventData
                = new ContainerServiceNodePoolRollingEventData();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("nodePoolName".equals(fieldName)) {
                    deserializedContainerServiceNodePoolRollingEventData.nodePoolName = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedContainerServiceNodePoolRollingEventData;
        });
    }
}
