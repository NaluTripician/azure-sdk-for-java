// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/**
 * Power BI Workspace linked service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("PowerBIWorkspace")
@JsonFlatten
@Fluent
public class PowerBIWorkspaceLinkedService extends LinkedService {
    /*
     * The Power BI workspace id.
     */
    @JsonProperty(value = "typeProperties.workspaceId", required = true)
    private String workspaceId;

    /*
     * The tenant id to which the Power BI workspace belongs.
     */
    @JsonProperty(value = "typeProperties.tenantId", required = true)
    private String tenantId;

    /**
     * Creates an instance of PowerBIWorkspaceLinkedService class.
     */
    public PowerBIWorkspaceLinkedService() {
    }

    /**
     * Get the workspaceId property: The Power BI workspace id.
     * 
     * @return the workspaceId value.
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * Set the workspaceId property: The Power BI workspace id.
     * 
     * @param workspaceId the workspaceId value to set.
     * @return the PowerBIWorkspaceLinkedService object itself.
     */
    public PowerBIWorkspaceLinkedService setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * Get the tenantId property: The tenant id to which the Power BI workspace belongs.
     * 
     * @return the tenantId value.
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: The tenant id to which the Power BI workspace belongs.
     * 
     * @param tenantId the tenantId value to set.
     * @return the PowerBIWorkspaceLinkedService object itself.
     */
    public PowerBIWorkspaceLinkedService setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PowerBIWorkspaceLinkedService setConnectVia(IntegrationRuntimeReference connectVia) {
        super.setConnectVia(connectVia);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PowerBIWorkspaceLinkedService setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PowerBIWorkspaceLinkedService setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PowerBIWorkspaceLinkedService setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }
}
