// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ISalesInvoicePostRequest;
import com.microsoft.graph.requests.extensions.SalesInvoicePostRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sales Invoice Post Request Builder.
 */
public class SalesInvoicePostRequestBuilder extends BaseActionRequestBuilder implements ISalesInvoicePostRequestBuilder {

    /**
     * The request builder for this SalesInvoicePost
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SalesInvoicePostRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the ISalesInvoicePostRequest
     *
     * @param requestOptions the options for the request
     * @return the ISalesInvoicePostRequest instance
     */
    public ISalesInvoicePostRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ISalesInvoicePostRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ISalesInvoicePostRequest instance
     */
    public ISalesInvoicePostRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        SalesInvoicePostRequest request = new SalesInvoicePostRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
