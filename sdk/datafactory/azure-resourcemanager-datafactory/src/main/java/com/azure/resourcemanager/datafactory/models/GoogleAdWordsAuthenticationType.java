// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The OAuth 2.0 authentication mechanism used for authentication. ServiceAuthentication can only be used on self-hosted
 * IR.
 */
public final class GoogleAdWordsAuthenticationType extends ExpandableStringEnum<GoogleAdWordsAuthenticationType> {
    /**
     * Static value ServiceAuthentication for GoogleAdWordsAuthenticationType.
     */
    public static final GoogleAdWordsAuthenticationType SERVICE_AUTHENTICATION = fromString("ServiceAuthentication");

    /**
     * Static value UserAuthentication for GoogleAdWordsAuthenticationType.
     */
    public static final GoogleAdWordsAuthenticationType USER_AUTHENTICATION = fromString("UserAuthentication");

    /**
     * Creates a new instance of GoogleAdWordsAuthenticationType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public GoogleAdWordsAuthenticationType() {
    }

    /**
     * Creates or finds a GoogleAdWordsAuthenticationType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding GoogleAdWordsAuthenticationType.
     */
    @JsonCreator
    public static GoogleAdWordsAuthenticationType fromString(String name) {
        return fromString(name, GoogleAdWordsAuthenticationType.class);
    }

    /**
     * Gets known GoogleAdWordsAuthenticationType values.
     * 
     * @return known GoogleAdWordsAuthenticationType values.
     */
    public static Collection<GoogleAdWordsAuthenticationType> values() {
        return values(GoogleAdWordsAuthenticationType.class);
    }
}
