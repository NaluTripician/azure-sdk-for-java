// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.fluent.models.CacheContractInner;

/** An immutable client-side representation of CacheContract. */
public interface CacheContract {
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
     * Gets the description property: Cache description.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the connectionString property: Runtime connection string to cache.
     *
     * @return the connectionString value.
     */
    String connectionString();

    /**
     * Gets the useFromLocation property: Location identifier to use cache from (should be either 'default' or valid
     * Azure region identifier).
     *
     * @return the useFromLocation value.
     */
    String useFromLocation();

    /**
     * Gets the resourceId property: Original uri of entity in external system cache points to.
     *
     * @return the resourceId value.
     */
    String resourceId();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.apimanagement.fluent.models.CacheContractInner object.
     *
     * @return the inner object.
     */
    CacheContractInner innerModel();

    /** The entirety of the CacheContract definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /** The CacheContract definition stages. */
    interface DefinitionStages {
        /** The first stage of the CacheContract definition. */
        interface Blank extends WithParentResource {
        }

        /** The stage of the CacheContract definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, serviceName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param serviceName The name of the API Management service.
             * @return the next definition stage.
             */
            WithCreate withExistingService(String resourceGroupName, String serviceName);
        }

        /**
         * The stage of the CacheContract definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithDescription,
                DefinitionStages.WithConnectionString,
                DefinitionStages.WithUseFromLocation,
                DefinitionStages.WithResourceId,
                DefinitionStages.WithIfMatch {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            CacheContract create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            CacheContract create(Context context);
        }

        /** The stage of the CacheContract definition allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: Cache description.
             *
             * @param description Cache description.
             * @return the next definition stage.
             */
            WithCreate withDescription(String description);
        }

        /** The stage of the CacheContract definition allowing to specify connectionString. */
        interface WithConnectionString {
            /**
             * Specifies the connectionString property: Runtime connection string to cache.
             *
             * @param connectionString Runtime connection string to cache.
             * @return the next definition stage.
             */
            WithCreate withConnectionString(String connectionString);
        }

        /** The stage of the CacheContract definition allowing to specify useFromLocation. */
        interface WithUseFromLocation {
            /**
             * Specifies the useFromLocation property: Location identifier to use cache from (should be either 'default'
             * or valid Azure region identifier).
             *
             * @param useFromLocation Location identifier to use cache from (should be either 'default' or valid Azure
             *     region identifier).
             * @return the next definition stage.
             */
            WithCreate withUseFromLocation(String useFromLocation);
        }

        /** The stage of the CacheContract definition allowing to specify resourceId. */
        interface WithResourceId {
            /**
             * Specifies the resourceId property: Original uri of entity in external system cache points to.
             *
             * @param resourceId Original uri of entity in external system cache points to.
             * @return the next definition stage.
             */
            WithCreate withResourceId(String resourceId);
        }

        /** The stage of the CacheContract definition allowing to specify ifMatch. */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: ETag of the Entity. Not required when creating an entity, but required
             * when updating an entity..
             *
             * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an
             *     entity.
             * @return the next definition stage.
             */
            WithCreate withIfMatch(String ifMatch);
        }
    }

    /**
     * Begins update for the CacheContract resource.
     *
     * @return the stage of resource update.
     */
    CacheContract.Update update();

    /** The template for CacheContract update. */
    interface Update
        extends UpdateStages.WithDescription,
            UpdateStages.WithConnectionString,
            UpdateStages.WithUseFromLocation,
            UpdateStages.WithResourceId,
            UpdateStages.WithIfMatch {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        CacheContract apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        CacheContract apply(Context context);
    }

    /** The CacheContract update stages. */
    interface UpdateStages {
        /** The stage of the CacheContract update allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: Cache description.
             *
             * @param description Cache description.
             * @return the next definition stage.
             */
            Update withDescription(String description);
        }

        /** The stage of the CacheContract update allowing to specify connectionString. */
        interface WithConnectionString {
            /**
             * Specifies the connectionString property: Runtime connection string to cache.
             *
             * @param connectionString Runtime connection string to cache.
             * @return the next definition stage.
             */
            Update withConnectionString(String connectionString);
        }

        /** The stage of the CacheContract update allowing to specify useFromLocation. */
        interface WithUseFromLocation {
            /**
             * Specifies the useFromLocation property: Location identifier to use cache from (should be either 'default'
             * or valid Azure region identifier).
             *
             * @param useFromLocation Location identifier to use cache from (should be either 'default' or valid Azure
             *     region identifier).
             * @return the next definition stage.
             */
            Update withUseFromLocation(String useFromLocation);
        }

        /** The stage of the CacheContract update allowing to specify resourceId. */
        interface WithResourceId {
            /**
             * Specifies the resourceId property: Original uri of entity in external system cache points to.
             *
             * @param resourceId Original uri of entity in external system cache points to.
             * @return the next definition stage.
             */
            Update withResourceId(String resourceId);
        }

        /** The stage of the CacheContract update allowing to specify ifMatch. */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: ETag of the Entity. ETag should match the current entity state from the
             * header response of the GET request or it should be * for unconditional update..
             *
             * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of
             *     the GET request or it should be * for unconditional update.
             * @return the next definition stage.
             */
            Update withIfMatch(String ifMatch);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    CacheContract refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    CacheContract refresh(Context context);
}
