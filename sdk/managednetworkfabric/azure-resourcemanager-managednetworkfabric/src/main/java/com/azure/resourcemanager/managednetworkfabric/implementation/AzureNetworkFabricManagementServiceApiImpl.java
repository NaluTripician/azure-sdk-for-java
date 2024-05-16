// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.implementation;

import com.azure.core.annotation.ServiceClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.Response;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.exception.ManagementError;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.management.polling.PollerFactory;
import com.azure.core.util.Context;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.polling.AsyncPollResponse;
import com.azure.core.util.polling.LongRunningOperationStatus;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.managednetworkfabric.fluent.AccessControlListsClient;
import com.azure.resourcemanager.managednetworkfabric.fluent.AzureNetworkFabricManagementServiceApi;
import com.azure.resourcemanager.managednetworkfabric.fluent.ExternalNetworksClient;
import com.azure.resourcemanager.managednetworkfabric.fluent.InternalNetworksClient;
import com.azure.resourcemanager.managednetworkfabric.fluent.InternetGatewayRulesClient;
import com.azure.resourcemanager.managednetworkfabric.fluent.InternetGatewaysClient;
import com.azure.resourcemanager.managednetworkfabric.fluent.IpCommunitiesClient;
import com.azure.resourcemanager.managednetworkfabric.fluent.IpExtendedCommunitiesClient;
import com.azure.resourcemanager.managednetworkfabric.fluent.IpPrefixesClient;
import com.azure.resourcemanager.managednetworkfabric.fluent.L2IsolationDomainsClient;
import com.azure.resourcemanager.managednetworkfabric.fluent.L3IsolationDomainsClient;
import com.azure.resourcemanager.managednetworkfabric.fluent.NeighborGroupsClient;
import com.azure.resourcemanager.managednetworkfabric.fluent.NetworkDeviceSkusClient;
import com.azure.resourcemanager.managednetworkfabric.fluent.NetworkDevicesClient;
import com.azure.resourcemanager.managednetworkfabric.fluent.NetworkFabricControllersClient;
import com.azure.resourcemanager.managednetworkfabric.fluent.NetworkFabricSkusClient;
import com.azure.resourcemanager.managednetworkfabric.fluent.NetworkFabricsClient;
import com.azure.resourcemanager.managednetworkfabric.fluent.NetworkInterfacesClient;
import com.azure.resourcemanager.managednetworkfabric.fluent.NetworkPacketBrokersClient;
import com.azure.resourcemanager.managednetworkfabric.fluent.NetworkRacksClient;
import com.azure.resourcemanager.managednetworkfabric.fluent.NetworkTapRulesClient;
import com.azure.resourcemanager.managednetworkfabric.fluent.NetworkTapsClient;
import com.azure.resourcemanager.managednetworkfabric.fluent.NetworkToNetworkInterconnectsClient;
import com.azure.resourcemanager.managednetworkfabric.fluent.OperationsClient;
import com.azure.resourcemanager.managednetworkfabric.fluent.RoutePoliciesClient;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the AzureNetworkFabricManagementServiceApiImpl type. */
@ServiceClient(builder = AzureNetworkFabricManagementServiceApiBuilder.class)
public final class AzureNetworkFabricManagementServiceApiImpl implements AzureNetworkFabricManagementServiceApi {
    /** The ID of the target subscription. The value must be an UUID. */
    private final String subscriptionId;

    /**
     * Gets The ID of the target subscription. The value must be an UUID.
     *
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /** server parameter. */
    private final String endpoint;

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /** Api Version. */
    private final String apiVersion;

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /** The default poll interval for long-running operation. */
    private final Duration defaultPollInterval;

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    public Duration getDefaultPollInterval() {
        return this.defaultPollInterval;
    }

    /** The AccessControlListsClient object to access its operations. */
    private final AccessControlListsClient accessControlLists;

    /**
     * Gets the AccessControlListsClient object to access its operations.
     *
     * @return the AccessControlListsClient object.
     */
    public AccessControlListsClient getAccessControlLists() {
        return this.accessControlLists;
    }

    /** The InternetGatewaysClient object to access its operations. */
    private final InternetGatewaysClient internetGateways;

    /**
     * Gets the InternetGatewaysClient object to access its operations.
     *
     * @return the InternetGatewaysClient object.
     */
    public InternetGatewaysClient getInternetGateways() {
        return this.internetGateways;
    }

    /** The InternetGatewayRulesClient object to access its operations. */
    private final InternetGatewayRulesClient internetGatewayRules;

    /**
     * Gets the InternetGatewayRulesClient object to access its operations.
     *
     * @return the InternetGatewayRulesClient object.
     */
    public InternetGatewayRulesClient getInternetGatewayRules() {
        return this.internetGatewayRules;
    }

    /** The IpCommunitiesClient object to access its operations. */
    private final IpCommunitiesClient ipCommunities;

    /**
     * Gets the IpCommunitiesClient object to access its operations.
     *
     * @return the IpCommunitiesClient object.
     */
    public IpCommunitiesClient getIpCommunities() {
        return this.ipCommunities;
    }

    /** The IpExtendedCommunitiesClient object to access its operations. */
    private final IpExtendedCommunitiesClient ipExtendedCommunities;

    /**
     * Gets the IpExtendedCommunitiesClient object to access its operations.
     *
     * @return the IpExtendedCommunitiesClient object.
     */
    public IpExtendedCommunitiesClient getIpExtendedCommunities() {
        return this.ipExtendedCommunities;
    }

    /** The IpPrefixesClient object to access its operations. */
    private final IpPrefixesClient ipPrefixes;

    /**
     * Gets the IpPrefixesClient object to access its operations.
     *
     * @return the IpPrefixesClient object.
     */
    public IpPrefixesClient getIpPrefixes() {
        return this.ipPrefixes;
    }

    /** The L2IsolationDomainsClient object to access its operations. */
    private final L2IsolationDomainsClient l2IsolationDomains;

    /**
     * Gets the L2IsolationDomainsClient object to access its operations.
     *
     * @return the L2IsolationDomainsClient object.
     */
    public L2IsolationDomainsClient getL2IsolationDomains() {
        return this.l2IsolationDomains;
    }

    /** The L3IsolationDomainsClient object to access its operations. */
    private final L3IsolationDomainsClient l3IsolationDomains;

    /**
     * Gets the L3IsolationDomainsClient object to access its operations.
     *
     * @return the L3IsolationDomainsClient object.
     */
    public L3IsolationDomainsClient getL3IsolationDomains() {
        return this.l3IsolationDomains;
    }

    /** The InternalNetworksClient object to access its operations. */
    private final InternalNetworksClient internalNetworks;

    /**
     * Gets the InternalNetworksClient object to access its operations.
     *
     * @return the InternalNetworksClient object.
     */
    public InternalNetworksClient getInternalNetworks() {
        return this.internalNetworks;
    }

    /** The ExternalNetworksClient object to access its operations. */
    private final ExternalNetworksClient externalNetworks;

    /**
     * Gets the ExternalNetworksClient object to access its operations.
     *
     * @return the ExternalNetworksClient object.
     */
    public ExternalNetworksClient getExternalNetworks() {
        return this.externalNetworks;
    }

    /** The NeighborGroupsClient object to access its operations. */
    private final NeighborGroupsClient neighborGroups;

    /**
     * Gets the NeighborGroupsClient object to access its operations.
     *
     * @return the NeighborGroupsClient object.
     */
    public NeighborGroupsClient getNeighborGroups() {
        return this.neighborGroups;
    }

    /** The NetworkDeviceSkusClient object to access its operations. */
    private final NetworkDeviceSkusClient networkDeviceSkus;

    /**
     * Gets the NetworkDeviceSkusClient object to access its operations.
     *
     * @return the NetworkDeviceSkusClient object.
     */
    public NetworkDeviceSkusClient getNetworkDeviceSkus() {
        return this.networkDeviceSkus;
    }

    /** The NetworkDevicesClient object to access its operations. */
    private final NetworkDevicesClient networkDevices;

    /**
     * Gets the NetworkDevicesClient object to access its operations.
     *
     * @return the NetworkDevicesClient object.
     */
    public NetworkDevicesClient getNetworkDevices() {
        return this.networkDevices;
    }

    /** The NetworkInterfacesClient object to access its operations. */
    private final NetworkInterfacesClient networkInterfaces;

    /**
     * Gets the NetworkInterfacesClient object to access its operations.
     *
     * @return the NetworkInterfacesClient object.
     */
    public NetworkInterfacesClient getNetworkInterfaces() {
        return this.networkInterfaces;
    }

    /** The NetworkFabricControllersClient object to access its operations. */
    private final NetworkFabricControllersClient networkFabricControllers;

    /**
     * Gets the NetworkFabricControllersClient object to access its operations.
     *
     * @return the NetworkFabricControllersClient object.
     */
    public NetworkFabricControllersClient getNetworkFabricControllers() {
        return this.networkFabricControllers;
    }

    /** The NetworkFabricSkusClient object to access its operations. */
    private final NetworkFabricSkusClient networkFabricSkus;

    /**
     * Gets the NetworkFabricSkusClient object to access its operations.
     *
     * @return the NetworkFabricSkusClient object.
     */
    public NetworkFabricSkusClient getNetworkFabricSkus() {
        return this.networkFabricSkus;
    }

    /** The NetworkFabricsClient object to access its operations. */
    private final NetworkFabricsClient networkFabrics;

    /**
     * Gets the NetworkFabricsClient object to access its operations.
     *
     * @return the NetworkFabricsClient object.
     */
    public NetworkFabricsClient getNetworkFabrics() {
        return this.networkFabrics;
    }

    /** The NetworkToNetworkInterconnectsClient object to access its operations. */
    private final NetworkToNetworkInterconnectsClient networkToNetworkInterconnects;

    /**
     * Gets the NetworkToNetworkInterconnectsClient object to access its operations.
     *
     * @return the NetworkToNetworkInterconnectsClient object.
     */
    public NetworkToNetworkInterconnectsClient getNetworkToNetworkInterconnects() {
        return this.networkToNetworkInterconnects;
    }

    /** The NetworkPacketBrokersClient object to access its operations. */
    private final NetworkPacketBrokersClient networkPacketBrokers;

    /**
     * Gets the NetworkPacketBrokersClient object to access its operations.
     *
     * @return the NetworkPacketBrokersClient object.
     */
    public NetworkPacketBrokersClient getNetworkPacketBrokers() {
        return this.networkPacketBrokers;
    }

    /** The NetworkRacksClient object to access its operations. */
    private final NetworkRacksClient networkRacks;

    /**
     * Gets the NetworkRacksClient object to access its operations.
     *
     * @return the NetworkRacksClient object.
     */
    public NetworkRacksClient getNetworkRacks() {
        return this.networkRacks;
    }

    /** The NetworkTapRulesClient object to access its operations. */
    private final NetworkTapRulesClient networkTapRules;

    /**
     * Gets the NetworkTapRulesClient object to access its operations.
     *
     * @return the NetworkTapRulesClient object.
     */
    public NetworkTapRulesClient getNetworkTapRules() {
        return this.networkTapRules;
    }

    /** The NetworkTapsClient object to access its operations. */
    private final NetworkTapsClient networkTaps;

    /**
     * Gets the NetworkTapsClient object to access its operations.
     *
     * @return the NetworkTapsClient object.
     */
    public NetworkTapsClient getNetworkTaps() {
        return this.networkTaps;
    }

    /** The OperationsClient object to access its operations. */
    private final OperationsClient operations;

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    public OperationsClient getOperations() {
        return this.operations;
    }

    /** The RoutePoliciesClient object to access its operations. */
    private final RoutePoliciesClient routePolicies;

    /**
     * Gets the RoutePoliciesClient object to access its operations.
     *
     * @return the RoutePoliciesClient object.
     */
    public RoutePoliciesClient getRoutePolicies() {
        return this.routePolicies;
    }

    /**
     * Initializes an instance of AzureNetworkFabricManagementServiceApi client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param subscriptionId The ID of the target subscription. The value must be an UUID.
     * @param endpoint server parameter.
     */
    AzureNetworkFabricManagementServiceApiImpl(
        HttpPipeline httpPipeline,
        SerializerAdapter serializerAdapter,
        Duration defaultPollInterval,
        AzureEnvironment environment,
        String subscriptionId,
        String endpoint) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.defaultPollInterval = defaultPollInterval;
        this.subscriptionId = subscriptionId;
        this.endpoint = endpoint;
        this.apiVersion = "2023-06-15";
        this.accessControlLists = new AccessControlListsClientImpl(this);
        this.internetGateways = new InternetGatewaysClientImpl(this);
        this.internetGatewayRules = new InternetGatewayRulesClientImpl(this);
        this.ipCommunities = new IpCommunitiesClientImpl(this);
        this.ipExtendedCommunities = new IpExtendedCommunitiesClientImpl(this);
        this.ipPrefixes = new IpPrefixesClientImpl(this);
        this.l2IsolationDomains = new L2IsolationDomainsClientImpl(this);
        this.l3IsolationDomains = new L3IsolationDomainsClientImpl(this);
        this.internalNetworks = new InternalNetworksClientImpl(this);
        this.externalNetworks = new ExternalNetworksClientImpl(this);
        this.neighborGroups = new NeighborGroupsClientImpl(this);
        this.networkDeviceSkus = new NetworkDeviceSkusClientImpl(this);
        this.networkDevices = new NetworkDevicesClientImpl(this);
        this.networkInterfaces = new NetworkInterfacesClientImpl(this);
        this.networkFabricControllers = new NetworkFabricControllersClientImpl(this);
        this.networkFabricSkus = new NetworkFabricSkusClientImpl(this);
        this.networkFabrics = new NetworkFabricsClientImpl(this);
        this.networkToNetworkInterconnects = new NetworkToNetworkInterconnectsClientImpl(this);
        this.networkPacketBrokers = new NetworkPacketBrokersClientImpl(this);
        this.networkRacks = new NetworkRacksClientImpl(this);
        this.networkTapRules = new NetworkTapRulesClientImpl(this);
        this.networkTaps = new NetworkTapsClientImpl(this);
        this.operations = new OperationsClientImpl(this);
        this.routePolicies = new RoutePoliciesClientImpl(this);
    }

    /**
     * Gets default client context.
     *
     * @return the default client context.
     */
    public Context getContext() {
        return Context.NONE;
    }

    /**
     * Merges default client context with provided context.
     *
     * @param context the context to be merged with default client context.
     * @return the merged context.
     */
    public Context mergeContext(Context context) {
        return CoreUtils.mergeContexts(this.getContext(), context);
    }

    /**
     * Gets long running operation result.
     *
     * @param activationResponse the response of activation operation.
     * @param httpPipeline the http pipeline.
     * @param pollResultType type of poll result.
     * @param finalResultType type of final result.
     * @param context the context shared by all requests.
     * @param <T> type of poll result.
     * @param <U> type of final result.
     * @return poller flux for poll result and final result.
     */
    public <T, U> PollerFlux<PollResult<T>, U> getLroResult(
        Mono<Response<Flux<ByteBuffer>>> activationResponse,
        HttpPipeline httpPipeline,
        Type pollResultType,
        Type finalResultType,
        Context context) {
        return PollerFactory
            .create(
                serializerAdapter,
                httpPipeline,
                pollResultType,
                finalResultType,
                defaultPollInterval,
                activationResponse,
                context);
    }

    /**
     * Gets the final result, or an error, based on last async poll response.
     *
     * @param response the last async poll response.
     * @param <T> type of poll result.
     * @param <U> type of final result.
     * @return the final result, or an error.
     */
    public <T, U> Mono<U> getLroFinalResultOrError(AsyncPollResponse<PollResult<T>, U> response) {
        if (response.getStatus() != LongRunningOperationStatus.SUCCESSFULLY_COMPLETED) {
            String errorMessage;
            ManagementError managementError = null;
            HttpResponse errorResponse = null;
            PollResult.Error lroError = response.getValue().getError();
            if (lroError != null) {
                errorResponse =
                    new HttpResponseImpl(
                        lroError.getResponseStatusCode(), lroError.getResponseHeaders(), lroError.getResponseBody());

                errorMessage = response.getValue().getError().getMessage();
                String errorBody = response.getValue().getError().getResponseBody();
                if (errorBody != null) {
                    // try to deserialize error body to ManagementError
                    try {
                        managementError =
                            this
                                .getSerializerAdapter()
                                .deserialize(errorBody, ManagementError.class, SerializerEncoding.JSON);
                        if (managementError.getCode() == null || managementError.getMessage() == null) {
                            managementError = null;
                        }
                    } catch (IOException | RuntimeException ioe) {
                        LOGGER.logThrowableAsWarning(ioe);
                    }
                }
            } else {
                // fallback to default error message
                errorMessage = "Long running operation failed.";
            }
            if (managementError == null) {
                // fallback to default ManagementError
                managementError = new ManagementError(response.getStatus().toString(), errorMessage);
            }
            return Mono.error(new ManagementException(errorMessage, errorResponse, managementError));
        } else {
            return response.getFinalResult();
        }
    }

    private static final class HttpResponseImpl extends HttpResponse {
        private final int statusCode;

        private final byte[] responseBody;

        private final HttpHeaders httpHeaders;

        HttpResponseImpl(int statusCode, HttpHeaders httpHeaders, String responseBody) {
            super(null);
            this.statusCode = statusCode;
            this.httpHeaders = httpHeaders;
            this.responseBody = responseBody == null ? null : responseBody.getBytes(StandardCharsets.UTF_8);
        }

        public int getStatusCode() {
            return statusCode;
        }

        public String getHeaderValue(String s) {
            return httpHeaders.getValue(s);
        }

        public HttpHeaders getHeaders() {
            return httpHeaders;
        }

        public Flux<ByteBuffer> getBody() {
            return Flux.just(ByteBuffer.wrap(responseBody));
        }

        public Mono<byte[]> getBodyAsByteArray() {
            return Mono.just(responseBody);
        }

        public Mono<String> getBodyAsString() {
            return Mono.just(new String(responseBody, StandardCharsets.UTF_8));
        }

        public Mono<String> getBodyAsString(Charset charset) {
            return Mono.just(new String(responseBody, charset));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AzureNetworkFabricManagementServiceApiImpl.class);
}
