// Template Source: BaseMethodCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ContentInfo;
import com.microsoft.graph.models.extensions.LabelingOptions;
import com.microsoft.graph.models.extensions.InformationProtectionAction;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IInformationProtectionLabelEvaluateApplicationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.InformationProtectionLabelEvaluateApplicationCollectionPage;
import com.microsoft.graph.requests.extensions.InformationProtectionLabelEvaluateApplicationCollectionResponse;
import com.microsoft.graph.models.extensions.InformationProtectionLabelEvaluateApplicationBody;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Information Protection Label Evaluate Application Collection Request.
 */
public class InformationProtectionLabelEvaluateApplicationCollectionRequest extends BaseCollectionRequest<InformationProtectionLabelEvaluateApplicationCollectionResponse, IInformationProtectionLabelEvaluateApplicationCollectionPage> implements IInformationProtectionLabelEvaluateApplicationCollectionRequest {


    protected final InformationProtectionLabelEvaluateApplicationBody body;


    /**
     * The request for this InformationProtectionLabelEvaluateApplication
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public InformationProtectionLabelEvaluateApplicationCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, InformationProtectionLabelEvaluateApplicationCollectionResponse.class, IInformationProtectionLabelEvaluateApplicationCollectionPage.class);
        body = new InformationProtectionLabelEvaluateApplicationBody();
    }


    public void post(final ICallback<? super IInformationProtectionLabelEvaluateApplicationCollectionPage> callback) {
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

    public IInformationProtectionLabelEvaluateApplicationCollectionPage post() throws ClientException {
        final InformationProtectionLabelEvaluateApplicationCollectionResponse response = post(body);
        return buildFromResponse(response);
    }


    public IInformationProtectionLabelEvaluateApplicationCollectionPage buildFromResponse(final InformationProtectionLabelEvaluateApplicationCollectionResponse response) {
        final IInformationProtectionLabelEvaluateApplicationCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new InformationProtectionLabelEvaluateApplicationCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null, (ContentInfo) null, (LabelingOptions) null);
        } else {
            builder = null;
        }
        final IInformationProtectionLabelEvaluateApplicationCollectionPage page = new InformationProtectionLabelEvaluateApplicationCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IInformationProtectionLabelEvaluateApplicationCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IInformationProtectionLabelEvaluateApplicationCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IInformationProtectionLabelEvaluateApplicationCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (IInformationProtectionLabelEvaluateApplicationCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IInformationProtectionLabelEvaluateApplicationCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IInformationProtectionLabelEvaluateApplicationCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IInformationProtectionLabelEvaluateApplicationCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (IInformationProtectionLabelEvaluateApplicationCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IInformationProtectionLabelEvaluateApplicationCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (IInformationProtectionLabelEvaluateApplicationCollectionRequest)this;
    }

}
