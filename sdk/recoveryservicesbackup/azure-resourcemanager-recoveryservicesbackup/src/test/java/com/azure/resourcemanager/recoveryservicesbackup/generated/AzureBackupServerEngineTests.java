// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureBackupServerEngine;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupEngineExtendedInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupManagementType;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class AzureBackupServerEngineTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureBackupServerEngine model = BinaryData.fromString(
            "{\"backupEngineType\":\"AzureBackupServerEngine\",\"friendlyName\":\"hlowkx\",\"backupManagementType\":\"MAB\",\"registrationStatus\":\"rdfjmzsyzfhotl\",\"backupEngineState\":\"k\",\"healthStatus\":\"ychunsjlpjrtwszh\",\"canReRegister\":false,\"backupEngineId\":\"c\",\"dpmVersion\":\"vtrrmhwrbfdpyflu\",\"azureBackupAgentVersion\":\"vjglrocuyzlwhhme\",\"isAzureBackupAgentUpgradeAvailable\":false,\"isDpmUpgradeAvailable\":true,\"extendedInfo\":{\"databaseName\":\"tnpqmemczjk\",\"protectedItemsCount\":2087898148,\"protectedServersCount\":1252342412,\"diskCount\":1879965141,\"usedDiskSpace\":35.50652285164764,\"availableDiskSpace\":83.93859393258009,\"refreshedAt\":\"2021-09-28T04:14:11Z\",\"azureProtectedInstances\":2045449859}}")
            .toObject(AzureBackupServerEngine.class);
        Assertions.assertEquals("hlowkx", model.friendlyName());
        Assertions.assertEquals(BackupManagementType.MAB, model.backupManagementType());
        Assertions.assertEquals("rdfjmzsyzfhotl", model.registrationStatus());
        Assertions.assertEquals("k", model.backupEngineState());
        Assertions.assertEquals("ychunsjlpjrtwszh", model.healthStatus());
        Assertions.assertEquals(false, model.canReRegister());
        Assertions.assertEquals("c", model.backupEngineId());
        Assertions.assertEquals("vtrrmhwrbfdpyflu", model.dpmVersion());
        Assertions.assertEquals("vjglrocuyzlwhhme", model.azureBackupAgentVersion());
        Assertions.assertEquals(false, model.isAzureBackupAgentUpgradeAvailable());
        Assertions.assertEquals(true, model.isDpmUpgradeAvailable());
        Assertions.assertEquals("tnpqmemczjk", model.extendedInfo().databaseName());
        Assertions.assertEquals(2087898148, model.extendedInfo().protectedItemsCount());
        Assertions.assertEquals(1252342412, model.extendedInfo().protectedServersCount());
        Assertions.assertEquals(1879965141, model.extendedInfo().diskCount());
        Assertions.assertEquals(35.50652285164764D, model.extendedInfo().usedDiskSpace());
        Assertions.assertEquals(83.93859393258009D, model.extendedInfo().availableDiskSpace());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-28T04:14:11Z"), model.extendedInfo().refreshedAt());
        Assertions.assertEquals(2045449859, model.extendedInfo().azureProtectedInstances());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureBackupServerEngine model = new AzureBackupServerEngine().withFriendlyName("hlowkx")
            .withBackupManagementType(BackupManagementType.MAB).withRegistrationStatus("rdfjmzsyzfhotl")
            .withBackupEngineState("k").withHealthStatus("ychunsjlpjrtwszh").withCanReRegister(false)
            .withBackupEngineId("c").withDpmVersion("vtrrmhwrbfdpyflu").withAzureBackupAgentVersion("vjglrocuyzlwhhme")
            .withIsAzureBackupAgentUpgradeAvailable(false).withIsDpmUpgradeAvailable(true)
            .withExtendedInfo(new BackupEngineExtendedInfo().withDatabaseName("tnpqmemczjk")
                .withProtectedItemsCount(2087898148).withProtectedServersCount(1252342412).withDiskCount(1879965141)
                .withUsedDiskSpace(35.50652285164764D).withAvailableDiskSpace(83.93859393258009D)
                .withRefreshedAt(OffsetDateTime.parse("2021-09-28T04:14:11Z")).withAzureProtectedInstances(2045449859));
        model = BinaryData.fromObject(model).toObject(AzureBackupServerEngine.class);
        Assertions.assertEquals("hlowkx", model.friendlyName());
        Assertions.assertEquals(BackupManagementType.MAB, model.backupManagementType());
        Assertions.assertEquals("rdfjmzsyzfhotl", model.registrationStatus());
        Assertions.assertEquals("k", model.backupEngineState());
        Assertions.assertEquals("ychunsjlpjrtwszh", model.healthStatus());
        Assertions.assertEquals(false, model.canReRegister());
        Assertions.assertEquals("c", model.backupEngineId());
        Assertions.assertEquals("vtrrmhwrbfdpyflu", model.dpmVersion());
        Assertions.assertEquals("vjglrocuyzlwhhme", model.azureBackupAgentVersion());
        Assertions.assertEquals(false, model.isAzureBackupAgentUpgradeAvailable());
        Assertions.assertEquals(true, model.isDpmUpgradeAvailable());
        Assertions.assertEquals("tnpqmemczjk", model.extendedInfo().databaseName());
        Assertions.assertEquals(2087898148, model.extendedInfo().protectedItemsCount());
        Assertions.assertEquals(1252342412, model.extendedInfo().protectedServersCount());
        Assertions.assertEquals(1879965141, model.extendedInfo().diskCount());
        Assertions.assertEquals(35.50652285164764D, model.extendedInfo().usedDiskSpace());
        Assertions.assertEquals(83.93859393258009D, model.extendedInfo().availableDiskSpace());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-28T04:14:11Z"), model.extendedInfo().refreshedAt());
        Assertions.assertEquals(2045449859, model.extendedInfo().azureProtectedInstances());
    }
}
