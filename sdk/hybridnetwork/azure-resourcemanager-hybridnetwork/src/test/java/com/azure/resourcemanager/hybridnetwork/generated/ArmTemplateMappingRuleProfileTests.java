// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridnetwork.models.ArmTemplateMappingRuleProfile;
import org.junit.jupiter.api.Assertions;

public final class ArmTemplateMappingRuleProfileTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ArmTemplateMappingRuleProfile model = BinaryData.fromString("{\"templateParameters\":\"hyhsgzfczbg\"}")
            .toObject(ArmTemplateMappingRuleProfile.class);
        Assertions.assertEquals("hyhsgzfczbg", model.templateParameters());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ArmTemplateMappingRuleProfile model = new ArmTemplateMappingRuleProfile().withTemplateParameters("hyhsgzfczbg");
        model = BinaryData.fromObject(model).toObject(ArmTemplateMappingRuleProfile.class);
        Assertions.assertEquals("hyhsgzfczbg", model.templateParameters());
    }
}
