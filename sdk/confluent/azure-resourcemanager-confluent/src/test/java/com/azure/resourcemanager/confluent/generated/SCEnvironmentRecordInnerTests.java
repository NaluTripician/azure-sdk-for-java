// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confluent.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.confluent.fluent.models.SCEnvironmentRecordInner;
import com.azure.resourcemanager.confluent.models.SCMetadataEntity;
import org.junit.jupiter.api.Assertions;

public final class SCEnvironmentRecordInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SCEnvironmentRecordInner model = BinaryData.fromString(
            "{\"kind\":\"lyzrpzbchckqqzqi\",\"id\":\"iysui\",\"properties\":{\"metadata\":{\"self\":\"ked\",\"resourceName\":\"trwyhqmib\",\"createdTimestamp\":\"hwit\",\"updatedTimestamp\":\"ypyynpcdpumnzg\",\"deletedTimestamp\":\"z\"}},\"name\":\"abikns\"}")
            .toObject(SCEnvironmentRecordInner.class);
        Assertions.assertEquals("lyzrpzbchckqqzqi", model.kind());
        Assertions.assertEquals("iysui", model.id());
        Assertions.assertEquals("abikns", model.name());
        Assertions.assertEquals("ked", model.metadata().self());
        Assertions.assertEquals("trwyhqmib", model.metadata().resourceName());
        Assertions.assertEquals("hwit", model.metadata().createdTimestamp());
        Assertions.assertEquals("ypyynpcdpumnzg", model.metadata().updatedTimestamp());
        Assertions.assertEquals("z", model.metadata().deletedTimestamp());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SCEnvironmentRecordInner model = new SCEnvironmentRecordInner().withKind("lyzrpzbchckqqzqi").withId("iysui")
            .withName("abikns").withMetadata(new SCMetadataEntity().withSelf("ked").withResourceName("trwyhqmib")
                .withCreatedTimestamp("hwit").withUpdatedTimestamp("ypyynpcdpumnzg").withDeletedTimestamp("z"));
        model = BinaryData.fromObject(model).toObject(SCEnvironmentRecordInner.class);
        Assertions.assertEquals("lyzrpzbchckqqzqi", model.kind());
        Assertions.assertEquals("iysui", model.id());
        Assertions.assertEquals("abikns", model.name());
        Assertions.assertEquals("ked", model.metadata().self());
        Assertions.assertEquals("trwyhqmib", model.metadata().resourceName());
        Assertions.assertEquals("hwit", model.metadata().createdTimestamp());
        Assertions.assertEquals("ypyynpcdpumnzg", model.metadata().updatedTimestamp());
        Assertions.assertEquals("z", model.metadata().deletedTimestamp());
    }
}
