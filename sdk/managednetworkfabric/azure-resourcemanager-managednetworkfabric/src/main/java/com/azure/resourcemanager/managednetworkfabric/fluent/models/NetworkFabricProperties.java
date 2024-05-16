// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.managednetworkfabric.models.AdministrativeState;
import com.azure.resourcemanager.managednetworkfabric.models.AnnotationResource;
import com.azure.resourcemanager.managednetworkfabric.models.ConfigurationState;
import com.azure.resourcemanager.managednetworkfabric.models.ManagementNetworkConfigurationProperties;
import com.azure.resourcemanager.managednetworkfabric.models.ProvisioningState;
import com.azure.resourcemanager.managednetworkfabric.models.TerminalServerConfiguration;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Network Fabric Properties defines the properties of the resource. */
@Fluent
public final class NetworkFabricProperties extends AnnotationResource {
    /*
     * Supported Network Fabric SKU.Example: Compute / Aggregate racks. Once the user chooses a particular SKU, only
     * supported racks can be added to the Network Fabric. The SKU determines whether it is a single / multi rack
     * Network Fabric.
     */
    @JsonProperty(value = "networkFabricSku", required = true)
    private String networkFabricSku;

    /*
     * The version of Network Fabric.
     */
    @JsonProperty(value = "fabricVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String fabricVersion;

    /*
     * Array of router IDs.
     */
    @JsonProperty(value = "routerIds", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> routerIds;

    /*
     * Azure resource ID for the NetworkFabricController the NetworkFabric belongs.
     */
    @JsonProperty(value = "networkFabricControllerId", required = true)
    private String networkFabricControllerId;

    /*
     * Number of compute racks associated to Network Fabric.
     */
    @JsonProperty(value = "rackCount")
    private Integer rackCount;

    /*
     * Number of servers.Possible values are from 1-16.
     */
    @JsonProperty(value = "serverCountPerRack", required = true)
    private int serverCountPerRack;

    /*
     * IPv4Prefix for Management Network. Example: 10.1.0.0/19.
     */
    @JsonProperty(value = "ipv4Prefix", required = true)
    private String ipv4Prefix;

    /*
     * IPv6Prefix for Management Network. Example: 3FFE:FFFF:0:CD40::/59
     */
    @JsonProperty(value = "ipv6Prefix")
    private String ipv6Prefix;

    /*
     * ASN of CE devices for CE/PE connectivity.
     */
    @JsonProperty(value = "fabricASN", required = true)
    private long fabricAsn;

    /*
     * Network and credentials configuration currently applied to terminal server.
     */
    @JsonProperty(value = "terminalServerConfiguration", required = true)
    private TerminalServerConfiguration terminalServerConfiguration;

    /*
     * Configuration to be used to setup the management network.
     */
    @JsonProperty(value = "managementNetworkConfiguration", required = true)
    private ManagementNetworkConfigurationProperties managementNetworkConfiguration;

    /*
     * List of NetworkRack resource IDs under the Network Fabric. The number of racks allowed depends on the Network
     * Fabric SKU.
     */
    @JsonProperty(value = "racks", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> racks;

    /*
     * List of L2 Isolation Domain resource IDs under the Network Fabric.
     */
    @JsonProperty(value = "l2IsolationDomains", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> l2IsolationDomains;

    /*
     * List of L3 Isolation Domain resource IDs under the Network Fabric.
     */
    @JsonProperty(value = "l3IsolationDomains", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> l3IsolationDomains;

    /*
     * Configuration state of the resource.
     */
    @JsonProperty(value = "configurationState", access = JsonProperty.Access.WRITE_ONLY)
    private ConfigurationState configurationState;

    /*
     * Provides you the latest status of the NFC service, whether it is Accepted, updating, Succeeded or Failed. During
     * this process, the states keep changing based on the status of NFC provisioning.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Administrative state of the resource.
     */
    @JsonProperty(value = "administrativeState", access = JsonProperty.Access.WRITE_ONLY)
    private AdministrativeState administrativeState;

    /** Creates an instance of NetworkFabricProperties class. */
    public NetworkFabricProperties() {
    }

    /**
     * Get the networkFabricSku property: Supported Network Fabric SKU.Example: Compute / Aggregate racks. Once the user
     * chooses a particular SKU, only supported racks can be added to the Network Fabric. The SKU determines whether it
     * is a single / multi rack Network Fabric.
     *
     * @return the networkFabricSku value.
     */
    public String networkFabricSku() {
        return this.networkFabricSku;
    }

    /**
     * Set the networkFabricSku property: Supported Network Fabric SKU.Example: Compute / Aggregate racks. Once the user
     * chooses a particular SKU, only supported racks can be added to the Network Fabric. The SKU determines whether it
     * is a single / multi rack Network Fabric.
     *
     * @param networkFabricSku the networkFabricSku value to set.
     * @return the NetworkFabricProperties object itself.
     */
    public NetworkFabricProperties withNetworkFabricSku(String networkFabricSku) {
        this.networkFabricSku = networkFabricSku;
        return this;
    }

    /**
     * Get the fabricVersion property: The version of Network Fabric.
     *
     * @return the fabricVersion value.
     */
    public String fabricVersion() {
        return this.fabricVersion;
    }

    /**
     * Get the routerIds property: Array of router IDs.
     *
     * @return the routerIds value.
     */
    public List<String> routerIds() {
        return this.routerIds;
    }

    /**
     * Get the networkFabricControllerId property: Azure resource ID for the NetworkFabricController the NetworkFabric
     * belongs.
     *
     * @return the networkFabricControllerId value.
     */
    public String networkFabricControllerId() {
        return this.networkFabricControllerId;
    }

    /**
     * Set the networkFabricControllerId property: Azure resource ID for the NetworkFabricController the NetworkFabric
     * belongs.
     *
     * @param networkFabricControllerId the networkFabricControllerId value to set.
     * @return the NetworkFabricProperties object itself.
     */
    public NetworkFabricProperties withNetworkFabricControllerId(String networkFabricControllerId) {
        this.networkFabricControllerId = networkFabricControllerId;
        return this;
    }

    /**
     * Get the rackCount property: Number of compute racks associated to Network Fabric.
     *
     * @return the rackCount value.
     */
    public Integer rackCount() {
        return this.rackCount;
    }

    /**
     * Set the rackCount property: Number of compute racks associated to Network Fabric.
     *
     * @param rackCount the rackCount value to set.
     * @return the NetworkFabricProperties object itself.
     */
    public NetworkFabricProperties withRackCount(Integer rackCount) {
        this.rackCount = rackCount;
        return this;
    }

    /**
     * Get the serverCountPerRack property: Number of servers.Possible values are from 1-16.
     *
     * @return the serverCountPerRack value.
     */
    public int serverCountPerRack() {
        return this.serverCountPerRack;
    }

    /**
     * Set the serverCountPerRack property: Number of servers.Possible values are from 1-16.
     *
     * @param serverCountPerRack the serverCountPerRack value to set.
     * @return the NetworkFabricProperties object itself.
     */
    public NetworkFabricProperties withServerCountPerRack(int serverCountPerRack) {
        this.serverCountPerRack = serverCountPerRack;
        return this;
    }

    /**
     * Get the ipv4Prefix property: IPv4Prefix for Management Network. Example: 10.1.0.0/19.
     *
     * @return the ipv4Prefix value.
     */
    public String ipv4Prefix() {
        return this.ipv4Prefix;
    }

    /**
     * Set the ipv4Prefix property: IPv4Prefix for Management Network. Example: 10.1.0.0/19.
     *
     * @param ipv4Prefix the ipv4Prefix value to set.
     * @return the NetworkFabricProperties object itself.
     */
    public NetworkFabricProperties withIpv4Prefix(String ipv4Prefix) {
        this.ipv4Prefix = ipv4Prefix;
        return this;
    }

    /**
     * Get the ipv6Prefix property: IPv6Prefix for Management Network. Example: 3FFE:FFFF:0:CD40::/59.
     *
     * @return the ipv6Prefix value.
     */
    public String ipv6Prefix() {
        return this.ipv6Prefix;
    }

    /**
     * Set the ipv6Prefix property: IPv6Prefix for Management Network. Example: 3FFE:FFFF:0:CD40::/59.
     *
     * @param ipv6Prefix the ipv6Prefix value to set.
     * @return the NetworkFabricProperties object itself.
     */
    public NetworkFabricProperties withIpv6Prefix(String ipv6Prefix) {
        this.ipv6Prefix = ipv6Prefix;
        return this;
    }

    /**
     * Get the fabricAsn property: ASN of CE devices for CE/PE connectivity.
     *
     * @return the fabricAsn value.
     */
    public long fabricAsn() {
        return this.fabricAsn;
    }

    /**
     * Set the fabricAsn property: ASN of CE devices for CE/PE connectivity.
     *
     * @param fabricAsn the fabricAsn value to set.
     * @return the NetworkFabricProperties object itself.
     */
    public NetworkFabricProperties withFabricAsn(long fabricAsn) {
        this.fabricAsn = fabricAsn;
        return this;
    }

    /**
     * Get the terminalServerConfiguration property: Network and credentials configuration currently applied to terminal
     * server.
     *
     * @return the terminalServerConfiguration value.
     */
    public TerminalServerConfiguration terminalServerConfiguration() {
        return this.terminalServerConfiguration;
    }

    /**
     * Set the terminalServerConfiguration property: Network and credentials configuration currently applied to terminal
     * server.
     *
     * @param terminalServerConfiguration the terminalServerConfiguration value to set.
     * @return the NetworkFabricProperties object itself.
     */
    public NetworkFabricProperties withTerminalServerConfiguration(
        TerminalServerConfiguration terminalServerConfiguration) {
        this.terminalServerConfiguration = terminalServerConfiguration;
        return this;
    }

    /**
     * Get the managementNetworkConfiguration property: Configuration to be used to setup the management network.
     *
     * @return the managementNetworkConfiguration value.
     */
    public ManagementNetworkConfigurationProperties managementNetworkConfiguration() {
        return this.managementNetworkConfiguration;
    }

    /**
     * Set the managementNetworkConfiguration property: Configuration to be used to setup the management network.
     *
     * @param managementNetworkConfiguration the managementNetworkConfiguration value to set.
     * @return the NetworkFabricProperties object itself.
     */
    public NetworkFabricProperties withManagementNetworkConfiguration(
        ManagementNetworkConfigurationProperties managementNetworkConfiguration) {
        this.managementNetworkConfiguration = managementNetworkConfiguration;
        return this;
    }

    /**
     * Get the racks property: List of NetworkRack resource IDs under the Network Fabric. The number of racks allowed
     * depends on the Network Fabric SKU.
     *
     * @return the racks value.
     */
    public List<String> racks() {
        return this.racks;
    }

    /**
     * Get the l2IsolationDomains property: List of L2 Isolation Domain resource IDs under the Network Fabric.
     *
     * @return the l2IsolationDomains value.
     */
    public List<String> l2IsolationDomains() {
        return this.l2IsolationDomains;
    }

    /**
     * Get the l3IsolationDomains property: List of L3 Isolation Domain resource IDs under the Network Fabric.
     *
     * @return the l3IsolationDomains value.
     */
    public List<String> l3IsolationDomains() {
        return this.l3IsolationDomains;
    }

    /**
     * Get the configurationState property: Configuration state of the resource.
     *
     * @return the configurationState value.
     */
    public ConfigurationState configurationState() {
        return this.configurationState;
    }

    /**
     * Get the provisioningState property: Provides you the latest status of the NFC service, whether it is Accepted,
     * updating, Succeeded or Failed. During this process, the states keep changing based on the status of NFC
     * provisioning.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the administrativeState property: Administrative state of the resource.
     *
     * @return the administrativeState value.
     */
    public AdministrativeState administrativeState() {
        return this.administrativeState;
    }

    /** {@inheritDoc} */
    @Override
    public NetworkFabricProperties withAnnotation(String annotation) {
        super.withAnnotation(annotation);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (networkFabricSku() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property networkFabricSku in model NetworkFabricProperties"));
        }
        if (networkFabricControllerId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property networkFabricControllerId in model NetworkFabricProperties"));
        }
        if (ipv4Prefix() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property ipv4Prefix in model NetworkFabricProperties"));
        }
        if (terminalServerConfiguration() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property terminalServerConfiguration in model NetworkFabricProperties"));
        } else {
            terminalServerConfiguration().validate();
        }
        if (managementNetworkConfiguration() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property managementNetworkConfiguration in model NetworkFabricProperties"));
        } else {
            managementNetworkConfiguration().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(NetworkFabricProperties.class);
}
