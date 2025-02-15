// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DetectedApp;
import com.microsoft.graph.requests.extensions.IManagedDeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Detected App Request.
 */
public class DetectedAppRequest extends BaseRequest implements IDetectedAppRequest {
	
    /**
     * The request for the DetectedApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DetectedAppRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DetectedApp.class);
    }

    /**
     * Gets the DetectedApp from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super DetectedApp> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DetectedApp from the service
     *
     * @return the DetectedApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DetectedApp get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super DetectedApp> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DetectedApp with a source
     *
     * @param sourceDetectedApp the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DetectedApp sourceDetectedApp, final ICallback<? super DetectedApp> callback) {
        send(HttpMethod.PATCH, callback, sourceDetectedApp);
    }

    /**
     * Patches this DetectedApp with a source
     *
     * @param sourceDetectedApp the source object with updates
     * @return the updated DetectedApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DetectedApp patch(final DetectedApp sourceDetectedApp) throws ClientException {
        return send(HttpMethod.PATCH, sourceDetectedApp);
    }

    /**
     * Creates a DetectedApp with a new object
     *
     * @param newDetectedApp the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DetectedApp newDetectedApp, final ICallback<? super DetectedApp> callback) {
        send(HttpMethod.POST, callback, newDetectedApp);
    }

    /**
     * Creates a DetectedApp with a new object
     *
     * @param newDetectedApp the new object to create
     * @return the created DetectedApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DetectedApp post(final DetectedApp newDetectedApp) throws ClientException {
        return send(HttpMethod.POST, newDetectedApp);
    }

    /**
     * Creates a DetectedApp with a new object
     *
     * @param newDetectedApp the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final DetectedApp newDetectedApp, final ICallback<? super DetectedApp> callback) {
        send(HttpMethod.PUT, callback, newDetectedApp);
    }

    /**
     * Creates a DetectedApp with a new object
     *
     * @param newDetectedApp the object to create/update
     * @return the created DetectedApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DetectedApp put(final DetectedApp newDetectedApp) throws ClientException {
        return send(HttpMethod.PUT, newDetectedApp);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDetectedAppRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DetectedAppRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDetectedAppRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DetectedAppRequest)this;
     }

}

