// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The client access policy. */
@Fluent
public final class CrossSiteAccessPolicies {
    /*
     * The content of clientaccesspolicy.xml used by Silverlight.
     */
    @JsonProperty(value = "clientAccessPolicy")
    private String clientAccessPolicy;

    /*
     * The content of crossdomain.xml used by Silverlight.
     */
    @JsonProperty(value = "crossDomainPolicy")
    private String crossDomainPolicy;

    /** Creates an instance of CrossSiteAccessPolicies class. */
    public CrossSiteAccessPolicies() {
    }

    /**
     * Get the clientAccessPolicy property: The content of clientaccesspolicy.xml used by Silverlight.
     *
     * @return the clientAccessPolicy value.
     */
    public String clientAccessPolicy() {
        return this.clientAccessPolicy;
    }

    /**
     * Set the clientAccessPolicy property: The content of clientaccesspolicy.xml used by Silverlight.
     *
     * @param clientAccessPolicy the clientAccessPolicy value to set.
     * @return the CrossSiteAccessPolicies object itself.
     */
    public CrossSiteAccessPolicies withClientAccessPolicy(String clientAccessPolicy) {
        this.clientAccessPolicy = clientAccessPolicy;
        return this;
    }

    /**
     * Get the crossDomainPolicy property: The content of crossdomain.xml used by Silverlight.
     *
     * @return the crossDomainPolicy value.
     */
    public String crossDomainPolicy() {
        return this.crossDomainPolicy;
    }

    /**
     * Set the crossDomainPolicy property: The content of crossdomain.xml used by Silverlight.
     *
     * @param crossDomainPolicy the crossDomainPolicy value to set.
     * @return the CrossSiteAccessPolicies object itself.
     */
    public CrossSiteAccessPolicies withCrossDomainPolicy(String crossDomainPolicy) {
        this.crossDomainPolicy = crossDomainPolicy;
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
