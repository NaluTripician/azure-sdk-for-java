// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Defines the common match conditions of the ACL and Network Tap Rule. */
@Fluent
public class CommonMatchConditions {
    /*
     * List of the protocols that need to be matched.
     */
    @JsonProperty(value = "protocolTypes")
    private List<String> protocolTypes;

    /*
     * Vlan match condition that needs to be matched.
     */
    @JsonProperty(value = "vlanMatchCondition")
    private VlanMatchCondition vlanMatchCondition;

    /*
     * IP condition that needs to be matched.
     */
    @JsonProperty(value = "ipCondition")
    private IpMatchCondition ipCondition;

    /** Creates an instance of CommonMatchConditions class. */
    public CommonMatchConditions() {
    }

    /**
     * Get the protocolTypes property: List of the protocols that need to be matched.
     *
     * @return the protocolTypes value.
     */
    public List<String> protocolTypes() {
        return this.protocolTypes;
    }

    /**
     * Set the protocolTypes property: List of the protocols that need to be matched.
     *
     * @param protocolTypes the protocolTypes value to set.
     * @return the CommonMatchConditions object itself.
     */
    public CommonMatchConditions withProtocolTypes(List<String> protocolTypes) {
        this.protocolTypes = protocolTypes;
        return this;
    }

    /**
     * Get the vlanMatchCondition property: Vlan match condition that needs to be matched.
     *
     * @return the vlanMatchCondition value.
     */
    public VlanMatchCondition vlanMatchCondition() {
        return this.vlanMatchCondition;
    }

    /**
     * Set the vlanMatchCondition property: Vlan match condition that needs to be matched.
     *
     * @param vlanMatchCondition the vlanMatchCondition value to set.
     * @return the CommonMatchConditions object itself.
     */
    public CommonMatchConditions withVlanMatchCondition(VlanMatchCondition vlanMatchCondition) {
        this.vlanMatchCondition = vlanMatchCondition;
        return this;
    }

    /**
     * Get the ipCondition property: IP condition that needs to be matched.
     *
     * @return the ipCondition value.
     */
    public IpMatchCondition ipCondition() {
        return this.ipCondition;
    }

    /**
     * Set the ipCondition property: IP condition that needs to be matched.
     *
     * @param ipCondition the ipCondition value to set.
     * @return the CommonMatchConditions object itself.
     */
    public CommonMatchConditions withIpCondition(IpMatchCondition ipCondition) {
        this.ipCondition = ipCondition;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (vlanMatchCondition() != null) {
            vlanMatchCondition().validate();
        }
        if (ipCondition() != null) {
            ipCondition().validate();
        }
    }
}
