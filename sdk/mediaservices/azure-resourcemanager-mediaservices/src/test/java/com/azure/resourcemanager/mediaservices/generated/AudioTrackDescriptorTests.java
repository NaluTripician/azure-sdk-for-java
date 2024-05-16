// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.models.AudioTrackDescriptor;
import com.azure.resourcemanager.mediaservices.models.ChannelMapping;
import org.junit.jupiter.api.Assertions;

public final class AudioTrackDescriptorTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AudioTrackDescriptor model =
            BinaryData
                .fromString("{\"@odata.type\":\"#Microsoft.Media.AudioTrackDescriptor\",\"channelMapping\":\"Center\"}")
                .toObject(AudioTrackDescriptor.class);
        Assertions.assertEquals(ChannelMapping.CENTER, model.channelMapping());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AudioTrackDescriptor model = new AudioTrackDescriptor().withChannelMapping(ChannelMapping.CENTER);
        model = BinaryData.fromObject(model).toObject(AudioTrackDescriptor.class);
        Assertions.assertEquals(ChannelMapping.CENTER, model.channelMapping());
    }
}
