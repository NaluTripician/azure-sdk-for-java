// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.devcenter.models.DevCenterProjectCatalogSettings;
import com.azure.resourcemanager.devcenter.models.Encryption;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of the devcenter. These properties can be updated after the resource has been created.
 */
@Fluent
public class DevCenterUpdateProperties {
    /*
     * Encryption settings to be used for server-side encryption for proprietary content (such as catalogs, logs, customizations).
     */
    @JsonProperty(value = "encryption")
    private Encryption encryption;

    /*
     * The display name of the devcenter.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Dev Center settings to be used when associating a project with a catalog.
     */
    @JsonProperty(value = "projectCatalogSettings")
    private DevCenterProjectCatalogSettings projectCatalogSettings;

    /**
     * Creates an instance of DevCenterUpdateProperties class.
     */
    public DevCenterUpdateProperties() {
    }

    /**
     * Get the encryption property: Encryption settings to be used for server-side encryption for proprietary content
     * (such as catalogs, logs, customizations).
     * 
     * @return the encryption value.
     */
    public Encryption encryption() {
        return this.encryption;
    }

    /**
     * Set the encryption property: Encryption settings to be used for server-side encryption for proprietary content
     * (such as catalogs, logs, customizations).
     * 
     * @param encryption the encryption value to set.
     * @return the DevCenterUpdateProperties object itself.
     */
    public DevCenterUpdateProperties withEncryption(Encryption encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Get the displayName property: The display name of the devcenter.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name of the devcenter.
     * 
     * @param displayName the displayName value to set.
     * @return the DevCenterUpdateProperties object itself.
     */
    public DevCenterUpdateProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the projectCatalogSettings property: Dev Center settings to be used when associating a project with a
     * catalog.
     * 
     * @return the projectCatalogSettings value.
     */
    public DevCenterProjectCatalogSettings projectCatalogSettings() {
        return this.projectCatalogSettings;
    }

    /**
     * Set the projectCatalogSettings property: Dev Center settings to be used when associating a project with a
     * catalog.
     * 
     * @param projectCatalogSettings the projectCatalogSettings value to set.
     * @return the DevCenterUpdateProperties object itself.
     */
    public DevCenterUpdateProperties
        withProjectCatalogSettings(DevCenterProjectCatalogSettings projectCatalogSettings) {
        this.projectCatalogSettings = projectCatalogSettings;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (encryption() != null) {
            encryption().validate();
        }
        if (projectCatalogSettings() != null) {
            projectCatalogSettings().validate();
        }
    }
}
