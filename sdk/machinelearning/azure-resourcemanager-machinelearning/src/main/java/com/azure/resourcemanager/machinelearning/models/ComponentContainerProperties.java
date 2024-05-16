// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import java.util.Map;

/**
 * Component container definition. &lt;see
 * href="https://docs.microsoft.com/en-us/azure/machine-learning/reference-yaml-component-command" /&gt;.
 */
@Fluent
public final class ComponentContainerProperties extends AssetContainer {
    /** Creates an instance of ComponentContainerProperties class. */
    public ComponentContainerProperties() {
    }

    /** {@inheritDoc} */
    @Override
    public ComponentContainerProperties withIsArchived(Boolean isArchived) {
        super.withIsArchived(isArchived);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ComponentContainerProperties withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ComponentContainerProperties withProperties(Map<String, String> properties) {
        super.withProperties(properties);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ComponentContainerProperties withTags(Map<String, String> tags) {
        super.withTags(tags);
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
