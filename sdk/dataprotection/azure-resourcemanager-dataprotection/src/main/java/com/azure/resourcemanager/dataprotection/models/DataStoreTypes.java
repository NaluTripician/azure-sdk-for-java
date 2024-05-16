// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * type of datastore; Operational/Vault/Archive.
 */
public final class DataStoreTypes extends ExpandableStringEnum<DataStoreTypes> {
    /**
     * Static value OperationalStore for DataStoreTypes.
     */
    public static final DataStoreTypes OPERATIONAL_STORE = fromString("OperationalStore");

    /**
     * Static value VaultStore for DataStoreTypes.
     */
    public static final DataStoreTypes VAULT_STORE = fromString("VaultStore");

    /**
     * Static value ArchiveStore for DataStoreTypes.
     */
    public static final DataStoreTypes ARCHIVE_STORE = fromString("ArchiveStore");

    /**
     * Creates a new instance of DataStoreTypes value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DataStoreTypes() {
    }

    /**
     * Creates or finds a DataStoreTypes from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DataStoreTypes.
     */
    @JsonCreator
    public static DataStoreTypes fromString(String name) {
        return fromString(name, DataStoreTypes.class);
    }

    /**
     * Gets known DataStoreTypes values.
     * 
     * @return known DataStoreTypes values.
     */
    public static Collection<DataStoreTypes> values() {
        return values(DataStoreTypes.class);
    }
}
