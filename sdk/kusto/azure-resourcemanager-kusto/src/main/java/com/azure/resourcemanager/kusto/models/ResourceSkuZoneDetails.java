// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes The zonal capabilities of a SKU. */
@Immutable
public final class ResourceSkuZoneDetails {
    /*
     * The set of zones that the SKU is available in with the specified capabilities.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> name;

    /*
     * A list of capabilities that are available for the SKU in the specified list of zones.
     */
    @JsonProperty(value = "capabilities", access = JsonProperty.Access.WRITE_ONLY)
    private List<ResourceSkuCapabilities> capabilities;

    /** Creates an instance of ResourceSkuZoneDetails class. */
    public ResourceSkuZoneDetails() {
    }

    /**
     * Get the name property: The set of zones that the SKU is available in with the specified capabilities.
     *
     * @return the name value.
     */
    public List<String> name() {
        return this.name;
    }

    /**
     * Get the capabilities property: A list of capabilities that are available for the SKU in the specified list of
     * zones.
     *
     * @return the capabilities value.
     */
    public List<ResourceSkuCapabilities> capabilities() {
        return this.capabilities;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (capabilities() != null) {
            capabilities().forEach(e -> e.validate());
        }
    }
}
