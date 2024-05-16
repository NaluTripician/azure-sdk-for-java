// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** OAuth2 grant type options. */
public final class OAuth2GrantType extends ExpandableStringEnum<OAuth2GrantType> {
    /** Static value AuthorizationCode for OAuth2GrantType. */
    public static final OAuth2GrantType AUTHORIZATION_CODE = fromString("AuthorizationCode");

    /** Static value ClientCredentials for OAuth2GrantType. */
    public static final OAuth2GrantType CLIENT_CREDENTIALS = fromString("ClientCredentials");

    /**
     * Creates a new instance of OAuth2GrantType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public OAuth2GrantType() {
    }

    /**
     * Creates or finds a OAuth2GrantType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OAuth2GrantType.
     */
    @JsonCreator
    public static OAuth2GrantType fromString(String name) {
        return fromString(name, OAuth2GrantType.class);
    }

    /**
     * Gets known OAuth2GrantType values.
     *
     * @return known OAuth2GrantType values.
     */
    public static Collection<OAuth2GrantType> values() {
        return values(OAuth2GrantType.class);
    }
}
