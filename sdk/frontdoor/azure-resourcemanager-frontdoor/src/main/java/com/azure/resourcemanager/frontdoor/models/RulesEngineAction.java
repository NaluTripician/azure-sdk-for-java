// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * One or more actions that will execute, modifying the request and/or response.
 */
@Fluent
public final class RulesEngineAction {
    /*
     * A list of header actions to apply from the request from AFD to the origin.
     */
    @JsonProperty(value = "requestHeaderActions")
    private List<HeaderAction> requestHeaderActions;

    /*
     * A list of header actions to apply from the response from AFD to the client.
     */
    @JsonProperty(value = "responseHeaderActions")
    private List<HeaderAction> responseHeaderActions;

    /*
     * Override the route configuration.
     */
    @JsonProperty(value = "routeConfigurationOverride")
    private RouteConfiguration routeConfigurationOverride;

    /**
     * Creates an instance of RulesEngineAction class.
     */
    public RulesEngineAction() {
    }

    /**
     * Get the requestHeaderActions property: A list of header actions to apply from the request from AFD to the origin.
     * 
     * @return the requestHeaderActions value.
     */
    public List<HeaderAction> requestHeaderActions() {
        return this.requestHeaderActions;
    }

    /**
     * Set the requestHeaderActions property: A list of header actions to apply from the request from AFD to the origin.
     * 
     * @param requestHeaderActions the requestHeaderActions value to set.
     * @return the RulesEngineAction object itself.
     */
    public RulesEngineAction withRequestHeaderActions(List<HeaderAction> requestHeaderActions) {
        this.requestHeaderActions = requestHeaderActions;
        return this;
    }

    /**
     * Get the responseHeaderActions property: A list of header actions to apply from the response from AFD to the
     * client.
     * 
     * @return the responseHeaderActions value.
     */
    public List<HeaderAction> responseHeaderActions() {
        return this.responseHeaderActions;
    }

    /**
     * Set the responseHeaderActions property: A list of header actions to apply from the response from AFD to the
     * client.
     * 
     * @param responseHeaderActions the responseHeaderActions value to set.
     * @return the RulesEngineAction object itself.
     */
    public RulesEngineAction withResponseHeaderActions(List<HeaderAction> responseHeaderActions) {
        this.responseHeaderActions = responseHeaderActions;
        return this;
    }

    /**
     * Get the routeConfigurationOverride property: Override the route configuration.
     * 
     * @return the routeConfigurationOverride value.
     */
    public RouteConfiguration routeConfigurationOverride() {
        return this.routeConfigurationOverride;
    }

    /**
     * Set the routeConfigurationOverride property: Override the route configuration.
     * 
     * @param routeConfigurationOverride the routeConfigurationOverride value to set.
     * @return the RulesEngineAction object itself.
     */
    public RulesEngineAction withRouteConfigurationOverride(RouteConfiguration routeConfigurationOverride) {
        this.routeConfigurationOverride = routeConfigurationOverride;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (requestHeaderActions() != null) {
            requestHeaderActions().forEach(e -> e.validate());
        }
        if (responseHeaderActions() != null) {
            responseHeaderActions().forEach(e -> e.validate());
        }
        if (routeConfigurationOverride() != null) {
            routeConfigurationOverride().validate();
        }
    }
}
