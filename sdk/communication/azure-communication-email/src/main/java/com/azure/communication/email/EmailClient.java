// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.email;

import com.azure.communication.email.implementation.models.ErrorResponseException;
import com.azure.communication.email.models.EmailMessage;
import com.azure.communication.email.models.EmailSendResult;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;

/** Initializes a new instance of the synchronous EmailClient type. */
@ServiceClient(builder = EmailClientBuilder.class)
public final class EmailClient {
    private final EmailAsyncClient client;

    /**
     * Initializes an instance of EmailClient class.
     *
     * @param client the async client.
     */
    EmailClient(EmailAsyncClient client) {
        this.client = client;
    }

    /**
     * Queues an email message to be sent to one or more recipients.
     *
     * @param message Message payload for sending an email.
     * @param context The context to associate with this operation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of status of the long running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<EmailSendResult, EmailSendResult> beginSend(EmailMessage message, Context context) {
        return client.beginSend(message, context).getSyncPoller();
    }
}
