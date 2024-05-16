// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.customerinsights.fluent.models.RoleAssignmentResourceFormatInner;
import com.azure.resourcemanager.customerinsights.models.AssignmentPrincipal;
import com.azure.resourcemanager.customerinsights.models.ProvisioningStates;
import com.azure.resourcemanager.customerinsights.models.ResourceSetDescription;
import com.azure.resourcemanager.customerinsights.models.RoleAssignmentResourceFormat;
import com.azure.resourcemanager.customerinsights.models.RoleTypes;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class RoleAssignmentResourceFormatImpl
    implements RoleAssignmentResourceFormat,
        RoleAssignmentResourceFormat.Definition,
        RoleAssignmentResourceFormat.Update {
    private RoleAssignmentResourceFormatInner innerObject;

    private final com.azure.resourcemanager.customerinsights.CustomerInsightsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String tenantId() {
        return this.innerModel().tenantId();
    }

    public String assignmentName() {
        return this.innerModel().assignmentName();
    }

    public Map<String, String> displayName() {
        Map<String, String> inner = this.innerModel().displayName();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public Map<String, String> description() {
        Map<String, String> inner = this.innerModel().description();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public ProvisioningStates provisioningState() {
        return this.innerModel().provisioningState();
    }

    public RoleTypes role() {
        return this.innerModel().role();
    }

    public List<AssignmentPrincipal> principals() {
        List<AssignmentPrincipal> inner = this.innerModel().principals();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ResourceSetDescription profiles() {
        return this.innerModel().profiles();
    }

    public ResourceSetDescription interactions() {
        return this.innerModel().interactions();
    }

    public ResourceSetDescription links() {
        return this.innerModel().links();
    }

    public ResourceSetDescription kpis() {
        return this.innerModel().kpis();
    }

    public ResourceSetDescription sasPolicies() {
        return this.innerModel().sasPolicies();
    }

    public ResourceSetDescription connectors() {
        return this.innerModel().connectors();
    }

    public ResourceSetDescription views() {
        return this.innerModel().views();
    }

    public ResourceSetDescription relationshipLinks() {
        return this.innerModel().relationshipLinks();
    }

    public ResourceSetDescription relationships() {
        return this.innerModel().relationships();
    }

    public ResourceSetDescription widgetTypes() {
        return this.innerModel().widgetTypes();
    }

    public ResourceSetDescription roleAssignments() {
        return this.innerModel().roleAssignments();
    }

    public ResourceSetDescription conflationPolicies() {
        return this.innerModel().conflationPolicies();
    }

    public ResourceSetDescription segments() {
        return this.innerModel().segments();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public RoleAssignmentResourceFormatInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.customerinsights.CustomerInsightsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String hubName;

    private String assignmentName;

    public RoleAssignmentResourceFormatImpl withExistingHub(String resourceGroupName, String hubName) {
        this.resourceGroupName = resourceGroupName;
        this.hubName = hubName;
        return this;
    }

    public RoleAssignmentResourceFormat create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRoleAssignments()
                .createOrUpdate(resourceGroupName, hubName, assignmentName, this.innerModel(), Context.NONE);
        return this;
    }

    public RoleAssignmentResourceFormat create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRoleAssignments()
                .createOrUpdate(resourceGroupName, hubName, assignmentName, this.innerModel(), context);
        return this;
    }

    RoleAssignmentResourceFormatImpl(
        String name, com.azure.resourcemanager.customerinsights.CustomerInsightsManager serviceManager) {
        this.innerObject = new RoleAssignmentResourceFormatInner();
        this.serviceManager = serviceManager;
        this.assignmentName = name;
    }

    public RoleAssignmentResourceFormatImpl update() {
        return this;
    }

    public RoleAssignmentResourceFormat apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRoleAssignments()
                .createOrUpdate(resourceGroupName, hubName, assignmentName, this.innerModel(), Context.NONE);
        return this;
    }

    public RoleAssignmentResourceFormat apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRoleAssignments()
                .createOrUpdate(resourceGroupName, hubName, assignmentName, this.innerModel(), context);
        return this;
    }

    RoleAssignmentResourceFormatImpl(
        RoleAssignmentResourceFormatInner innerObject,
        com.azure.resourcemanager.customerinsights.CustomerInsightsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.hubName = Utils.getValueFromIdByName(innerObject.id(), "hubs");
        this.assignmentName = Utils.getValueFromIdByName(innerObject.id(), "roleAssignments");
    }

    public RoleAssignmentResourceFormat refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRoleAssignments()
                .getWithResponse(resourceGroupName, hubName, assignmentName, Context.NONE)
                .getValue();
        return this;
    }

    public RoleAssignmentResourceFormat refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRoleAssignments()
                .getWithResponse(resourceGroupName, hubName, assignmentName, context)
                .getValue();
        return this;
    }

    public RoleAssignmentResourceFormatImpl withDisplayName(Map<String, String> displayName) {
        this.innerModel().withDisplayName(displayName);
        return this;
    }

    public RoleAssignmentResourceFormatImpl withDescription(Map<String, String> description) {
        this.innerModel().withDescription(description);
        return this;
    }

    public RoleAssignmentResourceFormatImpl withRole(RoleTypes role) {
        this.innerModel().withRole(role);
        return this;
    }

    public RoleAssignmentResourceFormatImpl withPrincipals(List<AssignmentPrincipal> principals) {
        this.innerModel().withPrincipals(principals);
        return this;
    }

    public RoleAssignmentResourceFormatImpl withProfiles(ResourceSetDescription profiles) {
        this.innerModel().withProfiles(profiles);
        return this;
    }

    public RoleAssignmentResourceFormatImpl withInteractions(ResourceSetDescription interactions) {
        this.innerModel().withInteractions(interactions);
        return this;
    }

    public RoleAssignmentResourceFormatImpl withLinks(ResourceSetDescription links) {
        this.innerModel().withLinks(links);
        return this;
    }

    public RoleAssignmentResourceFormatImpl withKpis(ResourceSetDescription kpis) {
        this.innerModel().withKpis(kpis);
        return this;
    }

    public RoleAssignmentResourceFormatImpl withSasPolicies(ResourceSetDescription sasPolicies) {
        this.innerModel().withSasPolicies(sasPolicies);
        return this;
    }

    public RoleAssignmentResourceFormatImpl withConnectors(ResourceSetDescription connectors) {
        this.innerModel().withConnectors(connectors);
        return this;
    }

    public RoleAssignmentResourceFormatImpl withViews(ResourceSetDescription views) {
        this.innerModel().withViews(views);
        return this;
    }

    public RoleAssignmentResourceFormatImpl withRelationshipLinks(ResourceSetDescription relationshipLinks) {
        this.innerModel().withRelationshipLinks(relationshipLinks);
        return this;
    }

    public RoleAssignmentResourceFormatImpl withRelationships(ResourceSetDescription relationships) {
        this.innerModel().withRelationships(relationships);
        return this;
    }

    public RoleAssignmentResourceFormatImpl withWidgetTypes(ResourceSetDescription widgetTypes) {
        this.innerModel().withWidgetTypes(widgetTypes);
        return this;
    }

    public RoleAssignmentResourceFormatImpl withRoleAssignments(ResourceSetDescription roleAssignments) {
        this.innerModel().withRoleAssignments(roleAssignments);
        return this;
    }

    public RoleAssignmentResourceFormatImpl withConflationPolicies(ResourceSetDescription conflationPolicies) {
        this.innerModel().withConflationPolicies(conflationPolicies);
        return this;
    }

    public RoleAssignmentResourceFormatImpl withSegments(ResourceSetDescription segments) {
        this.innerModel().withSegments(segments);
        return this;
    }
}
