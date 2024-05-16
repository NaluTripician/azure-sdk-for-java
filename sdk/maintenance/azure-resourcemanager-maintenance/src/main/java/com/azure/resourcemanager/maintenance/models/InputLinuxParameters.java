// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Input properties for patching a Linux machine. */
@Fluent
public final class InputLinuxParameters {
    /*
     * Package names to be excluded for patching.
     */
    @JsonProperty(value = "packageNameMasksToExclude")
    private List<String> packageNameMasksToExclude;

    /*
     * Package names to be included for patching.
     */
    @JsonProperty(value = "packageNameMasksToInclude")
    private List<String> packageNameMasksToInclude;

    /*
     * Classification category of patches to be patched
     */
    @JsonProperty(value = "classificationsToInclude")
    private List<String> classificationsToInclude;

    /** Creates an instance of InputLinuxParameters class. */
    public InputLinuxParameters() {
    }

    /**
     * Get the packageNameMasksToExclude property: Package names to be excluded for patching.
     *
     * @return the packageNameMasksToExclude value.
     */
    public List<String> packageNameMasksToExclude() {
        return this.packageNameMasksToExclude;
    }

    /**
     * Set the packageNameMasksToExclude property: Package names to be excluded for patching.
     *
     * @param packageNameMasksToExclude the packageNameMasksToExclude value to set.
     * @return the InputLinuxParameters object itself.
     */
    public InputLinuxParameters withPackageNameMasksToExclude(List<String> packageNameMasksToExclude) {
        this.packageNameMasksToExclude = packageNameMasksToExclude;
        return this;
    }

    /**
     * Get the packageNameMasksToInclude property: Package names to be included for patching.
     *
     * @return the packageNameMasksToInclude value.
     */
    public List<String> packageNameMasksToInclude() {
        return this.packageNameMasksToInclude;
    }

    /**
     * Set the packageNameMasksToInclude property: Package names to be included for patching.
     *
     * @param packageNameMasksToInclude the packageNameMasksToInclude value to set.
     * @return the InputLinuxParameters object itself.
     */
    public InputLinuxParameters withPackageNameMasksToInclude(List<String> packageNameMasksToInclude) {
        this.packageNameMasksToInclude = packageNameMasksToInclude;
        return this;
    }

    /**
     * Get the classificationsToInclude property: Classification category of patches to be patched.
     *
     * @return the classificationsToInclude value.
     */
    public List<String> classificationsToInclude() {
        return this.classificationsToInclude;
    }

    /**
     * Set the classificationsToInclude property: Classification category of patches to be patched.
     *
     * @param classificationsToInclude the classificationsToInclude value to set.
     * @return the InputLinuxParameters object itself.
     */
    public InputLinuxParameters withClassificationsToInclude(List<String> classificationsToInclude) {
        this.classificationsToInclude = classificationsToInclude;
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
