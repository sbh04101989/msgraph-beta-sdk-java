// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagementResourceAccessProfileAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Resource Access Profile Assignment Request.
 */
public class DeviceManagementResourceAccessProfileAssignmentRequest extends BaseRequest implements IDeviceManagementResourceAccessProfileAssignmentRequest {
	
    /**
     * The request for the DeviceManagementResourceAccessProfileAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementResourceAccessProfileAssignmentRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementResourceAccessProfileAssignment.class);
    }

    /**
     * Gets the DeviceManagementResourceAccessProfileAssignment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super DeviceManagementResourceAccessProfileAssignment> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceManagementResourceAccessProfileAssignment from the service
     *
     * @return the DeviceManagementResourceAccessProfileAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementResourceAccessProfileAssignment get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super DeviceManagementResourceAccessProfileAssignment> callback) {
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
     * Patches this DeviceManagementResourceAccessProfileAssignment with a source
     *
     * @param sourceDeviceManagementResourceAccessProfileAssignment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceManagementResourceAccessProfileAssignment sourceDeviceManagementResourceAccessProfileAssignment, final ICallback<? super DeviceManagementResourceAccessProfileAssignment> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceManagementResourceAccessProfileAssignment);
    }

    /**
     * Patches this DeviceManagementResourceAccessProfileAssignment with a source
     *
     * @param sourceDeviceManagementResourceAccessProfileAssignment the source object with updates
     * @return the updated DeviceManagementResourceAccessProfileAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementResourceAccessProfileAssignment patch(final DeviceManagementResourceAccessProfileAssignment sourceDeviceManagementResourceAccessProfileAssignment) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceManagementResourceAccessProfileAssignment);
    }

    /**
     * Creates a DeviceManagementResourceAccessProfileAssignment with a new object
     *
     * @param newDeviceManagementResourceAccessProfileAssignment the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceManagementResourceAccessProfileAssignment newDeviceManagementResourceAccessProfileAssignment, final ICallback<? super DeviceManagementResourceAccessProfileAssignment> callback) {
        send(HttpMethod.POST, callback, newDeviceManagementResourceAccessProfileAssignment);
    }

    /**
     * Creates a DeviceManagementResourceAccessProfileAssignment with a new object
     *
     * @param newDeviceManagementResourceAccessProfileAssignment the new object to create
     * @return the created DeviceManagementResourceAccessProfileAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementResourceAccessProfileAssignment post(final DeviceManagementResourceAccessProfileAssignment newDeviceManagementResourceAccessProfileAssignment) throws ClientException {
        return send(HttpMethod.POST, newDeviceManagementResourceAccessProfileAssignment);
    }

    /**
     * Creates a DeviceManagementResourceAccessProfileAssignment with a new object
     *
     * @param newDeviceManagementResourceAccessProfileAssignment the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final DeviceManagementResourceAccessProfileAssignment newDeviceManagementResourceAccessProfileAssignment, final ICallback<? super DeviceManagementResourceAccessProfileAssignment> callback) {
        send(HttpMethod.PUT, callback, newDeviceManagementResourceAccessProfileAssignment);
    }

    /**
     * Creates a DeviceManagementResourceAccessProfileAssignment with a new object
     *
     * @param newDeviceManagementResourceAccessProfileAssignment the object to create/update
     * @return the created DeviceManagementResourceAccessProfileAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementResourceAccessProfileAssignment put(final DeviceManagementResourceAccessProfileAssignment newDeviceManagementResourceAccessProfileAssignment) throws ClientException {
        return send(HttpMethod.PUT, newDeviceManagementResourceAccessProfileAssignment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceManagementResourceAccessProfileAssignmentRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DeviceManagementResourceAccessProfileAssignmentRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceManagementResourceAccessProfileAssignmentRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DeviceManagementResourceAccessProfileAssignmentRequest)this;
     }

}

