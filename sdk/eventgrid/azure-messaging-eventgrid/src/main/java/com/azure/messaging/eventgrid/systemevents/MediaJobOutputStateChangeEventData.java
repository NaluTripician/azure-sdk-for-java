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
import java.util.Map;

/**
 * Schema of the Data property of an EventGridEvent for a Microsoft.Media.JobOutputStateChange event.
 */
@Fluent
public class MediaJobOutputStateChangeEventData implements JsonSerializable<MediaJobOutputStateChangeEventData> {
    /*
     * The previous state of the Job.
     */
    private MediaJobState previousState;

    /*
     * Gets the output.
     */
    private MediaJobOutput output;

    /*
     * Gets the Job correlation data.
     */
    private Map<String, String> jobCorrelationData;

    /**
     * Creates an instance of MediaJobOutputStateChangeEventData class.
     */
    public MediaJobOutputStateChangeEventData() {
    }

    /**
     * Get the previousState property: The previous state of the Job.
     * 
     * @return the previousState value.
     */
    public MediaJobState getPreviousState() {
        return this.previousState;
    }

    /**
     * Set the previousState property: The previous state of the Job.
     * 
     * @param previousState the previousState value to set.
     * @return the MediaJobOutputStateChangeEventData object itself.
     */
    MediaJobOutputStateChangeEventData setPreviousState(MediaJobState previousState) {
        this.previousState = previousState;
        return this;
    }

    /**
     * Get the output property: Gets the output.
     * 
     * @return the output value.
     */
    public MediaJobOutput getOutput() {
        return this.output;
    }

    /**
     * Set the output property: Gets the output.
     * 
     * @param output the output value to set.
     * @return the MediaJobOutputStateChangeEventData object itself.
     */
    public MediaJobOutputStateChangeEventData setOutput(MediaJobOutput output) {
        this.output = output;
        return this;
    }

    /**
     * Get the jobCorrelationData property: Gets the Job correlation data.
     * 
     * @return the jobCorrelationData value.
     */
    public Map<String, String> getJobCorrelationData() {
        return this.jobCorrelationData;
    }

    /**
     * Set the jobCorrelationData property: Gets the Job correlation data.
     * 
     * @param jobCorrelationData the jobCorrelationData value to set.
     * @return the MediaJobOutputStateChangeEventData object itself.
     */
    public MediaJobOutputStateChangeEventData setJobCorrelationData(Map<String, String> jobCorrelationData) {
        this.jobCorrelationData = jobCorrelationData;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("output", this.output);
        jsonWriter.writeMapField("jobCorrelationData", this.jobCorrelationData,
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MediaJobOutputStateChangeEventData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MediaJobOutputStateChangeEventData if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MediaJobOutputStateChangeEventData.
     */
    public static MediaJobOutputStateChangeEventData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MediaJobOutputStateChangeEventData deserializedMediaJobOutputStateChangeEventData
                = new MediaJobOutputStateChangeEventData();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("previousState".equals(fieldName)) {
                    deserializedMediaJobOutputStateChangeEventData.previousState
                        = MediaJobState.fromString(reader.getString());
                } else if ("output".equals(fieldName)) {
                    deserializedMediaJobOutputStateChangeEventData.output = MediaJobOutput.fromJson(reader);
                } else if ("jobCorrelationData".equals(fieldName)) {
                    Map<String, String> jobCorrelationData = reader.readMap(reader1 -> reader1.getString());
                    deserializedMediaJobOutputStateChangeEventData.jobCorrelationData = jobCorrelationData;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMediaJobOutputStateChangeEventData;
        });
    }
}
