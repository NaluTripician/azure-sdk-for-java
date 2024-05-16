// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.machinelearning.fluent.models.CodeVersionInner;

/** An immutable client-side representation of CodeVersion. */
public interface CodeVersion {
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
     * Gets the properties property: [Required] Additional attributes of the entity.
     *
     * @return the properties value.
     */
    CodeVersionProperties properties();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.machinelearning.fluent.models.CodeVersionInner object.
     *
     * @return the inner object.
     */
    CodeVersionInner innerModel();

    /** The entirety of the CodeVersion definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithProperties,
            DefinitionStages.WithCreate {
    }
    /** The CodeVersion definition stages. */
    interface DefinitionStages {
        /** The first stage of the CodeVersion definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the CodeVersion definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, workspaceName, name.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param workspaceName Name of Azure Machine Learning workspace.
             * @param name Container name. This is case-sensitive.
             * @return the next definition stage.
             */
            WithProperties withExistingCode(String resourceGroupName, String workspaceName, String name);
        }
        /** The stage of the CodeVersion definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: [Required] Additional attributes of the entity..
             *
             * @param properties [Required] Additional attributes of the entity.
             * @return the next definition stage.
             */
            WithCreate withProperties(CodeVersionProperties properties);
        }
        /**
         * The stage of the CodeVersion definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            CodeVersion create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            CodeVersion create(Context context);
        }
    }
    /**
     * Begins update for the CodeVersion resource.
     *
     * @return the stage of resource update.
     */
    CodeVersion.Update update();

    /** The template for CodeVersion update. */
    interface Update extends UpdateStages.WithProperties {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        CodeVersion apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        CodeVersion apply(Context context);
    }
    /** The CodeVersion update stages. */
    interface UpdateStages {
        /** The stage of the CodeVersion update allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: [Required] Additional attributes of the entity..
             *
             * @param properties [Required] Additional attributes of the entity.
             * @return the next definition stage.
             */
            Update withProperties(CodeVersionProperties properties);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    CodeVersion refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    CodeVersion refresh(Context context);
}
