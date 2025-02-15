// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MacOSSoftwareUpdateCategorySummary;
import com.microsoft.graph.models.extensions.MacOSSoftwareUpdateStateSummary;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IMacOSSoftwareUpdateStateSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMacOSSoftwareUpdateStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IMacOSSoftwareUpdateStateSummaryCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSSoftware Update State Summary Collection Request Builder.
 */
public class MacOSSoftwareUpdateStateSummaryCollectionRequestBuilder extends BaseRequestBuilder implements IMacOSSoftwareUpdateStateSummaryCollectionRequestBuilder {

    /**
     * The request builder for this collection of MacOSSoftwareUpdateCategorySummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MacOSSoftwareUpdateStateSummaryCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IMacOSSoftwareUpdateStateSummaryCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IMacOSSoftwareUpdateStateSummaryCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new MacOSSoftwareUpdateStateSummaryCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IMacOSSoftwareUpdateStateSummaryRequestBuilder byId(final String id) {
        return new MacOSSoftwareUpdateStateSummaryRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
