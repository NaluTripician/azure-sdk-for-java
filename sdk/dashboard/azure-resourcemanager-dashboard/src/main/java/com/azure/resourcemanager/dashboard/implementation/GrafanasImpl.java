// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dashboard.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.dashboard.fluent.GrafanasClient;
import com.azure.resourcemanager.dashboard.fluent.models.EnterpriseDetailsInner;
import com.azure.resourcemanager.dashboard.fluent.models.GrafanaAvailablePluginListResponseInner;
import com.azure.resourcemanager.dashboard.fluent.models.ManagedGrafanaInner;
import com.azure.resourcemanager.dashboard.models.EnterpriseDetails;
import com.azure.resourcemanager.dashboard.models.GrafanaAvailablePluginListResponse;
import com.azure.resourcemanager.dashboard.models.Grafanas;
import com.azure.resourcemanager.dashboard.models.ManagedGrafana;

public final class GrafanasImpl implements Grafanas {
    private static final ClientLogger LOGGER = new ClientLogger(GrafanasImpl.class);

    private final GrafanasClient innerClient;

    private final com.azure.resourcemanager.dashboard.DashboardManager serviceManager;

    public GrafanasImpl(GrafanasClient innerClient,
        com.azure.resourcemanager.dashboard.DashboardManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ManagedGrafana> list() {
        PagedIterable<ManagedGrafanaInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new ManagedGrafanaImpl(inner1, this.manager()));
    }

    public PagedIterable<ManagedGrafana> list(Context context) {
        PagedIterable<ManagedGrafanaInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new ManagedGrafanaImpl(inner1, this.manager()));
    }

    public PagedIterable<ManagedGrafana> listByResourceGroup(String resourceGroupName) {
        PagedIterable<ManagedGrafanaInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new ManagedGrafanaImpl(inner1, this.manager()));
    }

    public PagedIterable<ManagedGrafana> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<ManagedGrafanaInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new ManagedGrafanaImpl(inner1, this.manager()));
    }

    public Response<ManagedGrafana> getByResourceGroupWithResponse(String resourceGroupName, String workspaceName,
        Context context) {
        Response<ManagedGrafanaInner> inner
            = this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, workspaceName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ManagedGrafanaImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ManagedGrafana getByResourceGroup(String resourceGroupName, String workspaceName) {
        ManagedGrafanaInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, workspaceName);
        if (inner != null) {
            return new ManagedGrafanaImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String workspaceName) {
        this.serviceClient().delete(resourceGroupName, workspaceName);
    }

    public void delete(String resourceGroupName, String workspaceName, Context context) {
        this.serviceClient().delete(resourceGroupName, workspaceName, context);
    }

    public Response<EnterpriseDetails> checkEnterpriseDetailsWithResponse(String resourceGroupName,
        String workspaceName, Context context) {
        Response<EnterpriseDetailsInner> inner
            = this.serviceClient().checkEnterpriseDetailsWithResponse(resourceGroupName, workspaceName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new EnterpriseDetailsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public EnterpriseDetails checkEnterpriseDetails(String resourceGroupName, String workspaceName) {
        EnterpriseDetailsInner inner = this.serviceClient().checkEnterpriseDetails(resourceGroupName, workspaceName);
        if (inner != null) {
            return new EnterpriseDetailsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<GrafanaAvailablePluginListResponse> fetchAvailablePluginsWithResponse(String resourceGroupName,
        String workspaceName, Context context) {
        Response<GrafanaAvailablePluginListResponseInner> inner
            = this.serviceClient().fetchAvailablePluginsWithResponse(resourceGroupName, workspaceName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new GrafanaAvailablePluginListResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public GrafanaAvailablePluginListResponse fetchAvailablePlugins(String resourceGroupName, String workspaceName) {
        GrafanaAvailablePluginListResponseInner inner
            = this.serviceClient().fetchAvailablePlugins(resourceGroupName, workspaceName);
        if (inner != null) {
            return new GrafanaAvailablePluginListResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ManagedGrafana getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "grafana");
        if (workspaceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'grafana'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, workspaceName, Context.NONE).getValue();
    }

    public Response<ManagedGrafana> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "grafana");
        if (workspaceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'grafana'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, workspaceName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "grafana");
        if (workspaceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'grafana'.", id)));
        }
        this.delete(resourceGroupName, workspaceName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "grafana");
        if (workspaceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'grafana'.", id)));
        }
        this.delete(resourceGroupName, workspaceName, context);
    }

    private GrafanasClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.dashboard.DashboardManager manager() {
        return this.serviceManager;
    }

    public ManagedGrafanaImpl define(String name) {
        return new ManagedGrafanaImpl(name, this.manager());
    }
}
