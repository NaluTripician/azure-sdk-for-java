// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Multi-instance Tasks are commonly used to support MPI Tasks. In the MPI case,
 * if any of the subtasks fail (for example due to exiting with a non-zero exit
 * code) the entire multi-instance Task fails. The multi-instance Task is then
 * terminated and retried, up to its retry limit.
 */
@Fluent
public final class MultiInstanceSettings implements JsonSerializable<MultiInstanceSettings> {

    /*
     * The number of Compute Nodes required by the Task. If omitted, the default is 1.
     */
    @Generated
    private Integer numberOfInstances;

    /*
     * The command line to run on all the Compute Nodes to enable them to coordinate when the primary runs the main Task command. A typical coordination command line launches a background service and verifies that the service is ready to process inter-node messages.
     */
    @Generated
    private final String coordinationCommandLine;

    /*
     * A list of files that the Batch service will download before running the coordination command line. The difference between common resource files and Task resource files is that common resource files are downloaded for all subtasks including the primary, whereas Task resource files are downloaded only for the primary. Also note that these resource files are not downloaded to the Task working directory, but instead are downloaded to the Task root directory (one directory above the working directory).  There is a maximum size for the list of resource files.  When the max size is exceeded, the request will fail and the response error code will be RequestEntityTooLarge. If this occurs, the collection of ResourceFiles must be reduced in size. This can be achieved using .zip files, Application Packages, or Docker Containers.
     */
    @Generated
    private List<ResourceFile> commonResourceFiles;

    /**
     * Creates an instance of MultiInstanceSettings class.
     *
     * @param coordinationCommandLine the coordinationCommandLine value to set.
     */
    @Generated
    public MultiInstanceSettings(String coordinationCommandLine) {
        this.coordinationCommandLine = coordinationCommandLine;
    }

    /**
     * Get the numberOfInstances property: The number of Compute Nodes required by the Task. If omitted, the default is
     * 1.
     *
     * @return the numberOfInstances value.
     */
    @Generated
    public Integer getNumberOfInstances() {
        return this.numberOfInstances;
    }

    /**
     * Set the numberOfInstances property: The number of Compute Nodes required by the Task. If omitted, the default is
     * 1.
     *
     * @param numberOfInstances the numberOfInstances value to set.
     * @return the MultiInstanceSettings object itself.
     */
    @Generated
    public MultiInstanceSettings setNumberOfInstances(Integer numberOfInstances) {
        this.numberOfInstances = numberOfInstances;
        return this;
    }

    /**
     * Get the coordinationCommandLine property: The command line to run on all the Compute Nodes to enable them to
     * coordinate when the primary runs the main Task command. A typical coordination command line launches a background
     * service and verifies that the service is ready to process inter-node messages.
     *
     * @return the coordinationCommandLine value.
     */
    @Generated
    public String getCoordinationCommandLine() {
        return this.coordinationCommandLine;
    }

    /**
     * Get the commonResourceFiles property: A list of files that the Batch service will download before running the
     * coordination command line. The difference between common resource files and Task resource files is that common
     * resource files are downloaded for all subtasks including the primary, whereas Task resource files are downloaded
     * only for the primary. Also note that these resource files are not downloaded to the Task working directory, but
     * instead are downloaded to the Task root directory (one directory above the working directory). There is a maximum
     * size for the list of resource files. When the max size is exceeded, the request will fail and the response error
     * code will be RequestEntityTooLarge. If this occurs, the collection of ResourceFiles must be reduced in size. This
     * can be achieved using .zip files, Application Packages, or Docker Containers.
     *
     * @return the commonResourceFiles value.
     */
    @Generated
    public List<ResourceFile> getCommonResourceFiles() {
        return this.commonResourceFiles;
    }

    /**
     * Set the commonResourceFiles property: A list of files that the Batch service will download before running the
     * coordination command line. The difference between common resource files and Task resource files is that common
     * resource files are downloaded for all subtasks including the primary, whereas Task resource files are downloaded
     * only for the primary. Also note that these resource files are not downloaded to the Task working directory, but
     * instead are downloaded to the Task root directory (one directory above the working directory). There is a maximum
     * size for the list of resource files. When the max size is exceeded, the request will fail and the response error
     * code will be RequestEntityTooLarge. If this occurs, the collection of ResourceFiles must be reduced in size. This
     * can be achieved using .zip files, Application Packages, or Docker Containers.
     *
     * @param commonResourceFiles the commonResourceFiles value to set.
     * @return the MultiInstanceSettings object itself.
     */
    @Generated
    public MultiInstanceSettings setCommonResourceFiles(List<ResourceFile> commonResourceFiles) {
        this.commonResourceFiles = commonResourceFiles;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("coordinationCommandLine", this.coordinationCommandLine);
        jsonWriter.writeNumberField("numberOfInstances", this.numberOfInstances);
        jsonWriter.writeArrayField("commonResourceFiles", this.commonResourceFiles,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MultiInstanceSettings from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of MultiInstanceSettings if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MultiInstanceSettings.
     */
    @Generated
    public static MultiInstanceSettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String coordinationCommandLine = null;
            Integer numberOfInstances = null;
            List<ResourceFile> commonResourceFiles = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("coordinationCommandLine".equals(fieldName)) {
                    coordinationCommandLine = reader.getString();
                } else if ("numberOfInstances".equals(fieldName)) {
                    numberOfInstances = reader.getNullable(JsonReader::getInt);
                } else if ("commonResourceFiles".equals(fieldName)) {
                    commonResourceFiles = reader.readArray(reader1 -> ResourceFile.fromJson(reader1));
                } else {
                    reader.skipChildren();
                }
            }
            MultiInstanceSettings deserializedMultiInstanceSettings
                = new MultiInstanceSettings(coordinationCommandLine);
            deserializedMultiInstanceSettings.numberOfInstances = numberOfInstances;
            deserializedMultiInstanceSettings.commonResourceFiles = commonResourceFiles;
            return deserializedMultiInstanceSettings;
        });
    }
}
