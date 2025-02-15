// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidDeviceOwnerCertificateProfileBase;
import com.microsoft.graph.requests.extensions.IAndroidDeviceOwnerTrustedRootCertificateRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidDeviceOwnerTrustedRootCertificateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Device Owner Certificate Profile Base Request.
 */
public class AndroidDeviceOwnerCertificateProfileBaseRequest extends BaseRequest implements IAndroidDeviceOwnerCertificateProfileBaseRequest {
	
    /**
     * The request for the AndroidDeviceOwnerCertificateProfileBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public AndroidDeviceOwnerCertificateProfileBaseRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends AndroidDeviceOwnerCertificateProfileBase> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the AndroidDeviceOwnerCertificateProfileBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidDeviceOwnerCertificateProfileBaseRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidDeviceOwnerCertificateProfileBase.class);
    }

    /**
     * Gets the AndroidDeviceOwnerCertificateProfileBase from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super AndroidDeviceOwnerCertificateProfileBase> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AndroidDeviceOwnerCertificateProfileBase from the service
     *
     * @return the AndroidDeviceOwnerCertificateProfileBase from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidDeviceOwnerCertificateProfileBase get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super AndroidDeviceOwnerCertificateProfileBase> callback) {
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
     * Patches this AndroidDeviceOwnerCertificateProfileBase with a source
     *
     * @param sourceAndroidDeviceOwnerCertificateProfileBase the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AndroidDeviceOwnerCertificateProfileBase sourceAndroidDeviceOwnerCertificateProfileBase, final ICallback<? super AndroidDeviceOwnerCertificateProfileBase> callback) {
        send(HttpMethod.PATCH, callback, sourceAndroidDeviceOwnerCertificateProfileBase);
    }

    /**
     * Patches this AndroidDeviceOwnerCertificateProfileBase with a source
     *
     * @param sourceAndroidDeviceOwnerCertificateProfileBase the source object with updates
     * @return the updated AndroidDeviceOwnerCertificateProfileBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidDeviceOwnerCertificateProfileBase patch(final AndroidDeviceOwnerCertificateProfileBase sourceAndroidDeviceOwnerCertificateProfileBase) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidDeviceOwnerCertificateProfileBase);
    }

    /**
     * Creates a AndroidDeviceOwnerCertificateProfileBase with a new object
     *
     * @param newAndroidDeviceOwnerCertificateProfileBase the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AndroidDeviceOwnerCertificateProfileBase newAndroidDeviceOwnerCertificateProfileBase, final ICallback<? super AndroidDeviceOwnerCertificateProfileBase> callback) {
        send(HttpMethod.POST, callback, newAndroidDeviceOwnerCertificateProfileBase);
    }

    /**
     * Creates a AndroidDeviceOwnerCertificateProfileBase with a new object
     *
     * @param newAndroidDeviceOwnerCertificateProfileBase the new object to create
     * @return the created AndroidDeviceOwnerCertificateProfileBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidDeviceOwnerCertificateProfileBase post(final AndroidDeviceOwnerCertificateProfileBase newAndroidDeviceOwnerCertificateProfileBase) throws ClientException {
        return send(HttpMethod.POST, newAndroidDeviceOwnerCertificateProfileBase);
    }

    /**
     * Creates a AndroidDeviceOwnerCertificateProfileBase with a new object
     *
     * @param newAndroidDeviceOwnerCertificateProfileBase the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final AndroidDeviceOwnerCertificateProfileBase newAndroidDeviceOwnerCertificateProfileBase, final ICallback<? super AndroidDeviceOwnerCertificateProfileBase> callback) {
        send(HttpMethod.PUT, callback, newAndroidDeviceOwnerCertificateProfileBase);
    }

    /**
     * Creates a AndroidDeviceOwnerCertificateProfileBase with a new object
     *
     * @param newAndroidDeviceOwnerCertificateProfileBase the object to create/update
     * @return the created AndroidDeviceOwnerCertificateProfileBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidDeviceOwnerCertificateProfileBase put(final AndroidDeviceOwnerCertificateProfileBase newAndroidDeviceOwnerCertificateProfileBase) throws ClientException {
        return send(HttpMethod.PUT, newAndroidDeviceOwnerCertificateProfileBase);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAndroidDeviceOwnerCertificateProfileBaseRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AndroidDeviceOwnerCertificateProfileBaseRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAndroidDeviceOwnerCertificateProfileBaseRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AndroidDeviceOwnerCertificateProfileBaseRequest)this;
     }

}

