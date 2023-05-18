// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.networkcloud.fluent.models.DefaultCniNetworkInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of DefaultCniNetwork. */
public interface DefaultCniNetwork {
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
     * Gets the clusterId property: The resource ID of the Network Cloud cluster this default CNI network is associated
     * with.
     *
     * @return the clusterId value.
     */
    String clusterId();

    /**
     * Gets the cniAsNumber property: The autonomous system number that the fabric expects to peer with, derived from
     * the associated L3 isolation domain.
     *
     * @return the cniAsNumber value.
     */
    Long cniAsNumber();

    /**
     * Gets the cniBgpConfiguration property: CniBgpConfiguration represents the Calico BGP configuration.
     *
     * <p>The Calico BGP configuration.
     *
     * @return the cniBgpConfiguration value.
     */
    CniBgpConfiguration cniBgpConfiguration();

    /**
     * Gets the detailedStatus property: The more detailed status of the default CNI network.
     *
     * @return the detailedStatus value.
     */
    DefaultCniNetworkDetailedStatus detailedStatus();

    /**
     * Gets the detailedStatusMessage property: The descriptive message about the current detailed status.
     *
     * @return the detailedStatusMessage value.
     */
    String detailedStatusMessage();

    /**
     * Gets the fabricBgpPeers property: The L3 isolation fabric BGP peering connectivity information necessary for BGP
     * peering the Hybrid AKS Cluster with the switch fabric.
     *
     * @return the fabricBgpPeers value.
     */
    List<BgpPeer> fabricBgpPeers();

    /**
     * Gets the hybridAksClustersAssociatedIds property: The list of Hybrid AKS cluster resource ID(s) that are
     * associated with this default CNI network.
     *
     * @return the hybridAksClustersAssociatedIds value.
     */
    List<String> hybridAksClustersAssociatedIds();

    /**
     * Gets the interfaceName property: The name of the interface that will be present in the virtual machine to
     * represent this network.
     *
     * @return the interfaceName value.
     */
    String interfaceName();

    /**
     * Gets the ipAllocationType property: The type of the IP address allocation.
     *
     * @return the ipAllocationType value.
     */
    IpAllocationType ipAllocationType();

    /**
     * Gets the ipv4ConnectedPrefix property: The IPV4 prefix (CIDR) assigned to this default CNI network. It is
     * required when the IP allocation type is IPV4 or DualStack.
     *
     * @return the ipv4ConnectedPrefix value.
     */
    String ipv4ConnectedPrefix();

    /**
     * Gets the ipv6ConnectedPrefix property: The IPV6 prefix (CIDR) assigned to this default CNI network. It is
     * required when the IP allocation type is IPV6 or DualStack.
     *
     * @return the ipv6ConnectedPrefix value.
     */
    String ipv6ConnectedPrefix();

    /**
     * Gets the l3IsolationDomainId property: The resource ID of the Network Fabric l3IsolationDomain.
     *
     * @return the l3IsolationDomainId value.
     */
    String l3IsolationDomainId();

    /**
     * Gets the provisioningState property: The provisioning state of the default CNI network.
     *
     * @return the provisioningState value.
     */
    DefaultCniNetworkProvisioningState provisioningState();

    /**
     * Gets the vlan property: The VLAN from the l3IsolationDomain that is used for this network.
     *
     * @return the vlan value.
     */
    long vlan();

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
     * Gets the inner com.azure.resourcemanager.networkcloud.fluent.models.DefaultCniNetworkInner object.
     *
     * @return the inner object.
     */
    DefaultCniNetworkInner innerModel();

    /** The entirety of the DefaultCniNetwork definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithExtendedLocation,
            DefinitionStages.WithL3IsolationDomainId,
            DefinitionStages.WithVlan,
            DefinitionStages.WithCreate {
    }
    /** The DefaultCniNetwork definition stages. */
    interface DefinitionStages {
        /** The first stage of the DefaultCniNetwork definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the DefaultCniNetwork definition allowing to specify location. */
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
        /** The stage of the DefaultCniNetwork definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithExtendedLocation withExistingResourceGroup(String resourceGroupName);
        }
        /** The stage of the DefaultCniNetwork definition allowing to specify extendedLocation. */
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
            WithL3IsolationDomainId withExtendedLocation(ExtendedLocation extendedLocation);
        }
        /** The stage of the DefaultCniNetwork definition allowing to specify l3IsolationDomainId. */
        interface WithL3IsolationDomainId {
            /**
             * Specifies the l3IsolationDomainId property: The resource ID of the Network Fabric l3IsolationDomain..
             *
             * @param l3IsolationDomainId The resource ID of the Network Fabric l3IsolationDomain.
             * @return the next definition stage.
             */
            WithVlan withL3IsolationDomainId(String l3IsolationDomainId);
        }
        /** The stage of the DefaultCniNetwork definition allowing to specify vlan. */
        interface WithVlan {
            /**
             * Specifies the vlan property: The VLAN from the l3IsolationDomain that is used for this network..
             *
             * @param vlan The VLAN from the l3IsolationDomain that is used for this network.
             * @return the next definition stage.
             */
            WithCreate withVlan(long vlan);
        }
        /**
         * The stage of the DefaultCniNetwork definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithCniBgpConfiguration,
                DefinitionStages.WithIpAllocationType,
                DefinitionStages.WithIpv4ConnectedPrefix,
                DefinitionStages.WithIpv6ConnectedPrefix {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            DefaultCniNetwork create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            DefaultCniNetwork create(Context context);
        }
        /** The stage of the DefaultCniNetwork definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the DefaultCniNetwork definition allowing to specify cniBgpConfiguration. */
        interface WithCniBgpConfiguration {
            /**
             * Specifies the cniBgpConfiguration property: CniBgpConfiguration represents the Calico BGP configuration.
             *
             * <p>The Calico BGP configuration..
             *
             * @param cniBgpConfiguration CniBgpConfiguration represents the Calico BGP configuration.
             *     <p>The Calico BGP configuration.
             * @return the next definition stage.
             */
            WithCreate withCniBgpConfiguration(CniBgpConfiguration cniBgpConfiguration);
        }
        /** The stage of the DefaultCniNetwork definition allowing to specify ipAllocationType. */
        interface WithIpAllocationType {
            /**
             * Specifies the ipAllocationType property: The type of the IP address allocation..
             *
             * @param ipAllocationType The type of the IP address allocation.
             * @return the next definition stage.
             */
            WithCreate withIpAllocationType(IpAllocationType ipAllocationType);
        }
        /** The stage of the DefaultCniNetwork definition allowing to specify ipv4ConnectedPrefix. */
        interface WithIpv4ConnectedPrefix {
            /**
             * Specifies the ipv4ConnectedPrefix property: The IPV4 prefix (CIDR) assigned to this default CNI network.
             * It is required when the IP allocation type is IPV4 or DualStack..
             *
             * @param ipv4ConnectedPrefix The IPV4 prefix (CIDR) assigned to this default CNI network. It is required
             *     when the IP allocation type is IPV4 or DualStack.
             * @return the next definition stage.
             */
            WithCreate withIpv4ConnectedPrefix(String ipv4ConnectedPrefix);
        }
        /** The stage of the DefaultCniNetwork definition allowing to specify ipv6ConnectedPrefix. */
        interface WithIpv6ConnectedPrefix {
            /**
             * Specifies the ipv6ConnectedPrefix property: The IPV6 prefix (CIDR) assigned to this default CNI network.
             * It is required when the IP allocation type is IPV6 or DualStack..
             *
             * @param ipv6ConnectedPrefix The IPV6 prefix (CIDR) assigned to this default CNI network. It is required
             *     when the IP allocation type is IPV6 or DualStack.
             * @return the next definition stage.
             */
            WithCreate withIpv6ConnectedPrefix(String ipv6ConnectedPrefix);
        }
    }
    /**
     * Begins update for the DefaultCniNetwork resource.
     *
     * @return the stage of resource update.
     */
    DefaultCniNetwork.Update update();

    /** The template for DefaultCniNetwork update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        DefaultCniNetwork apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        DefaultCniNetwork apply(Context context);
    }
    /** The DefaultCniNetwork update stages. */
    interface UpdateStages {
        /** The stage of the DefaultCniNetwork update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: The Azure resource tags that will replace the existing ones..
             *
             * @param tags The Azure resource tags that will replace the existing ones.
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
    DefaultCniNetwork refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    DefaultCniNetwork refresh(Context context);
}
