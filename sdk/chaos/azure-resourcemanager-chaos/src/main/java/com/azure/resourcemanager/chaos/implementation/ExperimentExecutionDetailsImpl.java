// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.implementation;

import com.azure.resourcemanager.chaos.fluent.models.ExperimentExecutionDetailsInner;
import com.azure.resourcemanager.chaos.models.ExperimentExecutionDetails;
import com.azure.resourcemanager.chaos.models.ExperimentExecutionDetailsPropertiesRunInformation;
import java.time.OffsetDateTime;

public final class ExperimentExecutionDetailsImpl implements ExperimentExecutionDetails {
    private ExperimentExecutionDetailsInner innerObject;

    private final com.azure.resourcemanager.chaos.ChaosManager serviceManager;

    ExperimentExecutionDetailsImpl(ExperimentExecutionDetailsInner innerObject,
        com.azure.resourcemanager.chaos.ChaosManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String type() {
        return this.innerModel().type();
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String failureReason() {
        return this.innerModel().failureReason();
    }

    public OffsetDateTime lastActionAt() {
        return this.innerModel().lastActionAt();
    }

    public ExperimentExecutionDetailsPropertiesRunInformation runInformation() {
        return this.innerModel().runInformation();
    }

    public String status() {
        return this.innerModel().status();
    }

    public OffsetDateTime startedAt() {
        return this.innerModel().startedAt();
    }

    public OffsetDateTime stoppedAt() {
        return this.innerModel().stoppedAt();
    }

    public ExperimentExecutionDetailsInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.chaos.ChaosManager manager() {
        return this.serviceManager;
    }
}
