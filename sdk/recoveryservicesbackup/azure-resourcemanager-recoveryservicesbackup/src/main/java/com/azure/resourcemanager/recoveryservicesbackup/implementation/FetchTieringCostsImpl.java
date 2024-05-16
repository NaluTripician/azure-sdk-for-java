// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.FetchTieringCostsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.TieringCostInfoInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.FetchTieringCostInfoRequest;
import com.azure.resourcemanager.recoveryservicesbackup.models.FetchTieringCosts;
import com.azure.resourcemanager.recoveryservicesbackup.models.TieringCostInfo;

public final class FetchTieringCostsImpl implements FetchTieringCosts {
    private static final ClientLogger LOGGER = new ClientLogger(FetchTieringCostsImpl.class);

    private final FetchTieringCostsClient innerClient;

    private final com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager;

    public FetchTieringCostsImpl(FetchTieringCostsClient innerClient,
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public TieringCostInfo post(String resourceGroupName, String vaultName, FetchTieringCostInfoRequest parameters) {
        TieringCostInfoInner inner = this.serviceClient().post(resourceGroupName, vaultName, parameters);
        if (inner != null) {
            return new TieringCostInfoImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public TieringCostInfo post(String resourceGroupName, String vaultName, FetchTieringCostInfoRequest parameters,
        Context context) {
        TieringCostInfoInner inner = this.serviceClient().post(resourceGroupName, vaultName, parameters, context);
        if (inner != null) {
            return new TieringCostInfoImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private FetchTieringCostsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager() {
        return this.serviceManager;
    }
}
