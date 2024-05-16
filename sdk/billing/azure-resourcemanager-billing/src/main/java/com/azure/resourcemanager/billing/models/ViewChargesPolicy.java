// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The policy that controls whether users with Azure RBAC access to a subscription can view its charges. */
public final class ViewChargesPolicy extends ExpandableStringEnum<ViewChargesPolicy> {
    /** Static value Allowed for ViewChargesPolicy. */
    public static final ViewChargesPolicy ALLOWED = fromString("Allowed");

    /** Static value NotAllowed for ViewChargesPolicy. */
    public static final ViewChargesPolicy NOT_ALLOWED = fromString("NotAllowed");

    /**
     * Creates a new instance of ViewChargesPolicy value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ViewChargesPolicy() {
    }

    /**
     * Creates or finds a ViewChargesPolicy from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ViewChargesPolicy.
     */
    @JsonCreator
    public static ViewChargesPolicy fromString(String name) {
        return fromString(name, ViewChargesPolicy.class);
    }

    /**
     * Gets known ViewChargesPolicy values.
     *
     * @return known ViewChargesPolicy values.
     */
    public static Collection<ViewChargesPolicy> values() {
        return values(ViewChargesPolicy.class);
    }
}
