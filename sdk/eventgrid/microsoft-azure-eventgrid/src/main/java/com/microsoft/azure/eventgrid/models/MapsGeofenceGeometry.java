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
 * The geofence geometry.
 */
public class MapsGeofenceGeometry {
    /**
     * ID of the device.
     */
    @JsonProperty(value = "deviceId")
    private String deviceId;

    /**
     * Distance from the coordinate to the closest border of the geofence.
     * Positive means the coordinate is outside of the geofence. If the
     * coordinate is outside of the geofence, but more than the value of
     * searchBuffer away from the closest geofence border, then the value is
     * 999. Negative means the coordinate is inside of the geofence. If the
     * coordinate is inside the polygon, but more than the value of
     * searchBuffer away from the closest geofencing border,then the value is
     * -999. A value of 999 means that there is great confidence the coordinate
     * is well outside the geofence. A value of -999 means that there is great
     * confidence the coordinate is well within the geofence.
     */
    @JsonProperty(value = "distance")
    private Double distance;

    /**
     * The unique ID for the geofence geometry.
     */
    @JsonProperty(value = "geometryId")
    private String geometryId;

    /**
     * Latitude of the nearest point of the geometry.
     */
    @JsonProperty(value = "nearestLat")
    private Double nearestLat;

    /**
     * Longitude of the nearest point of the geometry.
     */
    @JsonProperty(value = "nearestLon")
    private Double nearestLon;

    /**
     * The unique id returned from user upload service when uploading a
     * geofence. Will not be included in geofencing post API.
     */
    @JsonProperty(value = "udId")
    private String udId;

    /**
     * Get iD of the device.
     *
     * @return the deviceId value
     */
    public String deviceId() {
        return this.deviceId;
    }

    /**
     * Set iD of the device.
     *
     * @param deviceId the deviceId value to set
     * @return the MapsGeofenceGeometry object itself.
     */
    public MapsGeofenceGeometry withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * Get distance from the coordinate to the closest border of the geofence. Positive means the coordinate is outside of the geofence. If the coordinate is outside of the geofence, but more than the value of searchBuffer away from the closest geofence border, then the value is 999. Negative means the coordinate is inside of the geofence. If the coordinate is inside the polygon, but more than the value of searchBuffer away from the closest geofencing border,then the value is -999. A value of 999 means that there is great confidence the coordinate is well outside the geofence. A value of -999 means that there is great confidence the coordinate is well within the geofence.
     *
     * @return the distance value
     */
    public Double distance() {
        return this.distance;
    }

    /**
     * Set distance from the coordinate to the closest border of the geofence. Positive means the coordinate is outside of the geofence. If the coordinate is outside of the geofence, but more than the value of searchBuffer away from the closest geofence border, then the value is 999. Negative means the coordinate is inside of the geofence. If the coordinate is inside the polygon, but more than the value of searchBuffer away from the closest geofencing border,then the value is -999. A value of 999 means that there is great confidence the coordinate is well outside the geofence. A value of -999 means that there is great confidence the coordinate is well within the geofence.
     *
     * @param distance the distance value to set
     * @return the MapsGeofenceGeometry object itself.
     */
    public MapsGeofenceGeometry withDistance(Double distance) {
        this.distance = distance;
        return this;
    }

    /**
     * Get the unique ID for the geofence geometry.
     *
     * @return the geometryId value
     */
    public String geometryId() {
        return this.geometryId;
    }

    /**
     * Set the unique ID for the geofence geometry.
     *
     * @param geometryId the geometryId value to set
     * @return the MapsGeofenceGeometry object itself.
     */
    public MapsGeofenceGeometry withGeometryId(String geometryId) {
        this.geometryId = geometryId;
        return this;
    }

    /**
     * Get latitude of the nearest point of the geometry.
     *
     * @return the nearestLat value
     */
    public Double nearestLat() {
        return this.nearestLat;
    }

    /**
     * Set latitude of the nearest point of the geometry.
     *
     * @param nearestLat the nearestLat value to set
     * @return the MapsGeofenceGeometry object itself.
     */
    public MapsGeofenceGeometry withNearestLat(Double nearestLat) {
        this.nearestLat = nearestLat;
        return this;
    }

    /**
     * Get longitude of the nearest point of the geometry.
     *
     * @return the nearestLon value
     */
    public Double nearestLon() {
        return this.nearestLon;
    }

    /**
     * Set longitude of the nearest point of the geometry.
     *
     * @param nearestLon the nearestLon value to set
     * @return the MapsGeofenceGeometry object itself.
     */
    public MapsGeofenceGeometry withNearestLon(Double nearestLon) {
        this.nearestLon = nearestLon;
        return this;
    }

    /**
     * Get the unique id returned from user upload service when uploading a geofence. Will not be included in geofencing post API.
     *
     * @return the udId value
     */
    public String udId() {
        return this.udId;
    }

    /**
     * Set the unique id returned from user upload service when uploading a geofence. Will not be included in geofencing post API.
     *
     * @param udId the udId value to set
     * @return the MapsGeofenceGeometry object itself.
     */
    public MapsGeofenceGeometry withUdId(String udId) {
        this.udId = udId;
        return this;
    }

}
