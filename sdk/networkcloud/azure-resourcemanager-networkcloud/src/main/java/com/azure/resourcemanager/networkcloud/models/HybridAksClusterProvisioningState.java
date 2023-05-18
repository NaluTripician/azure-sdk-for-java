// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The provisioning state of the Hybrid AKS cluster resource. */
public final class HybridAksClusterProvisioningState extends ExpandableStringEnum<HybridAksClusterProvisioningState> {
    /** Static value Succeeded for HybridAksClusterProvisioningState. */
    public static final HybridAksClusterProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for HybridAksClusterProvisioningState. */
    public static final HybridAksClusterProvisioningState FAILED = fromString("Failed");

    /** Static value Canceled for HybridAksClusterProvisioningState. */
    public static final HybridAksClusterProvisioningState CANCELED = fromString("Canceled");

    /**
     * Creates a new instance of HybridAksClusterProvisioningState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public HybridAksClusterProvisioningState() {
    }

    /**
     * Creates or finds a HybridAksClusterProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding HybridAksClusterProvisioningState.
     */
    @JsonCreator
    public static HybridAksClusterProvisioningState fromString(String name) {
        return fromString(name, HybridAksClusterProvisioningState.class);
    }

    /**
     * Gets known HybridAksClusterProvisioningState values.
     *
     * @return known HybridAksClusterProvisioningState values.
     */
    public static Collection<HybridAksClusterProvisioningState> values() {
        return values(HybridAksClusterProvisioningState.class);
    }
}
