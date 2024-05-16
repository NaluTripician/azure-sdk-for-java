// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appcontainers.fluent.BuildersClient;
import com.azure.resourcemanager.appcontainers.fluent.models.BuilderResourceInner;
import com.azure.resourcemanager.appcontainers.models.BuilderResource;
import com.azure.resourcemanager.appcontainers.models.Builders;

public final class BuildersImpl implements Builders {
    private static final ClientLogger LOGGER = new ClientLogger(BuildersImpl.class);

    private final BuildersClient innerClient;

    private final com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager;

    public BuildersImpl(BuildersClient innerClient,
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<BuilderResource> list() {
        PagedIterable<BuilderResourceInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new BuilderResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<BuilderResource> list(Context context) {
        PagedIterable<BuilderResourceInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new BuilderResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<BuilderResource> listByResourceGroup(String resourceGroupName) {
        PagedIterable<BuilderResourceInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new BuilderResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<BuilderResource> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<BuilderResourceInner> inner
            = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new BuilderResourceImpl(inner1, this.manager()));
    }

    public Response<BuilderResource> getByResourceGroupWithResponse(String resourceGroupName, String builderName,
        Context context) {
        Response<BuilderResourceInner> inner
            = this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, builderName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new BuilderResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public BuilderResource getByResourceGroup(String resourceGroupName, String builderName) {
        BuilderResourceInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, builderName);
        if (inner != null) {
            return new BuilderResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String builderName) {
        this.serviceClient().delete(resourceGroupName, builderName);
    }

    public void delete(String resourceGroupName, String builderName, Context context) {
        this.serviceClient().delete(resourceGroupName, builderName, context);
    }

    public BuilderResource getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String builderName = ResourceManagerUtils.getValueFromIdByName(id, "builders");
        if (builderName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'builders'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, builderName, Context.NONE).getValue();
    }

    public Response<BuilderResource> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String builderName = ResourceManagerUtils.getValueFromIdByName(id, "builders");
        if (builderName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'builders'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, builderName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String builderName = ResourceManagerUtils.getValueFromIdByName(id, "builders");
        if (builderName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'builders'.", id)));
        }
        this.delete(resourceGroupName, builderName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String builderName = ResourceManagerUtils.getValueFromIdByName(id, "builders");
        if (builderName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'builders'.", id)));
        }
        this.delete(resourceGroupName, builderName, context);
    }

    private BuildersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager() {
        return this.serviceManager;
    }

    public BuilderResourceImpl define(String name) {
        return new BuilderResourceImpl(name, this.manager());
    }
}
