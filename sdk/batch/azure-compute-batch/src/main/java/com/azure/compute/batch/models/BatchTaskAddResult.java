// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Result for a single Task added as part of an add Task collection operation.
 */
@Immutable
public final class BatchTaskAddResult implements JsonSerializable<BatchTaskAddResult> {

    /*
     * The status of the add Task request.
     */
    @Generated
    private final BatchTaskAddStatus status;

    /*
     * The ID of the Task for which this is the result.
     */
    @Generated
    private final String taskId;

    /*
     * The ETag of the Task, if the Task was successfully added. You can use this to detect whether the Task has changed between requests. In particular, you can be pass the ETag with an Update Task request to specify that your changes should take effect only if nobody else has modified the Job in the meantime.
     */
    @Generated
    private String eTag;

    /*
     * The last modified time of the Task.
     */
    @Generated
    private OffsetDateTime lastModified;

    /*
     * The URL of the Task, if the Task was successfully added.
     */
    @Generated
    private String location;

    /*
     * The error encountered while attempting to add the Task.
     */
    @Generated
    private BatchError error;

    /**
     * Creates an instance of BatchTaskAddResult class.
     *
     * @param status the status value to set.
     * @param taskId the taskId value to set.
     */
    @Generated
    private BatchTaskAddResult(BatchTaskAddStatus status, String taskId) {
        this.status = status;
        this.taskId = taskId;
    }

    /**
     * Get the status property: The status of the add Task request.
     *
     * @return the status value.
     */
    @Generated
    public BatchTaskAddStatus getStatus() {
        return this.status;
    }

    /**
     * Get the taskId property: The ID of the Task for which this is the result.
     *
     * @return the taskId value.
     */
    @Generated
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * Get the eTag property: The ETag of the Task, if the Task was successfully added. You can use this to detect
     * whether the Task has changed between requests. In particular, you can be pass the ETag with an Update Task
     * request to specify that your changes should take effect only if nobody else has modified the Job in the meantime.
     *
     * @return the eTag value.
     */
    @Generated
    public String getETag() {
        return this.eTag;
    }

    /**
     * Get the lastModified property: The last modified time of the Task.
     *
     * @return the lastModified value.
     */
    @Generated
    public OffsetDateTime getLastModified() {
        return this.lastModified;
    }

    /**
     * Get the location property: The URL of the Task, if the Task was successfully added.
     *
     * @return the location value.
     */
    @Generated
    public String getLocation() {
        return this.location;
    }

    /**
     * Get the error property: The error encountered while attempting to add the Task.
     *
     * @return the error value.
     */
    @Generated
    public BatchError getError() {
        return this.error;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("status", this.status == null ? null : this.status.toString());
        jsonWriter.writeStringField("taskId", this.taskId);
        jsonWriter.writeStringField("eTag", this.eTag);
        jsonWriter.writeStringField("lastModified",
            this.lastModified == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.lastModified));
        jsonWriter.writeStringField("location", this.location);
        jsonWriter.writeJsonField("error", this.error);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BatchTaskAddResult from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of BatchTaskAddResult if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the BatchTaskAddResult.
     */
    @Generated
    public static BatchTaskAddResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BatchTaskAddStatus status = null;
            String taskId = null;
            String eTag = null;
            OffsetDateTime lastModified = null;
            String location = null;
            BatchError error = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("status".equals(fieldName)) {
                    status = BatchTaskAddStatus.fromString(reader.getString());
                } else if ("taskId".equals(fieldName)) {
                    taskId = reader.getString();
                } else if ("eTag".equals(fieldName)) {
                    eTag = reader.getString();
                } else if ("lastModified".equals(fieldName)) {
                    lastModified = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else if ("location".equals(fieldName)) {
                    location = reader.getString();
                } else if ("error".equals(fieldName)) {
                    error = BatchError.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            BatchTaskAddResult deserializedBatchTaskAddResult = new BatchTaskAddResult(status, taskId);
            deserializedBatchTaskAddResult.eTag = eTag;
            deserializedBatchTaskAddResult.lastModified = lastModified;
            deserializedBatchTaskAddResult.location = location;
            deserializedBatchTaskAddResult.error = error;
            return deserializedBatchTaskAddResult;
        });
    }
}
