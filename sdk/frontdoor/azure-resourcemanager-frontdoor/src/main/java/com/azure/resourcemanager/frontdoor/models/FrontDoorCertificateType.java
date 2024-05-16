// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines the type of the certificate used for secure connections to a frontendEndpoint.
 */
public final class FrontDoorCertificateType extends ExpandableStringEnum<FrontDoorCertificateType> {
    /**
     * Static value Dedicated for FrontDoorCertificateType.
     */
    public static final FrontDoorCertificateType DEDICATED = fromString("Dedicated");

    /**
     * Creates a new instance of FrontDoorCertificateType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public FrontDoorCertificateType() {
    }

    /**
     * Creates or finds a FrontDoorCertificateType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding FrontDoorCertificateType.
     */
    @JsonCreator
    public static FrontDoorCertificateType fromString(String name) {
        return fromString(name, FrontDoorCertificateType.class);
    }

    /**
     * Gets known FrontDoorCertificateType values.
     * 
     * @return known FrontDoorCertificateType values.
     */
    public static Collection<FrontDoorCertificateType> values() {
        return values(FrontDoorCertificateType.class);
    }
}
