// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceAndAppManagementAssignmentFilter;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device And App Management Assignment Filter Request.
 */
public interface IDeviceAndAppManagementAssignmentFilterRequest extends IHttpRequest {

    /**
     * Gets the DeviceAndAppManagementAssignmentFilter from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super DeviceAndAppManagementAssignmentFilter> callback);

    /**
     * Gets the DeviceAndAppManagementAssignmentFilter from the service
     *
     * @return the DeviceAndAppManagementAssignmentFilter from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceAndAppManagementAssignmentFilter get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super DeviceAndAppManagementAssignmentFilter> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceAndAppManagementAssignmentFilter with a source
     *
     * @param sourceDeviceAndAppManagementAssignmentFilter the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceAndAppManagementAssignmentFilter sourceDeviceAndAppManagementAssignmentFilter, final ICallback<? super DeviceAndAppManagementAssignmentFilter> callback);

    /**
     * Patches this DeviceAndAppManagementAssignmentFilter with a source
     *
     * @param sourceDeviceAndAppManagementAssignmentFilter the source object with updates
     * @return the updated DeviceAndAppManagementAssignmentFilter
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceAndAppManagementAssignmentFilter patch(final DeviceAndAppManagementAssignmentFilter sourceDeviceAndAppManagementAssignmentFilter) throws ClientException;

    /**
     * Posts a DeviceAndAppManagementAssignmentFilter with a new object
     *
     * @param newDeviceAndAppManagementAssignmentFilter the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceAndAppManagementAssignmentFilter newDeviceAndAppManagementAssignmentFilter, final ICallback<? super DeviceAndAppManagementAssignmentFilter> callback);

    /**
     * Posts a DeviceAndAppManagementAssignmentFilter with a new object
     *
     * @param newDeviceAndAppManagementAssignmentFilter the new object to create
     * @return the created DeviceAndAppManagementAssignmentFilter
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceAndAppManagementAssignmentFilter post(final DeviceAndAppManagementAssignmentFilter newDeviceAndAppManagementAssignmentFilter) throws ClientException;

    /**
     * Posts a DeviceAndAppManagementAssignmentFilter with a new object
     *
     * @param newDeviceAndAppManagementAssignmentFilter the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final DeviceAndAppManagementAssignmentFilter newDeviceAndAppManagementAssignmentFilter, final ICallback<? super DeviceAndAppManagementAssignmentFilter> callback);

    /**
     * Posts a DeviceAndAppManagementAssignmentFilter with a new object
     *
     * @param newDeviceAndAppManagementAssignmentFilter the object to create/update
     * @return the created DeviceAndAppManagementAssignmentFilter
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceAndAppManagementAssignmentFilter put(final DeviceAndAppManagementAssignmentFilter newDeviceAndAppManagementAssignmentFilter) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceAndAppManagementAssignmentFilterRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceAndAppManagementAssignmentFilterRequest expand(final String value);

}

