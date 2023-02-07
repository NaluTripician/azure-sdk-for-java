// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;

/** The properties of the reservations. */
@Fluent
public final class ReservationsProperties {
    /*
     * The type of the resource that is being reserved.
     */
    @JsonProperty(value = "reservedResourceType")
    private ReservedResourceType reservedResourceType;

    /*
     * Allows reservation discount to be applied across skus within the same auto fit group. Not all skus support
     * instance size flexibility.
     */
    @JsonProperty(value = "instanceFlexibility")
    private InstanceFlexibility instanceFlexibility;

    /*
     * Friendly name for user to easily identify the reservation
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The list of applied scopes
     */
    @JsonProperty(value = "appliedScopes")
    private List<String> appliedScopes;

    /*
     * The applied scope type
     */
    @JsonProperty(value = "appliedScopeType")
    private AppliedScopeType appliedScopeType;

    /*
     * Indicates if the reservation is archived
     */
    @JsonProperty(value = "archived")
    private Boolean archived;

    /*
     * Capabilities of the reservation
     */
    @JsonProperty(value = "capabilities")
    private String capabilities;

    /*
     * Quantity of the skus that are part of the reservation.
     */
    @JsonProperty(value = "quantity")
    private Integer quantity;

    /*
     * Current state of the reservation.
     */
    @JsonProperty(value = "provisioningState")
    private ProvisioningState provisioningState;

    /*
     * DateTime of the reservation starting when this version is effective from.
     */
    @JsonProperty(value = "effectiveDateTime")
    private OffsetDateTime effectiveDateTime;

    /*
     * This is the DateTime when the reservation benefit started.
     */
    @JsonProperty(value = "benefitStartTime")
    private OffsetDateTime benefitStartTime;

    /*
     * DateTime of the last time the reservation was updated.
     */
    @JsonProperty(value = "lastUpdatedDateTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastUpdatedDateTime;

    /*
     * This is the date when the reservation will expire.
     */
    @JsonProperty(value = "expiryDate")
    private LocalDate expiryDate;

    /*
     * This is the date-time when the reservation will expire.
     */
    @JsonProperty(value = "expiryDateTime")
    private OffsetDateTime expiryDateTime;

    /*
     * This is the date-time when the Azure Hybrid Benefit needs to be reviewed.
     */
    @JsonProperty(value = "reviewDateTime")
    private OffsetDateTime reviewDateTime;

    /*
     * Description of the sku in english.
     */
    @JsonProperty(value = "skuDescription")
    private String skuDescription;

    /*
     * The message giving detailed information about the status code.
     */
    @JsonProperty(value = "extendedStatusInfo")
    private ExtendedStatusInfo extendedStatusInfo;

    /*
     * The billing plan options available for this sku.
     */
    @JsonProperty(value = "billingPlan")
    private ReservationBillingPlan billingPlan;

    /*
     * The provisioning state of the reservation for display, e.g. Succeeded
     */
    @JsonProperty(value = "displayProvisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String displayProvisioningState;

    /*
     * The provisioning sub-state of the reservation, e.g. Succeeded
     */
    @JsonProperty(value = "provisioningSubState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningSubState;

    /*
     * This is the date when the reservation was purchased.
     */
    @JsonProperty(value = "purchaseDate")
    private LocalDate purchaseDate;

    /*
     * This is the date-time when the reservation was purchased.
     */
    @JsonProperty(value = "purchaseDateTime")
    private OffsetDateTime purchaseDateTime;

    /*
     * Properties of reservation split
     */
    @JsonProperty(value = "splitProperties")
    private ReservationSplitProperties splitProperties;

    /*
     * Properties of reservation merge
     */
    @JsonProperty(value = "mergeProperties")
    private ReservationMergeProperties mergeProperties;

    /*
     * Properties of reservation swap
     */
    @JsonProperty(value = "swapProperties")
    private ReservationSwapProperties swapProperties;

    /*
     * Properties specific to applied scope type. Not required if not applicable. Required and need to provide tenantId
     * and managementGroupId if AppliedScopeType is ManagementGroup
     */
    @JsonProperty(value = "appliedScopeProperties")
    private AppliedScopeProperties appliedScopeProperties;

    /*
     * Subscription that will be charged for purchasing reservation or savings plan
     */
    @JsonProperty(value = "billingScopeId")
    private String billingScopeId;

    /*
     * Setting this to true will automatically purchase a new reservation on the expiration date time.
     */
    @JsonProperty(value = "renew")
    private Boolean renew;

    /*
     * Reservation Id of the reservation from which this reservation is renewed. Format of the resource Id is
     * /providers/Microsoft.Capacity/reservationOrders/{reservationOrderId}/reservations/{reservationId}.
     */
    @JsonProperty(value = "renewSource")
    private String renewSource;

    /*
     * Reservation Id of the reservation which is purchased because of renew. Format of the resource Id is
     * /providers/Microsoft.Capacity/reservationOrders/{reservationOrderId}/reservations/{reservationId}.
     */
    @JsonProperty(value = "renewDestination")
    private String renewDestination;

    /*
     * The renew properties for a reservation.
     */
    @JsonProperty(value = "renewProperties")
    private RenewPropertiesResponse renewProperties;

    /*
     * Represent the term of reservation.
     */
    @JsonProperty(value = "term")
    private ReservationTerm term;

    /*
     * The applied scope type of the reservation for display, e.g. Shared
     */
    @JsonProperty(value = "userFriendlyAppliedScopeType", access = JsonProperty.Access.WRITE_ONLY)
    private String userFriendlyAppliedScopeType;

    /*
     * The renew state of the reservation for display, e.g. On
     */
    @JsonProperty(value = "userFriendlyRenewState", access = JsonProperty.Access.WRITE_ONLY)
    private String userFriendlyRenewState;

    /*
     * Reservation utilization
     */
    @JsonProperty(value = "utilization", access = JsonProperty.Access.WRITE_ONLY)
    private ReservationsPropertiesUtilization utilization;

    /** Creates an instance of ReservationsProperties class. */
    public ReservationsProperties() {
    }

    /**
     * Get the reservedResourceType property: The type of the resource that is being reserved.
     *
     * @return the reservedResourceType value.
     */
    public ReservedResourceType reservedResourceType() {
        return this.reservedResourceType;
    }

    /**
     * Set the reservedResourceType property: The type of the resource that is being reserved.
     *
     * @param reservedResourceType the reservedResourceType value to set.
     * @return the ReservationsProperties object itself.
     */
    public ReservationsProperties withReservedResourceType(ReservedResourceType reservedResourceType) {
        this.reservedResourceType = reservedResourceType;
        return this;
    }

    /**
     * Get the instanceFlexibility property: Allows reservation discount to be applied across skus within the same auto
     * fit group. Not all skus support instance size flexibility.
     *
     * @return the instanceFlexibility value.
     */
    public InstanceFlexibility instanceFlexibility() {
        return this.instanceFlexibility;
    }

    /**
     * Set the instanceFlexibility property: Allows reservation discount to be applied across skus within the same auto
     * fit group. Not all skus support instance size flexibility.
     *
     * @param instanceFlexibility the instanceFlexibility value to set.
     * @return the ReservationsProperties object itself.
     */
    public ReservationsProperties withInstanceFlexibility(InstanceFlexibility instanceFlexibility) {
        this.instanceFlexibility = instanceFlexibility;
        return this;
    }

    /**
     * Get the displayName property: Friendly name for user to easily identify the reservation.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Friendly name for user to easily identify the reservation.
     *
     * @param displayName the displayName value to set.
     * @return the ReservationsProperties object itself.
     */
    public ReservationsProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the appliedScopes property: The list of applied scopes.
     *
     * @return the appliedScopes value.
     */
    public List<String> appliedScopes() {
        return this.appliedScopes;
    }

    /**
     * Set the appliedScopes property: The list of applied scopes.
     *
     * @param appliedScopes the appliedScopes value to set.
     * @return the ReservationsProperties object itself.
     */
    public ReservationsProperties withAppliedScopes(List<String> appliedScopes) {
        this.appliedScopes = appliedScopes;
        return this;
    }

    /**
     * Get the appliedScopeType property: The applied scope type.
     *
     * @return the appliedScopeType value.
     */
    public AppliedScopeType appliedScopeType() {
        return this.appliedScopeType;
    }

    /**
     * Set the appliedScopeType property: The applied scope type.
     *
     * @param appliedScopeType the appliedScopeType value to set.
     * @return the ReservationsProperties object itself.
     */
    public ReservationsProperties withAppliedScopeType(AppliedScopeType appliedScopeType) {
        this.appliedScopeType = appliedScopeType;
        return this;
    }

    /**
     * Get the archived property: Indicates if the reservation is archived.
     *
     * @return the archived value.
     */
    public Boolean archived() {
        return this.archived;
    }

    /**
     * Set the archived property: Indicates if the reservation is archived.
     *
     * @param archived the archived value to set.
     * @return the ReservationsProperties object itself.
     */
    public ReservationsProperties withArchived(Boolean archived) {
        this.archived = archived;
        return this;
    }

    /**
     * Get the capabilities property: Capabilities of the reservation.
     *
     * @return the capabilities value.
     */
    public String capabilities() {
        return this.capabilities;
    }

    /**
     * Set the capabilities property: Capabilities of the reservation.
     *
     * @param capabilities the capabilities value to set.
     * @return the ReservationsProperties object itself.
     */
    public ReservationsProperties withCapabilities(String capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * Get the quantity property: Quantity of the skus that are part of the reservation.
     *
     * @return the quantity value.
     */
    public Integer quantity() {
        return this.quantity;
    }

    /**
     * Set the quantity property: Quantity of the skus that are part of the reservation.
     *
     * @param quantity the quantity value to set.
     * @return the ReservationsProperties object itself.
     */
    public ReservationsProperties withQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Get the provisioningState property: Current state of the reservation.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Current state of the reservation.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the ReservationsProperties object itself.
     */
    public ReservationsProperties withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the effectiveDateTime property: DateTime of the reservation starting when this version is effective from.
     *
     * @return the effectiveDateTime value.
     */
    public OffsetDateTime effectiveDateTime() {
        return this.effectiveDateTime;
    }

    /**
     * Set the effectiveDateTime property: DateTime of the reservation starting when this version is effective from.
     *
     * @param effectiveDateTime the effectiveDateTime value to set.
     * @return the ReservationsProperties object itself.
     */
    public ReservationsProperties withEffectiveDateTime(OffsetDateTime effectiveDateTime) {
        this.effectiveDateTime = effectiveDateTime;
        return this;
    }

    /**
     * Get the benefitStartTime property: This is the DateTime when the reservation benefit started.
     *
     * @return the benefitStartTime value.
     */
    public OffsetDateTime benefitStartTime() {
        return this.benefitStartTime;
    }

    /**
     * Set the benefitStartTime property: This is the DateTime when the reservation benefit started.
     *
     * @param benefitStartTime the benefitStartTime value to set.
     * @return the ReservationsProperties object itself.
     */
    public ReservationsProperties withBenefitStartTime(OffsetDateTime benefitStartTime) {
        this.benefitStartTime = benefitStartTime;
        return this;
    }

    /**
     * Get the lastUpdatedDateTime property: DateTime of the last time the reservation was updated.
     *
     * @return the lastUpdatedDateTime value.
     */
    public OffsetDateTime lastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * Get the expiryDate property: This is the date when the reservation will expire.
     *
     * @return the expiryDate value.
     */
    public LocalDate expiryDate() {
        return this.expiryDate;
    }

    /**
     * Set the expiryDate property: This is the date when the reservation will expire.
     *
     * @param expiryDate the expiryDate value to set.
     * @return the ReservationsProperties object itself.
     */
    public ReservationsProperties withExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
        return this;
    }

    /**
     * Get the expiryDateTime property: This is the date-time when the reservation will expire.
     *
     * @return the expiryDateTime value.
     */
    public OffsetDateTime expiryDateTime() {
        return this.expiryDateTime;
    }

    /**
     * Set the expiryDateTime property: This is the date-time when the reservation will expire.
     *
     * @param expiryDateTime the expiryDateTime value to set.
     * @return the ReservationsProperties object itself.
     */
    public ReservationsProperties withExpiryDateTime(OffsetDateTime expiryDateTime) {
        this.expiryDateTime = expiryDateTime;
        return this;
    }

    /**
     * Get the reviewDateTime property: This is the date-time when the Azure Hybrid Benefit needs to be reviewed.
     *
     * @return the reviewDateTime value.
     */
    public OffsetDateTime reviewDateTime() {
        return this.reviewDateTime;
    }

    /**
     * Set the reviewDateTime property: This is the date-time when the Azure Hybrid Benefit needs to be reviewed.
     *
     * @param reviewDateTime the reviewDateTime value to set.
     * @return the ReservationsProperties object itself.
     */
    public ReservationsProperties withReviewDateTime(OffsetDateTime reviewDateTime) {
        this.reviewDateTime = reviewDateTime;
        return this;
    }

    /**
     * Get the skuDescription property: Description of the sku in english.
     *
     * @return the skuDescription value.
     */
    public String skuDescription() {
        return this.skuDescription;
    }

    /**
     * Set the skuDescription property: Description of the sku in english.
     *
     * @param skuDescription the skuDescription value to set.
     * @return the ReservationsProperties object itself.
     */
    public ReservationsProperties withSkuDescription(String skuDescription) {
        this.skuDescription = skuDescription;
        return this;
    }

    /**
     * Get the extendedStatusInfo property: The message giving detailed information about the status code.
     *
     * @return the extendedStatusInfo value.
     */
    public ExtendedStatusInfo extendedStatusInfo() {
        return this.extendedStatusInfo;
    }

    /**
     * Set the extendedStatusInfo property: The message giving detailed information about the status code.
     *
     * @param extendedStatusInfo the extendedStatusInfo value to set.
     * @return the ReservationsProperties object itself.
     */
    public ReservationsProperties withExtendedStatusInfo(ExtendedStatusInfo extendedStatusInfo) {
        this.extendedStatusInfo = extendedStatusInfo;
        return this;
    }

    /**
     * Get the billingPlan property: The billing plan options available for this sku.
     *
     * @return the billingPlan value.
     */
    public ReservationBillingPlan billingPlan() {
        return this.billingPlan;
    }

    /**
     * Set the billingPlan property: The billing plan options available for this sku.
     *
     * @param billingPlan the billingPlan value to set.
     * @return the ReservationsProperties object itself.
     */
    public ReservationsProperties withBillingPlan(ReservationBillingPlan billingPlan) {
        this.billingPlan = billingPlan;
        return this;
    }

    /**
     * Get the displayProvisioningState property: The provisioning state of the reservation for display, e.g. Succeeded.
     *
     * @return the displayProvisioningState value.
     */
    public String displayProvisioningState() {
        return this.displayProvisioningState;
    }

    /**
     * Get the provisioningSubState property: The provisioning sub-state of the reservation, e.g. Succeeded.
     *
     * @return the provisioningSubState value.
     */
    public String provisioningSubState() {
        return this.provisioningSubState;
    }

    /**
     * Get the purchaseDate property: This is the date when the reservation was purchased.
     *
     * @return the purchaseDate value.
     */
    public LocalDate purchaseDate() {
        return this.purchaseDate;
    }

    /**
     * Set the purchaseDate property: This is the date when the reservation was purchased.
     *
     * @param purchaseDate the purchaseDate value to set.
     * @return the ReservationsProperties object itself.
     */
    public ReservationsProperties withPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
        return this;
    }

    /**
     * Get the purchaseDateTime property: This is the date-time when the reservation was purchased.
     *
     * @return the purchaseDateTime value.
     */
    public OffsetDateTime purchaseDateTime() {
        return this.purchaseDateTime;
    }

    /**
     * Set the purchaseDateTime property: This is the date-time when the reservation was purchased.
     *
     * @param purchaseDateTime the purchaseDateTime value to set.
     * @return the ReservationsProperties object itself.
     */
    public ReservationsProperties withPurchaseDateTime(OffsetDateTime purchaseDateTime) {
        this.purchaseDateTime = purchaseDateTime;
        return this;
    }

    /**
     * Get the splitProperties property: Properties of reservation split.
     *
     * @return the splitProperties value.
     */
    public ReservationSplitProperties splitProperties() {
        return this.splitProperties;
    }

    /**
     * Set the splitProperties property: Properties of reservation split.
     *
     * @param splitProperties the splitProperties value to set.
     * @return the ReservationsProperties object itself.
     */
    public ReservationsProperties withSplitProperties(ReservationSplitProperties splitProperties) {
        this.splitProperties = splitProperties;
        return this;
    }

    /**
     * Get the mergeProperties property: Properties of reservation merge.
     *
     * @return the mergeProperties value.
     */
    public ReservationMergeProperties mergeProperties() {
        return this.mergeProperties;
    }

    /**
     * Set the mergeProperties property: Properties of reservation merge.
     *
     * @param mergeProperties the mergeProperties value to set.
     * @return the ReservationsProperties object itself.
     */
    public ReservationsProperties withMergeProperties(ReservationMergeProperties mergeProperties) {
        this.mergeProperties = mergeProperties;
        return this;
    }

    /**
     * Get the swapProperties property: Properties of reservation swap.
     *
     * @return the swapProperties value.
     */
    public ReservationSwapProperties swapProperties() {
        return this.swapProperties;
    }

    /**
     * Set the swapProperties property: Properties of reservation swap.
     *
     * @param swapProperties the swapProperties value to set.
     * @return the ReservationsProperties object itself.
     */
    public ReservationsProperties withSwapProperties(ReservationSwapProperties swapProperties) {
        this.swapProperties = swapProperties;
        return this;
    }

    /**
     * Get the appliedScopeProperties property: Properties specific to applied scope type. Not required if not
     * applicable. Required and need to provide tenantId and managementGroupId if AppliedScopeType is ManagementGroup.
     *
     * @return the appliedScopeProperties value.
     */
    public AppliedScopeProperties appliedScopeProperties() {
        return this.appliedScopeProperties;
    }

    /**
     * Set the appliedScopeProperties property: Properties specific to applied scope type. Not required if not
     * applicable. Required and need to provide tenantId and managementGroupId if AppliedScopeType is ManagementGroup.
     *
     * @param appliedScopeProperties the appliedScopeProperties value to set.
     * @return the ReservationsProperties object itself.
     */
    public ReservationsProperties withAppliedScopeProperties(AppliedScopeProperties appliedScopeProperties) {
        this.appliedScopeProperties = appliedScopeProperties;
        return this;
    }

    /**
     * Get the billingScopeId property: Subscription that will be charged for purchasing reservation or savings plan.
     *
     * @return the billingScopeId value.
     */
    public String billingScopeId() {
        return this.billingScopeId;
    }

    /**
     * Set the billingScopeId property: Subscription that will be charged for purchasing reservation or savings plan.
     *
     * @param billingScopeId the billingScopeId value to set.
     * @return the ReservationsProperties object itself.
     */
    public ReservationsProperties withBillingScopeId(String billingScopeId) {
        this.billingScopeId = billingScopeId;
        return this;
    }

    /**
     * Get the renew property: Setting this to true will automatically purchase a new reservation on the expiration date
     * time.
     *
     * @return the renew value.
     */
    public Boolean renew() {
        return this.renew;
    }

    /**
     * Set the renew property: Setting this to true will automatically purchase a new reservation on the expiration date
     * time.
     *
     * @param renew the renew value to set.
     * @return the ReservationsProperties object itself.
     */
    public ReservationsProperties withRenew(Boolean renew) {
        this.renew = renew;
        return this;
    }

    /**
     * Get the renewSource property: Reservation Id of the reservation from which this reservation is renewed. Format of
     * the resource Id is
     * /providers/Microsoft.Capacity/reservationOrders/{reservationOrderId}/reservations/{reservationId}.
     *
     * @return the renewSource value.
     */
    public String renewSource() {
        return this.renewSource;
    }

    /**
     * Set the renewSource property: Reservation Id of the reservation from which this reservation is renewed. Format of
     * the resource Id is
     * /providers/Microsoft.Capacity/reservationOrders/{reservationOrderId}/reservations/{reservationId}.
     *
     * @param renewSource the renewSource value to set.
     * @return the ReservationsProperties object itself.
     */
    public ReservationsProperties withRenewSource(String renewSource) {
        this.renewSource = renewSource;
        return this;
    }

    /**
     * Get the renewDestination property: Reservation Id of the reservation which is purchased because of renew. Format
     * of the resource Id is
     * /providers/Microsoft.Capacity/reservationOrders/{reservationOrderId}/reservations/{reservationId}.
     *
     * @return the renewDestination value.
     */
    public String renewDestination() {
        return this.renewDestination;
    }

    /**
     * Set the renewDestination property: Reservation Id of the reservation which is purchased because of renew. Format
     * of the resource Id is
     * /providers/Microsoft.Capacity/reservationOrders/{reservationOrderId}/reservations/{reservationId}.
     *
     * @param renewDestination the renewDestination value to set.
     * @return the ReservationsProperties object itself.
     */
    public ReservationsProperties withRenewDestination(String renewDestination) {
        this.renewDestination = renewDestination;
        return this;
    }

    /**
     * Get the renewProperties property: The renew properties for a reservation.
     *
     * @return the renewProperties value.
     */
    public RenewPropertiesResponse renewProperties() {
        return this.renewProperties;
    }

    /**
     * Set the renewProperties property: The renew properties for a reservation.
     *
     * @param renewProperties the renewProperties value to set.
     * @return the ReservationsProperties object itself.
     */
    public ReservationsProperties withRenewProperties(RenewPropertiesResponse renewProperties) {
        this.renewProperties = renewProperties;
        return this;
    }

    /**
     * Get the term property: Represent the term of reservation.
     *
     * @return the term value.
     */
    public ReservationTerm term() {
        return this.term;
    }

    /**
     * Set the term property: Represent the term of reservation.
     *
     * @param term the term value to set.
     * @return the ReservationsProperties object itself.
     */
    public ReservationsProperties withTerm(ReservationTerm term) {
        this.term = term;
        return this;
    }

    /**
     * Get the userFriendlyAppliedScopeType property: The applied scope type of the reservation for display, e.g.
     * Shared.
     *
     * @return the userFriendlyAppliedScopeType value.
     */
    public String userFriendlyAppliedScopeType() {
        return this.userFriendlyAppliedScopeType;
    }

    /**
     * Get the userFriendlyRenewState property: The renew state of the reservation for display, e.g. On.
     *
     * @return the userFriendlyRenewState value.
     */
    public String userFriendlyRenewState() {
        return this.userFriendlyRenewState;
    }

    /**
     * Get the utilization property: Reservation utilization.
     *
     * @return the utilization value.
     */
    public ReservationsPropertiesUtilization utilization() {
        return this.utilization;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (extendedStatusInfo() != null) {
            extendedStatusInfo().validate();
        }
        if (splitProperties() != null) {
            splitProperties().validate();
        }
        if (mergeProperties() != null) {
            mergeProperties().validate();
        }
        if (swapProperties() != null) {
            swapProperties().validate();
        }
        if (appliedScopeProperties() != null) {
            appliedScopeProperties().validate();
        }
        if (renewProperties() != null) {
            renewProperties().validate();
        }
        if (utilization() != null) {
            utilization().validate();
        }
    }
}
