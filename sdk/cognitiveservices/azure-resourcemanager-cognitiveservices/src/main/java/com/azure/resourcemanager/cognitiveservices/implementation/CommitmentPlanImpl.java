// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.cognitiveservices.fluent.models.CommitmentPlanInner;
import com.azure.resourcemanager.cognitiveservices.models.CommitmentPlan;
import com.azure.resourcemanager.cognitiveservices.models.CommitmentPlanProperties;
import com.azure.resourcemanager.cognitiveservices.models.PatchResourceTagsAndSku;
import com.azure.resourcemanager.cognitiveservices.models.Sku;
import java.util.Collections;
import java.util.Map;

public final class CommitmentPlanImpl implements CommitmentPlan, CommitmentPlan.Definition, CommitmentPlan.Update {
    private CommitmentPlanInner innerObject;

    private final com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager serviceManager;

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

    public String etag() {
        return this.innerModel().etag();
    }

    public String kind() {
        return this.innerModel().kind();
    }

    public Sku sku() {
        return this.innerModel().sku();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String location() {
        return this.innerModel().location();
    }

    public CommitmentPlanProperties properties() {
        return this.innerModel().properties();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public CommitmentPlanInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String commitmentPlanName;

    private PatchResourceTagsAndSku updateCommitmentPlan;

    public CommitmentPlanImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public CommitmentPlan create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCommitmentPlans()
                .createOrUpdatePlan(resourceGroupName, commitmentPlanName, this.innerModel(), Context.NONE);
        return this;
    }

    public CommitmentPlan create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCommitmentPlans()
                .createOrUpdatePlan(resourceGroupName, commitmentPlanName, this.innerModel(), context);
        return this;
    }

    CommitmentPlanImpl(
        String name, com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager serviceManager) {
        this.innerObject = new CommitmentPlanInner();
        this.serviceManager = serviceManager;
        this.commitmentPlanName = name;
    }

    public CommitmentPlanImpl update() {
        this.updateCommitmentPlan = new PatchResourceTagsAndSku();
        return this;
    }

    public CommitmentPlan apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCommitmentPlans()
                .updatePlan(resourceGroupName, commitmentPlanName, updateCommitmentPlan, Context.NONE);
        return this;
    }

    public CommitmentPlan apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCommitmentPlans()
                .updatePlan(resourceGroupName, commitmentPlanName, updateCommitmentPlan, context);
        return this;
    }

    CommitmentPlanImpl(
        CommitmentPlanInner innerObject,
        com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.commitmentPlanName = Utils.getValueFromIdByName(innerObject.id(), "commitmentPlans");
    }

    public CommitmentPlan refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCommitmentPlans()
                .getByResourceGroupWithResponse(resourceGroupName, commitmentPlanName, Context.NONE)
                .getValue();
        return this;
    }

    public CommitmentPlan refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCommitmentPlans()
                .getByResourceGroupWithResponse(resourceGroupName, commitmentPlanName, context)
                .getValue();
        return this;
    }

    public CommitmentPlanImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public CommitmentPlanImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public CommitmentPlanImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateCommitmentPlan.withTags(tags);
            return this;
        }
    }

    public CommitmentPlanImpl withKind(String kind) {
        this.innerModel().withKind(kind);
        return this;
    }

    public CommitmentPlanImpl withSku(Sku sku) {
        if (isInCreateMode()) {
            this.innerModel().withSku(sku);
            return this;
        } else {
            this.updateCommitmentPlan.withSku(sku);
            return this;
        }
    }

    public CommitmentPlanImpl withProperties(CommitmentPlanProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
