// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devtestlabs.fluent.models.EnvironmentProperties;
import com.azure.resourcemanager.devtestlabs.models.ArmTemplateParameterProperties;
import com.azure.resourcemanager.devtestlabs.models.EnvironmentDeploymentProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class EnvironmentPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EnvironmentProperties model =
            BinaryData
                .fromString(
                    "{\"deploymentProperties\":{\"armTemplateId\":\"ldforobwj\",\"parameters\":[{\"name\":\"bfhfovvacqp\",\"value\":\"uodxesza\"},{\"name\":\"elawumu\",\"value\":\"lzkwrrwoy\"},{\"name\":\"ucwyhahno\",\"value\":\"rkywuhpsvfuu\"}]},\"armTemplateDisplayName\":\"tlwexxwlalniexz\",\"resourceGroupId\":\"zpgepqty\",\"createdByUser\":\"wwpgdakchzyvlixq\",\"provisioningState\":\"kcxk\",\"uniqueIdentifier\":\"bn\"}")
                .toObject(EnvironmentProperties.class);
        Assertions.assertEquals("ldforobwj", model.deploymentProperties().armTemplateId());
        Assertions.assertEquals("bfhfovvacqp", model.deploymentProperties().parameters().get(0).name());
        Assertions.assertEquals("uodxesza", model.deploymentProperties().parameters().get(0).value());
        Assertions.assertEquals("tlwexxwlalniexz", model.armTemplateDisplayName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EnvironmentProperties model =
            new EnvironmentProperties()
                .withDeploymentProperties(
                    new EnvironmentDeploymentProperties()
                        .withArmTemplateId("ldforobwj")
                        .withParameters(
                            Arrays
                                .asList(
                                    new ArmTemplateParameterProperties().withName("bfhfovvacqp").withValue("uodxesza"),
                                    new ArmTemplateParameterProperties().withName("elawumu").withValue("lzkwrrwoy"),
                                    new ArmTemplateParameterProperties()
                                        .withName("ucwyhahno")
                                        .withValue("rkywuhpsvfuu"))))
                .withArmTemplateDisplayName("tlwexxwlalniexz");
        model = BinaryData.fromObject(model).toObject(EnvironmentProperties.class);
        Assertions.assertEquals("ldforobwj", model.deploymentProperties().armTemplateId());
        Assertions.assertEquals("bfhfovvacqp", model.deploymentProperties().parameters().get(0).name());
        Assertions.assertEquals("uodxesza", model.deploymentProperties().parameters().get(0).value());
        Assertions.assertEquals("tlwexxwlalniexz", model.armTemplateDisplayName());
    }
}
