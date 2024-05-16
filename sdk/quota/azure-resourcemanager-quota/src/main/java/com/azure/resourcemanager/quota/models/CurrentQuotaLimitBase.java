// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.quota.fluent.models.CurrentQuotaLimitBaseInner;

/**
 * An immutable client-side representation of CurrentQuotaLimitBase.
 */
public interface CurrentQuotaLimitBase {
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
     * Gets the properties property: Quota properties for the specified resource, based on the API called, Quotas or
     * Usages.
     * 
     * @return the properties value.
     */
    QuotaProperties properties();

    /**
     * Gets the inner com.azure.resourcemanager.quota.fluent.models.CurrentQuotaLimitBaseInner object.
     * 
     * @return the inner object.
     */
    CurrentQuotaLimitBaseInner innerModel();

    /**
     * The entirety of the CurrentQuotaLimitBase definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithScope, DefinitionStages.WithCreate {
    }

    /**
     * The CurrentQuotaLimitBase definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the CurrentQuotaLimitBase definition.
         */
        interface Blank extends WithScope {
        }

        /**
         * The stage of the CurrentQuotaLimitBase definition allowing to specify parent resource.
         */
        interface WithScope {
            /**
             * Specifies scope.
             * 
             * @param scope The target Azure resource URI. For example,
             * `/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/qms-test/providers/Microsoft.Batch/batchAccounts/testAccount/`.
             * This is the target Azure resource URI for the List GET operation. If a `{resourceName}` is added after
             * `/quotas`, then it's the target Azure resource URI in the GET operation for the specific resource.
             * @return the next definition stage.
             */
            WithCreate withExistingScope(String scope);
        }

        /**
         * The stage of the CurrentQuotaLimitBase definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithProperties {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            CurrentQuotaLimitBase create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            CurrentQuotaLimitBase create(Context context);
        }

        /**
         * The stage of the CurrentQuotaLimitBase definition allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: Quota properties for the specified resource, based on the API called,
             * Quotas or Usages..
             * 
             * @param properties Quota properties for the specified resource, based on the API called, Quotas or Usages.
             * @return the next definition stage.
             */
            WithCreate withProperties(QuotaProperties properties);
        }
    }

    /**
     * Begins update for the CurrentQuotaLimitBase resource.
     * 
     * @return the stage of resource update.
     */
    CurrentQuotaLimitBase.Update update();

    /**
     * The template for CurrentQuotaLimitBase update.
     */
    interface Update extends UpdateStages.WithProperties {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        CurrentQuotaLimitBase apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        CurrentQuotaLimitBase apply(Context context);
    }

    /**
     * The CurrentQuotaLimitBase update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the CurrentQuotaLimitBase update allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: Quota properties for the specified resource, based on the API called,
             * Quotas or Usages..
             * 
             * @param properties Quota properties for the specified resource, based on the API called, Quotas or Usages.
             * @return the next definition stage.
             */
            Update withProperties(QuotaProperties properties);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    CurrentQuotaLimitBase refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    CurrentQuotaLimitBase refresh(Context context);
}
