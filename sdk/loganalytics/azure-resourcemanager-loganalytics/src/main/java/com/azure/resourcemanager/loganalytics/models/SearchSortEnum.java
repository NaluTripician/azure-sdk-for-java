// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The sort order of the search. */
public final class SearchSortEnum extends ExpandableStringEnum<SearchSortEnum> {
    /** Static value asc for SearchSortEnum. */
    public static final SearchSortEnum ASC = fromString("asc");

    /** Static value desc for SearchSortEnum. */
    public static final SearchSortEnum DESC = fromString("desc");

    /**
     * Creates a new instance of SearchSortEnum value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SearchSortEnum() {
    }

    /**
     * Creates or finds a SearchSortEnum from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SearchSortEnum.
     */
    @JsonCreator
    public static SearchSortEnum fromString(String name) {
        return fromString(name, SearchSortEnum.class);
    }

    /**
     * Gets known SearchSortEnum values.
     *
     * @return known SearchSortEnum values.
     */
    public static Collection<SearchSortEnum> values() {
        return values(SearchSortEnum.class);
    }
}
