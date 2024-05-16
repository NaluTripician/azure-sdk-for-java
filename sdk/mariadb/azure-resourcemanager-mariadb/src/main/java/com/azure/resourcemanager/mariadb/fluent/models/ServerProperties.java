// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.mariadb.models.MinimalTlsVersionEnum;
import com.azure.resourcemanager.mariadb.models.PublicNetworkAccessEnum;
import com.azure.resourcemanager.mariadb.models.ServerPrivateEndpointConnection;
import com.azure.resourcemanager.mariadb.models.ServerState;
import com.azure.resourcemanager.mariadb.models.ServerVersion;
import com.azure.resourcemanager.mariadb.models.SslEnforcementEnum;
import com.azure.resourcemanager.mariadb.models.StorageProfile;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The properties of a server. */
@Fluent
public final class ServerProperties {
    /*
     * The administrator's login name of a server. Can only be specified when the server is being created (and is
     * required for creation).
     */
    @JsonProperty(value = "administratorLogin")
    private String administratorLogin;

    /*
     * Server version.
     */
    @JsonProperty(value = "version")
    private ServerVersion version;

    /*
     * Enable ssl enforcement or not when connect to server.
     */
    @JsonProperty(value = "sslEnforcement")
    private SslEnforcementEnum sslEnforcement;

    /*
     * Enforce a minimal Tls version for the server.
     */
    @JsonProperty(value = "minimalTlsVersion")
    private MinimalTlsVersionEnum minimalTlsVersion;

    /*
     * A state of a server that is visible to user.
     */
    @JsonProperty(value = "userVisibleState")
    private ServerState userVisibleState;

    /*
     * The fully qualified domain name of a server.
     */
    @JsonProperty(value = "fullyQualifiedDomainName")
    private String fullyQualifiedDomainName;

    /*
     * Earliest restore point creation time (ISO8601 format)
     */
    @JsonProperty(value = "earliestRestoreDate")
    private OffsetDateTime earliestRestoreDate;

    /*
     * Storage profile of a server.
     */
    @JsonProperty(value = "storageProfile")
    private StorageProfile storageProfile;

    /*
     * The replication role of the server.
     */
    @JsonProperty(value = "replicationRole")
    private String replicationRole;

    /*
     * The master server id of a replica server.
     */
    @JsonProperty(value = "masterServerId")
    private String masterServerId;

    /*
     * The maximum number of replicas that a master server can have.
     */
    @JsonProperty(value = "replicaCapacity")
    private Integer replicaCapacity;

    /*
     * Whether or not public network access is allowed for this server. Value is optional but if passed in, must be
     * 'Enabled' or 'Disabled'
     */
    @JsonProperty(value = "publicNetworkAccess")
    private PublicNetworkAccessEnum publicNetworkAccess;

    /*
     * List of private endpoint connections on a server
     */
    @JsonProperty(value = "privateEndpointConnections", access = JsonProperty.Access.WRITE_ONLY)
    private List<ServerPrivateEndpointConnection> privateEndpointConnections;

    /** Creates an instance of ServerProperties class. */
    public ServerProperties() {
    }

    /**
     * Get the administratorLogin property: The administrator's login name of a server. Can only be specified when the
     * server is being created (and is required for creation).
     *
     * @return the administratorLogin value.
     */
    public String administratorLogin() {
        return this.administratorLogin;
    }

    /**
     * Set the administratorLogin property: The administrator's login name of a server. Can only be specified when the
     * server is being created (and is required for creation).
     *
     * @param administratorLogin the administratorLogin value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withAdministratorLogin(String administratorLogin) {
        this.administratorLogin = administratorLogin;
        return this;
    }

    /**
     * Get the version property: Server version.
     *
     * @return the version value.
     */
    public ServerVersion version() {
        return this.version;
    }

    /**
     * Set the version property: Server version.
     *
     * @param version the version value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withVersion(ServerVersion version) {
        this.version = version;
        return this;
    }

    /**
     * Get the sslEnforcement property: Enable ssl enforcement or not when connect to server.
     *
     * @return the sslEnforcement value.
     */
    public SslEnforcementEnum sslEnforcement() {
        return this.sslEnforcement;
    }

    /**
     * Set the sslEnforcement property: Enable ssl enforcement or not when connect to server.
     *
     * @param sslEnforcement the sslEnforcement value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withSslEnforcement(SslEnforcementEnum sslEnforcement) {
        this.sslEnforcement = sslEnforcement;
        return this;
    }

    /**
     * Get the minimalTlsVersion property: Enforce a minimal Tls version for the server.
     *
     * @return the minimalTlsVersion value.
     */
    public MinimalTlsVersionEnum minimalTlsVersion() {
        return this.minimalTlsVersion;
    }

    /**
     * Set the minimalTlsVersion property: Enforce a minimal Tls version for the server.
     *
     * @param minimalTlsVersion the minimalTlsVersion value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withMinimalTlsVersion(MinimalTlsVersionEnum minimalTlsVersion) {
        this.minimalTlsVersion = minimalTlsVersion;
        return this;
    }

    /**
     * Get the userVisibleState property: A state of a server that is visible to user.
     *
     * @return the userVisibleState value.
     */
    public ServerState userVisibleState() {
        return this.userVisibleState;
    }

    /**
     * Set the userVisibleState property: A state of a server that is visible to user.
     *
     * @param userVisibleState the userVisibleState value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withUserVisibleState(ServerState userVisibleState) {
        this.userVisibleState = userVisibleState;
        return this;
    }

    /**
     * Get the fullyQualifiedDomainName property: The fully qualified domain name of a server.
     *
     * @return the fullyQualifiedDomainName value.
     */
    public String fullyQualifiedDomainName() {
        return this.fullyQualifiedDomainName;
    }

    /**
     * Set the fullyQualifiedDomainName property: The fully qualified domain name of a server.
     *
     * @param fullyQualifiedDomainName the fullyQualifiedDomainName value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withFullyQualifiedDomainName(String fullyQualifiedDomainName) {
        this.fullyQualifiedDomainName = fullyQualifiedDomainName;
        return this;
    }

    /**
     * Get the earliestRestoreDate property: Earliest restore point creation time (ISO8601 format).
     *
     * @return the earliestRestoreDate value.
     */
    public OffsetDateTime earliestRestoreDate() {
        return this.earliestRestoreDate;
    }

    /**
     * Set the earliestRestoreDate property: Earliest restore point creation time (ISO8601 format).
     *
     * @param earliestRestoreDate the earliestRestoreDate value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withEarliestRestoreDate(OffsetDateTime earliestRestoreDate) {
        this.earliestRestoreDate = earliestRestoreDate;
        return this;
    }

    /**
     * Get the storageProfile property: Storage profile of a server.
     *
     * @return the storageProfile value.
     */
    public StorageProfile storageProfile() {
        return this.storageProfile;
    }

    /**
     * Set the storageProfile property: Storage profile of a server.
     *
     * @param storageProfile the storageProfile value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withStorageProfile(StorageProfile storageProfile) {
        this.storageProfile = storageProfile;
        return this;
    }

    /**
     * Get the replicationRole property: The replication role of the server.
     *
     * @return the replicationRole value.
     */
    public String replicationRole() {
        return this.replicationRole;
    }

    /**
     * Set the replicationRole property: The replication role of the server.
     *
     * @param replicationRole the replicationRole value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withReplicationRole(String replicationRole) {
        this.replicationRole = replicationRole;
        return this;
    }

    /**
     * Get the masterServerId property: The master server id of a replica server.
     *
     * @return the masterServerId value.
     */
    public String masterServerId() {
        return this.masterServerId;
    }

    /**
     * Set the masterServerId property: The master server id of a replica server.
     *
     * @param masterServerId the masterServerId value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withMasterServerId(String masterServerId) {
        this.masterServerId = masterServerId;
        return this;
    }

    /**
     * Get the replicaCapacity property: The maximum number of replicas that a master server can have.
     *
     * @return the replicaCapacity value.
     */
    public Integer replicaCapacity() {
        return this.replicaCapacity;
    }

    /**
     * Set the replicaCapacity property: The maximum number of replicas that a master server can have.
     *
     * @param replicaCapacity the replicaCapacity value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withReplicaCapacity(Integer replicaCapacity) {
        this.replicaCapacity = replicaCapacity;
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Whether or not public network access is allowed for this server. Value is
     * optional but if passed in, must be 'Enabled' or 'Disabled'.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccessEnum publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: Whether or not public network access is allowed for this server. Value is
     * optional but if passed in, must be 'Enabled' or 'Disabled'.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withPublicNetworkAccess(PublicNetworkAccessEnum publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the privateEndpointConnections property: List of private endpoint connections on a server.
     *
     * @return the privateEndpointConnections value.
     */
    public List<ServerPrivateEndpointConnection> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (storageProfile() != null) {
            storageProfile().validate();
        }
        if (privateEndpointConnections() != null) {
            privateEndpointConnections().forEach(e -> e.validate());
        }
    }
}
