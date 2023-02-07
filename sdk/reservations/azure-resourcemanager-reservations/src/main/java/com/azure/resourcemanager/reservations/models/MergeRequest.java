// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.reservations.fluent.models.MergeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The request for reservation merge. */
@Fluent
public final class MergeRequest {
    /*
     * Properties for reservation merge
     */
    @JsonProperty(value = "properties")
    private MergeProperties innerProperties;

    /** Creates an instance of MergeRequest class. */
    public MergeRequest() {
    }

    /**
     * Get the innerProperties property: Properties for reservation merge.
     *
     * @return the innerProperties value.
     */
    private MergeProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the sources property: Format of the resource id should be
     * /providers/Microsoft.Capacity/reservationOrders/{reservationOrderId}/reservations/{reservationId}.
     *
     * @return the sources value.
     */
    public List<String> sources() {
        return this.innerProperties() == null ? null : this.innerProperties().sources();
    }

    /**
     * Set the sources property: Format of the resource id should be
     * /providers/Microsoft.Capacity/reservationOrders/{reservationOrderId}/reservations/{reservationId}.
     *
     * @param sources the sources value to set.
     * @return the MergeRequest object itself.
     */
    public MergeRequest withSources(List<String> sources) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MergeProperties();
        }
        this.innerProperties().withSources(sources);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
