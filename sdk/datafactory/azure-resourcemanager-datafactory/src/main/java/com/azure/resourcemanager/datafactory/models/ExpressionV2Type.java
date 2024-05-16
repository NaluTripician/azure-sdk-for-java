// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Type of expressions supported by the system. Type: string.
 */
public final class ExpressionV2Type extends ExpandableStringEnum<ExpressionV2Type> {
    /**
     * Static value Constant for ExpressionV2Type.
     */
    public static final ExpressionV2Type CONSTANT = fromString("Constant");

    /**
     * Static value Field for ExpressionV2Type.
     */
    public static final ExpressionV2Type FIELD = fromString("Field");

    /**
     * Static value Unary for ExpressionV2Type.
     */
    public static final ExpressionV2Type UNARY = fromString("Unary");

    /**
     * Static value Binary for ExpressionV2Type.
     */
    public static final ExpressionV2Type BINARY = fromString("Binary");

    /**
     * Creates a new instance of ExpressionV2Type value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ExpressionV2Type() {
    }

    /**
     * Creates or finds a ExpressionV2Type from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ExpressionV2Type.
     */
    @JsonCreator
    public static ExpressionV2Type fromString(String name) {
        return fromString(name, ExpressionV2Type.class);
    }

    /**
     * Gets known ExpressionV2Type values.
     * 
     * @return known ExpressionV2Type values.
     */
    public static Collection<ExpressionV2Type> values() {
        return values(ExpressionV2Type.class);
    }
}
