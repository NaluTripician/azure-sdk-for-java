// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The sorting criteria to use for the results of Extractive Summarization. */
public final class ExtractiveSummarizationSortingCriteria
        extends ExpandableStringEnum<ExtractiveSummarizationSortingCriteria> {
    /** Indicates that results should be sorted in order of appearance in the text. */
    public static final ExtractiveSummarizationSortingCriteria OFFSET = fromString("Offset");

    /** Indicates that results should be sorted in order of importance (i.e. rank score) according to the model. */
    public static final ExtractiveSummarizationSortingCriteria RANK = fromString("Rank");

    /**
     * Creates a new instance of ExtractiveSummarizationSortingCriteria value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ExtractiveSummarizationSortingCriteria() {}

    /**
     * Creates or finds a ExtractiveSummarizationSortingCriteria from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ExtractiveSummarizationSortingCriteria.
     */
    @JsonCreator
    public static ExtractiveSummarizationSortingCriteria fromString(String name) {
        return fromString(name, ExtractiveSummarizationSortingCriteria.class);
    }

    /**
     * Gets known ExtractiveSummarizationSortingCriteria values.
     *
     * @return known ExtractiveSummarizationSortingCriteria values.
     */
    public static Collection<ExtractiveSummarizationSortingCriteria> values() {
        return values(ExtractiveSummarizationSortingCriteria.class);
    }
}
