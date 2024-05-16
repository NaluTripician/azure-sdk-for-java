// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Fluent;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** The DefaultRolloutPropertiesStatus model. */
@Fluent
public final class DefaultRolloutPropertiesStatus extends DefaultRolloutStatus {
    /** Creates an instance of DefaultRolloutPropertiesStatus class. */
    public DefaultRolloutPropertiesStatus() {
    }

    /** {@inheritDoc} */
    @Override
    public DefaultRolloutPropertiesStatus withNextTrafficRegion(TrafficRegionCategory nextTrafficRegion) {
        super.withNextTrafficRegion(nextTrafficRegion);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DefaultRolloutPropertiesStatus withNextTrafficRegionScheduledTime(
        OffsetDateTime nextTrafficRegionScheduledTime) {
        super.withNextTrafficRegionScheduledTime(nextTrafficRegionScheduledTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DefaultRolloutPropertiesStatus withSubscriptionReregistrationResult(
        SubscriptionReregistrationResult subscriptionReregistrationResult) {
        super.withSubscriptionReregistrationResult(subscriptionReregistrationResult);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DefaultRolloutPropertiesStatus withCompletedRegions(List<String> completedRegions) {
        super.withCompletedRegions(completedRegions);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DefaultRolloutPropertiesStatus withFailedOrSkippedRegions(
        Map<String, ExtendedErrorInfo> failedOrSkippedRegions) {
        super.withFailedOrSkippedRegions(failedOrSkippedRegions);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
