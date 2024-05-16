// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotfirmwaredefense.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.iotfirmwaredefense.fluent.CryptoCertificatesClient;
import com.azure.resourcemanager.iotfirmwaredefense.fluent.models.CryptoCertificateResourceInner;
import com.azure.resourcemanager.iotfirmwaredefense.models.CryptoCertificateResource;
import com.azure.resourcemanager.iotfirmwaredefense.models.CryptoCertificates;

public final class CryptoCertificatesImpl implements CryptoCertificates {
    private static final ClientLogger LOGGER = new ClientLogger(CryptoCertificatesImpl.class);

    private final CryptoCertificatesClient innerClient;

    private final com.azure.resourcemanager.iotfirmwaredefense.IoTFirmwareDefenseManager serviceManager;

    public CryptoCertificatesImpl(CryptoCertificatesClient innerClient,
        com.azure.resourcemanager.iotfirmwaredefense.IoTFirmwareDefenseManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<CryptoCertificateResource> listByFirmware(String resourceGroupName, String workspaceName,
        String firmwareId) {
        PagedIterable<CryptoCertificateResourceInner> inner
            = this.serviceClient().listByFirmware(resourceGroupName, workspaceName, firmwareId);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new CryptoCertificateResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<CryptoCertificateResource> listByFirmware(String resourceGroupName, String workspaceName,
        String firmwareId, Context context) {
        PagedIterable<CryptoCertificateResourceInner> inner
            = this.serviceClient().listByFirmware(resourceGroupName, workspaceName, firmwareId, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new CryptoCertificateResourceImpl(inner1, this.manager()));
    }

    private CryptoCertificatesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.iotfirmwaredefense.IoTFirmwareDefenseManager manager() {
        return this.serviceManager;
    }
}
