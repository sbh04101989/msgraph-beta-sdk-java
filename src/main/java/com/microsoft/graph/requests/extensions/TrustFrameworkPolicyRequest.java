// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TrustFrameworkPolicy;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Trust Framework Policy Request.
 */
public class TrustFrameworkPolicyRequest extends BaseRequest implements ITrustFrameworkPolicyRequest {
	
    /**
     * The request for the TrustFrameworkPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TrustFrameworkPolicyRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TrustFrameworkPolicy.class);
    }

    /**
     * Gets the TrustFrameworkPolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super TrustFrameworkPolicy> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the TrustFrameworkPolicy from the service
     *
     * @return the TrustFrameworkPolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TrustFrameworkPolicy get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super TrustFrameworkPolicy> callback) {
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
     * Patches this TrustFrameworkPolicy with a source
     *
     * @param sourceTrustFrameworkPolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final TrustFrameworkPolicy sourceTrustFrameworkPolicy, final ICallback<? super TrustFrameworkPolicy> callback) {
        send(HttpMethod.PATCH, callback, sourceTrustFrameworkPolicy);
    }

    /**
     * Patches this TrustFrameworkPolicy with a source
     *
     * @param sourceTrustFrameworkPolicy the source object with updates
     * @return the updated TrustFrameworkPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TrustFrameworkPolicy patch(final TrustFrameworkPolicy sourceTrustFrameworkPolicy) throws ClientException {
        return send(HttpMethod.PATCH, sourceTrustFrameworkPolicy);
    }

    /**
     * Creates a TrustFrameworkPolicy with a new object
     *
     * @param newTrustFrameworkPolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final TrustFrameworkPolicy newTrustFrameworkPolicy, final ICallback<? super TrustFrameworkPolicy> callback) {
        send(HttpMethod.POST, callback, newTrustFrameworkPolicy);
    }

    /**
     * Creates a TrustFrameworkPolicy with a new object
     *
     * @param newTrustFrameworkPolicy the new object to create
     * @return the created TrustFrameworkPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TrustFrameworkPolicy post(final TrustFrameworkPolicy newTrustFrameworkPolicy) throws ClientException {
        return send(HttpMethod.POST, newTrustFrameworkPolicy);
    }

    /**
     * Creates a TrustFrameworkPolicy with a new object
     *
     * @param newTrustFrameworkPolicy the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final TrustFrameworkPolicy newTrustFrameworkPolicy, final ICallback<? super TrustFrameworkPolicy> callback) {
        send(HttpMethod.PUT, callback, newTrustFrameworkPolicy);
    }

    /**
     * Creates a TrustFrameworkPolicy with a new object
     *
     * @param newTrustFrameworkPolicy the object to create/update
     * @return the created TrustFrameworkPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TrustFrameworkPolicy put(final TrustFrameworkPolicy newTrustFrameworkPolicy) throws ClientException {
        return send(HttpMethod.PUT, newTrustFrameworkPolicy);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ITrustFrameworkPolicyRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (TrustFrameworkPolicyRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ITrustFrameworkPolicyRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (TrustFrameworkPolicyRequest)this;
     }

}

