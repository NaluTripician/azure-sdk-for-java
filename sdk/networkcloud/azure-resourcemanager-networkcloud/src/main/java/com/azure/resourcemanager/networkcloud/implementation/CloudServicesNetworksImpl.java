// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.networkcloud.fluent.CloudServicesNetworksClient;
import com.azure.resourcemanager.networkcloud.fluent.models.CloudServicesNetworkInner;
import com.azure.resourcemanager.networkcloud.models.CloudServicesNetwork;
import com.azure.resourcemanager.networkcloud.models.CloudServicesNetworks;

public final class CloudServicesNetworksImpl implements CloudServicesNetworks {
    private static final ClientLogger LOGGER = new ClientLogger(CloudServicesNetworksImpl.class);

    private final CloudServicesNetworksClient innerClient;

    private final com.azure.resourcemanager.networkcloud.NetworkCloudManager serviceManager;

    public CloudServicesNetworksImpl(
        CloudServicesNetworksClient innerClient,
        com.azure.resourcemanager.networkcloud.NetworkCloudManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<CloudServicesNetwork> list() {
        PagedIterable<CloudServicesNetworkInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new CloudServicesNetworkImpl(inner1, this.manager()));
    }

    public PagedIterable<CloudServicesNetwork> list(Context context) {
        PagedIterable<CloudServicesNetworkInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new CloudServicesNetworkImpl(inner1, this.manager()));
    }

    public PagedIterable<CloudServicesNetwork> listByResourceGroup(String resourceGroupName) {
        PagedIterable<CloudServicesNetworkInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new CloudServicesNetworkImpl(inner1, this.manager()));
    }

    public PagedIterable<CloudServicesNetwork> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<CloudServicesNetworkInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new CloudServicesNetworkImpl(inner1, this.manager()));
    }

    public Response<CloudServicesNetwork> getByResourceGroupWithResponse(
        String resourceGroupName, String cloudServicesNetworkName, Context context) {
        Response<CloudServicesNetworkInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, cloudServicesNetworkName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CloudServicesNetworkImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CloudServicesNetwork getByResourceGroup(String resourceGroupName, String cloudServicesNetworkName) {
        CloudServicesNetworkInner inner =
            this.serviceClient().getByResourceGroup(resourceGroupName, cloudServicesNetworkName);
        if (inner != null) {
            return new CloudServicesNetworkImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String cloudServicesNetworkName) {
        this.serviceClient().delete(resourceGroupName, cloudServicesNetworkName);
    }

    public void delete(String resourceGroupName, String cloudServicesNetworkName, Context context) {
        this.serviceClient().delete(resourceGroupName, cloudServicesNetworkName, context);
    }

    public CloudServicesNetwork getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String cloudServicesNetworkName = Utils.getValueFromIdByName(id, "cloudServicesNetworks");
        if (cloudServicesNetworkName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'cloudServicesNetworks'.",
                                id)));
        }
        return this
            .getByResourceGroupWithResponse(resourceGroupName, cloudServicesNetworkName, Context.NONE)
            .getValue();
    }

    public Response<CloudServicesNetwork> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String cloudServicesNetworkName = Utils.getValueFromIdByName(id, "cloudServicesNetworks");
        if (cloudServicesNetworkName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'cloudServicesNetworks'.",
                                id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, cloudServicesNetworkName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String cloudServicesNetworkName = Utils.getValueFromIdByName(id, "cloudServicesNetworks");
        if (cloudServicesNetworkName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'cloudServicesNetworks'.",
                                id)));
        }
        this.delete(resourceGroupName, cloudServicesNetworkName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String cloudServicesNetworkName = Utils.getValueFromIdByName(id, "cloudServicesNetworks");
        if (cloudServicesNetworkName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'cloudServicesNetworks'.",
                                id)));
        }
        this.delete(resourceGroupName, cloudServicesNetworkName, context);
    }

    private CloudServicesNetworksClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.networkcloud.NetworkCloudManager manager() {
        return this.serviceManager;
    }

    public CloudServicesNetworkImpl define(String name) {
        return new CloudServicesNetworkImpl(name, this.manager());
    }
}
