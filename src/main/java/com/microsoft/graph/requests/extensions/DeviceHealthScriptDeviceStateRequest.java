// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceHealthScriptDeviceState;
import com.microsoft.graph.requests.extensions.IManagedDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Health Script Device State Request.
 */
public class DeviceHealthScriptDeviceStateRequest extends BaseRequest implements IDeviceHealthScriptDeviceStateRequest {
	
    /**
     * The request for the DeviceHealthScriptDeviceState
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceHealthScriptDeviceStateRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceHealthScriptDeviceState.class);
    }

    /**
     * Gets the DeviceHealthScriptDeviceState from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super DeviceHealthScriptDeviceState> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceHealthScriptDeviceState from the service
     *
     * @return the DeviceHealthScriptDeviceState from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceHealthScriptDeviceState get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super DeviceHealthScriptDeviceState> callback) {
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
     * Patches this DeviceHealthScriptDeviceState with a source
     *
     * @param sourceDeviceHealthScriptDeviceState the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceHealthScriptDeviceState sourceDeviceHealthScriptDeviceState, final ICallback<? super DeviceHealthScriptDeviceState> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceHealthScriptDeviceState);
    }

    /**
     * Patches this DeviceHealthScriptDeviceState with a source
     *
     * @param sourceDeviceHealthScriptDeviceState the source object with updates
     * @return the updated DeviceHealthScriptDeviceState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceHealthScriptDeviceState patch(final DeviceHealthScriptDeviceState sourceDeviceHealthScriptDeviceState) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceHealthScriptDeviceState);
    }

    /**
     * Creates a DeviceHealthScriptDeviceState with a new object
     *
     * @param newDeviceHealthScriptDeviceState the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceHealthScriptDeviceState newDeviceHealthScriptDeviceState, final ICallback<? super DeviceHealthScriptDeviceState> callback) {
        send(HttpMethod.POST, callback, newDeviceHealthScriptDeviceState);
    }

    /**
     * Creates a DeviceHealthScriptDeviceState with a new object
     *
     * @param newDeviceHealthScriptDeviceState the new object to create
     * @return the created DeviceHealthScriptDeviceState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceHealthScriptDeviceState post(final DeviceHealthScriptDeviceState newDeviceHealthScriptDeviceState) throws ClientException {
        return send(HttpMethod.POST, newDeviceHealthScriptDeviceState);
    }

    /**
     * Creates a DeviceHealthScriptDeviceState with a new object
     *
     * @param newDeviceHealthScriptDeviceState the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final DeviceHealthScriptDeviceState newDeviceHealthScriptDeviceState, final ICallback<? super DeviceHealthScriptDeviceState> callback) {
        send(HttpMethod.PUT, callback, newDeviceHealthScriptDeviceState);
    }

    /**
     * Creates a DeviceHealthScriptDeviceState with a new object
     *
     * @param newDeviceHealthScriptDeviceState the object to create/update
     * @return the created DeviceHealthScriptDeviceState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceHealthScriptDeviceState put(final DeviceHealthScriptDeviceState newDeviceHealthScriptDeviceState) throws ClientException {
        return send(HttpMethod.PUT, newDeviceHealthScriptDeviceState);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceHealthScriptDeviceStateRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DeviceHealthScriptDeviceStateRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceHealthScriptDeviceStateRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DeviceHealthScriptDeviceStateRequest)this;
     }

}

