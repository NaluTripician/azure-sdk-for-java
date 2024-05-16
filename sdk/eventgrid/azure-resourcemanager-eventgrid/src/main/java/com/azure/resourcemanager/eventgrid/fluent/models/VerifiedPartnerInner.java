// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.eventgrid.models.PartnerDetails;
import com.azure.resourcemanager.eventgrid.models.VerifiedPartnerProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/**
 * Verified partner information.
 */
@Fluent
public final class VerifiedPartnerInner extends ProxyResource {
    /*
     * Properties of the verified partner.
     */
    @JsonProperty(value = "properties")
    private VerifiedPartnerProperties innerProperties;

    /*
     * The system metadata relating to Verified Partner resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Creates an instance of VerifiedPartnerInner class.
     */
    public VerifiedPartnerInner() {
    }

    /**
     * Get the innerProperties property: Properties of the verified partner.
     * 
     * @return the innerProperties value.
     */
    private VerifiedPartnerProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: The system metadata relating to Verified Partner resource.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the partnerRegistrationImmutableId property: ImmutableId of the corresponding partner registration.
     * 
     * @return the partnerRegistrationImmutableId value.
     */
    public UUID partnerRegistrationImmutableId() {
        return this.innerProperties() == null ? null : this.innerProperties().partnerRegistrationImmutableId();
    }

    /**
     * Set the partnerRegistrationImmutableId property: ImmutableId of the corresponding partner registration.
     * 
     * @param partnerRegistrationImmutableId the partnerRegistrationImmutableId value to set.
     * @return the VerifiedPartnerInner object itself.
     */
    public VerifiedPartnerInner withPartnerRegistrationImmutableId(UUID partnerRegistrationImmutableId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VerifiedPartnerProperties();
        }
        this.innerProperties().withPartnerRegistrationImmutableId(partnerRegistrationImmutableId);
        return this;
    }

    /**
     * Get the organizationName property: Official name of the Partner.
     * 
     * @return the organizationName value.
     */
    public String organizationName() {
        return this.innerProperties() == null ? null : this.innerProperties().organizationName();
    }

    /**
     * Set the organizationName property: Official name of the Partner.
     * 
     * @param organizationName the organizationName value to set.
     * @return the VerifiedPartnerInner object itself.
     */
    public VerifiedPartnerInner withOrganizationName(String organizationName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VerifiedPartnerProperties();
        }
        this.innerProperties().withOrganizationName(organizationName);
        return this;
    }

    /**
     * Get the partnerDisplayName property: Display name of the verified partner.
     * 
     * @return the partnerDisplayName value.
     */
    public String partnerDisplayName() {
        return this.innerProperties() == null ? null : this.innerProperties().partnerDisplayName();
    }

    /**
     * Set the partnerDisplayName property: Display name of the verified partner.
     * 
     * @param partnerDisplayName the partnerDisplayName value to set.
     * @return the VerifiedPartnerInner object itself.
     */
    public VerifiedPartnerInner withPartnerDisplayName(String partnerDisplayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VerifiedPartnerProperties();
        }
        this.innerProperties().withPartnerDisplayName(partnerDisplayName);
        return this;
    }

    /**
     * Get the partnerTopicDetails property: Details of the partner topic scenario.
     * 
     * @return the partnerTopicDetails value.
     */
    public PartnerDetails partnerTopicDetails() {
        return this.innerProperties() == null ? null : this.innerProperties().partnerTopicDetails();
    }

    /**
     * Set the partnerTopicDetails property: Details of the partner topic scenario.
     * 
     * @param partnerTopicDetails the partnerTopicDetails value to set.
     * @return the VerifiedPartnerInner object itself.
     */
    public VerifiedPartnerInner withPartnerTopicDetails(PartnerDetails partnerTopicDetails) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VerifiedPartnerProperties();
        }
        this.innerProperties().withPartnerTopicDetails(partnerTopicDetails);
        return this;
    }

    /**
     * Get the partnerDestinationDetails property: Details of the partner destination scenario.
     * 
     * @return the partnerDestinationDetails value.
     */
    public PartnerDetails partnerDestinationDetails() {
        return this.innerProperties() == null ? null : this.innerProperties().partnerDestinationDetails();
    }

    /**
     * Set the partnerDestinationDetails property: Details of the partner destination scenario.
     * 
     * @param partnerDestinationDetails the partnerDestinationDetails value to set.
     * @return the VerifiedPartnerInner object itself.
     */
    public VerifiedPartnerInner withPartnerDestinationDetails(PartnerDetails partnerDestinationDetails) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VerifiedPartnerProperties();
        }
        this.innerProperties().withPartnerDestinationDetails(partnerDestinationDetails);
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the verified partner.
     * 
     * @return the provisioningState value.
     */
    public VerifiedPartnerProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Set the provisioningState property: Provisioning state of the verified partner.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the VerifiedPartnerInner object itself.
     */
    public VerifiedPartnerInner withProvisioningState(VerifiedPartnerProvisioningState provisioningState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VerifiedPartnerProperties();
        }
        this.innerProperties().withProvisioningState(provisioningState);
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
    }
}
