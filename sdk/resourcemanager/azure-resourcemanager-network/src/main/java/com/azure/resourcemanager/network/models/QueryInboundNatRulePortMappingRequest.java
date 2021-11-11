// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The request for a QueryInboundNatRulePortMapping API. Either IpConfiguration or IpAddress should be set. */
@Fluent
public final class QueryInboundNatRulePortMappingRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(QueryInboundNatRulePortMappingRequest.class);

    /*
     * NetworkInterfaceIPConfiguration set in load balancer backend address.
     */
    @JsonProperty(value = "ipConfiguration")
    private SubResource ipConfiguration;

    /*
     * IP address set in load balancer backend address.
     */
    @JsonProperty(value = "ipAddress")
    private String ipAddress;

    /**
     * Get the ipConfiguration property: NetworkInterfaceIPConfiguration set in load balancer backend address.
     *
     * @return the ipConfiguration value.
     */
    public SubResource ipConfiguration() {
        return this.ipConfiguration;
    }

    /**
     * Set the ipConfiguration property: NetworkInterfaceIPConfiguration set in load balancer backend address.
     *
     * @param ipConfiguration the ipConfiguration value to set.
     * @return the QueryInboundNatRulePortMappingRequest object itself.
     */
    public QueryInboundNatRulePortMappingRequest withIpConfiguration(SubResource ipConfiguration) {
        this.ipConfiguration = ipConfiguration;
        return this;
    }

    /**
     * Get the ipAddress property: IP address set in load balancer backend address.
     *
     * @return the ipAddress value.
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Set the ipAddress property: IP address set in load balancer backend address.
     *
     * @param ipAddress the ipAddress value to set.
     * @return the QueryInboundNatRulePortMappingRequest object itself.
     */
    public QueryInboundNatRulePortMappingRequest withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
