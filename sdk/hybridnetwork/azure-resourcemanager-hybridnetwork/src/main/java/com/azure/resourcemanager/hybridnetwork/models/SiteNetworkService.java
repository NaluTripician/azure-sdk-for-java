// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.hybridnetwork.fluent.models.SiteNetworkServiceInner;
import java.util.Map;

/**
 * An immutable client-side representation of SiteNetworkService.
 */
public interface SiteNetworkService {
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
     * Gets the properties property: Site network service properties.
     * 
     * @return the properties value.
     */
    SiteNetworkServicePropertiesFormat properties();

    /**
     * Gets the identity property: The managed identity of the Site network service, if configured.
     * 
     * @return the identity value.
     */
    ManagedServiceIdentity identity();

    /**
     * Gets the sku property: Sku of the site network service.
     * 
     * @return the sku value.
     */
    Sku sku();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

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
     * Gets the inner com.azure.resourcemanager.hybridnetwork.fluent.models.SiteNetworkServiceInner object.
     * 
     * @return the inner object.
     */
    SiteNetworkServiceInner innerModel();

    /**
     * The entirety of the SiteNetworkService definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLocation,
        DefinitionStages.WithResourceGroup, DefinitionStages.WithCreate {
    }

    /**
     * The SiteNetworkService definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the SiteNetworkService definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the SiteNetworkService definition allowing to specify location.
         */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }

        /**
         * The stage of the SiteNetworkService definition allowing to specify parent resource.
         */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }

        /**
         * The stage of the SiteNetworkService definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithProperties,
            DefinitionStages.WithIdentity, DefinitionStages.WithSku {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            SiteNetworkService create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            SiteNetworkService create(Context context);
        }

        /**
         * The stage of the SiteNetworkService definition allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the SiteNetworkService definition allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: Site network service properties..
             * 
             * @param properties Site network service properties.
             * @return the next definition stage.
             */
            WithCreate withProperties(SiteNetworkServicePropertiesFormat properties);
        }

        /**
         * The stage of the SiteNetworkService definition allowing to specify identity.
         */
        interface WithIdentity {
            /**
             * Specifies the identity property: The managed identity of the Site network service, if configured..
             * 
             * @param identity The managed identity of the Site network service, if configured.
             * @return the next definition stage.
             */
            WithCreate withIdentity(ManagedServiceIdentity identity);
        }

        /**
         * The stage of the SiteNetworkService definition allowing to specify sku.
         */
        interface WithSku {
            /**
             * Specifies the sku property: Sku of the site network service..
             * 
             * @param sku Sku of the site network service.
             * @return the next definition stage.
             */
            WithCreate withSku(Sku sku);
        }
    }

    /**
     * Begins update for the SiteNetworkService resource.
     * 
     * @return the stage of resource update.
     */
    SiteNetworkService.Update update();

    /**
     * The template for SiteNetworkService update.
     */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        SiteNetworkService apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        SiteNetworkService apply(Context context);
    }

    /**
     * The SiteNetworkService update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the SiteNetworkService update allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    SiteNetworkService refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    SiteNetworkService refresh(Context context);
}
