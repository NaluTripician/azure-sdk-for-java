// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Helm artifact profile.
 */
@Fluent
public final class HelmArtifactProfile {
    /*
     * Helm package name.
     */
    @JsonProperty(value = "helmPackageName")
    private String helmPackageName;

    /*
     * Helm package version range.
     */
    @JsonProperty(value = "helmPackageVersionRange")
    private String helmPackageVersionRange;

    /*
     * The registry values path list.
     */
    @JsonProperty(value = "registryValuesPaths")
    private List<String> registryValuesPaths;

    /*
     * The image pull secrets values path list.
     */
    @JsonProperty(value = "imagePullSecretsValuesPaths")
    private List<String> imagePullSecretsValuesPaths;

    /**
     * Creates an instance of HelmArtifactProfile class.
     */
    public HelmArtifactProfile() {
    }

    /**
     * Get the helmPackageName property: Helm package name.
     * 
     * @return the helmPackageName value.
     */
    public String helmPackageName() {
        return this.helmPackageName;
    }

    /**
     * Set the helmPackageName property: Helm package name.
     * 
     * @param helmPackageName the helmPackageName value to set.
     * @return the HelmArtifactProfile object itself.
     */
    public HelmArtifactProfile withHelmPackageName(String helmPackageName) {
        this.helmPackageName = helmPackageName;
        return this;
    }

    /**
     * Get the helmPackageVersionRange property: Helm package version range.
     * 
     * @return the helmPackageVersionRange value.
     */
    public String helmPackageVersionRange() {
        return this.helmPackageVersionRange;
    }

    /**
     * Set the helmPackageVersionRange property: Helm package version range.
     * 
     * @param helmPackageVersionRange the helmPackageVersionRange value to set.
     * @return the HelmArtifactProfile object itself.
     */
    public HelmArtifactProfile withHelmPackageVersionRange(String helmPackageVersionRange) {
        this.helmPackageVersionRange = helmPackageVersionRange;
        return this;
    }

    /**
     * Get the registryValuesPaths property: The registry values path list.
     * 
     * @return the registryValuesPaths value.
     */
    public List<String> registryValuesPaths() {
        return this.registryValuesPaths;
    }

    /**
     * Set the registryValuesPaths property: The registry values path list.
     * 
     * @param registryValuesPaths the registryValuesPaths value to set.
     * @return the HelmArtifactProfile object itself.
     */
    public HelmArtifactProfile withRegistryValuesPaths(List<String> registryValuesPaths) {
        this.registryValuesPaths = registryValuesPaths;
        return this;
    }

    /**
     * Get the imagePullSecretsValuesPaths property: The image pull secrets values path list.
     * 
     * @return the imagePullSecretsValuesPaths value.
     */
    public List<String> imagePullSecretsValuesPaths() {
        return this.imagePullSecretsValuesPaths;
    }

    /**
     * Set the imagePullSecretsValuesPaths property: The image pull secrets values path list.
     * 
     * @param imagePullSecretsValuesPaths the imagePullSecretsValuesPaths value to set.
     * @return the HelmArtifactProfile object itself.
     */
    public HelmArtifactProfile withImagePullSecretsValuesPaths(List<String> imagePullSecretsValuesPaths) {
        this.imagePullSecretsValuesPaths = imagePullSecretsValuesPaths;
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
