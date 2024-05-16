// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.peering.fluent.models.PeerAsnInner;
import com.azure.resourcemanager.peering.models.ContactDetail;
import com.azure.resourcemanager.peering.models.PeerAsn;
import com.azure.resourcemanager.peering.models.ValidationState;
import java.util.Collections;
import java.util.List;

public final class PeerAsnImpl implements PeerAsn, PeerAsn.Definition, PeerAsn.Update {
    private PeerAsnInner innerObject;

    private final com.azure.resourcemanager.peering.PeeringManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public Integer peerAsn() {
        return this.innerModel().peerAsn();
    }

    public List<ContactDetail> peerContactDetail() {
        List<ContactDetail> inner = this.innerModel().peerContactDetail();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String peerName() {
        return this.innerModel().peerName();
    }

    public ValidationState validationState() {
        return this.innerModel().validationState();
    }

    public String errorMessage() {
        return this.innerModel().errorMessage();
    }

    public PeerAsnInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.peering.PeeringManager manager() {
        return this.serviceManager;
    }

    private String peerAsnName;

    public PeerAsn create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPeerAsns()
                .createOrUpdateWithResponse(peerAsnName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public PeerAsn create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPeerAsns()
                .createOrUpdateWithResponse(peerAsnName, this.innerModel(), context)
                .getValue();
        return this;
    }

    PeerAsnImpl(String name, com.azure.resourcemanager.peering.PeeringManager serviceManager) {
        this.innerObject = new PeerAsnInner();
        this.serviceManager = serviceManager;
        this.peerAsnName = name;
    }

    public PeerAsnImpl update() {
        return this;
    }

    public PeerAsn apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPeerAsns()
                .createOrUpdateWithResponse(peerAsnName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public PeerAsn apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPeerAsns()
                .createOrUpdateWithResponse(peerAsnName, this.innerModel(), context)
                .getValue();
        return this;
    }

    PeerAsnImpl(PeerAsnInner innerObject, com.azure.resourcemanager.peering.PeeringManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.peerAsnName = Utils.getValueFromIdByName(innerObject.id(), "peerAsns");
    }

    public PeerAsn refresh() {
        this.innerObject =
            serviceManager.serviceClient().getPeerAsns().getWithResponse(peerAsnName, Context.NONE).getValue();
        return this;
    }

    public PeerAsn refresh(Context context) {
        this.innerObject =
            serviceManager.serviceClient().getPeerAsns().getWithResponse(peerAsnName, context).getValue();
        return this;
    }

    public PeerAsnImpl withPeerAsn(Integer peerAsn) {
        this.innerModel().withPeerAsn(peerAsn);
        return this;
    }

    public PeerAsnImpl withPeerContactDetail(List<ContactDetail> peerContactDetail) {
        this.innerModel().withPeerContactDetail(peerContactDetail);
        return this;
    }

    public PeerAsnImpl withPeerName(String peerName) {
        this.innerModel().withPeerName(peerName);
        return this;
    }

    public PeerAsnImpl withValidationState(ValidationState validationState) {
        this.innerModel().withValidationState(validationState);
        return this;
    }
}
