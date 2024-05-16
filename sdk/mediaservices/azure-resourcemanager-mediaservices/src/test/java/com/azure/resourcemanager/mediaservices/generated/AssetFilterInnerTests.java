// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.fluent.models.AssetFilterInner;
import com.azure.resourcemanager.mediaservices.models.FilterTrackSelection;
import com.azure.resourcemanager.mediaservices.models.FirstQuality;
import com.azure.resourcemanager.mediaservices.models.PresentationTimeRange;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AssetFilterInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AssetFilterInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"presentationTimeRange\":{\"startTimestamp\":1296946549223799191,\"endTimestamp\":6623329081283573494,\"presentationWindowDuration\":5136104931618105926,\"liveBackoffDuration\":7084872588122570574,\"timescale\":8771297433888765314,\"forceEndTimestamp\":true},\"firstQuality\":{\"bitrate\":1665401728},\"tracks\":[{\"trackSelections\":[]},{\"trackSelections\":[]}]},\"id\":\"xpkd\",\"name\":\"zb\",\"type\":\"iuebbaumny\"}")
                .toObject(AssetFilterInner.class);
        Assertions.assertEquals(1296946549223799191L, model.presentationTimeRange().startTimestamp());
        Assertions.assertEquals(6623329081283573494L, model.presentationTimeRange().endTimestamp());
        Assertions.assertEquals(5136104931618105926L, model.presentationTimeRange().presentationWindowDuration());
        Assertions.assertEquals(7084872588122570574L, model.presentationTimeRange().liveBackoffDuration());
        Assertions.assertEquals(8771297433888765314L, model.presentationTimeRange().timescale());
        Assertions.assertEquals(true, model.presentationTimeRange().forceEndTimestamp());
        Assertions.assertEquals(1665401728, model.firstQuality().bitrate());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AssetFilterInner model =
            new AssetFilterInner()
                .withPresentationTimeRange(
                    new PresentationTimeRange()
                        .withStartTimestamp(1296946549223799191L)
                        .withEndTimestamp(6623329081283573494L)
                        .withPresentationWindowDuration(5136104931618105926L)
                        .withLiveBackoffDuration(7084872588122570574L)
                        .withTimescale(8771297433888765314L)
                        .withForceEndTimestamp(true))
                .withFirstQuality(new FirstQuality().withBitrate(1665401728))
                .withTracks(
                    Arrays
                        .asList(
                            new FilterTrackSelection().withTrackSelections(Arrays.asList()),
                            new FilterTrackSelection().withTrackSelections(Arrays.asList())));
        model = BinaryData.fromObject(model).toObject(AssetFilterInner.class);
        Assertions.assertEquals(1296946549223799191L, model.presentationTimeRange().startTimestamp());
        Assertions.assertEquals(6623329081283573494L, model.presentationTimeRange().endTimestamp());
        Assertions.assertEquals(5136104931618105926L, model.presentationTimeRange().presentationWindowDuration());
        Assertions.assertEquals(7084872588122570574L, model.presentationTimeRange().liveBackoffDuration());
        Assertions.assertEquals(8771297433888765314L, model.presentationTimeRange().timescale());
        Assertions.assertEquals(true, model.presentationTimeRange().forceEndTimestamp());
        Assertions.assertEquals(1665401728, model.firstQuality().bitrate());
    }
}
