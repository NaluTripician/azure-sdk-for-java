// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * BatchPoolLifetimeOption enums.
 */
public final class BatchPoolLifetimeOption extends ExpandableStringEnum<BatchPoolLifetimeOption> {

    /**
     * The Pool exists for the lifetime of the Job Schedule. The Batch Service creates the Pool when it creates the
     * first Job on the schedule. You may apply this option only to Job Schedules, not to Jobs.
     */
    @Generated
    public static final BatchPoolLifetimeOption JOB_SCHEDULE = fromString("jobschedule");

    /**
     * The Pool exists for the lifetime of the Job to which it is dedicated. The Batch service creates the Pool when it
     * creates the Job. If the 'job' option is applied to a Job Schedule, the Batch service creates a new auto Pool for
     * every Job created on the schedule.
     */
    @Generated
    public static final BatchPoolLifetimeOption JOB = fromString("job");

    /**
     * Creates a new instance of BatchPoolLifetimeOption value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public BatchPoolLifetimeOption() {
    }

    /**
     * Creates or finds a BatchPoolLifetimeOption from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding BatchPoolLifetimeOption.
     */
    @Generated
    public static BatchPoolLifetimeOption fromString(String name) {
        return fromString(name, BatchPoolLifetimeOption.class);
    }

    /**
     * Gets known BatchPoolLifetimeOption values.
     *
     * @return known BatchPoolLifetimeOption values.
     */
    @Generated
    public static Collection<BatchPoolLifetimeOption> values() {
        return values(BatchPoolLifetimeOption.class);
    }
}
