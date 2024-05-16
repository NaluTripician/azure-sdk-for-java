// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of a private endpoint connection. */
@Fluent
public final class ServerPrivateEndpointConnectionProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServerPrivateEndpointConnectionProperties.class);

    /*
     * Private endpoint which the connection belongs to.
     */
    @JsonProperty(value = "privateEndpoint")
    private PrivateEndpointProperty privateEndpoint;

    /*
     * Connection state of the private endpoint connection.
     */
    @JsonProperty(value = "privateLinkServiceConnectionState")
    private ServerPrivateLinkServiceConnectionStateProperty privateLinkServiceConnectionState;

    /*
     * State of the private endpoint connection.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private PrivateEndpointProvisioningState provisioningState;

    /**
     * Get the privateEndpoint property: Private endpoint which the connection belongs to.
     *
     * @return the privateEndpoint value.
     */
    public PrivateEndpointProperty privateEndpoint() {
        return this.privateEndpoint;
    }

    /**
     * Set the privateEndpoint property: Private endpoint which the connection belongs to.
     *
     * @param privateEndpoint the privateEndpoint value to set.
     * @return the ServerPrivateEndpointConnectionProperties object itself.
     */
    public ServerPrivateEndpointConnectionProperties withPrivateEndpoint(PrivateEndpointProperty privateEndpoint) {
        this.privateEndpoint = privateEndpoint;
        return this;
    }

    /**
     * Get the privateLinkServiceConnectionState property: Connection state of the private endpoint connection.
     *
     * @return the privateLinkServiceConnectionState value.
     */
    public ServerPrivateLinkServiceConnectionStateProperty privateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    /**
     * Set the privateLinkServiceConnectionState property: Connection state of the private endpoint connection.
     *
     * @param privateLinkServiceConnectionState the privateLinkServiceConnectionState value to set.
     * @return the ServerPrivateEndpointConnectionProperties object itself.
     */
    public ServerPrivateEndpointConnectionProperties withPrivateLinkServiceConnectionState(
        ServerPrivateLinkServiceConnectionStateProperty privateLinkServiceConnectionState) {
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        return this;
    }

    /**
     * Get the provisioningState property: State of the private endpoint connection.
     *
     * @return the provisioningState value.
     */
    public PrivateEndpointProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (privateEndpoint() != null) {
            privateEndpoint().validate();
        }
        if (privateLinkServiceConnectionState() != null) {
            privateLinkServiceConnectionState().validate();
        }
    }
}
