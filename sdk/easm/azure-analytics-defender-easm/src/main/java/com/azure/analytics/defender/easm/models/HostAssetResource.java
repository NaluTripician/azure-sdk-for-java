// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.analytics.defender.easm.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The HostAssetResource model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("host")
@Immutable
public final class HostAssetResource extends AssetResource {

    /*
     * asset
     */
    @Generated
    @JsonProperty(value = "asset")
    private HostAsset asset;

    /**
     * Creates an instance of HostAssetResource class.
     *
     * @param asset the asset value to set.
     */
    @Generated
    @JsonCreator
    private HostAssetResource(@JsonProperty(value = "asset") HostAsset asset) {
        this.asset = asset;
    }

    /**
     * Get the asset property: asset.
     *
     * @return the asset value.
     */
    @Generated
    public HostAsset getAsset() {
        return this.asset;
    }
}
