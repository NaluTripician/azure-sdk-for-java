// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.PreValidateEnableBackupResponseInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.PreValidateEnableBackupResponse;
import com.azure.resourcemanager.recoveryservicesbackup.models.ValidationStatus;

public final class PreValidateEnableBackupResponseImpl implements PreValidateEnableBackupResponse {
    private PreValidateEnableBackupResponseInner innerObject;

    private final com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager;

    PreValidateEnableBackupResponseImpl(PreValidateEnableBackupResponseInner innerObject,
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public ValidationStatus status() {
        return this.innerModel().status();
    }

    public String errorCode() {
        return this.innerModel().errorCode();
    }

    public String errorMessage() {
        return this.innerModel().errorMessage();
    }

    public String recommendation() {
        return this.innerModel().recommendation();
    }

    public String containerName() {
        return this.innerModel().containerName();
    }

    public String protectedItemName() {
        return this.innerModel().protectedItemName();
    }

    public PreValidateEnableBackupResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager() {
        return this.serviceManager;
    }
}
