// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.VirtualEndpointResourceInner;
import com.azure.resourcemanager.postgresqlflexibleserver.models.VirtualEndpointResource;
import com.azure.resourcemanager.postgresqlflexibleserver.models.VirtualEndpointResourceForPatch;
import com.azure.resourcemanager.postgresqlflexibleserver.models.VirtualEndpointType;
import java.util.Collections;
import java.util.List;

public final class VirtualEndpointResourceImpl
    implements VirtualEndpointResource, VirtualEndpointResource.Definition, VirtualEndpointResource.Update {
    private VirtualEndpointResourceInner innerObject;

    private final com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager serviceManager;

    public VirtualEndpointType endpointType() {
        return this.innerModel().endpointType();
    }

    public List<String> members() {
        List<String> inner = this.innerModel().members();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> virtualEndpoints() {
        List<String> inner = this.innerModel().virtualEndpoints();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
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

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public VirtualEndpointResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serverName;

    private String virtualEndpointName;

    private VirtualEndpointResourceForPatch updateParameters;

    public VirtualEndpointResourceImpl withExistingFlexibleServer(String resourceGroupName, String serverName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        return this;
    }

    public VirtualEndpointResource create() {
        this.innerObject = serviceManager.serviceClient()
            .getVirtualEndpoints()
            .create(resourceGroupName, serverName, virtualEndpointName, this.innerModel(), Context.NONE);
        return this;
    }

    public VirtualEndpointResource create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getVirtualEndpoints()
            .create(resourceGroupName, serverName, virtualEndpointName, this.innerModel(), context);
        return this;
    }

    VirtualEndpointResourceImpl(String name,
        com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager serviceManager) {
        this.innerObject = new VirtualEndpointResourceInner();
        this.serviceManager = serviceManager;
        this.virtualEndpointName = name;
    }

    public VirtualEndpointResourceImpl update() {
        this.updateParameters = new VirtualEndpointResourceForPatch();
        return this;
    }

    public VirtualEndpointResource apply() {
        this.innerObject = serviceManager.serviceClient()
            .getVirtualEndpoints()
            .update(resourceGroupName, serverName, virtualEndpointName, updateParameters, Context.NONE);
        return this;
    }

    public VirtualEndpointResource apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getVirtualEndpoints()
            .update(resourceGroupName, serverName, virtualEndpointName, updateParameters, context);
        return this;
    }

    VirtualEndpointResourceImpl(VirtualEndpointResourceInner innerObject,
        com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serverName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "flexibleServers");
        this.virtualEndpointName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "virtualendpoints");
    }

    public VirtualEndpointResource refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getVirtualEndpoints()
            .getWithResponse(resourceGroupName, serverName, virtualEndpointName, Context.NONE)
            .getValue();
        return this;
    }

    public VirtualEndpointResource refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getVirtualEndpoints()
            .getWithResponse(resourceGroupName, serverName, virtualEndpointName, context)
            .getValue();
        return this;
    }

    public VirtualEndpointResourceImpl withEndpointType(VirtualEndpointType endpointType) {
        if (isInCreateMode()) {
            this.innerModel().withEndpointType(endpointType);
            return this;
        } else {
            this.updateParameters.withEndpointType(endpointType);
            return this;
        }
    }

    public VirtualEndpointResourceImpl withMembers(List<String> members) {
        if (isInCreateMode()) {
            this.innerModel().withMembers(members);
            return this;
        } else {
            this.updateParameters.withMembers(members);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
