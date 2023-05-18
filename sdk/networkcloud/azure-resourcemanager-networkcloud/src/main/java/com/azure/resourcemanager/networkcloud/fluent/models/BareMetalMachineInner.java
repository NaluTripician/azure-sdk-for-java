// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.networkcloud.models.AdministrativeCredentials;
import com.azure.resourcemanager.networkcloud.models.BareMetalMachineCordonStatus;
import com.azure.resourcemanager.networkcloud.models.BareMetalMachineDetailedStatus;
import com.azure.resourcemanager.networkcloud.models.BareMetalMachinePowerState;
import com.azure.resourcemanager.networkcloud.models.BareMetalMachineProvisioningState;
import com.azure.resourcemanager.networkcloud.models.BareMetalMachineReadyState;
import com.azure.resourcemanager.networkcloud.models.ExtendedLocation;
import com.azure.resourcemanager.networkcloud.models.HardwareInventory;
import com.azure.resourcemanager.networkcloud.models.HardwareValidationStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** BareMetalMachine represents the physical machine in the rack. */
@Fluent
public final class BareMetalMachineInner extends Resource {
    /*
     * ExtendedLocation represents the Azure custom location where the resource will be created.
     *
     * The extended location of the cluster associated with the resource.
     */
    @JsonProperty(value = "extendedLocation", required = true)
    private ExtendedLocation extendedLocation;

    /*
     * BareMetalMachineProperties represents the properties of a bare metal machine.
     *
     * The list of the resource properties.
     */
    @JsonProperty(value = "properties", required = true)
    private BareMetalMachineProperties innerProperties = new BareMetalMachineProperties();

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of BareMetalMachineInner class. */
    public BareMetalMachineInner() {
    }

    /**
     * Get the extendedLocation property: ExtendedLocation represents the Azure custom location where the resource will
     * be created.
     *
     * <p>The extended location of the cluster associated with the resource.
     *
     * @return the extendedLocation value.
     */
    public ExtendedLocation extendedLocation() {
        return this.extendedLocation;
    }

    /**
     * Set the extendedLocation property: ExtendedLocation represents the Azure custom location where the resource will
     * be created.
     *
     * <p>The extended location of the cluster associated with the resource.
     *
     * @param extendedLocation the extendedLocation value to set.
     * @return the BareMetalMachineInner object itself.
     */
    public BareMetalMachineInner withExtendedLocation(ExtendedLocation extendedLocation) {
        this.extendedLocation = extendedLocation;
        return this;
    }

    /**
     * Get the innerProperties property: BareMetalMachineProperties represents the properties of a bare metal machine.
     *
     * <p>The list of the resource properties.
     *
     * @return the innerProperties value.
     */
    private BareMetalMachineProperties innerProperties() {
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
    public BareMetalMachineInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BareMetalMachineInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the bmcConnectionString property: The connection string for the baseboard management controller including IP
     * address and protocol.
     *
     * @return the bmcConnectionString value.
     */
    public String bmcConnectionString() {
        return this.innerProperties() == null ? null : this.innerProperties().bmcConnectionString();
    }

    /**
     * Set the bmcConnectionString property: The connection string for the baseboard management controller including IP
     * address and protocol.
     *
     * @param bmcConnectionString the bmcConnectionString value to set.
     * @return the BareMetalMachineInner object itself.
     */
    public BareMetalMachineInner withBmcConnectionString(String bmcConnectionString) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BareMetalMachineProperties();
        }
        this.innerProperties().withBmcConnectionString(bmcConnectionString);
        return this;
    }

    /**
     * Get the bmcCredentials property: AdministrativeCredentials represents the admin credentials for the device
     * requiring password-based authentication.
     *
     * <p>The credentials of the baseboard management controller on this bare metal machine.
     *
     * @return the bmcCredentials value.
     */
    public AdministrativeCredentials bmcCredentials() {
        return this.innerProperties() == null ? null : this.innerProperties().bmcCredentials();
    }

    /**
     * Set the bmcCredentials property: AdministrativeCredentials represents the admin credentials for the device
     * requiring password-based authentication.
     *
     * <p>The credentials of the baseboard management controller on this bare metal machine.
     *
     * @param bmcCredentials the bmcCredentials value to set.
     * @return the BareMetalMachineInner object itself.
     */
    public BareMetalMachineInner withBmcCredentials(AdministrativeCredentials bmcCredentials) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BareMetalMachineProperties();
        }
        this.innerProperties().withBmcCredentials(bmcCredentials);
        return this;
    }

    /**
     * Get the bmcMacAddress property: The MAC address of the BMC device.
     *
     * @return the bmcMacAddress value.
     */
    public String bmcMacAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().bmcMacAddress();
    }

    /**
     * Set the bmcMacAddress property: The MAC address of the BMC device.
     *
     * @param bmcMacAddress the bmcMacAddress value to set.
     * @return the BareMetalMachineInner object itself.
     */
    public BareMetalMachineInner withBmcMacAddress(String bmcMacAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BareMetalMachineProperties();
        }
        this.innerProperties().withBmcMacAddress(bmcMacAddress);
        return this;
    }

    /**
     * Get the bootMacAddress property: The MAC address of a NIC connected to the PXE network.
     *
     * @return the bootMacAddress value.
     */
    public String bootMacAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().bootMacAddress();
    }

    /**
     * Set the bootMacAddress property: The MAC address of a NIC connected to the PXE network.
     *
     * @param bootMacAddress the bootMacAddress value to set.
     * @return the BareMetalMachineInner object itself.
     */
    public BareMetalMachineInner withBootMacAddress(String bootMacAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BareMetalMachineProperties();
        }
        this.innerProperties().withBootMacAddress(bootMacAddress);
        return this;
    }

    /**
     * Get the clusterId property: The resource ID of the cluster this bare metal machine is associated with.
     *
     * @return the clusterId value.
     */
    public String clusterId() {
        return this.innerProperties() == null ? null : this.innerProperties().clusterId();
    }

    /**
     * Get the cordonStatus property: The cordon status of the bare metal machine.
     *
     * @return the cordonStatus value.
     */
    public BareMetalMachineCordonStatus cordonStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().cordonStatus();
    }

    /**
     * Get the detailedStatus property: The more detailed status of the bare metal machine.
     *
     * @return the detailedStatus value.
     */
    public BareMetalMachineDetailedStatus detailedStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().detailedStatus();
    }

    /**
     * Get the detailedStatusMessage property: The descriptive message about the current detailed status.
     *
     * @return the detailedStatusMessage value.
     */
    public String detailedStatusMessage() {
        return this.innerProperties() == null ? null : this.innerProperties().detailedStatusMessage();
    }

    /**
     * Get the hardwareInventory property: HardwareInventory represents the hardware configuration of this machine as
     * exposed to the customer, including information acquired from the model/sku information and from the ironic
     * inspector.
     *
     * <p>The hardware inventory, including information acquired from the model/sku information and from the ironic
     * inspector.
     *
     * @return the hardwareInventory value.
     */
    public HardwareInventory hardwareInventory() {
        return this.innerProperties() == null ? null : this.innerProperties().hardwareInventory();
    }

    /**
     * Get the hardwareValidationStatus property: HardwareValidationStatus represents the latest hardware validation
     * details performed for this bare metal machine.
     *
     * <p>The details of the latest hardware validation performed for this bare metal machine.
     *
     * @return the hardwareValidationStatus value.
     */
    public HardwareValidationStatus hardwareValidationStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().hardwareValidationStatus();
    }

    /**
     * Get the hybridAksClustersAssociatedIds property: The list of the resource IDs for the HybridAksClusters that have
     * nodes hosted on this bare metal machine.
     *
     * @return the hybridAksClustersAssociatedIds value.
     */
    public List<String> hybridAksClustersAssociatedIds() {
        return this.innerProperties() == null ? null : this.innerProperties().hybridAksClustersAssociatedIds();
    }

    /**
     * Get the kubernetesNodeName property: The name of this machine represented by the host object in the Cluster's
     * Kubernetes control plane.
     *
     * @return the kubernetesNodeName value.
     */
    public String kubernetesNodeName() {
        return this.innerProperties() == null ? null : this.innerProperties().kubernetesNodeName();
    }

    /**
     * Get the kubernetesVersion property: The version of Kubernetes running on this machine.
     *
     * @return the kubernetesVersion value.
     */
    public String kubernetesVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().kubernetesVersion();
    }

    /**
     * Get the machineDetails property: The custom details provided by the customer.
     *
     * @return the machineDetails value.
     */
    public String machineDetails() {
        return this.innerProperties() == null ? null : this.innerProperties().machineDetails();
    }

    /**
     * Set the machineDetails property: The custom details provided by the customer.
     *
     * @param machineDetails the machineDetails value to set.
     * @return the BareMetalMachineInner object itself.
     */
    public BareMetalMachineInner withMachineDetails(String machineDetails) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BareMetalMachineProperties();
        }
        this.innerProperties().withMachineDetails(machineDetails);
        return this;
    }

    /**
     * Get the machineName property: The OS-level hostname assigned to this machine.
     *
     * @return the machineName value.
     */
    public String machineName() {
        return this.innerProperties() == null ? null : this.innerProperties().machineName();
    }

    /**
     * Set the machineName property: The OS-level hostname assigned to this machine.
     *
     * @param machineName the machineName value to set.
     * @return the BareMetalMachineInner object itself.
     */
    public BareMetalMachineInner withMachineName(String machineName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BareMetalMachineProperties();
        }
        this.innerProperties().withMachineName(machineName);
        return this;
    }

    /**
     * Get the machineSkuId property: The unique internal identifier of the bare metal machine SKU.
     *
     * @return the machineSkuId value.
     */
    public String machineSkuId() {
        return this.innerProperties() == null ? null : this.innerProperties().machineSkuId();
    }

    /**
     * Set the machineSkuId property: The unique internal identifier of the bare metal machine SKU.
     *
     * @param machineSkuId the machineSkuId value to set.
     * @return the BareMetalMachineInner object itself.
     */
    public BareMetalMachineInner withMachineSkuId(String machineSkuId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BareMetalMachineProperties();
        }
        this.innerProperties().withMachineSkuId(machineSkuId);
        return this;
    }

    /**
     * Get the oamIpv4Address property: The IPv4 address that is assigned to the bare metal machine during the cluster
     * deployment.
     *
     * @return the oamIpv4Address value.
     */
    public String oamIpv4Address() {
        return this.innerProperties() == null ? null : this.innerProperties().oamIpv4Address();
    }

    /**
     * Get the oamIpv6Address property: The IPv6 address that is assigned to the bare metal machine during the cluster
     * deployment.
     *
     * @return the oamIpv6Address value.
     */
    public String oamIpv6Address() {
        return this.innerProperties() == null ? null : this.innerProperties().oamIpv6Address();
    }

    /**
     * Get the osImage property: The image that is currently provisioned to the OS disk.
     *
     * @return the osImage value.
     */
    public String osImage() {
        return this.innerProperties() == null ? null : this.innerProperties().osImage();
    }

    /**
     * Get the powerState property: The power state derived from the baseboard management controller.
     *
     * @return the powerState value.
     */
    public BareMetalMachinePowerState powerState() {
        return this.innerProperties() == null ? null : this.innerProperties().powerState();
    }

    /**
     * Get the provisioningState property: The provisioning state of the bare metal machine.
     *
     * @return the provisioningState value.
     */
    public BareMetalMachineProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the rackId property: The resource ID of the rack where this bare metal machine resides.
     *
     * @return the rackId value.
     */
    public String rackId() {
        return this.innerProperties() == null ? null : this.innerProperties().rackId();
    }

    /**
     * Set the rackId property: The resource ID of the rack where this bare metal machine resides.
     *
     * @param rackId the rackId value to set.
     * @return the BareMetalMachineInner object itself.
     */
    public BareMetalMachineInner withRackId(String rackId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BareMetalMachineProperties();
        }
        this.innerProperties().withRackId(rackId);
        return this;
    }

    /**
     * Get the rackSlot property: The rack slot in which this bare metal machine is located, ordered from the bottom up
     * i.e. the lowest slot is 1.
     *
     * @return the rackSlot value.
     */
    public long rackSlot() {
        return this.innerProperties() == null ? 0L : this.innerProperties().rackSlot();
    }

    /**
     * Set the rackSlot property: The rack slot in which this bare metal machine is located, ordered from the bottom up
     * i.e. the lowest slot is 1.
     *
     * @param rackSlot the rackSlot value to set.
     * @return the BareMetalMachineInner object itself.
     */
    public BareMetalMachineInner withRackSlot(long rackSlot) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BareMetalMachineProperties();
        }
        this.innerProperties().withRackSlot(rackSlot);
        return this;
    }

    /**
     * Get the readyState property: The indicator of whether the bare metal machine is ready to receive workloads.
     *
     * @return the readyState value.
     */
    public BareMetalMachineReadyState readyState() {
        return this.innerProperties() == null ? null : this.innerProperties().readyState();
    }

    /**
     * Get the serialNumber property: The serial number of the bare metal machine.
     *
     * @return the serialNumber value.
     */
    public String serialNumber() {
        return this.innerProperties() == null ? null : this.innerProperties().serialNumber();
    }

    /**
     * Set the serialNumber property: The serial number of the bare metal machine.
     *
     * @param serialNumber the serialNumber value to set.
     * @return the BareMetalMachineInner object itself.
     */
    public BareMetalMachineInner withSerialNumber(String serialNumber) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BareMetalMachineProperties();
        }
        this.innerProperties().withSerialNumber(serialNumber);
        return this;
    }

    /**
     * Get the serviceTag property: The discovered value of the machine's service tag.
     *
     * @return the serviceTag value.
     */
    public String serviceTag() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceTag();
    }

    /**
     * Get the virtualMachinesAssociatedIds property: The list of the resource IDs for the VirtualMachines that are
     * hosted on this bare metal machine.
     *
     * @return the virtualMachinesAssociatedIds value.
     */
    public List<String> virtualMachinesAssociatedIds() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualMachinesAssociatedIds();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (extendedLocation() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property extendedLocation in model BareMetalMachineInner"));
        } else {
            extendedLocation().validate();
        }
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model BareMetalMachineInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(BareMetalMachineInner.class);
}
