// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.MicrosoftTunnelSite;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IMicrosoftTunnelSiteCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMicrosoftTunnelSiteRequestBuilder;
import com.microsoft.graph.requests.extensions.IMicrosoftTunnelSiteCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Microsoft Tunnel Site Collection Request Builder.
 */
public class MicrosoftTunnelSiteCollectionRequestBuilder extends BaseRequestBuilder implements IMicrosoftTunnelSiteCollectionRequestBuilder {

    /**
     * The request builder for this collection of DeviceManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MicrosoftTunnelSiteCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IMicrosoftTunnelSiteCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IMicrosoftTunnelSiteCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new MicrosoftTunnelSiteCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IMicrosoftTunnelSiteRequestBuilder byId(final String id) {
        return new MicrosoftTunnelSiteRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
