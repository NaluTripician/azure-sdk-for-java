// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mediaservices.fluent.AssetsClient;
import com.azure.resourcemanager.mediaservices.fluent.models.AssetContainerSasInner;
import com.azure.resourcemanager.mediaservices.fluent.models.AssetInner;
import com.azure.resourcemanager.mediaservices.fluent.models.ListStreamingLocatorsResponseInner;
import com.azure.resourcemanager.mediaservices.fluent.models.StorageEncryptedAssetDecryptionDataInner;
import com.azure.resourcemanager.mediaservices.models.Asset;
import com.azure.resourcemanager.mediaservices.models.AssetContainerSas;
import com.azure.resourcemanager.mediaservices.models.Assets;
import com.azure.resourcemanager.mediaservices.models.ListContainerSasInput;
import com.azure.resourcemanager.mediaservices.models.ListStreamingLocatorsResponse;
import com.azure.resourcemanager.mediaservices.models.StorageEncryptedAssetDecryptionData;

public final class AssetsImpl implements Assets {
    private static final ClientLogger LOGGER = new ClientLogger(AssetsImpl.class);

    private final AssetsClient innerClient;

    private final com.azure.resourcemanager.mediaservices.MediaServicesManager serviceManager;

    public AssetsImpl(
        AssetsClient innerClient, com.azure.resourcemanager.mediaservices.MediaServicesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Asset> list(String resourceGroupName, String accountName) {
        PagedIterable<AssetInner> inner = this.serviceClient().list(resourceGroupName, accountName);
        return Utils.mapPage(inner, inner1 -> new AssetImpl(inner1, this.manager()));
    }

    public PagedIterable<Asset> list(
        String resourceGroupName, String accountName, String filter, Integer top, String orderby, Context context) {
        PagedIterable<AssetInner> inner =
            this.serviceClient().list(resourceGroupName, accountName, filter, top, orderby, context);
        return Utils.mapPage(inner, inner1 -> new AssetImpl(inner1, this.manager()));
    }

    public Response<Asset> getWithResponse(
        String resourceGroupName, String accountName, String assetName, Context context) {
        Response<AssetInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, accountName, assetName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AssetImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Asset get(String resourceGroupName, String accountName, String assetName) {
        AssetInner inner = this.serviceClient().get(resourceGroupName, accountName, assetName);
        if (inner != null) {
            return new AssetImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String accountName, String assetName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, accountName, assetName, context);
    }

    public void delete(String resourceGroupName, String accountName, String assetName) {
        this.serviceClient().delete(resourceGroupName, accountName, assetName);
    }

    public Response<AssetContainerSas> listContainerSasWithResponse(
        String resourceGroupName,
        String accountName,
        String assetName,
        ListContainerSasInput parameters,
        Context context) {
        Response<AssetContainerSasInner> inner =
            this
                .serviceClient()
                .listContainerSasWithResponse(resourceGroupName, accountName, assetName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AssetContainerSasImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AssetContainerSas listContainerSas(
        String resourceGroupName, String accountName, String assetName, ListContainerSasInput parameters) {
        AssetContainerSasInner inner =
            this.serviceClient().listContainerSas(resourceGroupName, accountName, assetName, parameters);
        if (inner != null) {
            return new AssetContainerSasImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<StorageEncryptedAssetDecryptionData> getEncryptionKeyWithResponse(
        String resourceGroupName, String accountName, String assetName, Context context) {
        Response<StorageEncryptedAssetDecryptionDataInner> inner =
            this.serviceClient().getEncryptionKeyWithResponse(resourceGroupName, accountName, assetName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new StorageEncryptedAssetDecryptionDataImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public StorageEncryptedAssetDecryptionData getEncryptionKey(
        String resourceGroupName, String accountName, String assetName) {
        StorageEncryptedAssetDecryptionDataInner inner =
            this.serviceClient().getEncryptionKey(resourceGroupName, accountName, assetName);
        if (inner != null) {
            return new StorageEncryptedAssetDecryptionDataImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ListStreamingLocatorsResponse> listStreamingLocatorsWithResponse(
        String resourceGroupName, String accountName, String assetName, Context context) {
        Response<ListStreamingLocatorsResponseInner> inner =
            this.serviceClient().listStreamingLocatorsWithResponse(resourceGroupName, accountName, assetName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ListStreamingLocatorsResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ListStreamingLocatorsResponse listStreamingLocators(
        String resourceGroupName, String accountName, String assetName) {
        ListStreamingLocatorsResponseInner inner =
            this.serviceClient().listStreamingLocators(resourceGroupName, accountName, assetName);
        if (inner != null) {
            return new ListStreamingLocatorsResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Asset getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "mediaServices");
        if (accountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'mediaServices'.", id)));
        }
        String assetName = Utils.getValueFromIdByName(id, "assets");
        if (assetName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'assets'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, assetName, Context.NONE).getValue();
    }

    public Response<Asset> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "mediaServices");
        if (accountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'mediaServices'.", id)));
        }
        String assetName = Utils.getValueFromIdByName(id, "assets");
        if (assetName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'assets'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, assetName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "mediaServices");
        if (accountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'mediaServices'.", id)));
        }
        String assetName = Utils.getValueFromIdByName(id, "assets");
        if (assetName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'assets'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, accountName, assetName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "mediaServices");
        if (accountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'mediaServices'.", id)));
        }
        String assetName = Utils.getValueFromIdByName(id, "assets");
        if (assetName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'assets'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, accountName, assetName, context);
    }

    private AssetsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.mediaservices.MediaServicesManager manager() {
        return this.serviceManager;
    }

    public AssetImpl define(String name) {
        return new AssetImpl(name, this.manager());
    }
}
