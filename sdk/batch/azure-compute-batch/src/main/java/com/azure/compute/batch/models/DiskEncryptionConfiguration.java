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
 * The disk encryption configuration applied on compute nodes in the pool.
 * Disk encryption configuration is not supported on Linux pool created with
 * Azure Compute Gallery Image.
 */
@Fluent
public final class DiskEncryptionConfiguration implements JsonSerializable<DiskEncryptionConfiguration> {

    /*
     * The list of disk targets Batch Service will encrypt on the compute node. If omitted, no disks on the compute nodes in the pool will be encrypted. On Linux pool, only "TemporaryDisk" is supported; on Windows pool, "OsDisk" and "TemporaryDisk" must be specified.
     */
    @Generated
    private List<DiskEncryptionTarget> targets;

    /**
     * Creates an instance of DiskEncryptionConfiguration class.
     */
    @Generated
    public DiskEncryptionConfiguration() {
    }

    /**
     * Get the targets property: The list of disk targets Batch Service will encrypt on the compute node. If omitted, no
     * disks on the compute nodes in the pool will be encrypted. On Linux pool, only "TemporaryDisk" is supported; on
     * Windows pool, "OsDisk" and "TemporaryDisk" must be specified.
     *
     * @return the targets value.
     */
    @Generated
    public List<DiskEncryptionTarget> getTargets() {
        return this.targets;
    }

    /**
     * Set the targets property: The list of disk targets Batch Service will encrypt on the compute node. If omitted, no
     * disks on the compute nodes in the pool will be encrypted. On Linux pool, only "TemporaryDisk" is supported; on
     * Windows pool, "OsDisk" and "TemporaryDisk" must be specified.
     *
     * @param targets the targets value to set.
     * @return the DiskEncryptionConfiguration object itself.
     */
    @Generated
    public DiskEncryptionConfiguration setTargets(List<DiskEncryptionTarget> targets) {
        this.targets = targets;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("targets", this.targets,
            (writer, element) -> writer.writeString(element == null ? null : element.toString()));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DiskEncryptionConfiguration from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of DiskEncryptionConfiguration if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DiskEncryptionConfiguration.
     */
    @Generated
    public static DiskEncryptionConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DiskEncryptionConfiguration deserializedDiskEncryptionConfiguration = new DiskEncryptionConfiguration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("targets".equals(fieldName)) {
                    List<DiskEncryptionTarget> targets
                        = reader.readArray(reader1 -> DiskEncryptionTarget.fromString(reader1.getString()));
                    deserializedDiskEncryptionConfiguration.targets = targets;
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedDiskEncryptionConfiguration;
        });
    }
}
