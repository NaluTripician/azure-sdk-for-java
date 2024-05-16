/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.eventgrid.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Ingest fragment dropped event data.
 */
public class MediaLiveEventIncomingDataChunkDroppedEventData {
    /**
     * Gets the timestamp of the data chunk dropped.
     */
    @JsonProperty(value = "timestamp", access = JsonProperty.Access.WRITE_ONLY)
    private String timestamp;

    /**
     * Gets the type of the track (Audio / Video).
     */
    @JsonProperty(value = "trackType", access = JsonProperty.Access.WRITE_ONLY)
    private String trackType;

    /**
     * Gets the bitrate of the track.
     */
    @JsonProperty(value = "bitrate", access = JsonProperty.Access.WRITE_ONLY)
    private Long bitrate;

    /**
     * Gets the timescale of the Timestamp.
     */
    @JsonProperty(value = "timescale", access = JsonProperty.Access.WRITE_ONLY)
    private String timescale;

    /**
     * Gets the result code for fragment drop operation.
     */
    @JsonProperty(value = "resultCode", access = JsonProperty.Access.WRITE_ONLY)
    private String resultCode;

    /**
     * Gets the name of the track for which fragment is dropped.
     */
    @JsonProperty(value = "trackName", access = JsonProperty.Access.WRITE_ONLY)
    private String trackName;

    /**
     * Get gets the timestamp of the data chunk dropped.
     *
     * @return the timestamp value
     */
    public String timestamp() {
        return this.timestamp;
    }

    /**
     * Get gets the type of the track (Audio / Video).
     *
     * @return the trackType value
     */
    public String trackType() {
        return this.trackType;
    }

    /**
     * Get gets the bitrate of the track.
     *
     * @return the bitrate value
     */
    public Long bitrate() {
        return this.bitrate;
    }

    /**
     * Get gets the timescale of the Timestamp.
     *
     * @return the timescale value
     */
    public String timescale() {
        return this.timescale;
    }

    /**
     * Get gets the result code for fragment drop operation.
     *
     * @return the resultCode value
     */
    public String resultCode() {
        return this.resultCode;
    }

    /**
     * Get gets the name of the track for which fragment is dropped.
     *
     * @return the trackName value
     */
    public String trackName() {
        return this.trackName;
    }

}
