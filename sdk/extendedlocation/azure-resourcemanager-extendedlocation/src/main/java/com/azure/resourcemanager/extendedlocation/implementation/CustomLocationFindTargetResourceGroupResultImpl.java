// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.extendedlocation.implementation;

import com.azure.resourcemanager.extendedlocation.fluent.models.CustomLocationFindTargetResourceGroupResultInner;
import com.azure.resourcemanager.extendedlocation.models.CustomLocationFindTargetResourceGroupResult;

public final class CustomLocationFindTargetResourceGroupResultImpl
    implements CustomLocationFindTargetResourceGroupResult {
    private CustomLocationFindTargetResourceGroupResultInner innerObject;

    private final com.azure.resourcemanager.extendedlocation.CustomLocationsManager serviceManager;

    CustomLocationFindTargetResourceGroupResultImpl(
        CustomLocationFindTargetResourceGroupResultInner innerObject,
        com.azure.resourcemanager.extendedlocation.CustomLocationsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String matchedResourceSyncRule() {
        return this.innerModel().matchedResourceSyncRule();
    }

    public String targetResourceGroup() {
        return this.innerModel().targetResourceGroup();
    }

    public CustomLocationFindTargetResourceGroupResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.extendedlocation.CustomLocationsManager manager() {
        return this.serviceManager;
    }
}
