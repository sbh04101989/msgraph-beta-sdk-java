// Template Source: IBaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDeviceManagementReportsGetConfigurationSettingDetailsReportRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Management Reports Get Configuration Setting Details Report Request Builder.
 */
public interface IDeviceManagementReportsGetConfigurationSettingDetailsReportRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IDeviceManagementReportsGetConfigurationSettingDetailsReportRequest
     *
     * @param requestOptions the options for the request
     * @return the IDeviceManagementReportsGetConfigurationSettingDetailsReportRequest instance
     */
    IDeviceManagementReportsGetConfigurationSettingDetailsReportRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IDeviceManagementReportsGetConfigurationSettingDetailsReportRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IDeviceManagementReportsGetConfigurationSettingDetailsReportRequest instance
     */
    IDeviceManagementReportsGetConfigurationSettingDetailsReportRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
