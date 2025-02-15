// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DepOnboardingSetting;
import com.microsoft.graph.models.extensions.ImportedAppleDeviceIdentity;
import com.microsoft.graph.models.extensions.ImportedAppleDeviceIdentityResult;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IImportedAppleDeviceIdentityCollectionPage;
import com.microsoft.graph.requests.extensions.ImportedAppleDeviceIdentityCollectionResponse;
import com.microsoft.graph.requests.extensions.IImportedAppleDeviceIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IImportedAppleDeviceIdentityCollectionRequest;
import com.microsoft.graph.requests.extensions.ImportedAppleDeviceIdentityCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Imported Apple Device Identity Collection Request.
 */
public class ImportedAppleDeviceIdentityCollectionRequest extends BaseCollectionRequest<ImportedAppleDeviceIdentityCollectionResponse, IImportedAppleDeviceIdentityCollectionPage> implements IImportedAppleDeviceIdentityCollectionRequest {

    /**
     * The request builder for this collection of ImportedAppleDeviceIdentity
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ImportedAppleDeviceIdentityCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ImportedAppleDeviceIdentityCollectionResponse.class, IImportedAppleDeviceIdentityCollectionPage.class);
    }

    public void get(final ICallback<? super IImportedAppleDeviceIdentityCollectionPage> callback) {
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

    public IImportedAppleDeviceIdentityCollectionPage get() throws ClientException {
        final ImportedAppleDeviceIdentityCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final ImportedAppleDeviceIdentity newImportedAppleDeviceIdentity, final ICallback<? super ImportedAppleDeviceIdentity> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new ImportedAppleDeviceIdentityRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newImportedAppleDeviceIdentity, callback);
    }

    public ImportedAppleDeviceIdentity post(final ImportedAppleDeviceIdentity newImportedAppleDeviceIdentity) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ImportedAppleDeviceIdentityRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newImportedAppleDeviceIdentity);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IImportedAppleDeviceIdentityCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ImportedAppleDeviceIdentityCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IImportedAppleDeviceIdentityCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (ImportedAppleDeviceIdentityCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IImportedAppleDeviceIdentityCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (ImportedAppleDeviceIdentityCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IImportedAppleDeviceIdentityCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ImportedAppleDeviceIdentityCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IImportedAppleDeviceIdentityCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (ImportedAppleDeviceIdentityCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IImportedAppleDeviceIdentityCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (ImportedAppleDeviceIdentityCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IImportedAppleDeviceIdentityCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IImportedAppleDeviceIdentityCollectionRequest)this;
    }
    public IImportedAppleDeviceIdentityCollectionPage buildFromResponse(final ImportedAppleDeviceIdentityCollectionResponse response) {
        final IImportedAppleDeviceIdentityCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ImportedAppleDeviceIdentityCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final ImportedAppleDeviceIdentityCollectionPage page = new ImportedAppleDeviceIdentityCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
