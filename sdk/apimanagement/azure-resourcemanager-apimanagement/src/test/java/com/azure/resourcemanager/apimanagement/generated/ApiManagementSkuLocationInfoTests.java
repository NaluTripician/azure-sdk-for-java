// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.models.ApiManagementSkuLocationInfo;

public final class ApiManagementSkuLocationInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApiManagementSkuLocationInfo model =
            BinaryData
                .fromString(
                    "{\"location\":\"qhtdereunokakzwh\",\"zones\":[\"w\",\"xedzn\",\"xrfomcke\",\"vmyifopxf\"],\"zoneDetails\":[{\"name\":[\"yzoutxfptofh\",\"nuywe\",\"ygv\",\"dgaaqwvkgjpy\"],\"capabilities\":[{\"name\":\"vdn\",\"value\":\"e\"},{\"name\":\"ufb\",\"value\":\"tbnukkfaxz\"},{\"name\":\"bx\",\"value\":\"jisskob\"}]},{\"name\":[\"lflioewyhxessm\",\"rkdpsqeqfb\"],\"capabilities\":[{\"name\":\"ses\",\"value\":\"ujbjppp\"},{\"name\":\"lpdib\",\"value\":\"th\"},{\"name\":\"at\",\"value\":\"jrnm\"},{\"name\":\"zqpl\",\"value\":\"kihonik\"}]},{\"name\":[\"zfffjilzfbpnt\"],\"capabilities\":[{\"name\":\"nsckhbmcarmoyfxx\",\"value\":\"ykuqdnd\"},{\"name\":\"ykhkg\",\"value\":\"pvd\"}]},{\"name\":[\"peerscd\",\"rnrnjrcufmbgacnr\",\"fdtncmspsanma\"],\"capabilities\":[{\"name\":\"kqiq\",\"value\":\"fv\"},{\"name\":\"qcs\",\"value\":\"qjmxpt\"}]}]}")
                .toObject(ApiManagementSkuLocationInfo.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApiManagementSkuLocationInfo model = new ApiManagementSkuLocationInfo();
        model = BinaryData.fromObject(model).toObject(ApiManagementSkuLocationInfo.class);
    }
}
