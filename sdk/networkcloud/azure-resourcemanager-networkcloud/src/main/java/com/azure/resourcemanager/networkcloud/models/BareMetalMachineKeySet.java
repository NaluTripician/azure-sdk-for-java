// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.networkcloud.fluent.models.BareMetalMachineKeySetInner;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of BareMetalMachineKeySet. */
public interface BareMetalMachineKeySet {
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
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the extendedLocation property: ExtendedLocation represents the Azure custom location where the resource will
     * be created.
     *
     * <p>The extended location of the cluster associated with the resource.
     *
     * @return the extendedLocation value.
     */
    ExtendedLocation extendedLocation();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the azureGroupId property: The object ID of Azure Active Directory group that all users in the list must be
     * in for access to be granted. Users that are not in the group will not have access.
     *
     * @return the azureGroupId value.
     */
    String azureGroupId();

    /**
     * Gets the detailedStatus property: The more detailed status of the key set.
     *
     * @return the detailedStatus value.
     */
    BareMetalMachineKeySetDetailedStatus detailedStatus();

    /**
     * Gets the detailedStatusMessage property: The descriptive message about the current detailed status.
     *
     * @return the detailedStatusMessage value.
     */
    String detailedStatusMessage();

    /**
     * Gets the expiration property: The date and time after which the users in this key set will be removed from the
     * bare metal machines.
     *
     * @return the expiration value.
     */
    OffsetDateTime expiration();

    /**
     * Gets the jumpHostsAllowed property: The list of IP addresses of jump hosts with management network access from
     * which a login will be allowed for the users.
     *
     * @return the jumpHostsAllowed value.
     */
    List<String> jumpHostsAllowed();

    /**
     * Gets the lastValidation property: The last time this key set was validated.
     *
     * @return the lastValidation value.
     */
    OffsetDateTime lastValidation();

    /**
     * Gets the osGroupName property: The name of the group that users will be assigned to on the operating system of
     * the machines.
     *
     * @return the osGroupName value.
     */
    String osGroupName();

    /**
     * Gets the privilegeLevel property: The access level allowed for the users in this key set.
     *
     * @return the privilegeLevel value.
     */
    BareMetalMachineKeySetPrivilegeLevel privilegeLevel();

    /**
     * Gets the provisioningState property: The provisioning state of the bare metal machine key set.
     *
     * @return the provisioningState value.
     */
    BareMetalMachineKeySetProvisioningState provisioningState();

    /**
     * Gets the userList property: The unique list of permitted users.
     *
     * @return the userList value.
     */
    List<KeySetUser> userList();

    /**
     * Gets the userListStatus property: The status evaluation of each user.
     *
     * @return the userListStatus value.
     */
    List<KeySetUserStatus> userListStatus();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.networkcloud.fluent.models.BareMetalMachineKeySetInner object.
     *
     * @return the inner object.
     */
    BareMetalMachineKeySetInner innerModel();

    /** The entirety of the BareMetalMachineKeySet definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithExtendedLocation,
            DefinitionStages.WithAzureGroupId,
            DefinitionStages.WithExpiration,
            DefinitionStages.WithJumpHostsAllowed,
            DefinitionStages.WithPrivilegeLevel,
            DefinitionStages.WithUserList,
            DefinitionStages.WithCreate {
    }

    /** The BareMetalMachineKeySet definition stages. */
    interface DefinitionStages {
        /** The first stage of the BareMetalMachineKeySet definition. */
        interface Blank extends WithLocation {
        }

        /** The stage of the BareMetalMachineKeySet definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(String location);
        }

        /** The stage of the BareMetalMachineKeySet definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, clusterName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param clusterName The name of the cluster.
             * @return the next definition stage.
             */
            WithExtendedLocation withExistingCluster(String resourceGroupName, String clusterName);
        }

        /** The stage of the BareMetalMachineKeySet definition allowing to specify extendedLocation. */
        interface WithExtendedLocation {
            /**
             * Specifies the extendedLocation property: ExtendedLocation represents the Azure custom location where the
             * resource will be created.
             *
             * <p>The extended location of the cluster associated with the resource..
             *
             * @param extendedLocation ExtendedLocation represents the Azure custom location where the resource will be
             *     created.
             *     <p>The extended location of the cluster associated with the resource.
             * @return the next definition stage.
             */
            WithAzureGroupId withExtendedLocation(ExtendedLocation extendedLocation);
        }

        /** The stage of the BareMetalMachineKeySet definition allowing to specify azureGroupId. */
        interface WithAzureGroupId {
            /**
             * Specifies the azureGroupId property: The object ID of Azure Active Directory group that all users in the
             * list must be in for access to be granted. Users that are not in the group will not have access..
             *
             * @param azureGroupId The object ID of Azure Active Directory group that all users in the list must be in
             *     for access to be granted. Users that are not in the group will not have access.
             * @return the next definition stage.
             */
            WithExpiration withAzureGroupId(String azureGroupId);
        }

        /** The stage of the BareMetalMachineKeySet definition allowing to specify expiration. */
        interface WithExpiration {
            /**
             * Specifies the expiration property: The date and time after which the users in this key set will be
             * removed from the bare metal machines..
             *
             * @param expiration The date and time after which the users in this key set will be removed from the bare
             *     metal machines.
             * @return the next definition stage.
             */
            WithJumpHostsAllowed withExpiration(OffsetDateTime expiration);
        }

        /** The stage of the BareMetalMachineKeySet definition allowing to specify jumpHostsAllowed. */
        interface WithJumpHostsAllowed {
            /**
             * Specifies the jumpHostsAllowed property: The list of IP addresses of jump hosts with management network
             * access from which a login will be allowed for the users..
             *
             * @param jumpHostsAllowed The list of IP addresses of jump hosts with management network access from which
             *     a login will be allowed for the users.
             * @return the next definition stage.
             */
            WithPrivilegeLevel withJumpHostsAllowed(List<String> jumpHostsAllowed);
        }

        /** The stage of the BareMetalMachineKeySet definition allowing to specify privilegeLevel. */
        interface WithPrivilegeLevel {
            /**
             * Specifies the privilegeLevel property: The access level allowed for the users in this key set..
             *
             * @param privilegeLevel The access level allowed for the users in this key set.
             * @return the next definition stage.
             */
            WithUserList withPrivilegeLevel(BareMetalMachineKeySetPrivilegeLevel privilegeLevel);
        }

        /** The stage of the BareMetalMachineKeySet definition allowing to specify userList. */
        interface WithUserList {
            /**
             * Specifies the userList property: The unique list of permitted users..
             *
             * @param userList The unique list of permitted users.
             * @return the next definition stage.
             */
            WithCreate withUserList(List<KeySetUser> userList);
        }

        /**
         * The stage of the BareMetalMachineKeySet definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithOsGroupName {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            BareMetalMachineKeySet create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            BareMetalMachineKeySet create(Context context);
        }

        /** The stage of the BareMetalMachineKeySet definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /** The stage of the BareMetalMachineKeySet definition allowing to specify osGroupName. */
        interface WithOsGroupName {
            /**
             * Specifies the osGroupName property: The name of the group that users will be assigned to on the operating
             * system of the machines..
             *
             * @param osGroupName The name of the group that users will be assigned to on the operating system of the
             *     machines.
             * @return the next definition stage.
             */
            WithCreate withOsGroupName(String osGroupName);
        }
    }

    /**
     * Begins update for the BareMetalMachineKeySet resource.
     *
     * @return the stage of resource update.
     */
    BareMetalMachineKeySet.Update update();

    /** The template for BareMetalMachineKeySet update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithExpiration,
            UpdateStages.WithJumpHostsAllowed,
            UpdateStages.WithUserList {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        BareMetalMachineKeySet apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        BareMetalMachineKeySet apply(Context context);
    }

    /** The BareMetalMachineKeySet update stages. */
    interface UpdateStages {
        /** The stage of the BareMetalMachineKeySet update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: The Azure resource tags that will replace the existing ones..
             *
             * @param tags The Azure resource tags that will replace the existing ones.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }

        /** The stage of the BareMetalMachineKeySet update allowing to specify expiration. */
        interface WithExpiration {
            /**
             * Specifies the expiration property: The date and time after which the users in this key set will be
             * removed from the bare metal machines..
             *
             * @param expiration The date and time after which the users in this key set will be removed from the bare
             *     metal machines.
             * @return the next definition stage.
             */
            Update withExpiration(OffsetDateTime expiration);
        }

        /** The stage of the BareMetalMachineKeySet update allowing to specify jumpHostsAllowed. */
        interface WithJumpHostsAllowed {
            /**
             * Specifies the jumpHostsAllowed property: The list of IP addresses of jump hosts with management network
             * access from which a login will be allowed for the users..
             *
             * @param jumpHostsAllowed The list of IP addresses of jump hosts with management network access from which
             *     a login will be allowed for the users.
             * @return the next definition stage.
             */
            Update withJumpHostsAllowed(List<String> jumpHostsAllowed);
        }

        /** The stage of the BareMetalMachineKeySet update allowing to specify userList. */
        interface WithUserList {
            /**
             * Specifies the userList property: The unique list of permitted users..
             *
             * @param userList The unique list of permitted users.
             * @return the next definition stage.
             */
            Update withUserList(List<KeySetUser> userList);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    BareMetalMachineKeySet refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    BareMetalMachineKeySet refresh(Context context);
}
