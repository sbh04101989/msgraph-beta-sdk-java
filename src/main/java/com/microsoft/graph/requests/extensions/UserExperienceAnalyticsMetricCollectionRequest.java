// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsRegressionSummary;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsMetric;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsMetricCollectionPage;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsMetricCollectionResponse;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsMetricCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsMetricCollectionRequest;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsMetricCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics Metric Collection Request.
 */
public class UserExperienceAnalyticsMetricCollectionRequest extends BaseCollectionRequest<UserExperienceAnalyticsMetricCollectionResponse, IUserExperienceAnalyticsMetricCollectionPage> implements IUserExperienceAnalyticsMetricCollectionRequest {

    /**
     * The request builder for this collection of UserExperienceAnalyticsMetric
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserExperienceAnalyticsMetricCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserExperienceAnalyticsMetricCollectionResponse.class, IUserExperienceAnalyticsMetricCollectionPage.class);
    }

    public void get(final ICallback<? super IUserExperienceAnalyticsMetricCollectionPage> callback) {
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

    public IUserExperienceAnalyticsMetricCollectionPage get() throws ClientException {
        final UserExperienceAnalyticsMetricCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final UserExperienceAnalyticsMetric newUserExperienceAnalyticsMetric, final ICallback<? super UserExperienceAnalyticsMetric> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new UserExperienceAnalyticsMetricRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newUserExperienceAnalyticsMetric, callback);
    }

    public UserExperienceAnalyticsMetric post(final UserExperienceAnalyticsMetric newUserExperienceAnalyticsMetric) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new UserExperienceAnalyticsMetricRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newUserExperienceAnalyticsMetric);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IUserExperienceAnalyticsMetricCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (UserExperienceAnalyticsMetricCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IUserExperienceAnalyticsMetricCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (UserExperienceAnalyticsMetricCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IUserExperienceAnalyticsMetricCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (UserExperienceAnalyticsMetricCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IUserExperienceAnalyticsMetricCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (UserExperienceAnalyticsMetricCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IUserExperienceAnalyticsMetricCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (UserExperienceAnalyticsMetricCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IUserExperienceAnalyticsMetricCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (UserExperienceAnalyticsMetricCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IUserExperienceAnalyticsMetricCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IUserExperienceAnalyticsMetricCollectionRequest)this;
    }
    public IUserExperienceAnalyticsMetricCollectionPage buildFromResponse(final UserExperienceAnalyticsMetricCollectionResponse response) {
        final IUserExperienceAnalyticsMetricCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new UserExperienceAnalyticsMetricCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final UserExperienceAnalyticsMetricCollectionPage page = new UserExperienceAnalyticsMetricCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
