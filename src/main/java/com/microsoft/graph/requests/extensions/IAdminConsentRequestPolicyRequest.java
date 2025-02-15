// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AdminConsentRequestPolicy;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Admin Consent Request Policy Request.
 */
public interface IAdminConsentRequestPolicyRequest extends IHttpRequest {

    /**
     * Gets the AdminConsentRequestPolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super AdminConsentRequestPolicy> callback);

    /**
     * Gets the AdminConsentRequestPolicy from the service
     *
     * @return the AdminConsentRequestPolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AdminConsentRequestPolicy get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super AdminConsentRequestPolicy> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AdminConsentRequestPolicy with a source
     *
     * @param sourceAdminConsentRequestPolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AdminConsentRequestPolicy sourceAdminConsentRequestPolicy, final ICallback<? super AdminConsentRequestPolicy> callback);

    /**
     * Patches this AdminConsentRequestPolicy with a source
     *
     * @param sourceAdminConsentRequestPolicy the source object with updates
     * @return the updated AdminConsentRequestPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AdminConsentRequestPolicy patch(final AdminConsentRequestPolicy sourceAdminConsentRequestPolicy) throws ClientException;

    /**
     * Posts a AdminConsentRequestPolicy with a new object
     *
     * @param newAdminConsentRequestPolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AdminConsentRequestPolicy newAdminConsentRequestPolicy, final ICallback<? super AdminConsentRequestPolicy> callback);

    /**
     * Posts a AdminConsentRequestPolicy with a new object
     *
     * @param newAdminConsentRequestPolicy the new object to create
     * @return the created AdminConsentRequestPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AdminConsentRequestPolicy post(final AdminConsentRequestPolicy newAdminConsentRequestPolicy) throws ClientException;

    /**
     * Posts a AdminConsentRequestPolicy with a new object
     *
     * @param newAdminConsentRequestPolicy the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final AdminConsentRequestPolicy newAdminConsentRequestPolicy, final ICallback<? super AdminConsentRequestPolicy> callback);

    /**
     * Posts a AdminConsentRequestPolicy with a new object
     *
     * @param newAdminConsentRequestPolicy the object to create/update
     * @return the created AdminConsentRequestPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AdminConsentRequestPolicy put(final AdminConsentRequestPolicy newAdminConsentRequestPolicy) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAdminConsentRequestPolicyRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAdminConsentRequestPolicyRequest expand(final String value);

}

