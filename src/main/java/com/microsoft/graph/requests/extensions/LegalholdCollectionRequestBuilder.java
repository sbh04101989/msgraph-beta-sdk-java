// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Case;
import com.microsoft.graph.models.extensions.Legalhold;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ILegalholdCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ILegalholdRequestBuilder;
import com.microsoft.graph.requests.extensions.ILegalholdCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Legalhold Collection Request Builder.
 */
public class LegalholdCollectionRequestBuilder extends BaseRequestBuilder implements ILegalholdCollectionRequestBuilder {

    /**
     * The request builder for this collection of Case
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public LegalholdCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public ILegalholdCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public ILegalholdCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new LegalholdCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public ILegalholdRequestBuilder byId(final String id) {
        return new LegalholdRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
