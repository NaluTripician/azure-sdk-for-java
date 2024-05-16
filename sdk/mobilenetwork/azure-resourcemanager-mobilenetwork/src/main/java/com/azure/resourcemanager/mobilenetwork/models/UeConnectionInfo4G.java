// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * UE Connection Info for 4G.
 */
@Fluent
public final class UeConnectionInfo4G {
    /*
     * UE Location Info properties
     */
    @JsonProperty(value = "locationInfo")
    private UeLocationInfo locationInfo;

    /*
     * Global RAN Node ID
     */
    @JsonProperty(value = "globalRanNodeId", required = true)
    private GlobalRanNodeId globalRanNodeId;

    /*
     * Per-UE transport network layer association
     */
    @JsonProperty(value = "perUeTnla")
    private String perUeTnla;

    /*
     * MME S1AP identifier
     */
    @JsonProperty(value = "mmeS1apId", required = true)
    private int mmeS1ApId;

    /*
     * eNodeB S1AP identifier
     */
    @JsonProperty(value = "enbS1apId", required = true)
    private int enbS1ApId;

    /*
     * Last Visited TAI
     */
    @JsonProperty(value = "lastVisitedTai")
    private String lastVisitedTai;

    /*
     * State of the UE.
     */
    @JsonProperty(value = "ueState", required = true)
    private UeState ueState;

    /*
     * Radio connection establishment cause
     */
    @JsonProperty(value = "rrcEstablishmentCause", required = true)
    private RrcEstablishmentCause rrcEstablishmentCause;

    /*
     * The UE's usage setting
     */
    @JsonProperty(value = "ueUsageSetting")
    private UeUsageSetting ueUsageSetting;

    /*
     * The timestamp of last activity of UE (UTC).
     */
    @JsonProperty(value = "lastActivityTime")
    private OffsetDateTime lastActivityTime;

    /**
     * Creates an instance of UeConnectionInfo4G class.
     */
    public UeConnectionInfo4G() {
    }

    /**
     * Get the locationInfo property: UE Location Info properties.
     * 
     * @return the locationInfo value.
     */
    public UeLocationInfo locationInfo() {
        return this.locationInfo;
    }

    /**
     * Set the locationInfo property: UE Location Info properties.
     * 
     * @param locationInfo the locationInfo value to set.
     * @return the UeConnectionInfo4G object itself.
     */
    public UeConnectionInfo4G withLocationInfo(UeLocationInfo locationInfo) {
        this.locationInfo = locationInfo;
        return this;
    }

    /**
     * Get the globalRanNodeId property: Global RAN Node ID.
     * 
     * @return the globalRanNodeId value.
     */
    public GlobalRanNodeId globalRanNodeId() {
        return this.globalRanNodeId;
    }

    /**
     * Set the globalRanNodeId property: Global RAN Node ID.
     * 
     * @param globalRanNodeId the globalRanNodeId value to set.
     * @return the UeConnectionInfo4G object itself.
     */
    public UeConnectionInfo4G withGlobalRanNodeId(GlobalRanNodeId globalRanNodeId) {
        this.globalRanNodeId = globalRanNodeId;
        return this;
    }

    /**
     * Get the perUeTnla property: Per-UE transport network layer association.
     * 
     * @return the perUeTnla value.
     */
    public String perUeTnla() {
        return this.perUeTnla;
    }

    /**
     * Set the perUeTnla property: Per-UE transport network layer association.
     * 
     * @param perUeTnla the perUeTnla value to set.
     * @return the UeConnectionInfo4G object itself.
     */
    public UeConnectionInfo4G withPerUeTnla(String perUeTnla) {
        this.perUeTnla = perUeTnla;
        return this;
    }

    /**
     * Get the mmeS1ApId property: MME S1AP identifier.
     * 
     * @return the mmeS1ApId value.
     */
    public int mmeS1ApId() {
        return this.mmeS1ApId;
    }

    /**
     * Set the mmeS1ApId property: MME S1AP identifier.
     * 
     * @param mmeS1ApId the mmeS1ApId value to set.
     * @return the UeConnectionInfo4G object itself.
     */
    public UeConnectionInfo4G withMmeS1ApId(int mmeS1ApId) {
        this.mmeS1ApId = mmeS1ApId;
        return this;
    }

    /**
     * Get the enbS1ApId property: eNodeB S1AP identifier.
     * 
     * @return the enbS1ApId value.
     */
    public int enbS1ApId() {
        return this.enbS1ApId;
    }

    /**
     * Set the enbS1ApId property: eNodeB S1AP identifier.
     * 
     * @param enbS1ApId the enbS1ApId value to set.
     * @return the UeConnectionInfo4G object itself.
     */
    public UeConnectionInfo4G withEnbS1ApId(int enbS1ApId) {
        this.enbS1ApId = enbS1ApId;
        return this;
    }

    /**
     * Get the lastVisitedTai property: Last Visited TAI.
     * 
     * @return the lastVisitedTai value.
     */
    public String lastVisitedTai() {
        return this.lastVisitedTai;
    }

    /**
     * Set the lastVisitedTai property: Last Visited TAI.
     * 
     * @param lastVisitedTai the lastVisitedTai value to set.
     * @return the UeConnectionInfo4G object itself.
     */
    public UeConnectionInfo4G withLastVisitedTai(String lastVisitedTai) {
        this.lastVisitedTai = lastVisitedTai;
        return this;
    }

    /**
     * Get the ueState property: State of the UE.
     * 
     * @return the ueState value.
     */
    public UeState ueState() {
        return this.ueState;
    }

    /**
     * Set the ueState property: State of the UE.
     * 
     * @param ueState the ueState value to set.
     * @return the UeConnectionInfo4G object itself.
     */
    public UeConnectionInfo4G withUeState(UeState ueState) {
        this.ueState = ueState;
        return this;
    }

    /**
     * Get the rrcEstablishmentCause property: Radio connection establishment cause.
     * 
     * @return the rrcEstablishmentCause value.
     */
    public RrcEstablishmentCause rrcEstablishmentCause() {
        return this.rrcEstablishmentCause;
    }

    /**
     * Set the rrcEstablishmentCause property: Radio connection establishment cause.
     * 
     * @param rrcEstablishmentCause the rrcEstablishmentCause value to set.
     * @return the UeConnectionInfo4G object itself.
     */
    public UeConnectionInfo4G withRrcEstablishmentCause(RrcEstablishmentCause rrcEstablishmentCause) {
        this.rrcEstablishmentCause = rrcEstablishmentCause;
        return this;
    }

    /**
     * Get the ueUsageSetting property: The UE's usage setting.
     * 
     * @return the ueUsageSetting value.
     */
    public UeUsageSetting ueUsageSetting() {
        return this.ueUsageSetting;
    }

    /**
     * Set the ueUsageSetting property: The UE's usage setting.
     * 
     * @param ueUsageSetting the ueUsageSetting value to set.
     * @return the UeConnectionInfo4G object itself.
     */
    public UeConnectionInfo4G withUeUsageSetting(UeUsageSetting ueUsageSetting) {
        this.ueUsageSetting = ueUsageSetting;
        return this;
    }

    /**
     * Get the lastActivityTime property: The timestamp of last activity of UE (UTC).
     * 
     * @return the lastActivityTime value.
     */
    public OffsetDateTime lastActivityTime() {
        return this.lastActivityTime;
    }

    /**
     * Set the lastActivityTime property: The timestamp of last activity of UE (UTC).
     * 
     * @param lastActivityTime the lastActivityTime value to set.
     * @return the UeConnectionInfo4G object itself.
     */
    public UeConnectionInfo4G withLastActivityTime(OffsetDateTime lastActivityTime) {
        this.lastActivityTime = lastActivityTime;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (locationInfo() != null) {
            locationInfo().validate();
        }
        if (globalRanNodeId() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property globalRanNodeId in model UeConnectionInfo4G"));
        } else {
            globalRanNodeId().validate();
        }
        if (ueState() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property ueState in model UeConnectionInfo4G"));
        }
        if (rrcEstablishmentCause() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property rrcEstablishmentCause in model UeConnectionInfo4G"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(UeConnectionInfo4G.class);
}
