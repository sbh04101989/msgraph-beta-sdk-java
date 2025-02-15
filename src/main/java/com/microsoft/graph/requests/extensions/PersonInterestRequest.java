// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PersonInterest;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Person Interest Request.
 */
public class PersonInterestRequest extends BaseRequest implements IPersonInterestRequest {
	
    /**
     * The request for the PersonInterest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PersonInterestRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PersonInterest.class);
    }

    /**
     * Gets the PersonInterest from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super PersonInterest> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PersonInterest from the service
     *
     * @return the PersonInterest from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PersonInterest get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super PersonInterest> callback) {
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
     * Patches this PersonInterest with a source
     *
     * @param sourcePersonInterest the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final PersonInterest sourcePersonInterest, final ICallback<? super PersonInterest> callback) {
        send(HttpMethod.PATCH, callback, sourcePersonInterest);
    }

    /**
     * Patches this PersonInterest with a source
     *
     * @param sourcePersonInterest the source object with updates
     * @return the updated PersonInterest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PersonInterest patch(final PersonInterest sourcePersonInterest) throws ClientException {
        return send(HttpMethod.PATCH, sourcePersonInterest);
    }

    /**
     * Creates a PersonInterest with a new object
     *
     * @param newPersonInterest the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final PersonInterest newPersonInterest, final ICallback<? super PersonInterest> callback) {
        send(HttpMethod.POST, callback, newPersonInterest);
    }

    /**
     * Creates a PersonInterest with a new object
     *
     * @param newPersonInterest the new object to create
     * @return the created PersonInterest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PersonInterest post(final PersonInterest newPersonInterest) throws ClientException {
        return send(HttpMethod.POST, newPersonInterest);
    }

    /**
     * Creates a PersonInterest with a new object
     *
     * @param newPersonInterest the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final PersonInterest newPersonInterest, final ICallback<? super PersonInterest> callback) {
        send(HttpMethod.PUT, callback, newPersonInterest);
    }

    /**
     * Creates a PersonInterest with a new object
     *
     * @param newPersonInterest the object to create/update
     * @return the created PersonInterest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PersonInterest put(final PersonInterest newPersonInterest) throws ClientException {
        return send(HttpMethod.PUT, newPersonInterest);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IPersonInterestRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (PersonInterestRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IPersonInterestRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (PersonInterestRequest)this;
     }

}

