// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Job output canceling event data. Schema of the data property of an EventGridEvent for a
 * Microsoft.Media.JobOutputCanceling event.
 */
@Fluent
public final class MediaJobOutputCancelingEventData extends MediaJobOutputStateChangeEventData {
    /**
     * Creates an instance of MediaJobOutputCancelingEventData class.
     */
    public MediaJobOutputCancelingEventData() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MediaJobOutputCancelingEventData setOutput(MediaJobOutput output) {
        super.setOutput(output);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MediaJobOutputCancelingEventData setJobCorrelationData(Map<String, String> jobCorrelationData) {
        super.setJobCorrelationData(jobCorrelationData);
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("output", getOutput());
        jsonWriter.writeMapField("jobCorrelationData", getJobCorrelationData(),
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MediaJobOutputCancelingEventData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MediaJobOutputCancelingEventData if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MediaJobOutputCancelingEventData.
     */
    public static MediaJobOutputCancelingEventData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MediaJobOutputCancelingEventData deserializedMediaJobOutputCancelingEventData
                = new MediaJobOutputCancelingEventData();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("previousState".equals(fieldName)) {
                    deserializedMediaJobOutputCancelingEventData
                        .setPreviousState(MediaJobState.fromString(reader.getString()));
                } else if ("output".equals(fieldName)) {
                    deserializedMediaJobOutputCancelingEventData.setOutput(MediaJobOutput.fromJson(reader));
                } else if ("jobCorrelationData".equals(fieldName)) {
                    Map<String, String> jobCorrelationData = reader.readMap(reader1 -> reader1.getString());
                    deserializedMediaJobOutputCancelingEventData.setJobCorrelationData(jobCorrelationData);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMediaJobOutputCancelingEventData;
        });
    }
}
