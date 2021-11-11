// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.ExtendedLocation;
import com.azure.resourcemanager.network.models.InboundNatPool;
import com.azure.resourcemanager.network.models.LoadBalancerSku;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** LoadBalancer resource. */
@Fluent
public final class LoadBalancerInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LoadBalancerInner.class);

    /*
     * The extended location of the load balancer.
     */
    @JsonProperty(value = "extendedLocation")
    private ExtendedLocation extendedLocation;

    /*
     * The load balancer SKU.
     */
    @JsonProperty(value = "sku")
    private LoadBalancerSku sku;

    /*
     * Properties of load balancer.
     */
    @JsonProperty(value = "properties")
    private LoadBalancerPropertiesFormat innerProperties;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the extendedLocation property: The extended location of the load balancer.
     *
     * @return the extendedLocation value.
     */
    public ExtendedLocation extendedLocation() {
        return this.extendedLocation;
    }

    /**
     * Set the extendedLocation property: The extended location of the load balancer.
     *
     * @param extendedLocation the extendedLocation value to set.
     * @return the LoadBalancerInner object itself.
     */
    public LoadBalancerInner withExtendedLocation(ExtendedLocation extendedLocation) {
        this.extendedLocation = extendedLocation;
        return this;
    }

    /**
     * Get the sku property: The load balancer SKU.
     *
     * @return the sku value.
     */
    public LoadBalancerSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The load balancer SKU.
     *
     * @param sku the sku value to set.
     * @return the LoadBalancerInner object itself.
     */
    public LoadBalancerInner withSku(LoadBalancerSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the innerProperties property: Properties of load balancer.
     *
     * @return the innerProperties value.
     */
    private LoadBalancerPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the id property: Resource ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     *
     * @param id the id value to set.
     * @return the LoadBalancerInner object itself.
     */
    public LoadBalancerInner withId(String id) {
        this.id = id;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public LoadBalancerInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public LoadBalancerInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the frontendIpConfigurations property: Object representing the frontend IPs to be used for the load balancer.
     *
     * @return the frontendIpConfigurations value.
     */
    public List<FrontendIpConfigurationInner> frontendIpConfigurations() {
        return this.innerProperties() == null ? null : this.innerProperties().frontendIpConfigurations();
    }

    /**
     * Set the frontendIpConfigurations property: Object representing the frontend IPs to be used for the load balancer.
     *
     * @param frontendIpConfigurations the frontendIpConfigurations value to set.
     * @return the LoadBalancerInner object itself.
     */
    public LoadBalancerInner withFrontendIpConfigurations(List<FrontendIpConfigurationInner> frontendIpConfigurations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LoadBalancerPropertiesFormat();
        }
        this.innerProperties().withFrontendIpConfigurations(frontendIpConfigurations);
        return this;
    }

    /**
     * Get the backendAddressPools property: Collection of backend address pools used by a load balancer.
     *
     * @return the backendAddressPools value.
     */
    public List<BackendAddressPoolInner> backendAddressPools() {
        return this.innerProperties() == null ? null : this.innerProperties().backendAddressPools();
    }

    /**
     * Set the backendAddressPools property: Collection of backend address pools used by a load balancer.
     *
     * @param backendAddressPools the backendAddressPools value to set.
     * @return the LoadBalancerInner object itself.
     */
    public LoadBalancerInner withBackendAddressPools(List<BackendAddressPoolInner> backendAddressPools) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LoadBalancerPropertiesFormat();
        }
        this.innerProperties().withBackendAddressPools(backendAddressPools);
        return this;
    }

    /**
     * Get the loadBalancingRules property: Object collection representing the load balancing rules Gets the
     * provisioning.
     *
     * @return the loadBalancingRules value.
     */
    public List<LoadBalancingRuleInner> loadBalancingRules() {
        return this.innerProperties() == null ? null : this.innerProperties().loadBalancingRules();
    }

    /**
     * Set the loadBalancingRules property: Object collection representing the load balancing rules Gets the
     * provisioning.
     *
     * @param loadBalancingRules the loadBalancingRules value to set.
     * @return the LoadBalancerInner object itself.
     */
    public LoadBalancerInner withLoadBalancingRules(List<LoadBalancingRuleInner> loadBalancingRules) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LoadBalancerPropertiesFormat();
        }
        this.innerProperties().withLoadBalancingRules(loadBalancingRules);
        return this;
    }

    /**
     * Get the probes property: Collection of probe objects used in the load balancer.
     *
     * @return the probes value.
     */
    public List<ProbeInner> probes() {
        return this.innerProperties() == null ? null : this.innerProperties().probes();
    }

    /**
     * Set the probes property: Collection of probe objects used in the load balancer.
     *
     * @param probes the probes value to set.
     * @return the LoadBalancerInner object itself.
     */
    public LoadBalancerInner withProbes(List<ProbeInner> probes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LoadBalancerPropertiesFormat();
        }
        this.innerProperties().withProbes(probes);
        return this;
    }

    /**
     * Get the inboundNatRules property: Collection of inbound NAT Rules used by a load balancer. Defining inbound NAT
     * rules on your load balancer is mutually exclusive with defining an inbound NAT pool. Inbound NAT pools are
     * referenced from virtual machine scale sets. NICs that are associated with individual virtual machines cannot
     * reference an Inbound NAT pool. They have to reference individual inbound NAT rules.
     *
     * @return the inboundNatRules value.
     */
    public List<InboundNatRuleInner> inboundNatRules() {
        return this.innerProperties() == null ? null : this.innerProperties().inboundNatRules();
    }

    /**
     * Set the inboundNatRules property: Collection of inbound NAT Rules used by a load balancer. Defining inbound NAT
     * rules on your load balancer is mutually exclusive with defining an inbound NAT pool. Inbound NAT pools are
     * referenced from virtual machine scale sets. NICs that are associated with individual virtual machines cannot
     * reference an Inbound NAT pool. They have to reference individual inbound NAT rules.
     *
     * @param inboundNatRules the inboundNatRules value to set.
     * @return the LoadBalancerInner object itself.
     */
    public LoadBalancerInner withInboundNatRules(List<InboundNatRuleInner> inboundNatRules) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LoadBalancerPropertiesFormat();
        }
        this.innerProperties().withInboundNatRules(inboundNatRules);
        return this;
    }

    /**
     * Get the inboundNatPools property: Defines an external port range for inbound NAT to a single backend port on NICs
     * associated with a load balancer. Inbound NAT rules are created automatically for each NIC associated with the
     * Load Balancer using an external port from this range. Defining an Inbound NAT pool on your Load Balancer is
     * mutually exclusive with defining inbound NAT rules. Inbound NAT pools are referenced from virtual machine scale
     * sets. NICs that are associated with individual virtual machines cannot reference an inbound NAT pool. They have
     * to reference individual inbound NAT rules.
     *
     * @return the inboundNatPools value.
     */
    public List<InboundNatPool> inboundNatPools() {
        return this.innerProperties() == null ? null : this.innerProperties().inboundNatPools();
    }

    /**
     * Set the inboundNatPools property: Defines an external port range for inbound NAT to a single backend port on NICs
     * associated with a load balancer. Inbound NAT rules are created automatically for each NIC associated with the
     * Load Balancer using an external port from this range. Defining an Inbound NAT pool on your Load Balancer is
     * mutually exclusive with defining inbound NAT rules. Inbound NAT pools are referenced from virtual machine scale
     * sets. NICs that are associated with individual virtual machines cannot reference an inbound NAT pool. They have
     * to reference individual inbound NAT rules.
     *
     * @param inboundNatPools the inboundNatPools value to set.
     * @return the LoadBalancerInner object itself.
     */
    public LoadBalancerInner withInboundNatPools(List<InboundNatPool> inboundNatPools) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LoadBalancerPropertiesFormat();
        }
        this.innerProperties().withInboundNatPools(inboundNatPools);
        return this;
    }

    /**
     * Get the outboundRules property: The outbound rules.
     *
     * @return the outboundRules value.
     */
    public List<OutboundRuleInner> outboundRules() {
        return this.innerProperties() == null ? null : this.innerProperties().outboundRules();
    }

    /**
     * Set the outboundRules property: The outbound rules.
     *
     * @param outboundRules the outboundRules value to set.
     * @return the LoadBalancerInner object itself.
     */
    public LoadBalancerInner withOutboundRules(List<OutboundRuleInner> outboundRules) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LoadBalancerPropertiesFormat();
        }
        this.innerProperties().withOutboundRules(outboundRules);
        return this;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the load balancer resource.
     *
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceGuid();
    }

    /**
     * Get the provisioningState property: The provisioning state of the load balancer resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (extendedLocation() != null) {
            extendedLocation().validate();
        }
        if (sku() != null) {
            sku().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
