// Template Source: IBaseMethodBodyRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDeviceManagementReportsGetUnhealthyDefenderAgentsReportRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Management Reports Get Unhealthy Defender Agents Report Request.
 */
public interface IDeviceManagementReportsGetUnhealthyDefenderAgentsReportRequest extends IHttpRequest {

    void post(final ICallback<? super java.io.InputStream> callback);

    java.io.InputStream post() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceManagementReportsGetUnhealthyDefenderAgentsReportRequest select(final String value) ;

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IDeviceManagementReportsGetUnhealthyDefenderAgentsReportRequest top(final int value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceManagementReportsGetUnhealthyDefenderAgentsReportRequest expand(final String value);

}
