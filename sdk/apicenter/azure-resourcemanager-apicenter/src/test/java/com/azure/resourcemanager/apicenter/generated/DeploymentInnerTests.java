// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apicenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apicenter.fluent.models.DeploymentInner;
import com.azure.resourcemanager.apicenter.models.DeploymentProperties;
import com.azure.resourcemanager.apicenter.models.DeploymentServer;
import com.azure.resourcemanager.apicenter.models.DeploymentState;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DeploymentInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DeploymentInner model = BinaryData.fromString(
            "{\"properties\":{\"title\":\"ihkaetcktvfc\",\"description\":\"fsnkymuctq\",\"environmentId\":\"fbebrjcxer\",\"definitionId\":\"wutttxfvjrbi\",\"state\":\"inactive\",\"server\":{\"runtimeUri\":[\"c\",\"vahfn\",\"jky\",\"xjvuujqgidokg\"]},\"customProperties\":\"datajyoxgvclt\"},\"id\":\"sncghkjeszz\",\"name\":\"bijhtxfvgxbf\",\"type\":\"mxnehmp\"}")
            .toObject(DeploymentInner.class);
        Assertions.assertEquals("ihkaetcktvfc", model.properties().title());
        Assertions.assertEquals("fsnkymuctq", model.properties().description());
        Assertions.assertEquals("fbebrjcxer", model.properties().environmentId());
        Assertions.assertEquals("wutttxfvjrbi", model.properties().definitionId());
        Assertions.assertEquals(DeploymentState.INACTIVE, model.properties().state());
        Assertions.assertEquals("c", model.properties().server().runtimeUri().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DeploymentInner model = new DeploymentInner()
            .withProperties(new DeploymentProperties().withTitle("ihkaetcktvfc").withDescription("fsnkymuctq")
                .withEnvironmentId("fbebrjcxer").withDefinitionId("wutttxfvjrbi").withState(DeploymentState.INACTIVE)
                .withServer(new DeploymentServer().withRuntimeUri(Arrays.asList("c", "vahfn", "jky", "xjvuujqgidokg")))
                .withCustomProperties("datajyoxgvclt"));
        model = BinaryData.fromObject(model).toObject(DeploymentInner.class);
        Assertions.assertEquals("ihkaetcktvfc", model.properties().title());
        Assertions.assertEquals("fsnkymuctq", model.properties().description());
        Assertions.assertEquals("fbebrjcxer", model.properties().environmentId());
        Assertions.assertEquals("wutttxfvjrbi", model.properties().definitionId());
        Assertions.assertEquals(DeploymentState.INACTIVE, model.properties().state());
        Assertions.assertEquals("c", model.properties().server().runtimeUri().get(0));
    }
}
