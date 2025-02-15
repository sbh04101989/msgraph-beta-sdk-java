// Template Source: BaseMethodBodyRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagementReportsGetDeviceInstallStatusReportBody;
import com.microsoft.graph.requests.extensions.IDeviceManagementReportsGetDeviceInstallStatusReportRequest;
import com.microsoft.graph.requests.extensions.DeviceManagementReportsGetDeviceInstallStatusReportRequest;

import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Reports Get Device Install Status Report Request.
 */
public class DeviceManagementReportsGetDeviceInstallStatusReportRequest extends BaseRequest implements IDeviceManagementReportsGetDeviceInstallStatusReportRequest {
    protected final DeviceManagementReportsGetDeviceInstallStatusReportBody body;

    /**
     * The request for this DeviceManagementReportsGetDeviceInstallStatusReport
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementReportsGetDeviceInstallStatusReportRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, java.io.InputStream.class);
        body = new DeviceManagementReportsGetDeviceInstallStatusReportBody();
    }

    public void post(final ICallback<? super java.io.InputStream> callback) {
        send(HttpMethod.POST, callback, body);
    }

    public java.io.InputStream post() throws ClientException {
        return send(HttpMethod.POST, body);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceManagementReportsGetDeviceInstallStatusReportRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DeviceManagementReportsGetDeviceInstallStatusReportRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDeviceManagementReportsGetDeviceInstallStatusReportRequest top(final int value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (DeviceManagementReportsGetDeviceInstallStatusReportRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceManagementReportsGetDeviceInstallStatusReportRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DeviceManagementReportsGetDeviceInstallStatusReportRequest)this;
    }

}
