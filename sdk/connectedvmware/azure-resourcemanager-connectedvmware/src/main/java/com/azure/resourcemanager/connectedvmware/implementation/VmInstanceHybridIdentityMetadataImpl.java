// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.connectedvmware.fluent.models.VmInstanceHybridIdentityMetadataInner;
import com.azure.resourcemanager.connectedvmware.models.ProvisioningState;
import com.azure.resourcemanager.connectedvmware.models.VmInstanceHybridIdentityMetadata;

public final class VmInstanceHybridIdentityMetadataImpl implements VmInstanceHybridIdentityMetadata {
    private VmInstanceHybridIdentityMetadataInner innerObject;

    private final com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager serviceManager;

    VmInstanceHybridIdentityMetadataImpl(
        VmInstanceHybridIdentityMetadataInner innerObject,
        com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String resourceUid() {
        return this.innerModel().resourceUid();
    }

    public String publicKey() {
        return this.innerModel().publicKey();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public VmInstanceHybridIdentityMetadataInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager() {
        return this.serviceManager;
    }
}
