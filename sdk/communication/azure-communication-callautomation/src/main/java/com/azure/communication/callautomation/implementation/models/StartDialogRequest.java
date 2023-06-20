// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The StartDialogRequest model. */
@Fluent
public final class StartDialogRequest {
    /*
     * Defines options for dialog.
     */
    @JsonProperty(value = "dialogOptions", required = true)
    private DialogOptions dialogOptions;

    /*
     * Determines the type of the dialog.
     */
    @JsonProperty(value = "dialogInputType", required = true)
    private DialogInputType dialogInputType;

    /*
     * The value to identify context of the operation.
     */
    @JsonProperty(value = "operationContext")
    private String operationContext;

    /**
     * Get the dialogOptions property: Defines options for dialog.
     *
     * @return the dialogOptions value.
     */
    public DialogOptions getDialogOptions() {
        return this.dialogOptions;
    }

    /**
     * Set the dialogOptions property: Defines options for dialog.
     *
     * @param dialogOptions the dialogOptions value to set.
     * @return the StartDialogRequest object itself.
     */
    public StartDialogRequest setDialogOptions(DialogOptions dialogOptions) {
        this.dialogOptions = dialogOptions;
        return this;
    }

    /**
     * Get the dialogInputType property: Determines the type of the dialog.
     *
     * @return the dialogInputType value.
     */
    public DialogInputType getDialogInputType() {
        return this.dialogInputType;
    }

    /**
     * Set the dialogInputType property: Determines the type of the dialog.
     *
     * @param dialogInputType the dialogInputType value to set.
     * @return the StartDialogRequest object itself.
     */
    public StartDialogRequest setDialogInputType(DialogInputType dialogInputType) {
        this.dialogInputType = dialogInputType;
        return this;
    }

    /**
     * Get the operationContext property: The value to identify context of the operation.
     *
     * @return the operationContext value.
     */
    public String getOperationContext() {
        return this.operationContext;
    }

    /**
     * Set the operationContext property: The value to identify context of the operation.
     *
     * @param operationContext the operationContext value to set.
     * @return the StartDialogRequest object itself.
     */
    public StartDialogRequest setOperationContext(String operationContext) {
        this.operationContext = operationContext;
        return this;
    }
}
