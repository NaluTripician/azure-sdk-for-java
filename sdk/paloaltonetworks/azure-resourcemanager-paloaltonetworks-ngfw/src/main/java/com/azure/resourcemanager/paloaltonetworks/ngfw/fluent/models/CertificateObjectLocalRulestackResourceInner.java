// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.BooleanEnum;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * LocalRulestack Certificate Object.
 */
@Fluent
public final class CertificateObjectLocalRulestackResourceInner extends ProxyResource {
    /*
     * The resource-specific properties for this resource.
     */
    @JsonProperty(value = "properties", required = true)
    private CertificateObject innerProperties = new CertificateObject();

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Creates an instance of CertificateObjectLocalRulestackResourceInner class.
     */
    public CertificateObjectLocalRulestackResourceInner() {
    }

    /**
     * Get the innerProperties property: The resource-specific properties for this resource.
     * 
     * @return the innerProperties value.
     */
    private CertificateObject innerProperties() {
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

    /**
     * Get the certificateSignerResourceId property: Resource Id of certificate signer, to be populated only when
     * certificateSelfSigned is false.
     * 
     * @return the certificateSignerResourceId value.
     */
    public String certificateSignerResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().certificateSignerResourceId();
    }

    /**
     * Set the certificateSignerResourceId property: Resource Id of certificate signer, to be populated only when
     * certificateSelfSigned is false.
     * 
     * @param certificateSignerResourceId the certificateSignerResourceId value to set.
     * @return the CertificateObjectLocalRulestackResourceInner object itself.
     */
    public CertificateObjectLocalRulestackResourceInner
        withCertificateSignerResourceId(String certificateSignerResourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CertificateObject();
        }
        this.innerProperties().withCertificateSignerResourceId(certificateSignerResourceId);
        return this;
    }

    /**
     * Get the certificateSelfSigned property: use certificate self signed.
     * 
     * @return the certificateSelfSigned value.
     */
    public BooleanEnum certificateSelfSigned() {
        return this.innerProperties() == null ? null : this.innerProperties().certificateSelfSigned();
    }

    /**
     * Set the certificateSelfSigned property: use certificate self signed.
     * 
     * @param certificateSelfSigned the certificateSelfSigned value to set.
     * @return the CertificateObjectLocalRulestackResourceInner object itself.
     */
    public CertificateObjectLocalRulestackResourceInner withCertificateSelfSigned(BooleanEnum certificateSelfSigned) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CertificateObject();
        }
        this.innerProperties().withCertificateSelfSigned(certificateSelfSigned);
        return this;
    }

    /**
     * Get the auditComment property: comment for this object.
     * 
     * @return the auditComment value.
     */
    public String auditComment() {
        return this.innerProperties() == null ? null : this.innerProperties().auditComment();
    }

    /**
     * Set the auditComment property: comment for this object.
     * 
     * @param auditComment the auditComment value to set.
     * @return the CertificateObjectLocalRulestackResourceInner object itself.
     */
    public CertificateObjectLocalRulestackResourceInner withAuditComment(String auditComment) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CertificateObject();
        }
        this.innerProperties().withAuditComment(auditComment);
        return this;
    }

    /**
     * Get the description property: user description for this object.
     * 
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: user description for this object.
     * 
     * @param description the description value to set.
     * @return the CertificateObjectLocalRulestackResourceInner object itself.
     */
    public CertificateObjectLocalRulestackResourceInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CertificateObject();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the etag property: read only string representing last create or update.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.innerProperties() == null ? null : this.innerProperties().etag();
    }

    /**
     * Set the etag property: read only string representing last create or update.
     * 
     * @param etag the etag value to set.
     * @return the CertificateObjectLocalRulestackResourceInner object itself.
     */
    public CertificateObjectLocalRulestackResourceInner withEtag(String etag) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CertificateObject();
        }
        this.innerProperties().withEtag(etag);
        return this;
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
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property innerProperties in model CertificateObjectLocalRulestackResourceInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CertificateObjectLocalRulestackResourceInner.class);
}
