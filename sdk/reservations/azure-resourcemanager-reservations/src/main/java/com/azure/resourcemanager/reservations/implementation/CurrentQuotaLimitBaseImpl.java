// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.reservations.fluent.models.CurrentQuotaLimitBaseInner;
import com.azure.resourcemanager.reservations.models.CurrentQuotaLimitBase;
import com.azure.resourcemanager.reservations.models.QuotaProperties;

public final class CurrentQuotaLimitBaseImpl
    implements CurrentQuotaLimitBase, CurrentQuotaLimitBase.Definition, CurrentQuotaLimitBase.Update {
    private CurrentQuotaLimitBaseInner innerObject;

    private final com.azure.resourcemanager.reservations.ReservationsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public QuotaProperties properties() {
        return this.innerModel().properties();
    }

    public CurrentQuotaLimitBaseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.reservations.ReservationsManager manager() {
        return this.serviceManager;
    }

    private String subscriptionId;

    private String providerId;

    private String location;

    private String resourceName;

    public CurrentQuotaLimitBaseImpl withExistingLocation(String subscriptionId, String providerId, String location) {
        this.subscriptionId = subscriptionId;
        this.providerId = providerId;
        this.location = location;
        return this;
    }

    public CurrentQuotaLimitBase create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getQuotas()
                .createOrUpdate(subscriptionId, providerId, location, resourceName, this.innerModel(), Context.NONE);
        return this;
    }

    public CurrentQuotaLimitBase create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getQuotas()
                .createOrUpdate(subscriptionId, providerId, location, resourceName, this.innerModel(), context);
        return this;
    }

    CurrentQuotaLimitBaseImpl(String name, com.azure.resourcemanager.reservations.ReservationsManager serviceManager) {
        this.innerObject = new CurrentQuotaLimitBaseInner();
        this.serviceManager = serviceManager;
        this.resourceName = name;
    }

    public CurrentQuotaLimitBaseImpl update() {
        return this;
    }

    public CurrentQuotaLimitBase apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getQuotas()
                .update(subscriptionId, providerId, location, resourceName, this.innerModel(), Context.NONE);
        return this;
    }

    public CurrentQuotaLimitBase apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getQuotas()
                .update(subscriptionId, providerId, location, resourceName, this.innerModel(), context);
        return this;
    }

    CurrentQuotaLimitBaseImpl(
        CurrentQuotaLimitBaseInner innerObject,
        com.azure.resourcemanager.reservations.ReservationsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.subscriptionId = Utils.getValueFromIdByName(innerObject.id(), "subscriptions");
        this.providerId = Utils.getValueFromIdByName(innerObject.id(), "resourceProviders");
        this.location = Utils.getValueFromIdByName(innerObject.id(), "locations");
        this.resourceName = Utils.getValueFromIdByName(innerObject.id(), "serviceLimits");
    }

    public CurrentQuotaLimitBase refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getQuotas()
                .getWithResponse(subscriptionId, providerId, location, resourceName, Context.NONE)
                .getValue();
        return this;
    }

    public CurrentQuotaLimitBase refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getQuotas()
                .getWithResponse(subscriptionId, providerId, location, resourceName, context)
                .getValue();
        return this;
    }

    public CurrentQuotaLimitBaseImpl withProperties(QuotaProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }
}
