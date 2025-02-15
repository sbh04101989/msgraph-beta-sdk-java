// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IosLobAppProvisioningConfiguration;
import com.microsoft.graph.models.extensions.ManagedDeviceMobileAppConfigurationUserStatus;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationUserStatusCollectionPage;
import com.microsoft.graph.requests.extensions.ManagedDeviceMobileAppConfigurationUserStatusCollectionResponse;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationUserStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationUserStatusCollectionRequest;
import com.microsoft.graph.requests.extensions.ManagedDeviceMobileAppConfigurationUserStatusCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Mobile App Configuration User Status Collection Request.
 */
public class ManagedDeviceMobileAppConfigurationUserStatusCollectionRequest extends BaseCollectionRequest<ManagedDeviceMobileAppConfigurationUserStatusCollectionResponse, IManagedDeviceMobileAppConfigurationUserStatusCollectionPage> implements IManagedDeviceMobileAppConfigurationUserStatusCollectionRequest {

    /**
     * The request builder for this collection of ManagedDeviceMobileAppConfigurationUserStatus
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedDeviceMobileAppConfigurationUserStatusCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedDeviceMobileAppConfigurationUserStatusCollectionResponse.class, IManagedDeviceMobileAppConfigurationUserStatusCollectionPage.class);
    }

    public void get(final ICallback<? super IManagedDeviceMobileAppConfigurationUserStatusCollectionPage> callback) {
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

    public IManagedDeviceMobileAppConfigurationUserStatusCollectionPage get() throws ClientException {
        final ManagedDeviceMobileAppConfigurationUserStatusCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final ManagedDeviceMobileAppConfigurationUserStatus newManagedDeviceMobileAppConfigurationUserStatus, final ICallback<? super ManagedDeviceMobileAppConfigurationUserStatus> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new ManagedDeviceMobileAppConfigurationUserStatusRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newManagedDeviceMobileAppConfigurationUserStatus, callback);
    }

    public ManagedDeviceMobileAppConfigurationUserStatus post(final ManagedDeviceMobileAppConfigurationUserStatus newManagedDeviceMobileAppConfigurationUserStatus) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ManagedDeviceMobileAppConfigurationUserStatusRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newManagedDeviceMobileAppConfigurationUserStatus);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IManagedDeviceMobileAppConfigurationUserStatusCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ManagedDeviceMobileAppConfigurationUserStatusCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IManagedDeviceMobileAppConfigurationUserStatusCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (ManagedDeviceMobileAppConfigurationUserStatusCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IManagedDeviceMobileAppConfigurationUserStatusCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (ManagedDeviceMobileAppConfigurationUserStatusCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IManagedDeviceMobileAppConfigurationUserStatusCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ManagedDeviceMobileAppConfigurationUserStatusCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IManagedDeviceMobileAppConfigurationUserStatusCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (ManagedDeviceMobileAppConfigurationUserStatusCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IManagedDeviceMobileAppConfigurationUserStatusCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (ManagedDeviceMobileAppConfigurationUserStatusCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IManagedDeviceMobileAppConfigurationUserStatusCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IManagedDeviceMobileAppConfigurationUserStatusCollectionRequest)this;
    }
    public IManagedDeviceMobileAppConfigurationUserStatusCollectionPage buildFromResponse(final ManagedDeviceMobileAppConfigurationUserStatusCollectionResponse response) {
        final IManagedDeviceMobileAppConfigurationUserStatusCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ManagedDeviceMobileAppConfigurationUserStatusCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final ManagedDeviceMobileAppConfigurationUserStatusCollectionPage page = new ManagedDeviceMobileAppConfigurationUserStatusCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
