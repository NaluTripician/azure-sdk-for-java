// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Cluster version properties.
 */
@Fluent
public final class ClusterVersionProperties {
    /*
     * The type of cluster.
     */
    @JsonProperty(value = "clusterType")
    private String clusterType;

    /*
     * Version with three part.
     */
    @JsonProperty(value = "clusterVersion")
    private String clusterVersion;

    /*
     * Version with three part.
     */
    @JsonProperty(value = "ossVersion")
    private String ossVersion;

    /*
     * The two part cluster pool version. If the cluster version is before cluster pool version on-board, the return
     * value will be empty string
     */
    @JsonProperty(value = "clusterPoolVersion")
    private String clusterPoolVersion;

    /*
     * Indicate if this version is in preview or not.
     */
    @JsonProperty(value = "isPreview")
    private Boolean isPreview;

    /*
     * Component list of this cluster type and version.
     */
    @JsonProperty(value = "components", access = JsonProperty.Access.WRITE_ONLY)
    private List<ClusterComponentsItem> components;

    /**
     * Creates an instance of ClusterVersionProperties class.
     */
    public ClusterVersionProperties() {
    }

    /**
     * Get the clusterType property: The type of cluster.
     * 
     * @return the clusterType value.
     */
    public String clusterType() {
        return this.clusterType;
    }

    /**
     * Set the clusterType property: The type of cluster.
     * 
     * @param clusterType the clusterType value to set.
     * @return the ClusterVersionProperties object itself.
     */
    public ClusterVersionProperties withClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    /**
     * Get the clusterVersion property: Version with three part.
     * 
     * @return the clusterVersion value.
     */
    public String clusterVersion() {
        return this.clusterVersion;
    }

    /**
     * Set the clusterVersion property: Version with three part.
     * 
     * @param clusterVersion the clusterVersion value to set.
     * @return the ClusterVersionProperties object itself.
     */
    public ClusterVersionProperties withClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
        return this;
    }

    /**
     * Get the ossVersion property: Version with three part.
     * 
     * @return the ossVersion value.
     */
    public String ossVersion() {
        return this.ossVersion;
    }

    /**
     * Set the ossVersion property: Version with three part.
     * 
     * @param ossVersion the ossVersion value to set.
     * @return the ClusterVersionProperties object itself.
     */
    public ClusterVersionProperties withOssVersion(String ossVersion) {
        this.ossVersion = ossVersion;
        return this;
    }

    /**
     * Get the clusterPoolVersion property: The two part cluster pool version. If the cluster version is before cluster
     * pool version on-board, the return value will be empty string.
     * 
     * @return the clusterPoolVersion value.
     */
    public String clusterPoolVersion() {
        return this.clusterPoolVersion;
    }

    /**
     * Set the clusterPoolVersion property: The two part cluster pool version. If the cluster version is before cluster
     * pool version on-board, the return value will be empty string.
     * 
     * @param clusterPoolVersion the clusterPoolVersion value to set.
     * @return the ClusterVersionProperties object itself.
     */
    public ClusterVersionProperties withClusterPoolVersion(String clusterPoolVersion) {
        this.clusterPoolVersion = clusterPoolVersion;
        return this;
    }

    /**
     * Get the isPreview property: Indicate if this version is in preview or not.
     * 
     * @return the isPreview value.
     */
    public Boolean isPreview() {
        return this.isPreview;
    }

    /**
     * Set the isPreview property: Indicate if this version is in preview or not.
     * 
     * @param isPreview the isPreview value to set.
     * @return the ClusterVersionProperties object itself.
     */
    public ClusterVersionProperties withIsPreview(Boolean isPreview) {
        this.isPreview = isPreview;
        return this;
    }

    /**
     * Get the components property: Component list of this cluster type and version.
     * 
     * @return the components value.
     */
    public List<ClusterComponentsItem> components() {
        return this.components;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (components() != null) {
            components().forEach(e -> e.validate());
        }
    }
}
