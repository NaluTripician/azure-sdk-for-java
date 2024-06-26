// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.Office365Source;

public final class Office365SourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Office365Source model = BinaryData.fromString(
            "{\"type\":\"o\",\"allowedGroups\":\"datafcduqsdurfqaawr\",\"userScopeFilterUri\":\"datatzslfrztpnry\",\"dateFilterColumn\":\"dataxajr\",\"startTime\":\"dataighlhddvno\",\"endTime\":\"datasowbtnfqlwc\",\"outputColumns\":\"datajphtehoucmeuuua\",\"sourceRetryCount\":\"datacxofqjninrsk\",\"sourceRetryWait\":\"datakqtiuve\",\"maxConcurrentConnections\":\"datauciwbiwygwpwqu\",\"disableMetricsCollection\":\"dataqgslspihuxgvvio\",\"\":{\"quxvufrf\":\"dataolkmfizefbbrnd\",\"ysieyeblkgu\":\"dataaehssosowav\"}}")
            .toObject(Office365Source.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Office365Source model = new Office365Source().withSourceRetryCount("datacxofqjninrsk")
            .withSourceRetryWait("datakqtiuve")
            .withMaxConcurrentConnections("datauciwbiwygwpwqu")
            .withDisableMetricsCollection("dataqgslspihuxgvvio")
            .withAllowedGroups("datafcduqsdurfqaawr")
            .withUserScopeFilterUri("datatzslfrztpnry")
            .withDateFilterColumn("dataxajr")
            .withStartTime("dataighlhddvno")
            .withEndTime("datasowbtnfqlwc")
            .withOutputColumns("datajphtehoucmeuuua");
        model = BinaryData.fromObject(model).toObject(Office365Source.class);
    }
}
