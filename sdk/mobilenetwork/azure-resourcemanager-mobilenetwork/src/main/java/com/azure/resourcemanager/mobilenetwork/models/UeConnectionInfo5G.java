// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * UE Connection Info for 5G.
 */
@Fluent
public final class UeConnectionInfo5G {
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
     * The AMF UE NGAP ID
     */
    @JsonProperty(value = "amfUeNgapId", required = true)
    private long amfUeNgapId;

    /*
     * The RAN UE NGAP ID
     */
    @JsonProperty(value = "ranUeNgapId", required = true)
    private int ranUeNgapId;

    /*
     * Last Visited TAI
     */
    @JsonProperty(value = "lastVisitedTai")
    private String lastVisitedTai;

    /*
     * Allowed Network Slice Selection Assistance Information
     */
    @JsonProperty(value = "allowedNssai")
    private List<Snssai> allowedNssai;

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
     * Creates an instance of UeConnectionInfo5G class.
     */
    public UeConnectionInfo5G() {
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
     * @return the UeConnectionInfo5G object itself.
     */
    public UeConnectionInfo5G withLocationInfo(UeLocationInfo locationInfo) {
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
     * @return the UeConnectionInfo5G object itself.
     */
    public UeConnectionInfo5G withGlobalRanNodeId(GlobalRanNodeId globalRanNodeId) {
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
     * @return the UeConnectionInfo5G object itself.
     */
    public UeConnectionInfo5G withPerUeTnla(String perUeTnla) {
        this.perUeTnla = perUeTnla;
        return this;
    }

    /**
     * Get the amfUeNgapId property: The AMF UE NGAP ID.
     * 
     * @return the amfUeNgapId value.
     */
    public long amfUeNgapId() {
        return this.amfUeNgapId;
    }

    /**
     * Set the amfUeNgapId property: The AMF UE NGAP ID.
     * 
     * @param amfUeNgapId the amfUeNgapId value to set.
     * @return the UeConnectionInfo5G object itself.
     */
    public UeConnectionInfo5G withAmfUeNgapId(long amfUeNgapId) {
        this.amfUeNgapId = amfUeNgapId;
        return this;
    }

    /**
     * Get the ranUeNgapId property: The RAN UE NGAP ID.
     * 
     * @return the ranUeNgapId value.
     */
    public int ranUeNgapId() {
        return this.ranUeNgapId;
    }

    /**
     * Set the ranUeNgapId property: The RAN UE NGAP ID.
     * 
     * @param ranUeNgapId the ranUeNgapId value to set.
     * @return the UeConnectionInfo5G object itself.
     */
    public UeConnectionInfo5G withRanUeNgapId(int ranUeNgapId) {
        this.ranUeNgapId = ranUeNgapId;
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
     * @return the UeConnectionInfo5G object itself.
     */
    public UeConnectionInfo5G withLastVisitedTai(String lastVisitedTai) {
        this.lastVisitedTai = lastVisitedTai;
        return this;
    }

    /**
     * Get the allowedNssai property: Allowed Network Slice Selection Assistance Information.
     * 
     * @return the allowedNssai value.
     */
    public List<Snssai> allowedNssai() {
        return this.allowedNssai;
    }

    /**
     * Set the allowedNssai property: Allowed Network Slice Selection Assistance Information.
     * 
     * @param allowedNssai the allowedNssai value to set.
     * @return the UeConnectionInfo5G object itself.
     */
    public UeConnectionInfo5G withAllowedNssai(List<Snssai> allowedNssai) {
        this.allowedNssai = allowedNssai;
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
     * @return the UeConnectionInfo5G object itself.
     */
    public UeConnectionInfo5G withUeState(UeState ueState) {
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
     * @return the UeConnectionInfo5G object itself.
     */
    public UeConnectionInfo5G withRrcEstablishmentCause(RrcEstablishmentCause rrcEstablishmentCause) {
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
     * @return the UeConnectionInfo5G object itself.
     */
    public UeConnectionInfo5G withUeUsageSetting(UeUsageSetting ueUsageSetting) {
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
     * @return the UeConnectionInfo5G object itself.
     */
    public UeConnectionInfo5G withLastActivityTime(OffsetDateTime lastActivityTime) {
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
                new IllegalArgumentException("Missing required property globalRanNodeId in model UeConnectionInfo5G"));
        } else {
            globalRanNodeId().validate();
        }
        if (allowedNssai() != null) {
            allowedNssai().forEach(e -> e.validate());
        }
        if (ueState() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property ueState in model UeConnectionInfo5G"));
        }
        if (rrcEstablishmentCause() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property rrcEstablishmentCause in model UeConnectionInfo5G"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(UeConnectionInfo5G.class);
}
