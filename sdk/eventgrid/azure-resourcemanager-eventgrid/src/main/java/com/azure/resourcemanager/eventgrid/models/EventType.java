// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.resourcemanager.eventgrid.fluent.models.EventTypeInner;

/**
 * An immutable client-side representation of EventType.
 */
public interface EventType {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the displayName property: Display name of the event type.
     * 
     * @return the displayName value.
     */
    String displayName();

    /**
     * Gets the description property: Description of the event type.
     * 
     * @return the description value.
     */
    String description();

    /**
     * Gets the schemaUrl property: Url of the schema for this event type.
     * 
     * @return the schemaUrl value.
     */
    String schemaUrl();

    /**
     * Gets the isInDefaultSet property: IsInDefaultSet flag of the event type.
     * 
     * @return the isInDefaultSet value.
     */
    Boolean isInDefaultSet();

    /**
     * Gets the inner com.azure.resourcemanager.eventgrid.fluent.models.EventTypeInner object.
     * 
     * @return the inner object.
     */
    EventTypeInner innerModel();
}
