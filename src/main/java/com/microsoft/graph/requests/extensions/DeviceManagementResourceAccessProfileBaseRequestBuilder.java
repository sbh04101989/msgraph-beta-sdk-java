// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagementResourceAccessProfileBase;
import com.microsoft.graph.models.extensions.DeviceManagementResourceAccessProfileAssignment;
import com.microsoft.graph.requests.extensions.IDeviceManagementResourceAccessProfileAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementResourceAccessProfileAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementResourceAccessProfileAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementResourceAccessProfileAssignmentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Resource Access Profile Base Request Builder.
 */
public class DeviceManagementResourceAccessProfileBaseRequestBuilder extends BaseRequestBuilder implements IDeviceManagementResourceAccessProfileBaseRequestBuilder {

    /**
     * The request builder for the DeviceManagementResourceAccessProfileBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementResourceAccessProfileBaseRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IDeviceManagementResourceAccessProfileBaseRequest instance
     */
    public IDeviceManagementResourceAccessProfileBaseRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IDeviceManagementResourceAccessProfileBaseRequest instance
     */
    public IDeviceManagementResourceAccessProfileBaseRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.DeviceManagementResourceAccessProfileBaseRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IDeviceManagementResourceAccessProfileAssignmentCollectionRequestBuilder assignments() {
        return new DeviceManagementResourceAccessProfileAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    public IDeviceManagementResourceAccessProfileAssignmentRequestBuilder assignments(final String id) {
        return new DeviceManagementResourceAccessProfileAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }

    public IDeviceManagementResourceAccessProfileBaseAssignCollectionRequestBuilder assign(final java.util.List<DeviceManagementResourceAccessProfileAssignment> assignments) {
        return new DeviceManagementResourceAccessProfileBaseAssignCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.assign"), getClient(), null, assignments);
    }
}
