/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.contentmoderator.implementation;

import retrofit2.Retrofit;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.ListManagementImageLists;
import com.google.common.base.Joiner;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.APIErrorException;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.BodyModel;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.ImageList;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.RefreshIndex;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ListManagementImageLists.
 */
public class ListManagementImageListsImpl implements ListManagementImageLists {
    /** The Retrofit service to perform REST calls. */
    private ListManagementImageListsService service;
    /** The service client containing this operation class. */
    private ContentModeratorClientImpl client;

    /**
     * Initializes an instance of ListManagementImageListsImpl.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ListManagementImageListsImpl(Retrofit retrofit, ContentModeratorClientImpl client) {
        this.service = retrofit.create(ListManagementImageListsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ListManagementImageLists to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ListManagementImageListsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.cognitiveservices.vision.contentmoderator.ListManagementImageLists getDetails" })
        @GET("contentmoderator/lists/v1.0/imagelists/{listId}")
        Observable<Response<ResponseBody>> getDetails(@Path("listId") String listId, @Header("accept-language") String acceptLanguage, @Header("x-ms-parameterized-host") String parameterizedHost, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.cognitiveservices.vision.contentmoderator.ListManagementImageLists delete" })
        @HTTP(path = "contentmoderator/lists/v1.0/imagelists/{listId}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("listId") String listId, @Header("accept-language") String acceptLanguage, @Header("x-ms-parameterized-host") String parameterizedHost, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.cognitiveservices.vision.contentmoderator.ListManagementImageLists update" })
        @PUT("contentmoderator/lists/v1.0/imagelists/{listId}")
        Observable<Response<ResponseBody>> update(@Path("listId") String listId, @Header("Content-Type") String contentType, @Body BodyModel bodyParameter, @Header("accept-language") String acceptLanguage, @Header("x-ms-parameterized-host") String parameterizedHost, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.cognitiveservices.vision.contentmoderator.ListManagementImageLists create" })
        @POST("contentmoderator/lists/v1.0/imagelists")
        Observable<Response<ResponseBody>> create(@Header("Content-Type") String contentType, @Body BodyModel bodyParameter, @Header("accept-language") String acceptLanguage, @Header("x-ms-parameterized-host") String parameterizedHost, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.cognitiveservices.vision.contentmoderator.ListManagementImageLists getAllImageLists" })
        @GET("contentmoderator/lists/v1.0/imagelists")
        Observable<Response<ResponseBody>> getAllImageLists(@Header("accept-language") String acceptLanguage, @Header("x-ms-parameterized-host") String parameterizedHost, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.cognitiveservices.vision.contentmoderator.ListManagementImageLists refreshIndexMethod" })
        @POST("contentmoderator/lists/v1.0/imagelists/{listId}/RefreshIndex")
        Observable<Response<ResponseBody>> refreshIndexMethod(@Path("listId") String listId, @Header("accept-language") String acceptLanguage, @Header("x-ms-parameterized-host") String parameterizedHost, @Header("User-Agent") String userAgent);

    }

    /**
     * Returns the details of the image list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ImageList object if successful.
     */
    public ImageList getDetails(String listId) {
        return getDetailsWithServiceResponseAsync(listId).toBlocking().single().body();
    }

    /**
     * Returns the details of the image list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ImageList> getDetailsAsync(String listId, final ServiceCallback<ImageList> serviceCallback) {
        return ServiceFuture.fromResponse(getDetailsWithServiceResponseAsync(listId), serviceCallback);
    }

    /**
     * Returns the details of the image list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ImageList object
     */
    public Observable<ImageList> getDetailsAsync(String listId) {
        return getDetailsWithServiceResponseAsync(listId).map(new Func1<ServiceResponse<ImageList>, ImageList>() {
            @Override
            public ImageList call(ServiceResponse<ImageList> response) {
                return response.body();
            }
        });
    }

    /**
     * Returns the details of the image list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ImageList object
     */
    public Observable<ServiceResponse<ImageList>> getDetailsWithServiceResponseAsync(String listId) {
        if (this.client.baseUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.baseUrl() is required and cannot be null.");
        }
        if (listId == null) {
            throw new IllegalArgumentException("Parameter listId is required and cannot be null.");
        }
        String parameterizedHost = Joiner.on(", ").join("{baseUrl}", this.client.baseUrl());
        return service.getDetails(listId, this.client.acceptLanguage(), parameterizedHost, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ImageList>>>() {
                @Override
                public Observable<ServiceResponse<ImageList>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ImageList> clientResponse = getDetailsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ImageList> getDetailsDelegate(Response<ResponseBody> response) throws APIErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ImageList, APIErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ImageList>() { }.getType())
                .registerError(APIErrorException.class)
                .build(response);
    }

    /**
     * Deletes image list with the list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    public String delete(String listId) {
        return deleteWithServiceResponseAsync(listId).toBlocking().single().body();
    }

    /**
     * Deletes image list with the list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<String> deleteAsync(String listId, final ServiceCallback<String> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(listId), serviceCallback);
    }

    /**
     * Deletes image list with the list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    public Observable<String> deleteAsync(String listId) {
        return deleteWithServiceResponseAsync(listId).map(new Func1<ServiceResponse<String>, String>() {
            @Override
            public String call(ServiceResponse<String> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes image list with the list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    public Observable<ServiceResponse<String>> deleteWithServiceResponseAsync(String listId) {
        if (this.client.baseUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.baseUrl() is required and cannot be null.");
        }
        if (listId == null) {
            throw new IllegalArgumentException("Parameter listId is required and cannot be null.");
        }
        String parameterizedHost = Joiner.on(", ").join("{baseUrl}", this.client.baseUrl());
        return service.delete(listId, this.client.acceptLanguage(), parameterizedHost, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<String>>>() {
                @Override
                public Observable<ServiceResponse<String>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<String> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<String> deleteDelegate(Response<ResponseBody> response) throws APIErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<String, APIErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<String>() { }.getType())
                .registerError(APIErrorException.class)
                .build(response);
    }

    /**
     * Updates an image list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param contentType The content type.
     * @param bodyParameter Schema of the body.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ImageList object if successful.
     */
    public ImageList update(String listId, String contentType, BodyModel bodyParameter) {
        return updateWithServiceResponseAsync(listId, contentType, bodyParameter).toBlocking().single().body();
    }

    /**
     * Updates an image list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param contentType The content type.
     * @param bodyParameter Schema of the body.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ImageList> updateAsync(String listId, String contentType, BodyModel bodyParameter, final ServiceCallback<ImageList> serviceCallback) {
        return ServiceFuture.fromResponse(updateWithServiceResponseAsync(listId, contentType, bodyParameter), serviceCallback);
    }

    /**
     * Updates an image list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param contentType The content type.
     * @param bodyParameter Schema of the body.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ImageList object
     */
    public Observable<ImageList> updateAsync(String listId, String contentType, BodyModel bodyParameter) {
        return updateWithServiceResponseAsync(listId, contentType, bodyParameter).map(new Func1<ServiceResponse<ImageList>, ImageList>() {
            @Override
            public ImageList call(ServiceResponse<ImageList> response) {
                return response.body();
            }
        });
    }

    /**
     * Updates an image list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param contentType The content type.
     * @param bodyParameter Schema of the body.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ImageList object
     */
    public Observable<ServiceResponse<ImageList>> updateWithServiceResponseAsync(String listId, String contentType, BodyModel bodyParameter) {
        if (this.client.baseUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.baseUrl() is required and cannot be null.");
        }
        if (listId == null) {
            throw new IllegalArgumentException("Parameter listId is required and cannot be null.");
        }
        if (contentType == null) {
            throw new IllegalArgumentException("Parameter contentType is required and cannot be null.");
        }
        if (bodyParameter == null) {
            throw new IllegalArgumentException("Parameter bodyParameter is required and cannot be null.");
        }
        Validator.validate(bodyParameter);
        String parameterizedHost = Joiner.on(", ").join("{baseUrl}", this.client.baseUrl());
        return service.update(listId, contentType, bodyParameter, this.client.acceptLanguage(), parameterizedHost, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ImageList>>>() {
                @Override
                public Observable<ServiceResponse<ImageList>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ImageList> clientResponse = updateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ImageList> updateDelegate(Response<ResponseBody> response) throws APIErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ImageList, APIErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ImageList>() { }.getType())
                .registerError(APIErrorException.class)
                .build(response);
    }

    /**
     * Creates an image list.
     *
     * @param contentType The content type.
     * @param bodyParameter Schema of the body.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ImageList object if successful.
     */
    public ImageList create(String contentType, BodyModel bodyParameter) {
        return createWithServiceResponseAsync(contentType, bodyParameter).toBlocking().single().body();
    }

    /**
     * Creates an image list.
     *
     * @param contentType The content type.
     * @param bodyParameter Schema of the body.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ImageList> createAsync(String contentType, BodyModel bodyParameter, final ServiceCallback<ImageList> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(contentType, bodyParameter), serviceCallback);
    }

    /**
     * Creates an image list.
     *
     * @param contentType The content type.
     * @param bodyParameter Schema of the body.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ImageList object
     */
    public Observable<ImageList> createAsync(String contentType, BodyModel bodyParameter) {
        return createWithServiceResponseAsync(contentType, bodyParameter).map(new Func1<ServiceResponse<ImageList>, ImageList>() {
            @Override
            public ImageList call(ServiceResponse<ImageList> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates an image list.
     *
     * @param contentType The content type.
     * @param bodyParameter Schema of the body.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ImageList object
     */
    public Observable<ServiceResponse<ImageList>> createWithServiceResponseAsync(String contentType, BodyModel bodyParameter) {
        if (this.client.baseUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.baseUrl() is required and cannot be null.");
        }
        if (contentType == null) {
            throw new IllegalArgumentException("Parameter contentType is required and cannot be null.");
        }
        if (bodyParameter == null) {
            throw new IllegalArgumentException("Parameter bodyParameter is required and cannot be null.");
        }
        Validator.validate(bodyParameter);
        String parameterizedHost = Joiner.on(", ").join("{baseUrl}", this.client.baseUrl());
        return service.create(contentType, bodyParameter, this.client.acceptLanguage(), parameterizedHost, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ImageList>>>() {
                @Override
                public Observable<ServiceResponse<ImageList>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ImageList> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ImageList> createDelegate(Response<ResponseBody> response) throws APIErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ImageList, APIErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ImageList>() { }.getType())
                .registerError(APIErrorException.class)
                .build(response);
    }

    /**
     * Gets all the Image Lists.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;ImageList&gt; object if successful.
     */
    public List<ImageList> getAllImageLists() {
        return getAllImageListsWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Gets all the Image Lists.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ImageList>> getAllImageListsAsync(final ServiceCallback<List<ImageList>> serviceCallback) {
        return ServiceFuture.fromResponse(getAllImageListsWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Gets all the Image Lists.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;ImageList&gt; object
     */
    public Observable<List<ImageList>> getAllImageListsAsync() {
        return getAllImageListsWithServiceResponseAsync().map(new Func1<ServiceResponse<List<ImageList>>, List<ImageList>>() {
            @Override
            public List<ImageList> call(ServiceResponse<List<ImageList>> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets all the Image Lists.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;ImageList&gt; object
     */
    public Observable<ServiceResponse<List<ImageList>>> getAllImageListsWithServiceResponseAsync() {
        if (this.client.baseUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.baseUrl() is required and cannot be null.");
        }
        String parameterizedHost = Joiner.on(", ").join("{baseUrl}", this.client.baseUrl());
        return service.getAllImageLists(this.client.acceptLanguage(), parameterizedHost, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<ImageList>>>>() {
                @Override
                public Observable<ServiceResponse<List<ImageList>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<List<ImageList>> clientResponse = getAllImageListsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<List<ImageList>> getAllImageListsDelegate(Response<ResponseBody> response) throws APIErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<List<ImageList>, APIErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<List<ImageList>>() { }.getType())
                .registerError(APIErrorException.class)
                .build(response);
    }

    /**
     * Refreshes the index of the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RefreshIndex object if successful.
     */
    public RefreshIndex refreshIndexMethod(String listId) {
        return refreshIndexMethodWithServiceResponseAsync(listId).toBlocking().single().body();
    }

    /**
     * Refreshes the index of the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RefreshIndex> refreshIndexMethodAsync(String listId, final ServiceCallback<RefreshIndex> serviceCallback) {
        return ServiceFuture.fromResponse(refreshIndexMethodWithServiceResponseAsync(listId), serviceCallback);
    }

    /**
     * Refreshes the index of the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RefreshIndex object
     */
    public Observable<RefreshIndex> refreshIndexMethodAsync(String listId) {
        return refreshIndexMethodWithServiceResponseAsync(listId).map(new Func1<ServiceResponse<RefreshIndex>, RefreshIndex>() {
            @Override
            public RefreshIndex call(ServiceResponse<RefreshIndex> response) {
                return response.body();
            }
        });
    }

    /**
     * Refreshes the index of the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RefreshIndex object
     */
    public Observable<ServiceResponse<RefreshIndex>> refreshIndexMethodWithServiceResponseAsync(String listId) {
        if (this.client.baseUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.baseUrl() is required and cannot be null.");
        }
        if (listId == null) {
            throw new IllegalArgumentException("Parameter listId is required and cannot be null.");
        }
        String parameterizedHost = Joiner.on(", ").join("{baseUrl}", this.client.baseUrl());
        return service.refreshIndexMethod(listId, this.client.acceptLanguage(), parameterizedHost, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RefreshIndex>>>() {
                @Override
                public Observable<ServiceResponse<RefreshIndex>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RefreshIndex> clientResponse = refreshIndexMethodDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<RefreshIndex> refreshIndexMethodDelegate(Response<ResponseBody> response) throws APIErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<RefreshIndex, APIErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<RefreshIndex>() { }.getType())
                .registerError(APIErrorException.class)
                .build(response);
    }

}
