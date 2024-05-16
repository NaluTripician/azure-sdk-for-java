// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mixedreality.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mixedreality.fluent.models.OperationInner;
import com.azure.resourcemanager.mixedreality.models.OperationDisplay;
import com.azure.resourcemanager.mixedreality.models.OperationPage;
import com.azure.resourcemanager.mixedreality.models.OperationProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class OperationPageTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationPage model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"name\":\"quvgjxpybczme\",\"display\":{\"provider\":\"tzopbsphrupidgsy\",\"resource\":\"bejhphoycmsxa\",\"operation\":\"bhdxbm\",\"description\":\"qioqjzehtbmu\"},\"isDataAction\":false,\"origin\":\"noi\",\"properties\":{}},{\"name\":\"rxybqsoq\",\"display\":{\"provider\":\"gkdmb\",\"resource\":\"azlobcufpdznrbt\",\"operation\":\"qqjnqgl\",\"description\":\"qgn\"},\"isDataAction\":true,\"origin\":\"ojywifsqesa\",\"properties\":{}},{\"name\":\"mglzlhj\",\"display\":{\"provider\":\"ifkwmrvktsizntoc\",\"resource\":\"pa\",\"operation\":\"uajpsquc\",\"description\":\"poyfdkfogkn\"},\"isDataAction\":false,\"origin\":\"fjddeqs\",\"properties\":{}}],\"nextLink\":\"pewnw\"}")
                .toObject(OperationPage.class);
        Assertions.assertEquals("quvgjxpybczme", model.value().get(0).name());
        Assertions.assertEquals("tzopbsphrupidgsy", model.value().get(0).display().provider());
        Assertions.assertEquals("bejhphoycmsxa", model.value().get(0).display().resource());
        Assertions.assertEquals("bhdxbm", model.value().get(0).display().operation());
        Assertions.assertEquals("qioqjzehtbmu", model.value().get(0).display().description());
        Assertions.assertEquals(false, model.value().get(0).isDataAction());
        Assertions.assertEquals("noi", model.value().get(0).origin());
        Assertions.assertEquals("pewnw", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationPage model =
            new OperationPage()
                .withValue(
                    Arrays
                        .asList(
                            new OperationInner()
                                .withName("quvgjxpybczme")
                                .withDisplay(
                                    new OperationDisplay()
                                        .withProvider("tzopbsphrupidgsy")
                                        .withResource("bejhphoycmsxa")
                                        .withOperation("bhdxbm")
                                        .withDescription("qioqjzehtbmu"))
                                .withIsDataAction(false)
                                .withOrigin("noi")
                                .withProperties(new OperationProperties()),
                            new OperationInner()
                                .withName("rxybqsoq")
                                .withDisplay(
                                    new OperationDisplay()
                                        .withProvider("gkdmb")
                                        .withResource("azlobcufpdznrbt")
                                        .withOperation("qqjnqgl")
                                        .withDescription("qgn"))
                                .withIsDataAction(true)
                                .withOrigin("ojywifsqesa")
                                .withProperties(new OperationProperties()),
                            new OperationInner()
                                .withName("mglzlhj")
                                .withDisplay(
                                    new OperationDisplay()
                                        .withProvider("ifkwmrvktsizntoc")
                                        .withResource("pa")
                                        .withOperation("uajpsquc")
                                        .withDescription("poyfdkfogkn"))
                                .withIsDataAction(false)
                                .withOrigin("fjddeqs")
                                .withProperties(new OperationProperties())))
                .withNextLink("pewnw");
        model = BinaryData.fromObject(model).toObject(OperationPage.class);
        Assertions.assertEquals("quvgjxpybczme", model.value().get(0).name());
        Assertions.assertEquals("tzopbsphrupidgsy", model.value().get(0).display().provider());
        Assertions.assertEquals("bejhphoycmsxa", model.value().get(0).display().resource());
        Assertions.assertEquals("bhdxbm", model.value().get(0).display().operation());
        Assertions.assertEquals("qioqjzehtbmu", model.value().get(0).display().description());
        Assertions.assertEquals(false, model.value().get(0).isDataAction());
        Assertions.assertEquals("noi", model.value().get(0).origin());
        Assertions.assertEquals("pewnw", model.nextLink());
    }
}
