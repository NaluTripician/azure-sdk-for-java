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

/**
 * Information used to connect to a CIFS file system.
 */
@Fluent
public final class CifsMountConfiguration implements JsonSerializable<CifsMountConfiguration> {

    /*
     * The user to use for authentication against the CIFS file system.
     */
    @Generated
    private final String username;

    /*
     * The URI of the file system to mount.
     */
    @Generated
    private final String source;

    /*
     * The relative path on the compute node where the file system will be mounted. All file systems are mounted relative to the Batch mounts directory, accessible via the AZ_BATCH_NODE_MOUNTS_DIR environment variable.
     */
    @Generated
    private final String relativeMountPath;

    /*
     * Additional command line options to pass to the mount command. These are 'net use' options in Windows and 'mount' options in Linux.
     */
    @Generated
    private String mountOptions;

    /*
     * The password to use for authentication against the CIFS file system.
     */
    @Generated
    private final String password;

    /**
     * Creates an instance of CifsMountConfiguration class.
     *
     * @param username the username value to set.
     * @param source the source value to set.
     * @param relativeMountPath the relativeMountPath value to set.
     * @param password the password value to set.
     */
    @Generated
    public CifsMountConfiguration(String username, String source, String relativeMountPath, String password) {
        this.username = username;
        this.source = source;
        this.relativeMountPath = relativeMountPath;
        this.password = password;
    }

    /**
     * Get the username property: The user to use for authentication against the CIFS file system.
     *
     * @return the username value.
     */
    @Generated
    public String getUsername() {
        return this.username;
    }

    /**
     * Get the source property: The URI of the file system to mount.
     *
     * @return the source value.
     */
    @Generated
    public String getSource() {
        return this.source;
    }

    /**
     * Get the relativeMountPath property: The relative path on the compute node where the file system will be mounted.
     * All file systems are mounted relative to the Batch mounts directory, accessible via the AZ_BATCH_NODE_MOUNTS_DIR
     * environment variable.
     *
     * @return the relativeMountPath value.
     */
    @Generated
    public String getRelativeMountPath() {
        return this.relativeMountPath;
    }

    /**
     * Get the mountOptions property: Additional command line options to pass to the mount command. These are 'net use'
     * options in Windows and 'mount' options in Linux.
     *
     * @return the mountOptions value.
     */
    @Generated
    public String getMountOptions() {
        return this.mountOptions;
    }

    /**
     * Set the mountOptions property: Additional command line options to pass to the mount command. These are 'net use'
     * options in Windows and 'mount' options in Linux.
     *
     * @param mountOptions the mountOptions value to set.
     * @return the CifsMountConfiguration object itself.
     */
    @Generated
    public CifsMountConfiguration setMountOptions(String mountOptions) {
        this.mountOptions = mountOptions;
        return this;
    }

    /**
     * Get the password property: The password to use for authentication against the CIFS file system.
     *
     * @return the password value.
     */
    @Generated
    public String getPassword() {
        return this.password;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("username", this.username);
        jsonWriter.writeStringField("source", this.source);
        jsonWriter.writeStringField("relativeMountPath", this.relativeMountPath);
        jsonWriter.writeStringField("password", this.password);
        jsonWriter.writeStringField("mountOptions", this.mountOptions);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CifsMountConfiguration from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of CifsMountConfiguration if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CifsMountConfiguration.
     */
    @Generated
    public static CifsMountConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String username = null;
            String source = null;
            String relativeMountPath = null;
            String password = null;
            String mountOptions = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("username".equals(fieldName)) {
                    username = reader.getString();
                } else if ("source".equals(fieldName)) {
                    source = reader.getString();
                } else if ("relativeMountPath".equals(fieldName)) {
                    relativeMountPath = reader.getString();
                } else if ("password".equals(fieldName)) {
                    password = reader.getString();
                } else if ("mountOptions".equals(fieldName)) {
                    mountOptions = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            CifsMountConfiguration deserializedCifsMountConfiguration
                = new CifsMountConfiguration(username, source, relativeMountPath, password);
            deserializedCifsMountConfiguration.mountOptions = mountOptions;
            return deserializedCifsMountConfiguration;
        });
    }
}
