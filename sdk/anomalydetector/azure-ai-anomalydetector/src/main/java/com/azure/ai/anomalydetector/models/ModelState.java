// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.anomalydetector.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Model status. */
@Fluent
public final class ModelState {
    /*
     * This indicates the number of passes of the entire training dataset the
     * algorithm has completed.
     */
    @JsonProperty(value = "epochIds")
    private List<Integer> epochIds;

    /*
     * List of metrics used to assess how the model fits the training data for each
     * epoch.
     */
    @JsonProperty(value = "trainLosses")
    private List<Double> trainLosses;

    /*
     * List of metrics used to assess how the model fits the validation set for each
     * epoch.
     */
    @JsonProperty(value = "validationLosses")
    private List<Double> validationLosses;

    /*
     * Latency for each epoch.
     */
    @JsonProperty(value = "latenciesInSeconds")
    private List<Double> latenciesInSeconds;

    /** Creates an instance of ModelState class. */
    public ModelState() {}

    /**
     * Get the epochIds property: This indicates the number of passes of the entire training dataset the algorithm has
     * completed.
     *
     * @return the epochIds value.
     */
    public List<Integer> getEpochIds() {
        return this.epochIds;
    }

    /**
     * Set the epochIds property: This indicates the number of passes of the entire training dataset the algorithm has
     * completed.
     *
     * @param epochIds the epochIds value to set.
     * @return the ModelState object itself.
     */
    public ModelState setEpochIds(List<Integer> epochIds) {
        this.epochIds = epochIds;
        return this;
    }

    /**
     * Get the trainLosses property: List of metrics used to assess how the model fits the training data for each epoch.
     *
     * @return the trainLosses value.
     */
    public List<Double> getTrainLosses() {
        return this.trainLosses;
    }

    /**
     * Set the trainLosses property: List of metrics used to assess how the model fits the training data for each epoch.
     *
     * @param trainLosses the trainLosses value to set.
     * @return the ModelState object itself.
     */
    public ModelState setTrainLosses(List<Double> trainLosses) {
        this.trainLosses = trainLosses;
        return this;
    }

    /**
     * Get the validationLosses property: List of metrics used to assess how the model fits the validation set for each
     * epoch.
     *
     * @return the validationLosses value.
     */
    public List<Double> getValidationLosses() {
        return this.validationLosses;
    }

    /**
     * Set the validationLosses property: List of metrics used to assess how the model fits the validation set for each
     * epoch.
     *
     * @param validationLosses the validationLosses value to set.
     * @return the ModelState object itself.
     */
    public ModelState setValidationLosses(List<Double> validationLosses) {
        this.validationLosses = validationLosses;
        return this;
    }

    /**
     * Get the latenciesInSeconds property: Latency for each epoch.
     *
     * @return the latenciesInSeconds value.
     */
    public List<Double> getLatenciesInSeconds() {
        return this.latenciesInSeconds;
    }

    /**
     * Set the latenciesInSeconds property: Latency for each epoch.
     *
     * @param latenciesInSeconds the latenciesInSeconds value to set.
     * @return the ModelState object itself.
     */
    public ModelState setLatenciesInSeconds(List<Double> latenciesInSeconds) {
        this.latenciesInSeconds = latenciesInSeconds;
        return this;
    }
}
