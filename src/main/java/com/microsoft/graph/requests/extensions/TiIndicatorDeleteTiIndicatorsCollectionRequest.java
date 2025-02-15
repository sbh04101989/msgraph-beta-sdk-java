// Template Source: BaseMethodCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ResultInfo;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ITiIndicatorDeleteTiIndicatorsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TiIndicatorDeleteTiIndicatorsCollectionPage;
import com.microsoft.graph.requests.extensions.TiIndicatorDeleteTiIndicatorsCollectionResponse;
import com.microsoft.graph.models.extensions.TiIndicatorDeleteTiIndicatorsBody;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ti Indicator Delete Ti Indicators Collection Request.
 */
public class TiIndicatorDeleteTiIndicatorsCollectionRequest extends BaseCollectionRequest<TiIndicatorDeleteTiIndicatorsCollectionResponse, ITiIndicatorDeleteTiIndicatorsCollectionPage> implements ITiIndicatorDeleteTiIndicatorsCollectionRequest {


    protected final TiIndicatorDeleteTiIndicatorsBody body;


    /**
     * The request for this TiIndicatorDeleteTiIndicators
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TiIndicatorDeleteTiIndicatorsCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TiIndicatorDeleteTiIndicatorsCollectionResponse.class, ITiIndicatorDeleteTiIndicatorsCollectionPage.class);
        body = new TiIndicatorDeleteTiIndicatorsBody();
    }


    public void post(final ICallback<? super ITiIndicatorDeleteTiIndicatorsCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(post(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public ITiIndicatorDeleteTiIndicatorsCollectionPage post() throws ClientException {
        final TiIndicatorDeleteTiIndicatorsCollectionResponse response = post(body);
        return buildFromResponse(response);
    }


    public ITiIndicatorDeleteTiIndicatorsCollectionPage buildFromResponse(final TiIndicatorDeleteTiIndicatorsCollectionResponse response) {
        final ITiIndicatorDeleteTiIndicatorsCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new TiIndicatorDeleteTiIndicatorsCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null, (java.util.List<String>) null);
        } else {
            builder = null;
        }
        final ITiIndicatorDeleteTiIndicatorsCollectionPage page = new TiIndicatorDeleteTiIndicatorsCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ITiIndicatorDeleteTiIndicatorsCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ITiIndicatorDeleteTiIndicatorsCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ITiIndicatorDeleteTiIndicatorsCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (ITiIndicatorDeleteTiIndicatorsCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ITiIndicatorDeleteTiIndicatorsCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ITiIndicatorDeleteTiIndicatorsCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public ITiIndicatorDeleteTiIndicatorsCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (ITiIndicatorDeleteTiIndicatorsCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public ITiIndicatorDeleteTiIndicatorsCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (ITiIndicatorDeleteTiIndicatorsCollectionRequest)this;
    }

}
