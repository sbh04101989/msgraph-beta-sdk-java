// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagementCachedReportConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Cached Report Configuration Request.
 */
public class DeviceManagementCachedReportConfigurationRequest extends BaseRequest implements IDeviceManagementCachedReportConfigurationRequest {
	
    /**
     * The request for the DeviceManagementCachedReportConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementCachedReportConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementCachedReportConfiguration.class);
    }

    /**
     * Gets the DeviceManagementCachedReportConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super DeviceManagementCachedReportConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceManagementCachedReportConfiguration from the service
     *
     * @return the DeviceManagementCachedReportConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementCachedReportConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super DeviceManagementCachedReportConfiguration> callback) {
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
     * Patches this DeviceManagementCachedReportConfiguration with a source
     *
     * @param sourceDeviceManagementCachedReportConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceManagementCachedReportConfiguration sourceDeviceManagementCachedReportConfiguration, final ICallback<? super DeviceManagementCachedReportConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceManagementCachedReportConfiguration);
    }

    /**
     * Patches this DeviceManagementCachedReportConfiguration with a source
     *
     * @param sourceDeviceManagementCachedReportConfiguration the source object with updates
     * @return the updated DeviceManagementCachedReportConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementCachedReportConfiguration patch(final DeviceManagementCachedReportConfiguration sourceDeviceManagementCachedReportConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceManagementCachedReportConfiguration);
    }

    /**
     * Creates a DeviceManagementCachedReportConfiguration with a new object
     *
     * @param newDeviceManagementCachedReportConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceManagementCachedReportConfiguration newDeviceManagementCachedReportConfiguration, final ICallback<? super DeviceManagementCachedReportConfiguration> callback) {
        send(HttpMethod.POST, callback, newDeviceManagementCachedReportConfiguration);
    }

    /**
     * Creates a DeviceManagementCachedReportConfiguration with a new object
     *
     * @param newDeviceManagementCachedReportConfiguration the new object to create
     * @return the created DeviceManagementCachedReportConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementCachedReportConfiguration post(final DeviceManagementCachedReportConfiguration newDeviceManagementCachedReportConfiguration) throws ClientException {
        return send(HttpMethod.POST, newDeviceManagementCachedReportConfiguration);
    }

    /**
     * Creates a DeviceManagementCachedReportConfiguration with a new object
     *
     * @param newDeviceManagementCachedReportConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final DeviceManagementCachedReportConfiguration newDeviceManagementCachedReportConfiguration, final ICallback<? super DeviceManagementCachedReportConfiguration> callback) {
        send(HttpMethod.PUT, callback, newDeviceManagementCachedReportConfiguration);
    }

    /**
     * Creates a DeviceManagementCachedReportConfiguration with a new object
     *
     * @param newDeviceManagementCachedReportConfiguration the object to create/update
     * @return the created DeviceManagementCachedReportConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementCachedReportConfiguration put(final DeviceManagementCachedReportConfiguration newDeviceManagementCachedReportConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newDeviceManagementCachedReportConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceManagementCachedReportConfigurationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DeviceManagementCachedReportConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceManagementCachedReportConfigurationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DeviceManagementCachedReportConfigurationRequest)this;
     }

}

