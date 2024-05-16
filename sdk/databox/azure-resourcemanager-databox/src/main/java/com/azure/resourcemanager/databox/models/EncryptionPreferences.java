// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Preferences related to the Encryption. */
@Fluent
public final class EncryptionPreferences {
    /*
     * Defines secondary layer of software-based encryption enablement.
     */
    @JsonProperty(value = "doubleEncryption")
    private DoubleEncryption doubleEncryption;

    /*
     * Defines Hardware level encryption (Only for disk)
     */
    @JsonProperty(value = "hardwareEncryption")
    private HardwareEncryption hardwareEncryption;

    /** Creates an instance of EncryptionPreferences class. */
    public EncryptionPreferences() {
    }

    /**
     * Get the doubleEncryption property: Defines secondary layer of software-based encryption enablement.
     *
     * @return the doubleEncryption value.
     */
    public DoubleEncryption doubleEncryption() {
        return this.doubleEncryption;
    }

    /**
     * Set the doubleEncryption property: Defines secondary layer of software-based encryption enablement.
     *
     * @param doubleEncryption the doubleEncryption value to set.
     * @return the EncryptionPreferences object itself.
     */
    public EncryptionPreferences withDoubleEncryption(DoubleEncryption doubleEncryption) {
        this.doubleEncryption = doubleEncryption;
        return this;
    }

    /**
     * Get the hardwareEncryption property: Defines Hardware level encryption (Only for disk).
     *
     * @return the hardwareEncryption value.
     */
    public HardwareEncryption hardwareEncryption() {
        return this.hardwareEncryption;
    }

    /**
     * Set the hardwareEncryption property: Defines Hardware level encryption (Only for disk).
     *
     * @param hardwareEncryption the hardwareEncryption value to set.
     * @return the EncryptionPreferences object itself.
     */
    public EncryptionPreferences withHardwareEncryption(HardwareEncryption hardwareEncryption) {
        this.hardwareEncryption = hardwareEncryption;
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
