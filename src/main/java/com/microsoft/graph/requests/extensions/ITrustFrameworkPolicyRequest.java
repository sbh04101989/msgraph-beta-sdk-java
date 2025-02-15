// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.TrustFrameworkPolicy;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Trust Framework Policy Request.
 */
public interface ITrustFrameworkPolicyRequest extends IHttpRequest {

    /**
     * Gets the TrustFrameworkPolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super TrustFrameworkPolicy> callback);

    /**
     * Gets the TrustFrameworkPolicy from the service
     *
     * @return the TrustFrameworkPolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TrustFrameworkPolicy get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super TrustFrameworkPolicy> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this TrustFrameworkPolicy with a source
     *
     * @param sourceTrustFrameworkPolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final TrustFrameworkPolicy sourceTrustFrameworkPolicy, final ICallback<? super TrustFrameworkPolicy> callback);

    /**
     * Patches this TrustFrameworkPolicy with a source
     *
     * @param sourceTrustFrameworkPolicy the source object with updates
     * @return the updated TrustFrameworkPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TrustFrameworkPolicy patch(final TrustFrameworkPolicy sourceTrustFrameworkPolicy) throws ClientException;

    /**
     * Posts a TrustFrameworkPolicy with a new object
     *
     * @param newTrustFrameworkPolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final TrustFrameworkPolicy newTrustFrameworkPolicy, final ICallback<? super TrustFrameworkPolicy> callback);

    /**
     * Posts a TrustFrameworkPolicy with a new object
     *
     * @param newTrustFrameworkPolicy the new object to create
     * @return the created TrustFrameworkPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TrustFrameworkPolicy post(final TrustFrameworkPolicy newTrustFrameworkPolicy) throws ClientException;

    /**
     * Posts a TrustFrameworkPolicy with a new object
     *
     * @param newTrustFrameworkPolicy the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final TrustFrameworkPolicy newTrustFrameworkPolicy, final ICallback<? super TrustFrameworkPolicy> callback);

    /**
     * Posts a TrustFrameworkPolicy with a new object
     *
     * @param newTrustFrameworkPolicy the object to create/update
     * @return the created TrustFrameworkPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TrustFrameworkPolicy put(final TrustFrameworkPolicy newTrustFrameworkPolicy) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ITrustFrameworkPolicyRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ITrustFrameworkPolicyRequest expand(final String value);

}

