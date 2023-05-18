// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The category of hardware validation to perform. */
public final class StorageApplianceHardwareValidationCategory
    extends ExpandableStringEnum<StorageApplianceHardwareValidationCategory> {
    /** Static value BasicValidation for StorageApplianceHardwareValidationCategory. */
    public static final StorageApplianceHardwareValidationCategory BASIC_VALIDATION = fromString("BasicValidation");

    /**
     * Creates a new instance of StorageApplianceHardwareValidationCategory value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public StorageApplianceHardwareValidationCategory() {
    }

    /**
     * Creates or finds a StorageApplianceHardwareValidationCategory from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding StorageApplianceHardwareValidationCategory.
     */
    @JsonCreator
    public static StorageApplianceHardwareValidationCategory fromString(String name) {
        return fromString(name, StorageApplianceHardwareValidationCategory.class);
    }

    /**
     * Gets known StorageApplianceHardwareValidationCategory values.
     *
     * @return known StorageApplianceHardwareValidationCategory values.
     */
    public static Collection<StorageApplianceHardwareValidationCategory> values() {
        return values(StorageApplianceHardwareValidationCategory.class);
    }
}
