// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SecurityBaselineDeviceState;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Security Baseline Device State Request.
 */
public class SecurityBaselineDeviceStateRequest extends BaseRequest implements ISecurityBaselineDeviceStateRequest {
	
    /**
     * The request for the SecurityBaselineDeviceState
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SecurityBaselineDeviceStateRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SecurityBaselineDeviceState.class);
    }

    /**
     * Gets the SecurityBaselineDeviceState from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super SecurityBaselineDeviceState> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the SecurityBaselineDeviceState from the service
     *
     * @return the SecurityBaselineDeviceState from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SecurityBaselineDeviceState get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super SecurityBaselineDeviceState> callback) {
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
     * Patches this SecurityBaselineDeviceState with a source
     *
     * @param sourceSecurityBaselineDeviceState the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final SecurityBaselineDeviceState sourceSecurityBaselineDeviceState, final ICallback<? super SecurityBaselineDeviceState> callback) {
        send(HttpMethod.PATCH, callback, sourceSecurityBaselineDeviceState);
    }

    /**
     * Patches this SecurityBaselineDeviceState with a source
     *
     * @param sourceSecurityBaselineDeviceState the source object with updates
     * @return the updated SecurityBaselineDeviceState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SecurityBaselineDeviceState patch(final SecurityBaselineDeviceState sourceSecurityBaselineDeviceState) throws ClientException {
        return send(HttpMethod.PATCH, sourceSecurityBaselineDeviceState);
    }

    /**
     * Creates a SecurityBaselineDeviceState with a new object
     *
     * @param newSecurityBaselineDeviceState the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final SecurityBaselineDeviceState newSecurityBaselineDeviceState, final ICallback<? super SecurityBaselineDeviceState> callback) {
        send(HttpMethod.POST, callback, newSecurityBaselineDeviceState);
    }

    /**
     * Creates a SecurityBaselineDeviceState with a new object
     *
     * @param newSecurityBaselineDeviceState the new object to create
     * @return the created SecurityBaselineDeviceState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SecurityBaselineDeviceState post(final SecurityBaselineDeviceState newSecurityBaselineDeviceState) throws ClientException {
        return send(HttpMethod.POST, newSecurityBaselineDeviceState);
    }

    /**
     * Creates a SecurityBaselineDeviceState with a new object
     *
     * @param newSecurityBaselineDeviceState the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final SecurityBaselineDeviceState newSecurityBaselineDeviceState, final ICallback<? super SecurityBaselineDeviceState> callback) {
        send(HttpMethod.PUT, callback, newSecurityBaselineDeviceState);
    }

    /**
     * Creates a SecurityBaselineDeviceState with a new object
     *
     * @param newSecurityBaselineDeviceState the object to create/update
     * @return the created SecurityBaselineDeviceState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SecurityBaselineDeviceState put(final SecurityBaselineDeviceState newSecurityBaselineDeviceState) throws ClientException {
        return send(HttpMethod.PUT, newSecurityBaselineDeviceState);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ISecurityBaselineDeviceStateRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (SecurityBaselineDeviceStateRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ISecurityBaselineDeviceStateRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (SecurityBaselineDeviceStateRequest)this;
     }

}

