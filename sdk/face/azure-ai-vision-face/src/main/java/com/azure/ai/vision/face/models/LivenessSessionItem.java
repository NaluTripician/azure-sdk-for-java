// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.vision.face.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Session data returned for enumeration.
 */
@Immutable
public final class LivenessSessionItem {

    /*
     * The unique ID to reference this session.
     */
    @Generated
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * DateTime when this session was created.
     */
    @Generated
    @JsonProperty(value = "createdDateTime")
    private final OffsetDateTime createdDateTime;

    /*
     * DateTime when this session was started by the client.
     */
    @Generated
    @JsonProperty(value = "sessionStartDateTime")
    private OffsetDateTime sessionStartDateTime;

    /*
     * Whether or not the session is expired.
     */
    @Generated
    @JsonProperty(value = "sessionExpired")
    private final boolean sessionExpired;

    /*
     * Unique Guid per each end-user device. This is to provide rate limiting and anti-hammering. If 'deviceCorrelationIdSetInClient' is true in this request, this 'deviceCorrelationId' must be null.
     */
    @Generated
    @JsonProperty(value = "deviceCorrelationId")
    private String deviceCorrelationId;

    /*
     * Seconds the session should last for. Range is 60 to 86400 seconds. Default value is 600.
     */
    @Generated
    @JsonProperty(value = "authTokenTimeToLiveInSeconds")
    private Integer authTokenTimeToLiveInSeconds;

    /**
     * Creates an instance of LivenessSessionItem class.
     *
     * @param createdDateTime the createdDateTime value to set.
     * @param sessionExpired the sessionExpired value to set.
     */
    @Generated
    @JsonCreator
    private LivenessSessionItem(@JsonProperty(value = "createdDateTime") OffsetDateTime createdDateTime,
        @JsonProperty(value = "sessionExpired") boolean sessionExpired) {
        this.createdDateTime = createdDateTime;
        this.sessionExpired = sessionExpired;
    }

    /**
     * Get the id property: The unique ID to reference this session.
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the createdDateTime property: DateTime when this session was created.
     *
     * @return the createdDateTime value.
     */
    @Generated
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }

    /**
     * Get the sessionStartDateTime property: DateTime when this session was started by the client.
     *
     * @return the sessionStartDateTime value.
     */
    @Generated
    public OffsetDateTime getSessionStartDateTime() {
        return this.sessionStartDateTime;
    }

    /**
     * Get the sessionExpired property: Whether or not the session is expired.
     *
     * @return the sessionExpired value.
     */
    @Generated
    public boolean isSessionExpired() {
        return this.sessionExpired;
    }

    /**
     * Get the deviceCorrelationId property: Unique Guid per each end-user device. This is to provide rate limiting and
     * anti-hammering. If 'deviceCorrelationIdSetInClient' is true in this request, this 'deviceCorrelationId' must be
     * null.
     *
     * @return the deviceCorrelationId value.
     */
    @Generated
    public String getDeviceCorrelationId() {
        return this.deviceCorrelationId;
    }

    /**
     * Get the authTokenTimeToLiveInSeconds property: Seconds the session should last for. Range is 60 to 86400 seconds.
     * Default value is 600.
     *
     * @return the authTokenTimeToLiveInSeconds value.
     */
    @Generated
    public Integer getAuthTokenTimeToLiveInSeconds() {
        return this.authTokenTimeToLiveInSeconds;
    }
}
