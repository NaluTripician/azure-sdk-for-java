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
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Schema of the Data property of an EventGridEvent for a Microsoft.DataBox.CopyStarted event.
 */
@Fluent
public final class DataBoxCopyStartedEventData implements JsonSerializable<DataBoxCopyStartedEventData> {
    /*
     * Serial Number of the device associated with the event. The list is comma separated if more than one serial
     * number is associated.
     */
    private String serialNumber;

    /*
     * Name of the current Stage
     */
    private DataBoxStageName stageName;

    /*
     * The time at which the stage happened.
     */
    private OffsetDateTime stageTime;

    /**
     * Creates an instance of DataBoxCopyStartedEventData class.
     */
    public DataBoxCopyStartedEventData() {
    }

    /**
     * Get the serialNumber property: Serial Number of the device associated with the event. The list is comma
     * separated if more than one serial number is associated.
     * 
     * @return the serialNumber value.
     */
    public String getSerialNumber() {
        return this.serialNumber;
    }

    /**
     * Set the serialNumber property: Serial Number of the device associated with the event. The list is comma
     * separated if more than one serial number is associated.
     * 
     * @param serialNumber the serialNumber value to set.
     * @return the DataBoxCopyStartedEventData object itself.
     */
    public DataBoxCopyStartedEventData setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    /**
     * Get the stageName property: Name of the current Stage.
     * 
     * @return the stageName value.
     */
    public DataBoxStageName getStageName() {
        return this.stageName;
    }

    /**
     * Set the stageName property: Name of the current Stage.
     * 
     * @param stageName the stageName value to set.
     * @return the DataBoxCopyStartedEventData object itself.
     */
    public DataBoxCopyStartedEventData setStageName(DataBoxStageName stageName) {
        this.stageName = stageName;
        return this;
    }

    /**
     * Get the stageTime property: The time at which the stage happened.
     * 
     * @return the stageTime value.
     */
    public OffsetDateTime getStageTime() {
        return this.stageTime;
    }

    /**
     * Set the stageTime property: The time at which the stage happened.
     * 
     * @param stageTime the stageTime value to set.
     * @return the DataBoxCopyStartedEventData object itself.
     */
    public DataBoxCopyStartedEventData setStageTime(OffsetDateTime stageTime) {
        this.stageTime = stageTime;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("serialNumber", this.serialNumber);
        jsonWriter.writeStringField("stageName", this.stageName == null ? null : this.stageName.toString());
        jsonWriter.writeStringField("stageTime",
            this.stageTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.stageTime));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DataBoxCopyStartedEventData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DataBoxCopyStartedEventData if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DataBoxCopyStartedEventData.
     */
    public static DataBoxCopyStartedEventData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DataBoxCopyStartedEventData deserializedDataBoxCopyStartedEventData = new DataBoxCopyStartedEventData();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("serialNumber".equals(fieldName)) {
                    deserializedDataBoxCopyStartedEventData.serialNumber = reader.getString();
                } else if ("stageName".equals(fieldName)) {
                    deserializedDataBoxCopyStartedEventData.stageName = DataBoxStageName.fromString(reader.getString());
                } else if ("stageTime".equals(fieldName)) {
                    deserializedDataBoxCopyStartedEventData.stageTime
                        = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDataBoxCopyStartedEventData;
        });
    }
}
