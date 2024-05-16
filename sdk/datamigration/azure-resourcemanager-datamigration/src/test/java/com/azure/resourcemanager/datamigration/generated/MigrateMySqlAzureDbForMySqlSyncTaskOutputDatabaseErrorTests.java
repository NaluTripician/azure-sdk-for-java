// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datamigration.models.MigrateMySqlAzureDbForMySqlSyncTaskOutputDatabaseError;
import com.azure.resourcemanager.datamigration.models.SyncMigrationDatabaseErrorEvent;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class MigrateMySqlAzureDbForMySqlSyncTaskOutputDatabaseErrorTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MigrateMySqlAzureDbForMySqlSyncTaskOutputDatabaseError model =
            BinaryData
                .fromString(
                    "{\"resultType\":\"DatabaseLevelErrorOutput\",\"errorMessage\":\"vdmovsmzlxwabm\",\"events\":[{\"timestampString\":\"kif\",\"eventTypeString\":\"tpuqujmq\",\"eventText\":\"kfbtndoaongbjc\"},{\"timestampString\":\"ujitcjedftww\",\"eventTypeString\":\"zkoj\",\"eventText\":\"c\"}],\"id\":\"foqouicybx\"}")
                .toObject(MigrateMySqlAzureDbForMySqlSyncTaskOutputDatabaseError.class);
        Assertions.assertEquals("vdmovsmzlxwabm", model.errorMessage());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MigrateMySqlAzureDbForMySqlSyncTaskOutputDatabaseError model =
            new MigrateMySqlAzureDbForMySqlSyncTaskOutputDatabaseError()
                .withErrorMessage("vdmovsmzlxwabm")
                .withEvents(
                    Arrays.asList(new SyncMigrationDatabaseErrorEvent(), new SyncMigrationDatabaseErrorEvent()));
        model = BinaryData.fromObject(model).toObject(MigrateMySqlAzureDbForMySqlSyncTaskOutputDatabaseError.class);
        Assertions.assertEquals("vdmovsmzlxwabm", model.errorMessage());
    }
}
