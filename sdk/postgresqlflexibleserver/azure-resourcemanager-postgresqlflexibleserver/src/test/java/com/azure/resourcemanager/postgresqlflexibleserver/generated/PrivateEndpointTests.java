// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.postgresqlflexibleserver.models.PrivateEndpoint;

public final class PrivateEndpointTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateEndpoint model = BinaryData.fromString("{\"id\":\"xzvlvqhjkbegib\"}").toObject(PrivateEndpoint.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateEndpoint model = new PrivateEndpoint();
        model = BinaryData.fromObject(model).toObject(PrivateEndpoint.class);
    }
}
