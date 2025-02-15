// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Security;
import com.microsoft.graph.models.extensions.UserSecurityProfile;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IUserSecurityProfileCollectionPage;
import com.microsoft.graph.requests.extensions.UserSecurityProfileCollectionResponse;
import com.microsoft.graph.requests.extensions.IUserSecurityProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserSecurityProfileCollectionRequest;
import com.microsoft.graph.requests.extensions.UserSecurityProfileCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Security Profile Collection Request.
 */
public class UserSecurityProfileCollectionRequest extends BaseCollectionRequest<UserSecurityProfileCollectionResponse, IUserSecurityProfileCollectionPage> implements IUserSecurityProfileCollectionRequest {

    /**
     * The request builder for this collection of UserSecurityProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserSecurityProfileCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserSecurityProfileCollectionResponse.class, IUserSecurityProfileCollectionPage.class);
    }

    public void get(final ICallback<? super IUserSecurityProfileCollectionPage> callback) {
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

    public IUserSecurityProfileCollectionPage get() throws ClientException {
        final UserSecurityProfileCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final UserSecurityProfile newUserSecurityProfile, final ICallback<? super UserSecurityProfile> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new UserSecurityProfileRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newUserSecurityProfile, callback);
    }

    public UserSecurityProfile post(final UserSecurityProfile newUserSecurityProfile) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new UserSecurityProfileRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newUserSecurityProfile);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IUserSecurityProfileCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (UserSecurityProfileCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IUserSecurityProfileCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (UserSecurityProfileCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IUserSecurityProfileCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (UserSecurityProfileCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IUserSecurityProfileCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (UserSecurityProfileCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IUserSecurityProfileCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (UserSecurityProfileCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IUserSecurityProfileCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (UserSecurityProfileCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IUserSecurityProfileCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IUserSecurityProfileCollectionRequest)this;
    }
    public IUserSecurityProfileCollectionPage buildFromResponse(final UserSecurityProfileCollectionResponse response) {
        final IUserSecurityProfileCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new UserSecurityProfileCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final UserSecurityProfileCollectionPage page = new UserSecurityProfileCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
