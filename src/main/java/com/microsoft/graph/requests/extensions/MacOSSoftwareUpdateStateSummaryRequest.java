// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MacOSSoftwareUpdateStateSummary;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSSoftware Update State Summary Request.
 */
public class MacOSSoftwareUpdateStateSummaryRequest extends BaseRequest implements IMacOSSoftwareUpdateStateSummaryRequest {
	
    /**
     * The request for the MacOSSoftwareUpdateStateSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MacOSSoftwareUpdateStateSummaryRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MacOSSoftwareUpdateStateSummary.class);
    }

    /**
     * Gets the MacOSSoftwareUpdateStateSummary from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super MacOSSoftwareUpdateStateSummary> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the MacOSSoftwareUpdateStateSummary from the service
     *
     * @return the MacOSSoftwareUpdateStateSummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MacOSSoftwareUpdateStateSummary get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super MacOSSoftwareUpdateStateSummary> callback) {
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
     * Patches this MacOSSoftwareUpdateStateSummary with a source
     *
     * @param sourceMacOSSoftwareUpdateStateSummary the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final MacOSSoftwareUpdateStateSummary sourceMacOSSoftwareUpdateStateSummary, final ICallback<? super MacOSSoftwareUpdateStateSummary> callback) {
        send(HttpMethod.PATCH, callback, sourceMacOSSoftwareUpdateStateSummary);
    }

    /**
     * Patches this MacOSSoftwareUpdateStateSummary with a source
     *
     * @param sourceMacOSSoftwareUpdateStateSummary the source object with updates
     * @return the updated MacOSSoftwareUpdateStateSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MacOSSoftwareUpdateStateSummary patch(final MacOSSoftwareUpdateStateSummary sourceMacOSSoftwareUpdateStateSummary) throws ClientException {
        return send(HttpMethod.PATCH, sourceMacOSSoftwareUpdateStateSummary);
    }

    /**
     * Creates a MacOSSoftwareUpdateStateSummary with a new object
     *
     * @param newMacOSSoftwareUpdateStateSummary the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final MacOSSoftwareUpdateStateSummary newMacOSSoftwareUpdateStateSummary, final ICallback<? super MacOSSoftwareUpdateStateSummary> callback) {
        send(HttpMethod.POST, callback, newMacOSSoftwareUpdateStateSummary);
    }

    /**
     * Creates a MacOSSoftwareUpdateStateSummary with a new object
     *
     * @param newMacOSSoftwareUpdateStateSummary the new object to create
     * @return the created MacOSSoftwareUpdateStateSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MacOSSoftwareUpdateStateSummary post(final MacOSSoftwareUpdateStateSummary newMacOSSoftwareUpdateStateSummary) throws ClientException {
        return send(HttpMethod.POST, newMacOSSoftwareUpdateStateSummary);
    }

    /**
     * Creates a MacOSSoftwareUpdateStateSummary with a new object
     *
     * @param newMacOSSoftwareUpdateStateSummary the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final MacOSSoftwareUpdateStateSummary newMacOSSoftwareUpdateStateSummary, final ICallback<? super MacOSSoftwareUpdateStateSummary> callback) {
        send(HttpMethod.PUT, callback, newMacOSSoftwareUpdateStateSummary);
    }

    /**
     * Creates a MacOSSoftwareUpdateStateSummary with a new object
     *
     * @param newMacOSSoftwareUpdateStateSummary the object to create/update
     * @return the created MacOSSoftwareUpdateStateSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MacOSSoftwareUpdateStateSummary put(final MacOSSoftwareUpdateStateSummary newMacOSSoftwareUpdateStateSummary) throws ClientException {
        return send(HttpMethod.PUT, newMacOSSoftwareUpdateStateSummary);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IMacOSSoftwareUpdateStateSummaryRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (MacOSSoftwareUpdateStateSummaryRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IMacOSSoftwareUpdateStateSummaryRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (MacOSSoftwareUpdateStateSummaryRequest)this;
     }

}

