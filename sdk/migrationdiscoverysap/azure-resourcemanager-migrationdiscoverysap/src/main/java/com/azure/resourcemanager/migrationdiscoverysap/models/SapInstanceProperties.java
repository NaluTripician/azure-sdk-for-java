// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.migrationdiscoverysap.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines the SAP Instance properties.
 */
@Immutable
public final class SapInstanceProperties {
    /*
     * This is the SID of SAP System. Keeping this not equal to ID as different landscapes can have repeated System SID
     * IDs.
     */
    @JsonProperty(value = "systemSid", access = JsonProperty.Access.WRITE_ONLY)
    private String systemSid;

    /*
     * The Environment; PRD, QA, DEV, etc to which SAP system belongs to. Select from the list of available dropdown
     * values.
     */
    @JsonProperty(value = "environment", access = JsonProperty.Access.WRITE_ONLY)
    private SapInstanceEnvironment environment;

    /*
     * This is the SID of the production system in a landscape. An SAP system could itself be a production SID or a
     * part of a landscape with a different Production SID. This field can be used to relate non-prod SIDs, other
     * components, SID (WEBDISP) to the prod SID. Enter the value of Production SID.
     */
    @JsonProperty(value = "landscapeSid", access = JsonProperty.Access.WRITE_ONLY)
    private String landscapeSid;

    /*
     * Enter a business function/department identifier to group multiple SIDs.
     */
    @JsonProperty(value = "application", access = JsonProperty.Access.WRITE_ONLY)
    private String application;

    /*
     * Defines the provisioning states.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Defines the errors related to SAP Instance resource.
     */
    @JsonProperty(value = "errors", access = JsonProperty.Access.WRITE_ONLY)
    private SapMigrateError errors;

    /**
     * Creates an instance of SapInstanceProperties class.
     */
    public SapInstanceProperties() {
    }

    /**
     * Get the systemSid property: This is the SID of SAP System. Keeping this not equal to ID as different landscapes
     * can have repeated System SID IDs.
     * 
     * @return the systemSid value.
     */
    public String systemSid() {
        return this.systemSid;
    }

    /**
     * Get the environment property: The Environment; PRD, QA, DEV, etc to which SAP system belongs to. Select from the
     * list of available dropdown values.
     * 
     * @return the environment value.
     */
    public SapInstanceEnvironment environment() {
        return this.environment;
    }

    /**
     * Get the landscapeSid property: This is the SID of the production system in a landscape. An SAP system could
     * itself be a production SID or a part of a landscape with a different Production SID. This field can be used to
     * relate non-prod SIDs, other components, SID (WEBDISP) to the prod SID. Enter the value of Production SID.
     * 
     * @return the landscapeSid value.
     */
    public String landscapeSid() {
        return this.landscapeSid;
    }

    /**
     * Get the application property: Enter a business function/department identifier to group multiple SIDs.
     * 
     * @return the application value.
     */
    public String application() {
        return this.application;
    }

    /**
     * Get the provisioningState property: Defines the provisioning states.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the errors property: Defines the errors related to SAP Instance resource.
     * 
     * @return the errors value.
     */
    public SapMigrateError errors() {
        return this.errors;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (errors() != null) {
            errors().validate();
        }
    }
}
