// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsAppHealthApplicationPerformance;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsAppHealthApplicationPerformanceCollectionPage;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionResponse;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsAppHealthApplicationPerformanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsAppHealthApplicationPerformanceCollectionRequest;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics App Health Application Performance Collection Request.
 */
public class UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionRequest extends BaseCollectionRequest<UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionResponse, IUserExperienceAnalyticsAppHealthApplicationPerformanceCollectionPage> implements IUserExperienceAnalyticsAppHealthApplicationPerformanceCollectionRequest {

    /**
     * The request builder for this collection of UserExperienceAnalyticsAppHealthApplicationPerformance
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionResponse.class, IUserExperienceAnalyticsAppHealthApplicationPerformanceCollectionPage.class);
    }

    public void get(final ICallback<? super IUserExperienceAnalyticsAppHealthApplicationPerformanceCollectionPage> callback) {
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

    public IUserExperienceAnalyticsAppHealthApplicationPerformanceCollectionPage get() throws ClientException {
        final UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final UserExperienceAnalyticsAppHealthApplicationPerformance newUserExperienceAnalyticsAppHealthApplicationPerformance, final ICallback<? super UserExperienceAnalyticsAppHealthApplicationPerformance> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new UserExperienceAnalyticsAppHealthApplicationPerformanceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newUserExperienceAnalyticsAppHealthApplicationPerformance, callback);
    }

    public UserExperienceAnalyticsAppHealthApplicationPerformance post(final UserExperienceAnalyticsAppHealthApplicationPerformance newUserExperienceAnalyticsAppHealthApplicationPerformance) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new UserExperienceAnalyticsAppHealthApplicationPerformanceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newUserExperienceAnalyticsAppHealthApplicationPerformance);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IUserExperienceAnalyticsAppHealthApplicationPerformanceCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IUserExperienceAnalyticsAppHealthApplicationPerformanceCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IUserExperienceAnalyticsAppHealthApplicationPerformanceCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IUserExperienceAnalyticsAppHealthApplicationPerformanceCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IUserExperienceAnalyticsAppHealthApplicationPerformanceCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IUserExperienceAnalyticsAppHealthApplicationPerformanceCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IUserExperienceAnalyticsAppHealthApplicationPerformanceCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IUserExperienceAnalyticsAppHealthApplicationPerformanceCollectionRequest)this;
    }
    public IUserExperienceAnalyticsAppHealthApplicationPerformanceCollectionPage buildFromResponse(final UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionResponse response) {
        final IUserExperienceAnalyticsAppHealthApplicationPerformanceCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionPage page = new UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
