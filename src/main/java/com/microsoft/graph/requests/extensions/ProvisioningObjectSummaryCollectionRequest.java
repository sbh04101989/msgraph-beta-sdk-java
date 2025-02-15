// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AuditLogRoot;
import com.microsoft.graph.models.extensions.ProvisioningObjectSummary;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IProvisioningObjectSummaryCollectionPage;
import com.microsoft.graph.requests.extensions.ProvisioningObjectSummaryCollectionResponse;
import com.microsoft.graph.requests.extensions.IProvisioningObjectSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IProvisioningObjectSummaryCollectionRequest;
import com.microsoft.graph.requests.extensions.ProvisioningObjectSummaryCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Provisioning Object Summary Collection Request.
 */
public class ProvisioningObjectSummaryCollectionRequest extends BaseCollectionRequest<ProvisioningObjectSummaryCollectionResponse, IProvisioningObjectSummaryCollectionPage> implements IProvisioningObjectSummaryCollectionRequest {

    /**
     * The request builder for this collection of ProvisioningObjectSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ProvisioningObjectSummaryCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ProvisioningObjectSummaryCollectionResponse.class, IProvisioningObjectSummaryCollectionPage.class);
    }

    public void get(final ICallback<? super IProvisioningObjectSummaryCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IProvisioningObjectSummaryCollectionPage get() throws ClientException {
        final ProvisioningObjectSummaryCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final ProvisioningObjectSummary newProvisioningObjectSummary, final ICallback<? super ProvisioningObjectSummary> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new ProvisioningObjectSummaryRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newProvisioningObjectSummary, callback);
    }

    public ProvisioningObjectSummary post(final ProvisioningObjectSummary newProvisioningObjectSummary) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ProvisioningObjectSummaryRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newProvisioningObjectSummary);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IProvisioningObjectSummaryCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ProvisioningObjectSummaryCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IProvisioningObjectSummaryCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (ProvisioningObjectSummaryCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IProvisioningObjectSummaryCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (ProvisioningObjectSummaryCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IProvisioningObjectSummaryCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ProvisioningObjectSummaryCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IProvisioningObjectSummaryCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (ProvisioningObjectSummaryCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IProvisioningObjectSummaryCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (ProvisioningObjectSummaryCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IProvisioningObjectSummaryCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IProvisioningObjectSummaryCollectionRequest)this;
    }
    public IProvisioningObjectSummaryCollectionPage buildFromResponse(final ProvisioningObjectSummaryCollectionResponse response) {
        final IProvisioningObjectSummaryCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ProvisioningObjectSummaryCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final ProvisioningObjectSummaryCollectionPage page = new ProvisioningObjectSummaryCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
