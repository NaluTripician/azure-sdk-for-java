// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datadog.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datadog.fluent.SingleSignOnConfigurationsClient;
import com.azure.resourcemanager.datadog.fluent.models.DatadogSingleSignOnResourceInner;
import com.azure.resourcemanager.datadog.models.DatadogSingleSignOnResource;
import com.azure.resourcemanager.datadog.models.SingleSignOnConfigurations;

public final class SingleSignOnConfigurationsImpl implements SingleSignOnConfigurations {
    private static final ClientLogger LOGGER = new ClientLogger(SingleSignOnConfigurationsImpl.class);

    private final SingleSignOnConfigurationsClient innerClient;

    private final com.azure.resourcemanager.datadog.MicrosoftDatadogManager serviceManager;

    public SingleSignOnConfigurationsImpl(
        SingleSignOnConfigurationsClient innerClient,
        com.azure.resourcemanager.datadog.MicrosoftDatadogManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<DatadogSingleSignOnResource> list(String resourceGroupName, String monitorName) {
        PagedIterable<DatadogSingleSignOnResourceInner> inner =
            this.serviceClient().list(resourceGroupName, monitorName);
        return Utils.mapPage(inner, inner1 -> new DatadogSingleSignOnResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<DatadogSingleSignOnResource> list(
        String resourceGroupName, String monitorName, Context context) {
        PagedIterable<DatadogSingleSignOnResourceInner> inner =
            this.serviceClient().list(resourceGroupName, monitorName, context);
        return Utils.mapPage(inner, inner1 -> new DatadogSingleSignOnResourceImpl(inner1, this.manager()));
    }

    public Response<DatadogSingleSignOnResource> getWithResponse(
        String resourceGroupName, String monitorName, String configurationName, Context context) {
        Response<DatadogSingleSignOnResourceInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, monitorName, configurationName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DatadogSingleSignOnResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DatadogSingleSignOnResource get(String resourceGroupName, String monitorName, String configurationName) {
        DatadogSingleSignOnResourceInner inner =
            this.serviceClient().get(resourceGroupName, monitorName, configurationName);
        if (inner != null) {
            return new DatadogSingleSignOnResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public DatadogSingleSignOnResource getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String monitorName = Utils.getValueFromIdByName(id, "monitors");
        if (monitorName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'monitors'.", id)));
        }
        String configurationName = Utils.getValueFromIdByName(id, "singleSignOnConfigurations");
        if (configurationName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'singleSignOnConfigurations'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, monitorName, configurationName, Context.NONE).getValue();
    }

    public Response<DatadogSingleSignOnResource> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String monitorName = Utils.getValueFromIdByName(id, "monitors");
        if (monitorName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'monitors'.", id)));
        }
        String configurationName = Utils.getValueFromIdByName(id, "singleSignOnConfigurations");
        if (configurationName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'singleSignOnConfigurations'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, monitorName, configurationName, context);
    }

    private SingleSignOnConfigurationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.datadog.MicrosoftDatadogManager manager() {
        return this.serviceManager;
    }

    public DatadogSingleSignOnResourceImpl define(String name) {
        return new DatadogSingleSignOnResourceImpl(name, this.manager());
    }
}
