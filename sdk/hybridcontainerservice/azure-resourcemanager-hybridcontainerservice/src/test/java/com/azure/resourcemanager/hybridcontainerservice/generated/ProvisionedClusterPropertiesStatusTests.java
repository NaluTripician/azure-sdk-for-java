// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcontainerservice.models.AddonPhase;
import com.azure.resourcemanager.hybridcontainerservice.models.AddonStatusProfile;
import com.azure.resourcemanager.hybridcontainerservice.models.ProvisionedClusterPropertiesStatus;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ProvisionedClusterPropertiesStatusTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ProvisionedClusterPropertiesStatus model = BinaryData.fromString(
            "{\"controlPlaneStatus\":[{\"name\":\"zb\",\"phase\":\"upgrading\",\"ready\":false,\"errorMessage\":\"x\"},{\"name\":\"ivyqniwbybrkxvd\",\"phase\":\"deleting\",\"ready\":false,\"errorMessage\":\"fwvuk\"}],\"currentState\":\"Updating\",\"errorMessage\":\"dcc\"}")
            .toObject(ProvisionedClusterPropertiesStatus.class);
        Assertions.assertEquals("zb", model.controlPlaneStatus().get(0).name());
        Assertions.assertEquals(AddonPhase.UPGRADING, model.controlPlaneStatus().get(0).phase());
        Assertions.assertEquals(false, model.controlPlaneStatus().get(0).ready());
        Assertions.assertEquals("x", model.controlPlaneStatus().get(0).errorMessage());
        Assertions.assertEquals("dcc", model.errorMessage());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ProvisionedClusterPropertiesStatus model
            = new ProvisionedClusterPropertiesStatus().withControlPlaneStatus(Arrays.asList(
                new AddonStatusProfile().withName("zb").withPhase(AddonPhase.UPGRADING).withReady(false)
                    .withErrorMessage("x"),
                new AddonStatusProfile().withName("ivyqniwbybrkxvd").withPhase(AddonPhase.DELETING).withReady(false)
                    .withErrorMessage("fwvuk")))
                .withErrorMessage("dcc");
        model = BinaryData.fromObject(model).toObject(ProvisionedClusterPropertiesStatus.class);
        Assertions.assertEquals("zb", model.controlPlaneStatus().get(0).name());
        Assertions.assertEquals(AddonPhase.UPGRADING, model.controlPlaneStatus().get(0).phase());
        Assertions.assertEquals(false, model.controlPlaneStatus().get(0).ready());
        Assertions.assertEquals("x", model.controlPlaneStatus().get(0).errorMessage());
        Assertions.assertEquals("dcc", model.errorMessage());
    }
}
