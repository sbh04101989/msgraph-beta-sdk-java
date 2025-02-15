// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceAndAppManagementAssignmentFilter;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device And App Management Assignment Filter Request.
 */
public class DeviceAndAppManagementAssignmentFilterRequest extends BaseRequest implements IDeviceAndAppManagementAssignmentFilterRequest {
	
    /**
     * The request for the DeviceAndAppManagementAssignmentFilter
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceAndAppManagementAssignmentFilterRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceAndAppManagementAssignmentFilter.class);
    }

    /**
     * Gets the DeviceAndAppManagementAssignmentFilter from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super DeviceAndAppManagementAssignmentFilter> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceAndAppManagementAssignmentFilter from the service
     *
     * @return the DeviceAndAppManagementAssignmentFilter from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceAndAppManagementAssignmentFilter get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super DeviceAndAppManagementAssignmentFilter> callback) {
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
     * Patches this DeviceAndAppManagementAssignmentFilter with a source
     *
     * @param sourceDeviceAndAppManagementAssignmentFilter the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceAndAppManagementAssignmentFilter sourceDeviceAndAppManagementAssignmentFilter, final ICallback<? super DeviceAndAppManagementAssignmentFilter> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceAndAppManagementAssignmentFilter);
    }

    /**
     * Patches this DeviceAndAppManagementAssignmentFilter with a source
     *
     * @param sourceDeviceAndAppManagementAssignmentFilter the source object with updates
     * @return the updated DeviceAndAppManagementAssignmentFilter
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceAndAppManagementAssignmentFilter patch(final DeviceAndAppManagementAssignmentFilter sourceDeviceAndAppManagementAssignmentFilter) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceAndAppManagementAssignmentFilter);
    }

    /**
     * Creates a DeviceAndAppManagementAssignmentFilter with a new object
     *
     * @param newDeviceAndAppManagementAssignmentFilter the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceAndAppManagementAssignmentFilter newDeviceAndAppManagementAssignmentFilter, final ICallback<? super DeviceAndAppManagementAssignmentFilter> callback) {
        send(HttpMethod.POST, callback, newDeviceAndAppManagementAssignmentFilter);
    }

    /**
     * Creates a DeviceAndAppManagementAssignmentFilter with a new object
     *
     * @param newDeviceAndAppManagementAssignmentFilter the new object to create
     * @return the created DeviceAndAppManagementAssignmentFilter
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceAndAppManagementAssignmentFilter post(final DeviceAndAppManagementAssignmentFilter newDeviceAndAppManagementAssignmentFilter) throws ClientException {
        return send(HttpMethod.POST, newDeviceAndAppManagementAssignmentFilter);
    }

    /**
     * Creates a DeviceAndAppManagementAssignmentFilter with a new object
     *
     * @param newDeviceAndAppManagementAssignmentFilter the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final DeviceAndAppManagementAssignmentFilter newDeviceAndAppManagementAssignmentFilter, final ICallback<? super DeviceAndAppManagementAssignmentFilter> callback) {
        send(HttpMethod.PUT, callback, newDeviceAndAppManagementAssignmentFilter);
    }

    /**
     * Creates a DeviceAndAppManagementAssignmentFilter with a new object
     *
     * @param newDeviceAndAppManagementAssignmentFilter the object to create/update
     * @return the created DeviceAndAppManagementAssignmentFilter
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceAndAppManagementAssignmentFilter put(final DeviceAndAppManagementAssignmentFilter newDeviceAndAppManagementAssignmentFilter) throws ClientException {
        return send(HttpMethod.PUT, newDeviceAndAppManagementAssignmentFilter);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceAndAppManagementAssignmentFilterRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DeviceAndAppManagementAssignmentFilterRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceAndAppManagementAssignmentFilterRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DeviceAndAppManagementAssignmentFilterRequest)this;
     }

}

