// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Identifies the type of source operation.
 */
public final class ObjectType extends ExpandableStringEnum<ObjectType> {
    /**
     * Static value BackupAndExportResponse for ObjectType.
     */
    public static final ObjectType BACKUP_AND_EXPORT_RESPONSE = fromString("BackupAndExportResponse");

    /**
     * Static value ImportFromStorageResponse for ObjectType.
     */
    public static final ObjectType IMPORT_FROM_STORAGE_RESPONSE = fromString("ImportFromStorageResponse");

    /**
     * Creates a new instance of ObjectType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ObjectType() {
    }

    /**
     * Creates or finds a ObjectType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ObjectType.
     */
    @JsonCreator
    public static ObjectType fromString(String name) {
        return fromString(name, ObjectType.class);
    }

    /**
     * Gets known ObjectType values.
     * 
     * @return known ObjectType values.
     */
    public static Collection<ObjectType> values() {
        return values(ObjectType.class);
    }
}
