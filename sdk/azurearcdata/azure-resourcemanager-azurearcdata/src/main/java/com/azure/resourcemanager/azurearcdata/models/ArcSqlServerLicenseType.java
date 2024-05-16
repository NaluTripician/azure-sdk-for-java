// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurearcdata.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** SQL Server license type. */
public final class ArcSqlServerLicenseType extends ExpandableStringEnum<ArcSqlServerLicenseType> {
    /** Static value Paid for ArcSqlServerLicenseType. */
    public static final ArcSqlServerLicenseType PAID = fromString("Paid");

    /** Static value Free for ArcSqlServerLicenseType. */
    public static final ArcSqlServerLicenseType FREE = fromString("Free");

    /** Static value HADR for ArcSqlServerLicenseType. */
    public static final ArcSqlServerLicenseType HADR = fromString("HADR");

    /** Static value Undefined for ArcSqlServerLicenseType. */
    public static final ArcSqlServerLicenseType UNDEFINED = fromString("Undefined");

    /**
     * Creates a new instance of ArcSqlServerLicenseType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ArcSqlServerLicenseType() {
    }

    /**
     * Creates or finds a ArcSqlServerLicenseType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ArcSqlServerLicenseType.
     */
    @JsonCreator
    public static ArcSqlServerLicenseType fromString(String name) {
        return fromString(name, ArcSqlServerLicenseType.class);
    }

    /**
     * Gets known ArcSqlServerLicenseType values.
     *
     * @return known ArcSqlServerLicenseType values.
     */
    public static Collection<ArcSqlServerLicenseType> values() {
        return values(ArcSqlServerLicenseType.class);
    }
}
