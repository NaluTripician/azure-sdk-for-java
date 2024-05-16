// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.models.VMExtension;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class VMExtensionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VMExtension model = BinaryData.fromString(
            "{\"name\":\"nqpeh\",\"publisher\":\"ndoygmifthnzdnd\",\"type\":\"l\",\"typeHandlerVersion\":\"ayqigynduhav\",\"autoUpgradeMinorVersion\":false,\"enableAutomaticUpgrade\":false,\"settings\":\"dataumaq\",\"protectedSettings\":\"databgycduiertgccym\",\"provisionAfterExtensions\":[\"l\",\"ssl\",\"lfmmdnbbglzpswi\"]}")
            .toObject(VMExtension.class);
        Assertions.assertEquals("nqpeh", model.name());
        Assertions.assertEquals("ndoygmifthnzdnd", model.publisher());
        Assertions.assertEquals("l", model.type());
        Assertions.assertEquals("ayqigynduhav", model.typeHandlerVersion());
        Assertions.assertEquals(false, model.autoUpgradeMinorVersion());
        Assertions.assertEquals(false, model.enableAutomaticUpgrade());
        Assertions.assertEquals("l", model.provisionAfterExtensions().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VMExtension model = new VMExtension().withName("nqpeh").withPublisher("ndoygmifthnzdnd").withType("l")
            .withTypeHandlerVersion("ayqigynduhav").withAutoUpgradeMinorVersion(false).withEnableAutomaticUpgrade(false)
            .withSettings("dataumaq").withProtectedSettings("databgycduiertgccym")
            .withProvisionAfterExtensions(Arrays.asList("l", "ssl", "lfmmdnbbglzpswi"));
        model = BinaryData.fromObject(model).toObject(VMExtension.class);
        Assertions.assertEquals("nqpeh", model.name());
        Assertions.assertEquals("ndoygmifthnzdnd", model.publisher());
        Assertions.assertEquals("l", model.type());
        Assertions.assertEquals("ayqigynduhav", model.typeHandlerVersion());
        Assertions.assertEquals(false, model.autoUpgradeMinorVersion());
        Assertions.assertEquals(false, model.enableAutomaticUpgrade());
        Assertions.assertEquals("l", model.provisionAfterExtensions().get(0));
    }
}
