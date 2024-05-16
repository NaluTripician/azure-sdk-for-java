// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.imagebuilder.fluent.models.OperationInner;
import com.azure.resourcemanager.imagebuilder.models.OperationDisplay;
import com.azure.resourcemanager.imagebuilder.models.OperationListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class OperationListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationListResult model = BinaryData.fromString(
            "{\"value\":[{\"name\":\"bqe\",\"display\":{\"provider\":\"xqbzvddntwnd\",\"operation\":\"cbtwnpzaoqvuh\",\"resource\":\"cffcyddglmj\",\"description\":\"jqkwpyeicx\"},\"origin\":\"ciwqvhk\",\"properties\":\"dataxuigdtopbobj\",\"isDataAction\":false},{\"name\":\"e\",\"display\":{\"provider\":\"m\",\"operation\":\"hrzayvvtpgvdf\",\"resource\":\"otkftutqxlngx\",\"description\":\"fgugnxkrxdqmid\"},\"origin\":\"hzrvqd\",\"properties\":\"databhj\",\"isDataAction\":false},{\"name\":\"ehoqfbowskan\",\"display\":{\"provider\":\"zlcuiywgqywgndrv\",\"operation\":\"hzgpphrcgyncocpe\",\"resource\":\"vmmcoofs\",\"description\":\"zevgb\"},\"origin\":\"jqabcypmivkwlzuv\",\"properties\":\"datafwnfnb\",\"isDataAction\":false}],\"nextLink\":\"onlebxetqgtzxdpn\"}")
            .toObject(OperationListResult.class);
        Assertions.assertEquals("bqe", model.value().get(0).name());
        Assertions.assertEquals("xqbzvddntwnd", model.value().get(0).display().provider());
        Assertions.assertEquals("cbtwnpzaoqvuh", model.value().get(0).display().operation());
        Assertions.assertEquals("cffcyddglmj", model.value().get(0).display().resource());
        Assertions.assertEquals("jqkwpyeicx", model.value().get(0).display().description());
        Assertions.assertEquals("ciwqvhk", model.value().get(0).origin());
        Assertions.assertEquals(false, model.value().get(0).isDataAction());
        Assertions.assertEquals("onlebxetqgtzxdpn", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationListResult model = new OperationListResult()
            .withValue(Arrays.asList(
                new OperationInner().withName("bqe")
                    .withDisplay(new OperationDisplay().withProvider("xqbzvddntwnd").withOperation("cbtwnpzaoqvuh")
                        .withResource("cffcyddglmj").withDescription("jqkwpyeicx"))
                    .withOrigin("ciwqvhk").withProperties("dataxuigdtopbobj").withIsDataAction(false),
                new OperationInner().withName("e")
                    .withDisplay(new OperationDisplay().withProvider("m").withOperation("hrzayvvtpgvdf")
                        .withResource("otkftutqxlngx").withDescription("fgugnxkrxdqmid"))
                    .withOrigin("hzrvqd").withProperties("databhj").withIsDataAction(false),
                new OperationInner().withName("ehoqfbowskan")
                    .withDisplay(new OperationDisplay().withProvider("zlcuiywgqywgndrv")
                        .withOperation("hzgpphrcgyncocpe").withResource("vmmcoofs").withDescription("zevgb"))
                    .withOrigin("jqabcypmivkwlzuv").withProperties("datafwnfnb").withIsDataAction(false)))
            .withNextLink("onlebxetqgtzxdpn");
        model = BinaryData.fromObject(model).toObject(OperationListResult.class);
        Assertions.assertEquals("bqe", model.value().get(0).name());
        Assertions.assertEquals("xqbzvddntwnd", model.value().get(0).display().provider());
        Assertions.assertEquals("cbtwnpzaoqvuh", model.value().get(0).display().operation());
        Assertions.assertEquals("cffcyddglmj", model.value().get(0).display().resource());
        Assertions.assertEquals("jqkwpyeicx", model.value().get(0).display().description());
        Assertions.assertEquals("ciwqvhk", model.value().get(0).origin());
        Assertions.assertEquals(false, model.value().get(0).isDataAction());
        Assertions.assertEquals("onlebxetqgtzxdpn", model.nextLink());
    }
}
