// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.avs.fluent.models.WorkloadNetworkDnsServiceInner;
import com.azure.resourcemanager.avs.models.DnsServiceLogLevelEnum;
import com.azure.resourcemanager.avs.models.DnsServiceStatusEnum;
import com.azure.resourcemanager.avs.models.WorkloadNetworkDnsService;
import com.azure.resourcemanager.avs.models.WorkloadNetworkDnsServiceProvisioningState;
import java.util.Collections;
import java.util.List;

public final class WorkloadNetworkDnsServiceImpl
    implements WorkloadNetworkDnsService, WorkloadNetworkDnsService.Definition, WorkloadNetworkDnsService.Update {
    private WorkloadNetworkDnsServiceInner innerObject;

    private final com.azure.resourcemanager.avs.AvsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public String dnsServiceIp() {
        return this.innerModel().dnsServiceIp();
    }

    public String defaultDnsZone() {
        return this.innerModel().defaultDnsZone();
    }

    public List<String> fqdnZones() {
        List<String> inner = this.innerModel().fqdnZones();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public DnsServiceLogLevelEnum logLevel() {
        return this.innerModel().logLevel();
    }

    public DnsServiceStatusEnum status() {
        return this.innerModel().status();
    }

    public WorkloadNetworkDnsServiceProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public Long revision() {
        return this.innerModel().revision();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public WorkloadNetworkDnsServiceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.avs.AvsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String privateCloudName;

    private String dnsServiceId;

    public WorkloadNetworkDnsServiceImpl withExistingPrivateCloud(String resourceGroupName, String privateCloudName) {
        this.resourceGroupName = resourceGroupName;
        this.privateCloudName = privateCloudName;
        return this;
    }

    public WorkloadNetworkDnsService create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkloadNetworks()
                .createDnsService(resourceGroupName, privateCloudName, dnsServiceId, this.innerModel(), Context.NONE);
        return this;
    }

    public WorkloadNetworkDnsService create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkloadNetworks()
                .createDnsService(resourceGroupName, privateCloudName, dnsServiceId, this.innerModel(), context);
        return this;
    }

    WorkloadNetworkDnsServiceImpl(String name, com.azure.resourcemanager.avs.AvsManager serviceManager) {
        this.innerObject = new WorkloadNetworkDnsServiceInner();
        this.serviceManager = serviceManager;
        this.dnsServiceId = name;
    }

    public WorkloadNetworkDnsServiceImpl update() {
        return this;
    }

    public WorkloadNetworkDnsService apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkloadNetworks()
                .updateDnsService(resourceGroupName, privateCloudName, dnsServiceId, this.innerModel(), Context.NONE);
        return this;
    }

    public WorkloadNetworkDnsService apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkloadNetworks()
                .updateDnsService(resourceGroupName, privateCloudName, dnsServiceId, this.innerModel(), context);
        return this;
    }

    WorkloadNetworkDnsServiceImpl(
        WorkloadNetworkDnsServiceInner innerObject, com.azure.resourcemanager.avs.AvsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.privateCloudName = Utils.getValueFromIdByName(innerObject.id(), "privateClouds");
        this.dnsServiceId = Utils.getValueFromIdByName(innerObject.id(), "dnsServices");
    }

    public WorkloadNetworkDnsService refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkloadNetworks()
                .getDnsServiceWithResponse(resourceGroupName, privateCloudName, dnsServiceId, Context.NONE)
                .getValue();
        return this;
    }

    public WorkloadNetworkDnsService refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkloadNetworks()
                .getDnsServiceWithResponse(resourceGroupName, privateCloudName, dnsServiceId, context)
                .getValue();
        return this;
    }

    public WorkloadNetworkDnsServiceImpl withDisplayName(String displayName) {
        this.innerModel().withDisplayName(displayName);
        return this;
    }

    public WorkloadNetworkDnsServiceImpl withDnsServiceIp(String dnsServiceIp) {
        this.innerModel().withDnsServiceIp(dnsServiceIp);
        return this;
    }

    public WorkloadNetworkDnsServiceImpl withDefaultDnsZone(String defaultDnsZone) {
        this.innerModel().withDefaultDnsZone(defaultDnsZone);
        return this;
    }

    public WorkloadNetworkDnsServiceImpl withFqdnZones(List<String> fqdnZones) {
        this.innerModel().withFqdnZones(fqdnZones);
        return this;
    }

    public WorkloadNetworkDnsServiceImpl withLogLevel(DnsServiceLogLevelEnum logLevel) {
        this.innerModel().withLogLevel(logLevel);
        return this;
    }

    public WorkloadNetworkDnsServiceImpl withRevision(Long revision) {
        this.innerModel().withRevision(revision);
        return this;
    }
}
