// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.quota.fluent.QuotaRequestStatusClient;
import com.azure.resourcemanager.quota.fluent.models.QuotaRequestDetailsInner;
import com.azure.resourcemanager.quota.models.QuotaRequestDetails;
import com.azure.resourcemanager.quota.models.QuotaRequestStatus;

public final class QuotaRequestStatusImpl implements QuotaRequestStatus {
    private static final ClientLogger LOGGER = new ClientLogger(QuotaRequestStatusImpl.class);

    private final QuotaRequestStatusClient innerClient;

    private final com.azure.resourcemanager.quota.QuotaManager serviceManager;

    public QuotaRequestStatusImpl(QuotaRequestStatusClient innerClient,
        com.azure.resourcemanager.quota.QuotaManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<QuotaRequestDetails> getWithResponse(String id, String scope, Context context) {
        Response<QuotaRequestDetailsInner> inner = this.serviceClient().getWithResponse(id, scope, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new QuotaRequestDetailsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public QuotaRequestDetails get(String id, String scope) {
        QuotaRequestDetailsInner inner = this.serviceClient().get(id, scope);
        if (inner != null) {
            return new QuotaRequestDetailsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<QuotaRequestDetails> list(String scope) {
        PagedIterable<QuotaRequestDetailsInner> inner = this.serviceClient().list(scope);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new QuotaRequestDetailsImpl(inner1, this.manager()));
    }

    public PagedIterable<QuotaRequestDetails> list(String scope, String filter, Integer top, String skiptoken,
        Context context) {
        PagedIterable<QuotaRequestDetailsInner> inner
            = this.serviceClient().list(scope, filter, top, skiptoken, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new QuotaRequestDetailsImpl(inner1, this.manager()));
    }

    private QuotaRequestStatusClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.quota.QuotaManager manager() {
        return this.serviceManager;
    }
}
