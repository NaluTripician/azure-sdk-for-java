// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.verticals.agrifood.farming;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.verticals.agrifood.farming.implementation.SensorDataModelsImpl;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous FarmBeatsClient type. */
@ServiceClient(builder = SensorDataModelsClientBuilder.class, isAsync = true)
public final class SensorDataModelsAsyncClient {
    @Generated private final SensorDataModelsImpl serviceClient;

    /**
     * Initializes an instance of SensorDataModelsAsyncClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    SensorDataModelsAsyncClient(SensorDataModelsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Returns a paginated list of sensor data model resources.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>ids</td><td>List&lt;String&gt;</td><td>No</td><td>Ids of the resource. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>names</td><td>List&lt;String&gt;</td><td>No</td><td>Names of the resource. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>propertyFilters</td><td>List&lt;String&gt;</td><td>No</td><td>Filters on key-value pairs within the Properties object.
     * eg. "{testKey} eq {testValue}". Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>statuses</td><td>List&lt;String&gt;</td><td>No</td><td>Statuses of the resource. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>minCreatedDateTime</td><td>OffsetDateTime</td><td>No</td><td>Minimum creation date of resource (inclusive).</td></tr>
     *     <tr><td>maxCreatedDateTime</td><td>OffsetDateTime</td><td>No</td><td>Maximum creation date of resource (inclusive).</td></tr>
     *     <tr><td>minLastModifiedDateTime</td><td>OffsetDateTime</td><td>No</td><td>Minimum last modified date of resource (inclusive).</td></tr>
     *     <tr><td>maxLastModifiedDateTime</td><td>OffsetDateTime</td><td>No</td><td>Maximum last modified date of resource (inclusive).</td></tr>
     *     <tr><td>maxPageSize</td><td>Integer</td><td>No</td><td>Maximum number of items needed (inclusive).
     * Minimum = 10, Maximum = 1000, Default value = 50.</td></tr>
     *     <tr><td>skipToken</td><td>String</td><td>No</td><td>Skip token for getting next set of results.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     type: String (Optional)
     *     manufacturer: String (Optional)
     *     productCode: String (Optional)
     *     measures (Required): {
     *         String (Required): {
     *             description: String (Optional)
     *             dataType: String(Bool/Double/DateTime/Long/String) (Required)
     *             type: String (Optional)
     *             unit: String (Optional)
     *             properties (Optional): {
     *                 String: Object (Optional)
     *             }
     *         }
     *     }
     *     sensorPartnerId: String (Optional)
     *     id: String (Optional)
     *     status: String (Optional)
     *     createdDateTime: OffsetDateTime (Optional)
     *     modifiedDateTime: OffsetDateTime (Optional)
     *     eTag: String (Optional)
     *     name: String (Optional)
     *     description: String (Optional)
     *     createdBy: String (Optional)
     *     modifiedBy: String (Optional)
     *     properties (Optional): {
     *         String: Object (Optional)
     *     }
     * }
     * }</pre>
     *
     * @param sensorPartnerId Id of the associated sensor partner.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return paged response contains list of requested objects and a URL link to get the next set of results as
     *     paginated response with {@link PagedFlux}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> list(String sensorPartnerId, RequestOptions requestOptions) {
        return this.serviceClient.listAsync(sensorPartnerId, requestOptions);
    }

    /**
     * Create a sensor data model entity.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     type: String (Optional)
     *     manufacturer: String (Optional)
     *     productCode: String (Optional)
     *     measures (Required): {
     *         String (Required): {
     *             description: String (Optional)
     *             dataType: String(Bool/Double/DateTime/Long/String) (Required)
     *             type: String (Optional)
     *             unit: String (Optional)
     *             properties (Optional): {
     *                 String: Object (Optional)
     *             }
     *         }
     *     }
     *     sensorPartnerId: String (Optional)
     *     id: String (Optional)
     *     status: String (Optional)
     *     createdDateTime: OffsetDateTime (Optional)
     *     modifiedDateTime: OffsetDateTime (Optional)
     *     eTag: String (Optional)
     *     name: String (Optional)
     *     description: String (Optional)
     *     createdBy: String (Optional)
     *     modifiedBy: String (Optional)
     *     properties (Optional): {
     *         String: Object (Optional)
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     type: String (Optional)
     *     manufacturer: String (Optional)
     *     productCode: String (Optional)
     *     measures (Required): {
     *         String (Required): {
     *             description: String (Optional)
     *             dataType: String(Bool/Double/DateTime/Long/String) (Required)
     *             type: String (Optional)
     *             unit: String (Optional)
     *             properties (Optional): {
     *                 String: Object (Optional)
     *             }
     *         }
     *     }
     *     sensorPartnerId: String (Optional)
     *     id: String (Optional)
     *     status: String (Optional)
     *     createdDateTime: OffsetDateTime (Optional)
     *     modifiedDateTime: OffsetDateTime (Optional)
     *     eTag: String (Optional)
     *     name: String (Optional)
     *     description: String (Optional)
     *     createdBy: String (Optional)
     *     modifiedBy: String (Optional)
     *     properties (Optional): {
     *         String: Object (Optional)
     *     }
     * }
     * }</pre>
     *
     * @param sensorPartnerId Id of the sensor partner.
     * @param sensorDataModelId Id of the sensor data model.
     * @param sensorDataModelObject Sensor data model object details.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return sensorModel API model along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> createOrUpdateWithResponse(
            String sensorPartnerId,
            String sensorDataModelId,
            BinaryData sensorDataModelObject,
            RequestOptions requestOptions) {
        return this.serviceClient.createOrUpdateWithResponseAsync(
                sensorPartnerId, sensorDataModelId, sensorDataModelObject, requestOptions);
    }

    /**
     * Gets a sensor data model entity.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     type: String (Optional)
     *     manufacturer: String (Optional)
     *     productCode: String (Optional)
     *     measures (Required): {
     *         String (Required): {
     *             description: String (Optional)
     *             dataType: String(Bool/Double/DateTime/Long/String) (Required)
     *             type: String (Optional)
     *             unit: String (Optional)
     *             properties (Optional): {
     *                 String: Object (Optional)
     *             }
     *         }
     *     }
     *     sensorPartnerId: String (Optional)
     *     id: String (Optional)
     *     status: String (Optional)
     *     createdDateTime: OffsetDateTime (Optional)
     *     modifiedDateTime: OffsetDateTime (Optional)
     *     eTag: String (Optional)
     *     name: String (Optional)
     *     description: String (Optional)
     *     createdBy: String (Optional)
     *     modifiedBy: String (Optional)
     *     properties (Optional): {
     *         String: Object (Optional)
     *     }
     * }
     * }</pre>
     *
     * @param sensorPartnerId Id of the sensor partner.
     * @param sensorDataModelId Id of the sensor data model resource.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a sensor data model entity along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getWithResponse(
            String sensorPartnerId, String sensorDataModelId, RequestOptions requestOptions) {
        return this.serviceClient.getWithResponseAsync(sensorPartnerId, sensorDataModelId, requestOptions);
    }

    /**
     * Deletes a sensor data model entity.
     *
     * @param sensorPartnerId Id of the sensor partner.
     * @param sensorDataModelId Id of the sensor data model resource.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponse(
            String sensorPartnerId, String sensorDataModelId, RequestOptions requestOptions) {
        return this.serviceClient.deleteWithResponseAsync(sensorPartnerId, sensorDataModelId, requestOptions);
    }
}
