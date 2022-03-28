// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.eventgrid.models.DataResidencyBoundary;
import com.azure.resourcemanager.eventgrid.models.DomainProvisioningState;
import com.azure.resourcemanager.eventgrid.models.IdentityInfo;
import com.azure.resourcemanager.eventgrid.models.InboundIpRule;
import com.azure.resourcemanager.eventgrid.models.InputSchema;
import com.azure.resourcemanager.eventgrid.models.InputSchemaMapping;
import com.azure.resourcemanager.eventgrid.models.PublicNetworkAccess;
import com.azure.resourcemanager.eventgrid.models.ResourceSku;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** EventGrid Domain. */
@Fluent
public final class DomainInner extends Resource {
    /*
     * Properties of the Event Grid Domain resource.
     */
    @JsonProperty(value = "properties")
    private DomainProperties innerProperties;

    /*
     * The Sku pricing tier for the Event Grid Domain resource.
     */
    @JsonProperty(value = "sku")
    private ResourceSku sku;

    /*
     * Identity information for the Event Grid Domain resource.
     */
    @JsonProperty(value = "identity")
    private IdentityInfo identity;

    /*
     * The system metadata relating to the Event Grid Domain resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the innerProperties property: Properties of the Event Grid Domain resource.
     *
     * @return the innerProperties value.
     */
    private DomainProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the sku property: The Sku pricing tier for the Event Grid Domain resource.
     *
     * @return the sku value.
     */
    public ResourceSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The Sku pricing tier for the Event Grid Domain resource.
     *
     * @param sku the sku value to set.
     * @return the DomainInner object itself.
     */
    public DomainInner withSku(ResourceSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the identity property: Identity information for the Event Grid Domain resource.
     *
     * @return the identity value.
     */
    public IdentityInfo identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Identity information for the Event Grid Domain resource.
     *
     * @param identity the identity value to set.
     * @return the DomainInner object itself.
     */
    public DomainInner withIdentity(IdentityInfo identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the systemData property: The system metadata relating to the Event Grid Domain resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public DomainInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DomainInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the privateEndpointConnections property: List of private endpoint connections.
     *
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.innerProperties() == null ? null : this.innerProperties().privateEndpointConnections();
    }

    /**
     * Get the provisioningState property: Provisioning state of the Event Grid Domain Resource.
     *
     * @return the provisioningState value.
     */
    public DomainProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the endpoint property: Endpoint for the Event Grid Domain Resource which is used for publishing the events.
     *
     * @return the endpoint value.
     */
    public String endpoint() {
        return this.innerProperties() == null ? null : this.innerProperties().endpoint();
    }

    /**
     * Get the inputSchema property: This determines the format that Event Grid should expect for incoming events
     * published to the Event Grid Domain Resource.
     *
     * @return the inputSchema value.
     */
    public InputSchema inputSchema() {
        return this.innerProperties() == null ? null : this.innerProperties().inputSchema();
    }

    /**
     * Set the inputSchema property: This determines the format that Event Grid should expect for incoming events
     * published to the Event Grid Domain Resource.
     *
     * @param inputSchema the inputSchema value to set.
     * @return the DomainInner object itself.
     */
    public DomainInner withInputSchema(InputSchema inputSchema) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DomainProperties();
        }
        this.innerProperties().withInputSchema(inputSchema);
        return this;
    }

    /**
     * Get the inputSchemaMapping property: Information about the InputSchemaMapping which specified the info about
     * mapping event payload.
     *
     * @return the inputSchemaMapping value.
     */
    public InputSchemaMapping inputSchemaMapping() {
        return this.innerProperties() == null ? null : this.innerProperties().inputSchemaMapping();
    }

    /**
     * Set the inputSchemaMapping property: Information about the InputSchemaMapping which specified the info about
     * mapping event payload.
     *
     * @param inputSchemaMapping the inputSchemaMapping value to set.
     * @return the DomainInner object itself.
     */
    public DomainInner withInputSchemaMapping(InputSchemaMapping inputSchemaMapping) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DomainProperties();
        }
        this.innerProperties().withInputSchemaMapping(inputSchemaMapping);
        return this;
    }

    /**
     * Get the metricResourceId property: Metric resource id for the Event Grid Domain Resource.
     *
     * @return the metricResourceId value.
     */
    public String metricResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().metricResourceId();
    }

    /**
     * Get the publicNetworkAccess property: This determines if traffic is allowed over public network. By default it is
     * enabled. You can further restrict to specific IPs by configuring &lt;seealso
     * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.DomainProperties.InboundIpRules" /&gt;.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().publicNetworkAccess();
    }

    /**
     * Set the publicNetworkAccess property: This determines if traffic is allowed over public network. By default it is
     * enabled. You can further restrict to specific IPs by configuring &lt;seealso
     * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.DomainProperties.InboundIpRules" /&gt;.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the DomainInner object itself.
     */
    public DomainInner withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DomainProperties();
        }
        this.innerProperties().withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    /**
     * Get the inboundIpRules property: This can be used to restrict traffic from specific IPs instead of all IPs. Note:
     * These are considered only if PublicNetworkAccess is enabled.
     *
     * @return the inboundIpRules value.
     */
    public List<InboundIpRule> inboundIpRules() {
        return this.innerProperties() == null ? null : this.innerProperties().inboundIpRules();
    }

    /**
     * Set the inboundIpRules property: This can be used to restrict traffic from specific IPs instead of all IPs. Note:
     * These are considered only if PublicNetworkAccess is enabled.
     *
     * @param inboundIpRules the inboundIpRules value to set.
     * @return the DomainInner object itself.
     */
    public DomainInner withInboundIpRules(List<InboundIpRule> inboundIpRules) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DomainProperties();
        }
        this.innerProperties().withInboundIpRules(inboundIpRules);
        return this;
    }

    /**
     * Get the disableLocalAuth property: This boolean is used to enable or disable local auth. Default value is false.
     * When the property is set to true, only AAD token will be used to authenticate if user is allowed to publish to
     * the domain.
     *
     * @return the disableLocalAuth value.
     */
    public Boolean disableLocalAuth() {
        return this.innerProperties() == null ? null : this.innerProperties().disableLocalAuth();
    }

    /**
     * Set the disableLocalAuth property: This boolean is used to enable or disable local auth. Default value is false.
     * When the property is set to true, only AAD token will be used to authenticate if user is allowed to publish to
     * the domain.
     *
     * @param disableLocalAuth the disableLocalAuth value to set.
     * @return the DomainInner object itself.
     */
    public DomainInner withDisableLocalAuth(Boolean disableLocalAuth) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DomainProperties();
        }
        this.innerProperties().withDisableLocalAuth(disableLocalAuth);
        return this;
    }

    /**
     * Get the autoCreateTopicWithFirstSubscription property: This Boolean is used to specify the creation mechanism for
     * 'all' the Event Grid Domain Topics associated with this Event Grid Domain resource. In this context, creation of
     * domain topic can be auto-managed (when true) or self-managed (when false). The default value for this property is
     * true. When this property is null or set to true, Event Grid is responsible of automatically creating the domain
     * topic when the first event subscription is created at the scope of the domain topic. If this property is set to
     * false, then creating the first event subscription will require creating a domain topic by the user. The
     * self-management mode can be used if the user wants full control of when the domain topic is created, while
     * auto-managed mode provides the flexibility to perform less operations and manage fewer resources by the user.
     * Also, note that in auto-managed creation mode, user is allowed to create the domain topic on demand if needed.
     *
     * @return the autoCreateTopicWithFirstSubscription value.
     */
    public Boolean autoCreateTopicWithFirstSubscription() {
        return this.innerProperties() == null ? null : this.innerProperties().autoCreateTopicWithFirstSubscription();
    }

    /**
     * Set the autoCreateTopicWithFirstSubscription property: This Boolean is used to specify the creation mechanism for
     * 'all' the Event Grid Domain Topics associated with this Event Grid Domain resource. In this context, creation of
     * domain topic can be auto-managed (when true) or self-managed (when false). The default value for this property is
     * true. When this property is null or set to true, Event Grid is responsible of automatically creating the domain
     * topic when the first event subscription is created at the scope of the domain topic. If this property is set to
     * false, then creating the first event subscription will require creating a domain topic by the user. The
     * self-management mode can be used if the user wants full control of when the domain topic is created, while
     * auto-managed mode provides the flexibility to perform less operations and manage fewer resources by the user.
     * Also, note that in auto-managed creation mode, user is allowed to create the domain topic on demand if needed.
     *
     * @param autoCreateTopicWithFirstSubscription the autoCreateTopicWithFirstSubscription value to set.
     * @return the DomainInner object itself.
     */
    public DomainInner withAutoCreateTopicWithFirstSubscription(Boolean autoCreateTopicWithFirstSubscription) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DomainProperties();
        }
        this.innerProperties().withAutoCreateTopicWithFirstSubscription(autoCreateTopicWithFirstSubscription);
        return this;
    }

    /**
     * Get the autoDeleteTopicWithLastSubscription property: This Boolean is used to specify the deletion mechanism for
     * 'all' the Event Grid Domain Topics associated with this Event Grid Domain resource. In this context, deletion of
     * domain topic can be auto-managed (when true) or self-managed (when false). The default value for this property is
     * true. When this property is set to true, Event Grid is responsible of automatically deleting the domain topic
     * when the last event subscription at the scope of the domain topic is deleted. If this property is set to false,
     * then the user needs to manually delete the domain topic when it is no longer needed (e.g., when last event
     * subscription is deleted and the resource needs to be cleaned up). The self-management mode can be used if the
     * user wants full control of when the domain topic needs to be deleted, while auto-managed mode provides the
     * flexibility to perform less operations and manage fewer resources by the user.
     *
     * @return the autoDeleteTopicWithLastSubscription value.
     */
    public Boolean autoDeleteTopicWithLastSubscription() {
        return this.innerProperties() == null ? null : this.innerProperties().autoDeleteTopicWithLastSubscription();
    }

    /**
     * Set the autoDeleteTopicWithLastSubscription property: This Boolean is used to specify the deletion mechanism for
     * 'all' the Event Grid Domain Topics associated with this Event Grid Domain resource. In this context, deletion of
     * domain topic can be auto-managed (when true) or self-managed (when false). The default value for this property is
     * true. When this property is set to true, Event Grid is responsible of automatically deleting the domain topic
     * when the last event subscription at the scope of the domain topic is deleted. If this property is set to false,
     * then the user needs to manually delete the domain topic when it is no longer needed (e.g., when last event
     * subscription is deleted and the resource needs to be cleaned up). The self-management mode can be used if the
     * user wants full control of when the domain topic needs to be deleted, while auto-managed mode provides the
     * flexibility to perform less operations and manage fewer resources by the user.
     *
     * @param autoDeleteTopicWithLastSubscription the autoDeleteTopicWithLastSubscription value to set.
     * @return the DomainInner object itself.
     */
    public DomainInner withAutoDeleteTopicWithLastSubscription(Boolean autoDeleteTopicWithLastSubscription) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DomainProperties();
        }
        this.innerProperties().withAutoDeleteTopicWithLastSubscription(autoDeleteTopicWithLastSubscription);
        return this;
    }

    /**
     * Get the dataResidencyBoundary property: Data Residency Boundary of the resource.
     *
     * @return the dataResidencyBoundary value.
     */
    public DataResidencyBoundary dataResidencyBoundary() {
        return this.innerProperties() == null ? null : this.innerProperties().dataResidencyBoundary();
    }

    /**
     * Set the dataResidencyBoundary property: Data Residency Boundary of the resource.
     *
     * @param dataResidencyBoundary the dataResidencyBoundary value to set.
     * @return the DomainInner object itself.
     */
    public DomainInner withDataResidencyBoundary(DataResidencyBoundary dataResidencyBoundary) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DomainProperties();
        }
        this.innerProperties().withDataResidencyBoundary(dataResidencyBoundary);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (sku() != null) {
            sku().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
    }
}
