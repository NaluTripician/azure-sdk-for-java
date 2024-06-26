// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.billing.fluent.InstructionsClient;
import com.azure.resourcemanager.billing.fluent.models.InstructionInner;
import com.azure.resourcemanager.billing.models.Instruction;
import com.azure.resourcemanager.billing.models.Instructions;

public final class InstructionsImpl implements Instructions {
    private static final ClientLogger LOGGER = new ClientLogger(InstructionsImpl.class);

    private final InstructionsClient innerClient;

    private final com.azure.resourcemanager.billing.BillingManager serviceManager;

    public InstructionsImpl(
        InstructionsClient innerClient, com.azure.resourcemanager.billing.BillingManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Instruction> listByBillingProfile(String billingAccountName, String billingProfileName) {
        PagedIterable<InstructionInner> inner =
            this.serviceClient().listByBillingProfile(billingAccountName, billingProfileName);
        return Utils.mapPage(inner, inner1 -> new InstructionImpl(inner1, this.manager()));
    }

    public PagedIterable<Instruction> listByBillingProfile(
        String billingAccountName, String billingProfileName, Context context) {
        PagedIterable<InstructionInner> inner =
            this.serviceClient().listByBillingProfile(billingAccountName, billingProfileName, context);
        return Utils.mapPage(inner, inner1 -> new InstructionImpl(inner1, this.manager()));
    }

    public Response<Instruction> getWithResponse(
        String billingAccountName, String billingProfileName, String instructionName, Context context) {
        Response<InstructionInner> inner =
            this.serviceClient().getWithResponse(billingAccountName, billingProfileName, instructionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new InstructionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Instruction get(String billingAccountName, String billingProfileName, String instructionName) {
        InstructionInner inner = this.serviceClient().get(billingAccountName, billingProfileName, instructionName);
        if (inner != null) {
            return new InstructionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Instruction> putWithResponse(
        String billingAccountName,
        String billingProfileName,
        String instructionName,
        InstructionInner parameters,
        Context context) {
        Response<InstructionInner> inner =
            this
                .serviceClient()
                .putWithResponse(billingAccountName, billingProfileName, instructionName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new InstructionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Instruction put(
        String billingAccountName, String billingProfileName, String instructionName, InstructionInner parameters) {
        InstructionInner inner =
            this.serviceClient().put(billingAccountName, billingProfileName, instructionName, parameters);
        if (inner != null) {
            return new InstructionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private InstructionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.billing.BillingManager manager() {
        return this.serviceManager;
    }
}
