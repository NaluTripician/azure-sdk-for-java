// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.alertsmanagement.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Alert modification item. */
@Fluent
public final class AlertModificationItem {
    /*
     * Reason for the modification
     */
    @JsonProperty(value = "modificationEvent")
    private AlertModificationEvent modificationEvent;

    /*
     * Old value
     */
    @JsonProperty(value = "oldValue")
    private String oldValue;

    /*
     * New value
     */
    @JsonProperty(value = "newValue")
    private String newValue;

    /*
     * Modified date and time
     */
    @JsonProperty(value = "modifiedAt")
    private String modifiedAt;

    /*
     * Modified user details (Principal client name)
     */
    @JsonProperty(value = "modifiedBy")
    private String modifiedBy;

    /*
     * Modification comments
     */
    @JsonProperty(value = "comments")
    private String comments;

    /*
     * Description of the modification
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get the modificationEvent property: Reason for the modification.
     *
     * @return the modificationEvent value.
     */
    public AlertModificationEvent modificationEvent() {
        return this.modificationEvent;
    }

    /**
     * Set the modificationEvent property: Reason for the modification.
     *
     * @param modificationEvent the modificationEvent value to set.
     * @return the AlertModificationItem object itself.
     */
    public AlertModificationItem withModificationEvent(AlertModificationEvent modificationEvent) {
        this.modificationEvent = modificationEvent;
        return this;
    }

    /**
     * Get the oldValue property: Old value.
     *
     * @return the oldValue value.
     */
    public String oldValue() {
        return this.oldValue;
    }

    /**
     * Set the oldValue property: Old value.
     *
     * @param oldValue the oldValue value to set.
     * @return the AlertModificationItem object itself.
     */
    public AlertModificationItem withOldValue(String oldValue) {
        this.oldValue = oldValue;
        return this;
    }

    /**
     * Get the newValue property: New value.
     *
     * @return the newValue value.
     */
    public String newValue() {
        return this.newValue;
    }

    /**
     * Set the newValue property: New value.
     *
     * @param newValue the newValue value to set.
     * @return the AlertModificationItem object itself.
     */
    public AlertModificationItem withNewValue(String newValue) {
        this.newValue = newValue;
        return this;
    }

    /**
     * Get the modifiedAt property: Modified date and time.
     *
     * @return the modifiedAt value.
     */
    public String modifiedAt() {
        return this.modifiedAt;
    }

    /**
     * Set the modifiedAt property: Modified date and time.
     *
     * @param modifiedAt the modifiedAt value to set.
     * @return the AlertModificationItem object itself.
     */
    public AlertModificationItem withModifiedAt(String modifiedAt) {
        this.modifiedAt = modifiedAt;
        return this;
    }

    /**
     * Get the modifiedBy property: Modified user details (Principal client name).
     *
     * @return the modifiedBy value.
     */
    public String modifiedBy() {
        return this.modifiedBy;
    }

    /**
     * Set the modifiedBy property: Modified user details (Principal client name).
     *
     * @param modifiedBy the modifiedBy value to set.
     * @return the AlertModificationItem object itself.
     */
    public AlertModificationItem withModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    /**
     * Get the comments property: Modification comments.
     *
     * @return the comments value.
     */
    public String comments() {
        return this.comments;
    }

    /**
     * Set the comments property: Modification comments.
     *
     * @param comments the comments value to set.
     * @return the AlertModificationItem object itself.
     */
    public AlertModificationItem withComments(String comments) {
        this.comments = comments;
        return this;
    }

    /**
     * Get the description property: Description of the modification.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of the modification.
     *
     * @param description the description value to set.
     * @return the AlertModificationItem object itself.
     */
    public AlertModificationItem withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
