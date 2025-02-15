// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SkypeForBusinessParticipantActivityCounts;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Skype For Business Participant Activity Counts Request.
 */
public class SkypeForBusinessParticipantActivityCountsRequest extends BaseRequest implements ISkypeForBusinessParticipantActivityCountsRequest {
	
    /**
     * The request for the SkypeForBusinessParticipantActivityCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SkypeForBusinessParticipantActivityCountsRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SkypeForBusinessParticipantActivityCounts.class);
    }

    /**
     * Gets the SkypeForBusinessParticipantActivityCounts from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super SkypeForBusinessParticipantActivityCounts> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the SkypeForBusinessParticipantActivityCounts from the service
     *
     * @return the SkypeForBusinessParticipantActivityCounts from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SkypeForBusinessParticipantActivityCounts get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super SkypeForBusinessParticipantActivityCounts> callback) {
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
     * Patches this SkypeForBusinessParticipantActivityCounts with a source
     *
     * @param sourceSkypeForBusinessParticipantActivityCounts the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final SkypeForBusinessParticipantActivityCounts sourceSkypeForBusinessParticipantActivityCounts, final ICallback<? super SkypeForBusinessParticipantActivityCounts> callback) {
        send(HttpMethod.PATCH, callback, sourceSkypeForBusinessParticipantActivityCounts);
    }

    /**
     * Patches this SkypeForBusinessParticipantActivityCounts with a source
     *
     * @param sourceSkypeForBusinessParticipantActivityCounts the source object with updates
     * @return the updated SkypeForBusinessParticipantActivityCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SkypeForBusinessParticipantActivityCounts patch(final SkypeForBusinessParticipantActivityCounts sourceSkypeForBusinessParticipantActivityCounts) throws ClientException {
        return send(HttpMethod.PATCH, sourceSkypeForBusinessParticipantActivityCounts);
    }

    /**
     * Creates a SkypeForBusinessParticipantActivityCounts with a new object
     *
     * @param newSkypeForBusinessParticipantActivityCounts the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final SkypeForBusinessParticipantActivityCounts newSkypeForBusinessParticipantActivityCounts, final ICallback<? super SkypeForBusinessParticipantActivityCounts> callback) {
        send(HttpMethod.POST, callback, newSkypeForBusinessParticipantActivityCounts);
    }

    /**
     * Creates a SkypeForBusinessParticipantActivityCounts with a new object
     *
     * @param newSkypeForBusinessParticipantActivityCounts the new object to create
     * @return the created SkypeForBusinessParticipantActivityCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SkypeForBusinessParticipantActivityCounts post(final SkypeForBusinessParticipantActivityCounts newSkypeForBusinessParticipantActivityCounts) throws ClientException {
        return send(HttpMethod.POST, newSkypeForBusinessParticipantActivityCounts);
    }

    /**
     * Creates a SkypeForBusinessParticipantActivityCounts with a new object
     *
     * @param newSkypeForBusinessParticipantActivityCounts the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final SkypeForBusinessParticipantActivityCounts newSkypeForBusinessParticipantActivityCounts, final ICallback<? super SkypeForBusinessParticipantActivityCounts> callback) {
        send(HttpMethod.PUT, callback, newSkypeForBusinessParticipantActivityCounts);
    }

    /**
     * Creates a SkypeForBusinessParticipantActivityCounts with a new object
     *
     * @param newSkypeForBusinessParticipantActivityCounts the object to create/update
     * @return the created SkypeForBusinessParticipantActivityCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SkypeForBusinessParticipantActivityCounts put(final SkypeForBusinessParticipantActivityCounts newSkypeForBusinessParticipantActivityCounts) throws ClientException {
        return send(HttpMethod.PUT, newSkypeForBusinessParticipantActivityCounts);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ISkypeForBusinessParticipantActivityCountsRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (SkypeForBusinessParticipantActivityCountsRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ISkypeForBusinessParticipantActivityCountsRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (SkypeForBusinessParticipantActivityCountsRequest)this;
     }

}

