// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.alertsmanagement.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.alertsmanagement.fluent.AlertProcessingRulesClient;
import com.azure.resourcemanager.alertsmanagement.fluent.models.AlertProcessingRuleInner;
import com.azure.resourcemanager.alertsmanagement.models.AlertProcessingRule;
import com.azure.resourcemanager.alertsmanagement.models.AlertProcessingRules;
import com.azure.resourcemanager.alertsmanagement.models.AlertProcessingRulesDeleteResponse;
import com.azure.resourcemanager.alertsmanagement.models.AlertProcessingRulesGetByResourceGroupResponse;

public final class AlertProcessingRulesImpl implements AlertProcessingRules {
    private static final ClientLogger LOGGER = new ClientLogger(AlertProcessingRulesImpl.class);

    private final AlertProcessingRulesClient innerClient;

    private final com.azure.resourcemanager.alertsmanagement.AlertsManagementManager serviceManager;

    public AlertProcessingRulesImpl(
        AlertProcessingRulesClient innerClient,
        com.azure.resourcemanager.alertsmanagement.AlertsManagementManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<AlertProcessingRule> list() {
        PagedIterable<AlertProcessingRuleInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new AlertProcessingRuleImpl(inner1, this.manager()));
    }

    public PagedIterable<AlertProcessingRule> list(Context context) {
        PagedIterable<AlertProcessingRuleInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new AlertProcessingRuleImpl(inner1, this.manager()));
    }

    public PagedIterable<AlertProcessingRule> listByResourceGroup(String resourceGroupName) {
        PagedIterable<AlertProcessingRuleInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new AlertProcessingRuleImpl(inner1, this.manager()));
    }

    public PagedIterable<AlertProcessingRule> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<AlertProcessingRuleInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new AlertProcessingRuleImpl(inner1, this.manager()));
    }

    public AlertProcessingRule getByResourceGroup(String resourceGroupName, String alertProcessingRuleName) {
        AlertProcessingRuleInner inner =
            this.serviceClient().getByResourceGroup(resourceGroupName, alertProcessingRuleName);
        if (inner != null) {
            return new AlertProcessingRuleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AlertProcessingRule> getByResourceGroupWithResponse(
        String resourceGroupName, String alertProcessingRuleName, Context context) {
        AlertProcessingRulesGetByResourceGroupResponse inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, alertProcessingRuleName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AlertProcessingRuleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String alertProcessingRuleName) {
        this.serviceClient().delete(resourceGroupName, alertProcessingRuleName);
    }

    public AlertProcessingRulesDeleteResponse deleteWithResponse(
        String resourceGroupName, String alertProcessingRuleName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, alertProcessingRuleName, context);
    }

    public AlertProcessingRule getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String alertProcessingRuleName = Utils.getValueFromIdByName(id, "actionRules");
        if (alertProcessingRuleName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'actionRules'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, alertProcessingRuleName, Context.NONE).getValue();
    }

    public Response<AlertProcessingRule> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String alertProcessingRuleName = Utils.getValueFromIdByName(id, "actionRules");
        if (alertProcessingRuleName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'actionRules'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, alertProcessingRuleName, context);
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
        String alertProcessingRuleName = Utils.getValueFromIdByName(id, "actionRules");
        if (alertProcessingRuleName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'actionRules'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, alertProcessingRuleName, Context.NONE);
    }

    public AlertProcessingRulesDeleteResponse deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String alertProcessingRuleName = Utils.getValueFromIdByName(id, "actionRules");
        if (alertProcessingRuleName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'actionRules'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, alertProcessingRuleName, context);
    }

    private AlertProcessingRulesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.alertsmanagement.AlertsManagementManager manager() {
        return this.serviceManager;
    }

    public AlertProcessingRuleImpl define(String name) {
        return new AlertProcessingRuleImpl(name, this.manager());
    }
}
