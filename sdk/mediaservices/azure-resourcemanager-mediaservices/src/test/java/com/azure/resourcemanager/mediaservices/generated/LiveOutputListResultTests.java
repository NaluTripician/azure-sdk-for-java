// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.fluent.models.LiveOutputInner;
import com.azure.resourcemanager.mediaservices.models.LiveOutputListResult;
import java.time.Duration;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class LiveOutputListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LiveOutputListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"description\":\"kayuhqlbjbs\",\"assetName\":\"bbqwrvtldg\",\"archiveWindowLength\":\"PT169H44M34S\",\"rewindWindowLength\":\"PT103H24M51S\",\"manifestName\":\"mpipaslthaqfxs\",\"outputSnapTime\":1015247860287593628,\"created\":\"2021-02-18T02:58:52Z\",\"lastModified\":\"2021-11-08T23:17:29Z\",\"provisioningState\":\"ezpdrhneu\",\"resourceState\":\"Running\"},\"id\":\"kdw\",\"name\":\"t\",\"type\":\"sibircgpi\"},{\"properties\":{\"description\":\"imejzanl\",\"assetName\":\"zxiavrm\",\"archiveWindowLength\":\"PT113H22M47S\",\"rewindWindowLength\":\"PT34H29M44S\",\"manifestName\":\"kixrj\",\"outputSnapTime\":3220363701408483675,\"created\":\"2021-02-12T14:44:45Z\",\"lastModified\":\"2021-01-31T15:02:11Z\",\"provisioningState\":\"azszrnwoiindfpw\",\"resourceState\":\"Running\"},\"id\":\"wbtlhflsjcdh\",\"name\":\"zfjvfbgofe\",\"type\":\"jagrqmqhldvr\"},{\"properties\":{\"description\":\"ojnal\",\"assetName\":\"hfkvtvsexsowuel\",\"archiveWindowLength\":\"PT12H32M54S\",\"rewindWindowLength\":\"PT172H2M59S\",\"manifestName\":\"hhxvrhmzkwpj\",\"outputSnapTime\":3678346587764831956,\"created\":\"2021-03-06T02:41:14Z\",\"lastModified\":\"2021-06-26T13:54:37Z\",\"provisioningState\":\"qs\",\"resourceState\":\"Running\"},\"id\":\"ujxukndxd\",\"name\":\"grjguufzd\",\"type\":\"syqtfi\"}],\"@odata.count\":1852140441,\"@odata.nextLink\":\"otzi\"}")
                .toObject(LiveOutputListResult.class);
        Assertions.assertEquals("kayuhqlbjbs", model.value().get(0).description());
        Assertions.assertEquals("bbqwrvtldg", model.value().get(0).assetName());
        Assertions.assertEquals(Duration.parse("PT169H44M34S"), model.value().get(0).archiveWindowLength());
        Assertions.assertEquals(Duration.parse("PT103H24M51S"), model.value().get(0).rewindWindowLength());
        Assertions.assertEquals("mpipaslthaqfxs", model.value().get(0).manifestName());
        Assertions.assertEquals(1015247860287593628L, model.value().get(0).outputSnapTime());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LiveOutputListResult model =
            new LiveOutputListResult()
                .withValue(
                    Arrays
                        .asList(
                            new LiveOutputInner()
                                .withDescription("kayuhqlbjbs")
                                .withAssetName("bbqwrvtldg")
                                .withArchiveWindowLength(Duration.parse("PT169H44M34S"))
                                .withRewindWindowLength(Duration.parse("PT103H24M51S"))
                                .withManifestName("mpipaslthaqfxs")
                                .withOutputSnapTime(1015247860287593628L),
                            new LiveOutputInner()
                                .withDescription("imejzanl")
                                .withAssetName("zxiavrm")
                                .withArchiveWindowLength(Duration.parse("PT113H22M47S"))
                                .withRewindWindowLength(Duration.parse("PT34H29M44S"))
                                .withManifestName("kixrj")
                                .withOutputSnapTime(3220363701408483675L),
                            new LiveOutputInner()
                                .withDescription("ojnal")
                                .withAssetName("hfkvtvsexsowuel")
                                .withArchiveWindowLength(Duration.parse("PT12H32M54S"))
                                .withRewindWindowLength(Duration.parse("PT172H2M59S"))
                                .withManifestName("hhxvrhmzkwpj")
                                .withOutputSnapTime(3678346587764831956L)));
        model = BinaryData.fromObject(model).toObject(LiveOutputListResult.class);
        Assertions.assertEquals("kayuhqlbjbs", model.value().get(0).description());
        Assertions.assertEquals("bbqwrvtldg", model.value().get(0).assetName());
        Assertions.assertEquals(Duration.parse("PT169H44M34S"), model.value().get(0).archiveWindowLength());
        Assertions.assertEquals(Duration.parse("PT103H24M51S"), model.value().get(0).rewindWindowLength());
        Assertions.assertEquals("mpipaslthaqfxs", model.value().get(0).manifestName());
        Assertions.assertEquals(1015247860287593628L, model.value().get(0).outputSnapTime());
    }
}
