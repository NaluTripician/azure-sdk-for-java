// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.messages.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The message template's image value information.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "kind", defaultImpl = MessageTemplateImage.class, visible = true)
@JsonTypeName("image")
@Fluent
public final class MessageTemplateImage extends MessageTemplateValue {

    /*
     * The (public) URL of the media.
     */
    @Generated
    @JsonProperty(value = "url")
    private final String url;

    /*
     * The [optional] caption of the media object.
     */
    @Generated
    @JsonProperty(value = "caption")
    private String caption;

    /*
     * The [optional] filename of the media file.
     */
    @Generated
    @JsonProperty(value = "fileName")
    private String fileName;

    /**
     * Creates an instance of MessageTemplateImage class.
     *
     * @param refValue the refValue value to set.
     * @param url the url value to set.
     */
    @Generated
    @JsonCreator
    public MessageTemplateImage(@JsonProperty(value = "name") String refValue,
        @JsonProperty(value = "url") String url) {
        super(refValue);
        this.url = url;
    }

    /**
     * Get the url property: The (public) URL of the media.
     *
     * @return the url value.
     */
    @Generated
    public String getUrl() {
        return this.url;
    }

    /**
     * Get the caption property: The [optional] caption of the media object.
     *
     * @return the caption value.
     */
    @Generated
    public String getCaption() {
        return this.caption;
    }

    /**
     * Set the caption property: The [optional] caption of the media object.
     *
     * @param caption the caption value to set.
     * @return the MessageTemplateImage object itself.
     */
    @Generated
    public MessageTemplateImage setCaption(String caption) {
        this.caption = caption;
        return this;
    }

    /**
     * Get the fileName property: The [optional] filename of the media file.
     *
     * @return the fileName value.
     */
    @Generated
    public String getFileName() {
        return this.fileName;
    }

    /**
     * Set the fileName property: The [optional] filename of the media file.
     *
     * @param fileName the fileName value to set.
     * @return the MessageTemplateImage object itself.
     */
    @Generated
    public MessageTemplateImage setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /*
     * The type discriminator describing a template parameter type.
     */
    @Generated
    @JsonTypeId
    @JsonProperty(value = "kind")
    private MessageTemplateValueKind kind = MessageTemplateValueKind.IMAGE;

    /**
     * Get the kind property: The type discriminator describing a template parameter type.
     *
     * @return the kind value.
     */
    @Generated
    @Override
    public MessageTemplateValueKind getKind() {
        return this.kind;
    }
}
