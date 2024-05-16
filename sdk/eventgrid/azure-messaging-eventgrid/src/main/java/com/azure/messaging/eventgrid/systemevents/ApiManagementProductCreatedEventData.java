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
 * Schema of the Data property of an EventGridEvent for a Microsoft.ApiManagement.ProductCreated event.
 */
@Fluent
public final class ApiManagementProductCreatedEventData
    implements JsonSerializable<ApiManagementProductCreatedEventData> {
    /*
     * The fully qualified ID of the resource that the compliance state change is for, including the resource name and
     * resource type. Uses the format,
     * `/subscriptions/<SubscriptionID>/resourceGroups/<ResourceGroup>/Microsoft.ApiManagement/service/<ServiceName>/<
     * ResourceType>/<ResourceName>`
     */
    private String resourceUri;

    /**
     * Creates an instance of ApiManagementProductCreatedEventData class.
     */
    public ApiManagementProductCreatedEventData() {
    }

    /**
     * Get the resourceUri property: The fully qualified ID of the resource that the compliance state change is for,
     * including the resource name and resource type. Uses the format,
     * `/subscriptions/&lt;SubscriptionID&gt;/resourceGroups/&lt;ResourceGroup&gt;/Microsoft.ApiManagement/service/&lt;ServiceName&gt;/&lt;ResourceType&gt;/&lt;ResourceName&gt;`.
     * 
     * @return the resourceUri value.
     */
    public String getResourceUri() {
        return this.resourceUri;
    }

    /**
     * Set the resourceUri property: The fully qualified ID of the resource that the compliance state change is for,
     * including the resource name and resource type. Uses the format,
     * `/subscriptions/&lt;SubscriptionID&gt;/resourceGroups/&lt;ResourceGroup&gt;/Microsoft.ApiManagement/service/&lt;ServiceName&gt;/&lt;ResourceType&gt;/&lt;ResourceName&gt;`.
     * 
     * @param resourceUri the resourceUri value to set.
     * @return the ApiManagementProductCreatedEventData object itself.
     */
    public ApiManagementProductCreatedEventData setResourceUri(String resourceUri) {
        this.resourceUri = resourceUri;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("resourceUri", this.resourceUri);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ApiManagementProductCreatedEventData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ApiManagementProductCreatedEventData if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ApiManagementProductCreatedEventData.
     */
    public static ApiManagementProductCreatedEventData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ApiManagementProductCreatedEventData deserializedApiManagementProductCreatedEventData
                = new ApiManagementProductCreatedEventData();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("resourceUri".equals(fieldName)) {
                    deserializedApiManagementProductCreatedEventData.resourceUri = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedApiManagementProductCreatedEventData;
        });
    }
}
