// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automanage.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.automanage.fluent.models.ConfigurationProfileInner;
import com.azure.resourcemanager.automanage.fluent.models.ConfigurationProfileProperties;
import com.azure.resourcemanager.automanage.models.ConfigurationProfile;
import com.azure.resourcemanager.automanage.models.ConfigurationProfileUpdate;
import java.util.Collections;
import java.util.Map;

public final class ConfigurationProfileImpl
    implements ConfigurationProfile, ConfigurationProfile.Definition, ConfigurationProfile.Update {
    private ConfigurationProfileInner innerObject;

    private final com.azure.resourcemanager.automanage.AutomanageManager serviceManager;

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

    public ConfigurationProfileProperties properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
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

    public ConfigurationProfileInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.automanage.AutomanageManager manager() {
        return this.serviceManager;
    }

    private String configurationProfileName;

    private String resourceGroupName;

    private ConfigurationProfileUpdate updateParameters;

    public ConfigurationProfileImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public ConfigurationProfile create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getConfigurationProfiles()
                .createOrUpdateWithResponse(
                    configurationProfileName, resourceGroupName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public ConfigurationProfile create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getConfigurationProfiles()
                .createOrUpdateWithResponse(configurationProfileName, resourceGroupName, this.innerModel(), context)
                .getValue();
        return this;
    }

    ConfigurationProfileImpl(String name, com.azure.resourcemanager.automanage.AutomanageManager serviceManager) {
        this.innerObject = new ConfigurationProfileInner();
        this.serviceManager = serviceManager;
        this.configurationProfileName = name;
    }

    public ConfigurationProfileImpl update() {
        this.updateParameters = new ConfigurationProfileUpdate();
        return this;
    }

    public ConfigurationProfile apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getConfigurationProfiles()
                .updateWithResponse(configurationProfileName, resourceGroupName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public ConfigurationProfile apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getConfigurationProfiles()
                .updateWithResponse(configurationProfileName, resourceGroupName, updateParameters, context)
                .getValue();
        return this;
    }

    ConfigurationProfileImpl(
        ConfigurationProfileInner innerObject, com.azure.resourcemanager.automanage.AutomanageManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.configurationProfileName = Utils.getValueFromIdByName(innerObject.id(), "configurationProfiles");
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
    }

    public ConfigurationProfile refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getConfigurationProfiles()
                .getByResourceGroupWithResponse(resourceGroupName, configurationProfileName, Context.NONE)
                .getValue();
        return this;
    }

    public ConfigurationProfile refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getConfigurationProfiles()
                .getByResourceGroupWithResponse(resourceGroupName, configurationProfileName, context)
                .getValue();
        return this;
    }

    public ConfigurationProfileImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ConfigurationProfileImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ConfigurationProfileImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public ConfigurationProfileImpl withProperties(ConfigurationProfileProperties properties) {
        if (isInCreateMode()) {
            this.innerModel().withProperties(properties);
            return this;
        } else {
            this.updateParameters.withProperties(properties);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
