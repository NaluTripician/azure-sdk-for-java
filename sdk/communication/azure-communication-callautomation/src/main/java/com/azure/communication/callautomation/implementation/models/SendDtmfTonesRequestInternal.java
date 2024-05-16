// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The SendDtmfTonesRequestInternal model. */
@Fluent
public final class SendDtmfTonesRequestInternal {
    /*
     * List of tones to be sent to target participant.
     */
    @JsonProperty(value = "tones", required = true)
    private List<DtmfToneInternal> tones;

    /*
     * Target participant of send Dtmf tones.
     */
    @JsonProperty(value = "targetParticipant", required = true)
    private CommunicationIdentifierModel targetParticipant;

    /*
     * The value to identify context of the operation.
     */
    @JsonProperty(value = "operationContext")
    private String operationContext;

    /*
     * Set a callback URI that overrides the default callback URI set by
     * CreateCall/AnswerCall for this operation.
     * This setup is per-action. If this is not set, the default callback URI
     * set by CreateCall/AnswerCall will be used.
     */
    @JsonProperty(value = "operationCallbackUri")
    private String operationCallbackUri;

    /**
     * Get the tones property: List of tones to be sent to target participant.
     *
     * @return the tones value.
     */
    public List<DtmfToneInternal> getTones() {
        return this.tones;
    }

    /**
     * Set the tones property: List of tones to be sent to target participant.
     *
     * @param tones the tones value to set.
     * @return the SendDtmfTonesRequestInternal object itself.
     */
    public SendDtmfTonesRequestInternal setTones(List<DtmfToneInternal> tones) {
        this.tones = tones;
        return this;
    }

    /**
     * Get the targetParticipant property: Target participant of send Dtmf tones.
     *
     * @return the targetParticipant value.
     */
    public CommunicationIdentifierModel getTargetParticipant() {
        return this.targetParticipant;
    }

    /**
     * Set the targetParticipant property: Target participant of send Dtmf tones.
     *
     * @param targetParticipant the targetParticipant value to set.
     * @return the SendDtmfTonesRequestInternal object itself.
     */
    public SendDtmfTonesRequestInternal setTargetParticipant(CommunicationIdentifierModel targetParticipant) {
        this.targetParticipant = targetParticipant;
        return this;
    }

    /**
     * Get the operationContext property: The value to identify context of the operation.
     *
     * @return the operationContext value.
     */
    public String getOperationContext() {
        return this.operationContext;
    }

    /**
     * Set the operationContext property: The value to identify context of the operation.
     *
     * @param operationContext the operationContext value to set.
     * @return the SendDtmfTonesRequestInternal object itself.
     */
    public SendDtmfTonesRequestInternal setOperationContext(String operationContext) {
        this.operationContext = operationContext;
        return this;
    }

    /**
     * Get the operationCallbackUri property: Set a callback URI that overrides the default callback URI set by
     * CreateCall/AnswerCall for this operation. This setup is per-action. If this is not set, the default callback URI
     * set by CreateCall/AnswerCall will be used.
     *
     * @return the operationCallbackUri value.
     */
    public String getOperationCallbackUri() {
        return this.operationCallbackUri;
    }

    /**
     * Set the operationCallbackUri property: Set a callback URI that overrides the default callback URI set by
     * CreateCall/AnswerCall for this operation. This setup is per-action. If this is not set, the default callback URI
     * set by CreateCall/AnswerCall will be used.
     *
     * @param operationCallbackUri the operationCallbackUri value to set.
     * @return the SendDtmfTonesRequestInternal object itself.
     */
    public SendDtmfTonesRequestInternal setOperationCallbackUri(String operationCallbackUri) {
        this.operationCallbackUri = operationCallbackUri;
        return this;
    }
}
