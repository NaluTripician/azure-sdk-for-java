// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.eventgrid.fluent.models.PartnerNamespaceInner;
import com.azure.resourcemanager.eventgrid.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.eventgrid.models.InboundIpRule;
import com.azure.resourcemanager.eventgrid.models.PartnerNamespace;
import com.azure.resourcemanager.eventgrid.models.PartnerNamespaceProvisioningState;
import com.azure.resourcemanager.eventgrid.models.PartnerNamespaceRegenerateKeyRequest;
import com.azure.resourcemanager.eventgrid.models.PartnerNamespaceSharedAccessKeys;
import com.azure.resourcemanager.eventgrid.models.PartnerNamespaceUpdateParameters;
import com.azure.resourcemanager.eventgrid.models.PartnerTopicRoutingMode;
import com.azure.resourcemanager.eventgrid.models.PrivateEndpointConnection;
import com.azure.resourcemanager.eventgrid.models.PublicNetworkAccess;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class PartnerNamespaceImpl
    implements PartnerNamespace, PartnerNamespace.Definition, PartnerNamespace.Update {
    private PartnerNamespaceInner innerObject;

    private final com.azure.resourcemanager.eventgrid.EventGridManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public List<PrivateEndpointConnection> privateEndpointConnections() {
        List<PrivateEndpointConnectionInner> inner = this.innerModel().privateEndpointConnections();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new PrivateEndpointConnectionImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public PartnerNamespaceProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String partnerRegistrationFullyQualifiedId() {
        return this.innerModel().partnerRegistrationFullyQualifiedId();
    }

    public String endpoint() {
        return this.innerModel().endpoint();
    }

    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerModel().publicNetworkAccess();
    }

    public List<InboundIpRule> inboundIpRules() {
        List<InboundIpRule> inner = this.innerModel().inboundIpRules();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Boolean disableLocalAuth() {
        return this.innerModel().disableLocalAuth();
    }

    public PartnerTopicRoutingMode partnerTopicRoutingMode() {
        return this.innerModel().partnerTopicRoutingMode();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public PartnerNamespaceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.eventgrid.EventGridManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String partnerNamespaceName;

    private PartnerNamespaceUpdateParameters updatePartnerNamespaceUpdateParameters;

    public PartnerNamespaceImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public PartnerNamespace create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPartnerNamespaces()
                .createOrUpdate(resourceGroupName, partnerNamespaceName, this.innerModel(), Context.NONE);
        return this;
    }

    public PartnerNamespace create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPartnerNamespaces()
                .createOrUpdate(resourceGroupName, partnerNamespaceName, this.innerModel(), context);
        return this;
    }

    PartnerNamespaceImpl(String name, com.azure.resourcemanager.eventgrid.EventGridManager serviceManager) {
        this.innerObject = new PartnerNamespaceInner();
        this.serviceManager = serviceManager;
        this.partnerNamespaceName = name;
    }

    public PartnerNamespaceImpl update() {
        this.updatePartnerNamespaceUpdateParameters = new PartnerNamespaceUpdateParameters();
        return this;
    }

    public PartnerNamespace apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPartnerNamespaces()
                .update(resourceGroupName, partnerNamespaceName, updatePartnerNamespaceUpdateParameters, Context.NONE);
        return this;
    }

    public PartnerNamespace apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPartnerNamespaces()
                .update(resourceGroupName, partnerNamespaceName, updatePartnerNamespaceUpdateParameters, context);
        return this;
    }

    PartnerNamespaceImpl(
        PartnerNamespaceInner innerObject, com.azure.resourcemanager.eventgrid.EventGridManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.partnerNamespaceName = Utils.getValueFromIdByName(innerObject.id(), "partnerNamespaces");
    }

    public PartnerNamespace refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPartnerNamespaces()
                .getByResourceGroupWithResponse(resourceGroupName, partnerNamespaceName, Context.NONE)
                .getValue();
        return this;
    }

    public PartnerNamespace refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPartnerNamespaces()
                .getByResourceGroupWithResponse(resourceGroupName, partnerNamespaceName, context)
                .getValue();
        return this;
    }

    public PartnerNamespaceSharedAccessKeys listSharedAccessKeys() {
        return serviceManager.partnerNamespaces().listSharedAccessKeys(resourceGroupName, partnerNamespaceName);
    }

    public Response<PartnerNamespaceSharedAccessKeys> listSharedAccessKeysWithResponse(Context context) {
        return serviceManager
            .partnerNamespaces()
            .listSharedAccessKeysWithResponse(resourceGroupName, partnerNamespaceName, context);
    }

    public PartnerNamespaceSharedAccessKeys regenerateKey(PartnerNamespaceRegenerateKeyRequest regenerateKeyRequest) {
        return serviceManager
            .partnerNamespaces()
            .regenerateKey(resourceGroupName, partnerNamespaceName, regenerateKeyRequest);
    }

    public Response<PartnerNamespaceSharedAccessKeys> regenerateKeyWithResponse(
        PartnerNamespaceRegenerateKeyRequest regenerateKeyRequest, Context context) {
        return serviceManager
            .partnerNamespaces()
            .regenerateKeyWithResponse(resourceGroupName, partnerNamespaceName, regenerateKeyRequest, context);
    }

    public PartnerNamespaceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public PartnerNamespaceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public PartnerNamespaceImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updatePartnerNamespaceUpdateParameters.withTags(tags);
            return this;
        }
    }

    public PartnerNamespaceImpl withPartnerRegistrationFullyQualifiedId(String partnerRegistrationFullyQualifiedId) {
        this.innerModel().withPartnerRegistrationFullyQualifiedId(partnerRegistrationFullyQualifiedId);
        return this;
    }

    public PartnerNamespaceImpl withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        if (isInCreateMode()) {
            this.innerModel().withPublicNetworkAccess(publicNetworkAccess);
            return this;
        } else {
            this.updatePartnerNamespaceUpdateParameters.withPublicNetworkAccess(publicNetworkAccess);
            return this;
        }
    }

    public PartnerNamespaceImpl withInboundIpRules(List<InboundIpRule> inboundIpRules) {
        if (isInCreateMode()) {
            this.innerModel().withInboundIpRules(inboundIpRules);
            return this;
        } else {
            this.updatePartnerNamespaceUpdateParameters.withInboundIpRules(inboundIpRules);
            return this;
        }
    }

    public PartnerNamespaceImpl withDisableLocalAuth(Boolean disableLocalAuth) {
        if (isInCreateMode()) {
            this.innerModel().withDisableLocalAuth(disableLocalAuth);
            return this;
        } else {
            this.updatePartnerNamespaceUpdateParameters.withDisableLocalAuth(disableLocalAuth);
            return this;
        }
    }

    public PartnerNamespaceImpl withPartnerTopicRoutingMode(PartnerTopicRoutingMode partnerTopicRoutingMode) {
        this.innerModel().withPartnerTopicRoutingMode(partnerTopicRoutingMode);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
