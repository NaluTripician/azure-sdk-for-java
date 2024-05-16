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

/**
 * Information about the Compute Node on which a Task ran.
 */
@Immutable
public final class BatchNodeInfo implements JsonSerializable<BatchNodeInfo> {

    /*
     * An identifier for the Node on which the Task ran, which can be passed when adding a Task to request that the Task be scheduled on this Compute Node.
     */
    @Generated
    private String affinityId;

    /*
     * The URL of the Compute Node on which the Task ran.
     */
    @Generated
    private String nodeUrl;

    /*
     * The ID of the Pool on which the Task ran.
     */
    @Generated
    private String poolId;

    /*
     * The ID of the Compute Node on which the Task ran.
     */
    @Generated
    private String nodeId;

    /*
     * The root directory of the Task on the Compute Node.
     */
    @Generated
    private String taskRootDirectory;

    /*
     * The URL to the root directory of the Task on the Compute Node.
     */
    @Generated
    private String taskRootDirectoryUrl;

    /**
     * Creates an instance of BatchNodeInfo class.
     */
    @Generated
    private BatchNodeInfo() {
    }

    /**
     * Get the affinityId property: An identifier for the Node on which the Task ran, which can be passed when adding a
     * Task to request that the Task be scheduled on this Compute Node.
     *
     * @return the affinityId value.
     */
    @Generated
    public String getAffinityId() {
        return this.affinityId;
    }

    /**
     * Get the nodeUrl property: The URL of the Compute Node on which the Task ran.
     *
     * @return the nodeUrl value.
     */
    @Generated
    public String getNodeUrl() {
        return this.nodeUrl;
    }

    /**
     * Get the poolId property: The ID of the Pool on which the Task ran.
     *
     * @return the poolId value.
     */
    @Generated
    public String getPoolId() {
        return this.poolId;
    }

    /**
     * Get the nodeId property: The ID of the Compute Node on which the Task ran.
     *
     * @return the nodeId value.
     */
    @Generated
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * Get the taskRootDirectory property: The root directory of the Task on the Compute Node.
     *
     * @return the taskRootDirectory value.
     */
    @Generated
    public String getTaskRootDirectory() {
        return this.taskRootDirectory;
    }

    /**
     * Get the taskRootDirectoryUrl property: The URL to the root directory of the Task on the Compute Node.
     *
     * @return the taskRootDirectoryUrl value.
     */
    @Generated
    public String getTaskRootDirectoryUrl() {
        return this.taskRootDirectoryUrl;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("affinityId", this.affinityId);
        jsonWriter.writeStringField("nodeUrl", this.nodeUrl);
        jsonWriter.writeStringField("poolId", this.poolId);
        jsonWriter.writeStringField("nodeId", this.nodeId);
        jsonWriter.writeStringField("taskRootDirectory", this.taskRootDirectory);
        jsonWriter.writeStringField("taskRootDirectoryUrl", this.taskRootDirectoryUrl);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BatchNodeInfo from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of BatchNodeInfo if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the BatchNodeInfo.
     */
    @Generated
    public static BatchNodeInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BatchNodeInfo deserializedBatchNodeInfo = new BatchNodeInfo();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("affinityId".equals(fieldName)) {
                    deserializedBatchNodeInfo.affinityId = reader.getString();
                } else if ("nodeUrl".equals(fieldName)) {
                    deserializedBatchNodeInfo.nodeUrl = reader.getString();
                } else if ("poolId".equals(fieldName)) {
                    deserializedBatchNodeInfo.poolId = reader.getString();
                } else if ("nodeId".equals(fieldName)) {
                    deserializedBatchNodeInfo.nodeId = reader.getString();
                } else if ("taskRootDirectory".equals(fieldName)) {
                    deserializedBatchNodeInfo.taskRootDirectory = reader.getString();
                } else if ("taskRootDirectoryUrl".equals(fieldName)) {
                    deserializedBatchNodeInfo.taskRootDirectoryUrl = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedBatchNodeInfo;
        });
    }
}
