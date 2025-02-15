// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.OnPremisesAgent;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the On Premises Agent Request.
 */
public interface IOnPremisesAgentRequest extends IHttpRequest {

    /**
     * Gets the OnPremisesAgent from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super OnPremisesAgent> callback);

    /**
     * Gets the OnPremisesAgent from the service
     *
     * @return the OnPremisesAgent from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OnPremisesAgent get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super OnPremisesAgent> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this OnPremisesAgent with a source
     *
     * @param sourceOnPremisesAgent the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final OnPremisesAgent sourceOnPremisesAgent, final ICallback<? super OnPremisesAgent> callback);

    /**
     * Patches this OnPremisesAgent with a source
     *
     * @param sourceOnPremisesAgent the source object with updates
     * @return the updated OnPremisesAgent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OnPremisesAgent patch(final OnPremisesAgent sourceOnPremisesAgent) throws ClientException;

    /**
     * Posts a OnPremisesAgent with a new object
     *
     * @param newOnPremisesAgent the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final OnPremisesAgent newOnPremisesAgent, final ICallback<? super OnPremisesAgent> callback);

    /**
     * Posts a OnPremisesAgent with a new object
     *
     * @param newOnPremisesAgent the new object to create
     * @return the created OnPremisesAgent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OnPremisesAgent post(final OnPremisesAgent newOnPremisesAgent) throws ClientException;

    /**
     * Posts a OnPremisesAgent with a new object
     *
     * @param newOnPremisesAgent the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final OnPremisesAgent newOnPremisesAgent, final ICallback<? super OnPremisesAgent> callback);

    /**
     * Posts a OnPremisesAgent with a new object
     *
     * @param newOnPremisesAgent the object to create/update
     * @return the created OnPremisesAgent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OnPremisesAgent put(final OnPremisesAgent newOnPremisesAgent) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IOnPremisesAgentRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IOnPremisesAgentRequest expand(final String value);

}

