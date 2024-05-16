// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Stochastic optimizer for image models. */
public final class StochasticOptimizer extends ExpandableStringEnum<StochasticOptimizer> {
    /** Static value None for StochasticOptimizer. */
    public static final StochasticOptimizer NONE = fromString("None");

    /** Static value Sgd for StochasticOptimizer. */
    public static final StochasticOptimizer SGD = fromString("Sgd");

    /** Static value Adam for StochasticOptimizer. */
    public static final StochasticOptimizer ADAM = fromString("Adam");

    /** Static value Adamw for StochasticOptimizer. */
    public static final StochasticOptimizer ADAMW = fromString("Adamw");

    /**
     * Creates a new instance of StochasticOptimizer value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public StochasticOptimizer() {
    }

    /**
     * Creates or finds a StochasticOptimizer from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding StochasticOptimizer.
     */
    @JsonCreator
    public static StochasticOptimizer fromString(String name) {
        return fromString(name, StochasticOptimizer.class);
    }

    /**
     * Gets known StochasticOptimizer values.
     *
     * @return known StochasticOptimizer values.
     */
    public static Collection<StochasticOptimizer> values() {
        return values(StochasticOptimizer.class);
    }
}
