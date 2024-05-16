// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The state of the datastore provisioning. */
public final class DatastoreProvisioningState extends ExpandableStringEnum<DatastoreProvisioningState> {
    /** Static value Succeeded for DatastoreProvisioningState. */
    public static final DatastoreProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for DatastoreProvisioningState. */
    public static final DatastoreProvisioningState FAILED = fromString("Failed");

    /** Static value Cancelled for DatastoreProvisioningState. */
    public static final DatastoreProvisioningState CANCELLED = fromString("Cancelled");

    /** Static value Pending for DatastoreProvisioningState. */
    public static final DatastoreProvisioningState PENDING = fromString("Pending");

    /** Static value Creating for DatastoreProvisioningState. */
    public static final DatastoreProvisioningState CREATING = fromString("Creating");

    /** Static value Updating for DatastoreProvisioningState. */
    public static final DatastoreProvisioningState UPDATING = fromString("Updating");

    /** Static value Deleting for DatastoreProvisioningState. */
    public static final DatastoreProvisioningState DELETING = fromString("Deleting");

    /** Static value Canceled for DatastoreProvisioningState. */
    public static final DatastoreProvisioningState CANCELED = fromString("Canceled");

    /**
     * Creates a new instance of DatastoreProvisioningState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DatastoreProvisioningState() {
    }

    /**
     * Creates or finds a DatastoreProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DatastoreProvisioningState.
     */
    @JsonCreator
    public static DatastoreProvisioningState fromString(String name) {
        return fromString(name, DatastoreProvisioningState.class);
    }

    /**
     * Gets known DatastoreProvisioningState values.
     *
     * @return known DatastoreProvisioningState values.
     */
    public static Collection<DatastoreProvisioningState> values() {
        return values(DatastoreProvisioningState.class);
    }
}
