// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billingbenefits.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Describes whether the payment is completed, failed, cancelled or scheduled in the future. */
public final class PaymentStatus extends ExpandableStringEnum<PaymentStatus> {
    /** Static value Succeeded for PaymentStatus. */
    public static final PaymentStatus SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for PaymentStatus. */
    public static final PaymentStatus FAILED = fromString("Failed");

    /** Static value Scheduled for PaymentStatus. */
    public static final PaymentStatus SCHEDULED = fromString("Scheduled");

    /** Static value Cancelled for PaymentStatus. */
    public static final PaymentStatus CANCELLED = fromString("Cancelled");

    /**
     * Creates a new instance of PaymentStatus value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PaymentStatus() {
    }

    /**
     * Creates or finds a PaymentStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PaymentStatus.
     */
    @JsonCreator
    public static PaymentStatus fromString(String name) {
        return fromString(name, PaymentStatus.class);
    }

    /**
     * Gets known PaymentStatus values.
     *
     * @return known PaymentStatus values.
     */
    public static Collection<PaymentStatus> values() {
        return values(PaymentStatus.class);
    }
}
