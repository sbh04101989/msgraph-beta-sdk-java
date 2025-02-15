// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.VirtualEndpoint;
import com.microsoft.graph.models.extensions.CloudPC;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ICloudPCCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICloudPCRequestBuilder;
import com.microsoft.graph.requests.extensions.ICloudPCCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Cloud PCCollection Request Builder.
 */
public class CloudPCCollectionRequestBuilder extends BaseRequestBuilder implements ICloudPCCollectionRequestBuilder {

    /**
     * The request builder for this collection of VirtualEndpoint
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CloudPCCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public ICloudPCCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public ICloudPCCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new CloudPCCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public ICloudPCRequestBuilder byId(final String id) {
        return new CloudPCRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
