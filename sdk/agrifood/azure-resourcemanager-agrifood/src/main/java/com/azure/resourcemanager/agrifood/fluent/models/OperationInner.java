// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.agrifood.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.agrifood.models.ActionType;
import com.azure.resourcemanager.agrifood.models.OperationDisplay;
import com.azure.resourcemanager.agrifood.models.Origin;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * REST API Operation
 *
 * <p>Details of a REST API operation, returned from the Resource Provider Operations API.
 */
@Fluent
public final class OperationInner {
    /*
     * The name of the operation, as per Resource-Based Access Control (RBAC). Examples:
     * "Microsoft.Compute/virtualMachines/write", "Microsoft.Compute/virtualMachines/capture/action"
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Whether the operation applies to data-plane. This is "true" for data-plane operations and "false" for
     * ARM/control-plane operations.
     */
    @JsonProperty(value = "isDataAction", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isDataAction;

    /*
     * Localized display information for this particular operation.
     */
    @JsonProperty(value = "display")
    private OperationDisplay display;

    /*
     * The intended executor of the operation; as in Resource Based Access Control (RBAC) and audit logs UX. Default
     * value is "user,system"
     */
    @JsonProperty(value = "origin", access = JsonProperty.Access.WRITE_ONLY)
    private Origin origin;

    /*
     * Enum. Indicates the action type. "Internal" refers to actions that are for internal only APIs.
     */
    @JsonProperty(value = "actionType", access = JsonProperty.Access.WRITE_ONLY)
    private ActionType actionType;

    /**
     * Get the name property: The name of the operation, as per Resource-Based Access Control (RBAC). Examples:
     * "Microsoft.Compute/virtualMachines/write", "Microsoft.Compute/virtualMachines/capture/action".
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the isDataAction property: Whether the operation applies to data-plane. This is "true" for data-plane
     * operations and "false" for ARM/control-plane operations.
     *
     * @return the isDataAction value.
     */
    public Boolean isDataAction() {
        return this.isDataAction;
    }

    /**
     * Get the display property: Localized display information for this particular operation.
     *
     * @return the display value.
     */
    public OperationDisplay display() {
        return this.display;
    }

    /**
     * Set the display property: Localized display information for this particular operation.
     *
     * @param display the display value to set.
     * @return the OperationInner object itself.
     */
    public OperationInner withDisplay(OperationDisplay display) {
        this.display = display;
        return this;
    }

    /**
     * Get the origin property: The intended executor of the operation; as in Resource Based Access Control (RBAC) and
     * audit logs UX. Default value is "user,system".
     *
     * @return the origin value.
     */
    public Origin origin() {
        return this.origin;
    }

    /**
     * Get the actionType property: Enum. Indicates the action type. "Internal" refers to actions that are for internal
     * only APIs.
     *
     * @return the actionType value.
     */
    public ActionType actionType() {
        return this.actionType;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (display() != null) {
            display().validate();
        }
    }
}
