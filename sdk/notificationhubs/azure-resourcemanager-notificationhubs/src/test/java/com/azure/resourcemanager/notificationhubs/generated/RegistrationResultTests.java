// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.notificationhubs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.notificationhubs.models.RegistrationResult;

public final class RegistrationResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RegistrationResult model = BinaryData.fromString(
            "{\"applicationPlatform\":\"wbxgjvt\",\"pnsHandle\":\"p\",\"registrationId\":\"szdnr\",\"outcome\":\"qguhmuo\"}")
            .toObject(RegistrationResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RegistrationResult model = new RegistrationResult();
        model = BinaryData.fromObject(model).toObject(RegistrationResult.class);
    }
}
