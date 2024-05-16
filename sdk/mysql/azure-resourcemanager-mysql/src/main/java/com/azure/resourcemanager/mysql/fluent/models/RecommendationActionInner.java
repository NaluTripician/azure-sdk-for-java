// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** Represents a Recommendation Action. */
@Fluent
public final class RecommendationActionInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RecommendationActionInner.class);

    /*
     * The properties of a recommendation action.
     */
    @JsonProperty(value = "properties")
    private RecommendationActionProperties innerProperties;

    /**
     * Get the innerProperties property: The properties of a recommendation action.
     *
     * @return the innerProperties value.
     */
    private RecommendationActionProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the advisorName property: Advisor name.
     *
     * @return the advisorName value.
     */
    public String advisorName() {
        return this.innerProperties() == null ? null : this.innerProperties().advisorName();
    }

    /**
     * Set the advisorName property: Advisor name.
     *
     * @param advisorName the advisorName value to set.
     * @return the RecommendationActionInner object itself.
     */
    public RecommendationActionInner withAdvisorName(String advisorName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationActionProperties();
        }
        this.innerProperties().withAdvisorName(advisorName);
        return this;
    }

    /**
     * Get the sessionId property: Recommendation action session identifier.
     *
     * @return the sessionId value.
     */
    public String sessionId() {
        return this.innerProperties() == null ? null : this.innerProperties().sessionId();
    }

    /**
     * Set the sessionId property: Recommendation action session identifier.
     *
     * @param sessionId the sessionId value to set.
     * @return the RecommendationActionInner object itself.
     */
    public RecommendationActionInner withSessionId(String sessionId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationActionProperties();
        }
        this.innerProperties().withSessionId(sessionId);
        return this;
    }

    /**
     * Get the actionId property: Recommendation action identifier.
     *
     * @return the actionId value.
     */
    public Integer actionId() {
        return this.innerProperties() == null ? null : this.innerProperties().actionId();
    }

    /**
     * Set the actionId property: Recommendation action identifier.
     *
     * @param actionId the actionId value to set.
     * @return the RecommendationActionInner object itself.
     */
    public RecommendationActionInner withActionId(Integer actionId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationActionProperties();
        }
        this.innerProperties().withActionId(actionId);
        return this;
    }

    /**
     * Get the createdTime property: Recommendation action creation time.
     *
     * @return the createdTime value.
     */
    public OffsetDateTime createdTime() {
        return this.innerProperties() == null ? null : this.innerProperties().createdTime();
    }

    /**
     * Set the createdTime property: Recommendation action creation time.
     *
     * @param createdTime the createdTime value to set.
     * @return the RecommendationActionInner object itself.
     */
    public RecommendationActionInner withCreatedTime(OffsetDateTime createdTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationActionProperties();
        }
        this.innerProperties().withCreatedTime(createdTime);
        return this;
    }

    /**
     * Get the expirationTime property: Recommendation action expiration time.
     *
     * @return the expirationTime value.
     */
    public OffsetDateTime expirationTime() {
        return this.innerProperties() == null ? null : this.innerProperties().expirationTime();
    }

    /**
     * Set the expirationTime property: Recommendation action expiration time.
     *
     * @param expirationTime the expirationTime value to set.
     * @return the RecommendationActionInner object itself.
     */
    public RecommendationActionInner withExpirationTime(OffsetDateTime expirationTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationActionProperties();
        }
        this.innerProperties().withExpirationTime(expirationTime);
        return this;
    }

    /**
     * Get the reason property: Recommendation action reason.
     *
     * @return the reason value.
     */
    public String reason() {
        return this.innerProperties() == null ? null : this.innerProperties().reason();
    }

    /**
     * Set the reason property: Recommendation action reason.
     *
     * @param reason the reason value to set.
     * @return the RecommendationActionInner object itself.
     */
    public RecommendationActionInner withReason(String reason) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationActionProperties();
        }
        this.innerProperties().withReason(reason);
        return this;
    }

    /**
     * Get the recommendationType property: Recommendation action type.
     *
     * @return the recommendationType value.
     */
    public String recommendationType() {
        return this.innerProperties() == null ? null : this.innerProperties().recommendationType();
    }

    /**
     * Set the recommendationType property: Recommendation action type.
     *
     * @param recommendationType the recommendationType value to set.
     * @return the RecommendationActionInner object itself.
     */
    public RecommendationActionInner withRecommendationType(String recommendationType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationActionProperties();
        }
        this.innerProperties().withRecommendationType(recommendationType);
        return this;
    }

    /**
     * Get the details property: Recommendation action details.
     *
     * @return the details value.
     */
    public Map<String, String> details() {
        return this.innerProperties() == null ? null : this.innerProperties().details();
    }

    /**
     * Set the details property: Recommendation action details.
     *
     * @param details the details value to set.
     * @return the RecommendationActionInner object itself.
     */
    public RecommendationActionInner withDetails(Map<String, String> details) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationActionProperties();
        }
        this.innerProperties().withDetails(details);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
