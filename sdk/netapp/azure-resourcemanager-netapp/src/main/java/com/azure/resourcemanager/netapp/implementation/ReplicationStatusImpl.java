// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.implementation;

import com.azure.resourcemanager.netapp.fluent.models.ReplicationStatusInner;
import com.azure.resourcemanager.netapp.models.MirrorState;
import com.azure.resourcemanager.netapp.models.RelationshipStatus;
import com.azure.resourcemanager.netapp.models.ReplicationStatus;

public final class ReplicationStatusImpl implements ReplicationStatus {
    private ReplicationStatusInner innerObject;

    private final com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager;

    ReplicationStatusImpl(ReplicationStatusInner innerObject,
        com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Boolean healthy() {
        return this.innerModel().healthy();
    }

    public RelationshipStatus relationshipStatus() {
        return this.innerModel().relationshipStatus();
    }

    public MirrorState mirrorState() {
        return this.innerModel().mirrorState();
    }

    public String totalProgress() {
        return this.innerModel().totalProgress();
    }

    public String errorMessage() {
        return this.innerModel().errorMessage();
    }

    public ReplicationStatusInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.netapp.NetAppFilesManager manager() {
        return this.serviceManager;
    }
}
