// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceConfigurationGroupAssignment;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Configuration Group Assignment Request.
 */
public interface IDeviceConfigurationGroupAssignmentRequest extends IHttpRequest {

    /**
     * Gets the DeviceConfigurationGroupAssignment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super DeviceConfigurationGroupAssignment> callback);

    /**
     * Gets the DeviceConfigurationGroupAssignment from the service
     *
     * @return the DeviceConfigurationGroupAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceConfigurationGroupAssignment get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super DeviceConfigurationGroupAssignment> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceConfigurationGroupAssignment with a source
     *
     * @param sourceDeviceConfigurationGroupAssignment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceConfigurationGroupAssignment sourceDeviceConfigurationGroupAssignment, final ICallback<? super DeviceConfigurationGroupAssignment> callback);

    /**
     * Patches this DeviceConfigurationGroupAssignment with a source
     *
     * @param sourceDeviceConfigurationGroupAssignment the source object with updates
     * @return the updated DeviceConfigurationGroupAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceConfigurationGroupAssignment patch(final DeviceConfigurationGroupAssignment sourceDeviceConfigurationGroupAssignment) throws ClientException;

    /**
     * Posts a DeviceConfigurationGroupAssignment with a new object
     *
     * @param newDeviceConfigurationGroupAssignment the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceConfigurationGroupAssignment newDeviceConfigurationGroupAssignment, final ICallback<? super DeviceConfigurationGroupAssignment> callback);

    /**
     * Posts a DeviceConfigurationGroupAssignment with a new object
     *
     * @param newDeviceConfigurationGroupAssignment the new object to create
     * @return the created DeviceConfigurationGroupAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceConfigurationGroupAssignment post(final DeviceConfigurationGroupAssignment newDeviceConfigurationGroupAssignment) throws ClientException;

    /**
     * Posts a DeviceConfigurationGroupAssignment with a new object
     *
     * @param newDeviceConfigurationGroupAssignment the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final DeviceConfigurationGroupAssignment newDeviceConfigurationGroupAssignment, final ICallback<? super DeviceConfigurationGroupAssignment> callback);

    /**
     * Posts a DeviceConfigurationGroupAssignment with a new object
     *
     * @param newDeviceConfigurationGroupAssignment the object to create/update
     * @return the created DeviceConfigurationGroupAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceConfigurationGroupAssignment put(final DeviceConfigurationGroupAssignment newDeviceConfigurationGroupAssignment) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceConfigurationGroupAssignmentRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceConfigurationGroupAssignmentRequest expand(final String value);

}

