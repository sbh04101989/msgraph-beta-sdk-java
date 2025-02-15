// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SharePointSiteUsageSiteCounts;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Share Point Site Usage Site Counts Request.
 */
public class SharePointSiteUsageSiteCountsRequest extends BaseRequest implements ISharePointSiteUsageSiteCountsRequest {
	
    /**
     * The request for the SharePointSiteUsageSiteCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SharePointSiteUsageSiteCountsRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SharePointSiteUsageSiteCounts.class);
    }

    /**
     * Gets the SharePointSiteUsageSiteCounts from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super SharePointSiteUsageSiteCounts> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the SharePointSiteUsageSiteCounts from the service
     *
     * @return the SharePointSiteUsageSiteCounts from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SharePointSiteUsageSiteCounts get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super SharePointSiteUsageSiteCounts> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this SharePointSiteUsageSiteCounts with a source
     *
     * @param sourceSharePointSiteUsageSiteCounts the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final SharePointSiteUsageSiteCounts sourceSharePointSiteUsageSiteCounts, final ICallback<? super SharePointSiteUsageSiteCounts> callback) {
        send(HttpMethod.PATCH, callback, sourceSharePointSiteUsageSiteCounts);
    }

    /**
     * Patches this SharePointSiteUsageSiteCounts with a source
     *
     * @param sourceSharePointSiteUsageSiteCounts the source object with updates
     * @return the updated SharePointSiteUsageSiteCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SharePointSiteUsageSiteCounts patch(final SharePointSiteUsageSiteCounts sourceSharePointSiteUsageSiteCounts) throws ClientException {
        return send(HttpMethod.PATCH, sourceSharePointSiteUsageSiteCounts);
    }

    /**
     * Creates a SharePointSiteUsageSiteCounts with a new object
     *
     * @param newSharePointSiteUsageSiteCounts the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final SharePointSiteUsageSiteCounts newSharePointSiteUsageSiteCounts, final ICallback<? super SharePointSiteUsageSiteCounts> callback) {
        send(HttpMethod.POST, callback, newSharePointSiteUsageSiteCounts);
    }

    /**
     * Creates a SharePointSiteUsageSiteCounts with a new object
     *
     * @param newSharePointSiteUsageSiteCounts the new object to create
     * @return the created SharePointSiteUsageSiteCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SharePointSiteUsageSiteCounts post(final SharePointSiteUsageSiteCounts newSharePointSiteUsageSiteCounts) throws ClientException {
        return send(HttpMethod.POST, newSharePointSiteUsageSiteCounts);
    }

    /**
     * Creates a SharePointSiteUsageSiteCounts with a new object
     *
     * @param newSharePointSiteUsageSiteCounts the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final SharePointSiteUsageSiteCounts newSharePointSiteUsageSiteCounts, final ICallback<? super SharePointSiteUsageSiteCounts> callback) {
        send(HttpMethod.PUT, callback, newSharePointSiteUsageSiteCounts);
    }

    /**
     * Creates a SharePointSiteUsageSiteCounts with a new object
     *
     * @param newSharePointSiteUsageSiteCounts the object to create/update
     * @return the created SharePointSiteUsageSiteCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SharePointSiteUsageSiteCounts put(final SharePointSiteUsageSiteCounts newSharePointSiteUsageSiteCounts) throws ClientException {
        return send(HttpMethod.PUT, newSharePointSiteUsageSiteCounts);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ISharePointSiteUsageSiteCountsRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (SharePointSiteUsageSiteCountsRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ISharePointSiteUsageSiteCountsRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (SharePointSiteUsageSiteCountsRequest)this;
     }

}

