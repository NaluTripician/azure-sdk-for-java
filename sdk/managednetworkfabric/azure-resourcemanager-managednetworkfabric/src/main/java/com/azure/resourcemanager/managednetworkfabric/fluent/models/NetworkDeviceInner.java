// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.managednetworkfabric.models.AdministrativeState;
import com.azure.resourcemanager.managednetworkfabric.models.ConfigurationState;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkDeviceRole;
import com.azure.resourcemanager.managednetworkfabric.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The Network Device resource definition. */
@Fluent
public final class NetworkDeviceInner extends Resource {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties", required = true)
    private NetworkDeviceProperties innerProperties = new NetworkDeviceProperties();

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of NetworkDeviceInner class. */
    public NetworkDeviceInner() {
    }

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private NetworkDeviceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public NetworkDeviceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public NetworkDeviceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the version property: Current version of the device as defined in SKU.
     *
     * @return the version value.
     */
    public String version() {
        return this.innerProperties() == null ? null : this.innerProperties().version();
    }

    /**
     * Get the networkDeviceSku property: Network Device SKU name.
     *
     * @return the networkDeviceSku value.
     */
    public String networkDeviceSku() {
        return this.innerProperties() == null ? null : this.innerProperties().networkDeviceSku();
    }

    /**
     * Set the networkDeviceSku property: Network Device SKU name.
     *
     * @param networkDeviceSku the networkDeviceSku value to set.
     * @return the NetworkDeviceInner object itself.
     */
    public NetworkDeviceInner withNetworkDeviceSku(String networkDeviceSku) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkDeviceProperties();
        }
        this.innerProperties().withNetworkDeviceSku(networkDeviceSku);
        return this;
    }

    /**
     * Get the networkDeviceRole property: NetworkDeviceRole is the device role: Example: CE | ToR.
     *
     * @return the networkDeviceRole value.
     */
    public NetworkDeviceRole networkDeviceRole() {
        return this.innerProperties() == null ? null : this.innerProperties().networkDeviceRole();
    }

    /**
     * Get the networkRackId property: Reference to network rack resource id.
     *
     * @return the networkRackId value.
     */
    public String networkRackId() {
        return this.innerProperties() == null ? null : this.innerProperties().networkRackId();
    }

    /**
     * Get the managementIpv4Address property: Management IPv4 Address.
     *
     * @return the managementIpv4Address value.
     */
    public String managementIpv4Address() {
        return this.innerProperties() == null ? null : this.innerProperties().managementIpv4Address();
    }

    /**
     * Get the managementIpv6Address property: Management IPv6 Address.
     *
     * @return the managementIpv6Address value.
     */
    public String managementIpv6Address() {
        return this.innerProperties() == null ? null : this.innerProperties().managementIpv6Address();
    }

    /**
     * Get the configurationState property: Configuration state of the resource.
     *
     * @return the configurationState value.
     */
    public ConfigurationState configurationState() {
        return this.innerProperties() == null ? null : this.innerProperties().configurationState();
    }

    /**
     * Get the provisioningState property: Provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the administrativeState property: Administrative state of the resource.
     *
     * @return the administrativeState value.
     */
    public AdministrativeState administrativeState() {
        return this.innerProperties() == null ? null : this.innerProperties().administrativeState();
    }

    /**
     * Get the hostname property: The host name of the device.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.innerProperties() == null ? null : this.innerProperties().hostname();
    }

    /**
     * Set the hostname property: The host name of the device.
     *
     * @param hostname the hostname value to set.
     * @return the NetworkDeviceInner object itself.
     */
    public NetworkDeviceInner withHostname(String hostname) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkDeviceProperties();
        }
        this.innerProperties().withHostname(hostname);
        return this;
    }

    /**
     * Get the serialNumber property: Serial number of the device. Format of serial Number -
     * Make;Model;HardwareRevisionId;SerialNumber.
     *
     * @return the serialNumber value.
     */
    public String serialNumber() {
        return this.innerProperties() == null ? null : this.innerProperties().serialNumber();
    }

    /**
     * Set the serialNumber property: Serial number of the device. Format of serial Number -
     * Make;Model;HardwareRevisionId;SerialNumber.
     *
     * @param serialNumber the serialNumber value to set.
     * @return the NetworkDeviceInner object itself.
     */
    public NetworkDeviceInner withSerialNumber(String serialNumber) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkDeviceProperties();
        }
        this.innerProperties().withSerialNumber(serialNumber);
        return this;
    }

    /**
     * Get the annotation property: Switch configuration description.
     *
     * @return the annotation value.
     */
    public String annotation() {
        return this.innerProperties() == null ? null : this.innerProperties().annotation();
    }

    /**
     * Set the annotation property: Switch configuration description.
     *
     * @param annotation the annotation value to set.
     * @return the NetworkDeviceInner object itself.
     */
    public NetworkDeviceInner withAnnotation(String annotation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkDeviceProperties();
        }
        this.innerProperties().withAnnotation(annotation);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model NetworkDeviceInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(NetworkDeviceInner.class);
}
