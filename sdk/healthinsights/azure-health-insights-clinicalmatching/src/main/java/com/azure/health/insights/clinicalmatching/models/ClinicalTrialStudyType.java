// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.health.insights.clinicalmatching.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Possible study types of a clinical trial. */
public final class ClinicalTrialStudyType extends ExpandableStringEnum<ClinicalTrialStudyType> {
    /** Static value interventional for ClinicalTrialStudyType. */
    public static final ClinicalTrialStudyType INTERVENTIONAL = fromString("interventional");

    /** Static value observational for ClinicalTrialStudyType. */
    public static final ClinicalTrialStudyType OBSERVATIONAL = fromString("observational");

    /** Static value expandedAccess for ClinicalTrialStudyType. */
    public static final ClinicalTrialStudyType EXPANDED_ACCESS = fromString("expandedAccess");

    /** Static value patientRegistries for ClinicalTrialStudyType. */
    public static final ClinicalTrialStudyType PATIENT_REGISTRIES = fromString("patientRegistries");

    /**
     * Creates a new instance of ClinicalTrialStudyType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ClinicalTrialStudyType() {}

    /**
     * Creates or finds a ClinicalTrialStudyType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ClinicalTrialStudyType.
     */
    @JsonCreator
    public static ClinicalTrialStudyType fromString(String name) {
        return fromString(name, ClinicalTrialStudyType.class);
    }

    /**
     * Gets known ClinicalTrialStudyType values.
     *
     * @return known ClinicalTrialStudyType values.
     */
    public static Collection<ClinicalTrialStudyType> values() {
        return values(ClinicalTrialStudyType.class);
    }
}
