// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidWorkProfileEasEmailProfileBase;
import com.microsoft.graph.requests.extensions.IAndroidWorkProfileCertificateProfileBaseRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidWorkProfileCertificateProfileBaseRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Work Profile Eas Email Profile Base Request.
 */
public class AndroidWorkProfileEasEmailProfileBaseRequest extends BaseRequest implements IAndroidWorkProfileEasEmailProfileBaseRequest {
	
    /**
     * The request for the AndroidWorkProfileEasEmailProfileBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public AndroidWorkProfileEasEmailProfileBaseRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends AndroidWorkProfileEasEmailProfileBase> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the AndroidWorkProfileEasEmailProfileBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidWorkProfileEasEmailProfileBaseRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidWorkProfileEasEmailProfileBase.class);
    }

    /**
     * Gets the AndroidWorkProfileEasEmailProfileBase from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super AndroidWorkProfileEasEmailProfileBase> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AndroidWorkProfileEasEmailProfileBase from the service
     *
     * @return the AndroidWorkProfileEasEmailProfileBase from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidWorkProfileEasEmailProfileBase get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super AndroidWorkProfileEasEmailProfileBase> callback) {
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
     * Patches this AndroidWorkProfileEasEmailProfileBase with a source
     *
     * @param sourceAndroidWorkProfileEasEmailProfileBase the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AndroidWorkProfileEasEmailProfileBase sourceAndroidWorkProfileEasEmailProfileBase, final ICallback<? super AndroidWorkProfileEasEmailProfileBase> callback) {
        send(HttpMethod.PATCH, callback, sourceAndroidWorkProfileEasEmailProfileBase);
    }

    /**
     * Patches this AndroidWorkProfileEasEmailProfileBase with a source
     *
     * @param sourceAndroidWorkProfileEasEmailProfileBase the source object with updates
     * @return the updated AndroidWorkProfileEasEmailProfileBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidWorkProfileEasEmailProfileBase patch(final AndroidWorkProfileEasEmailProfileBase sourceAndroidWorkProfileEasEmailProfileBase) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidWorkProfileEasEmailProfileBase);
    }

    /**
     * Creates a AndroidWorkProfileEasEmailProfileBase with a new object
     *
     * @param newAndroidWorkProfileEasEmailProfileBase the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AndroidWorkProfileEasEmailProfileBase newAndroidWorkProfileEasEmailProfileBase, final ICallback<? super AndroidWorkProfileEasEmailProfileBase> callback) {
        send(HttpMethod.POST, callback, newAndroidWorkProfileEasEmailProfileBase);
    }

    /**
     * Creates a AndroidWorkProfileEasEmailProfileBase with a new object
     *
     * @param newAndroidWorkProfileEasEmailProfileBase the new object to create
     * @return the created AndroidWorkProfileEasEmailProfileBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidWorkProfileEasEmailProfileBase post(final AndroidWorkProfileEasEmailProfileBase newAndroidWorkProfileEasEmailProfileBase) throws ClientException {
        return send(HttpMethod.POST, newAndroidWorkProfileEasEmailProfileBase);
    }

    /**
     * Creates a AndroidWorkProfileEasEmailProfileBase with a new object
     *
     * @param newAndroidWorkProfileEasEmailProfileBase the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final AndroidWorkProfileEasEmailProfileBase newAndroidWorkProfileEasEmailProfileBase, final ICallback<? super AndroidWorkProfileEasEmailProfileBase> callback) {
        send(HttpMethod.PUT, callback, newAndroidWorkProfileEasEmailProfileBase);
    }

    /**
     * Creates a AndroidWorkProfileEasEmailProfileBase with a new object
     *
     * @param newAndroidWorkProfileEasEmailProfileBase the object to create/update
     * @return the created AndroidWorkProfileEasEmailProfileBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidWorkProfileEasEmailProfileBase put(final AndroidWorkProfileEasEmailProfileBase newAndroidWorkProfileEasEmailProfileBase) throws ClientException {
        return send(HttpMethod.PUT, newAndroidWorkProfileEasEmailProfileBase);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAndroidWorkProfileEasEmailProfileBaseRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AndroidWorkProfileEasEmailProfileBaseRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAndroidWorkProfileEasEmailProfileBaseRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AndroidWorkProfileEasEmailProfileBaseRequest)this;
     }

}

