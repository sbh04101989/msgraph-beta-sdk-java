// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SharePointSiteUsageFileCounts;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Share Point Site Usage File Counts Request.
 */
public interface ISharePointSiteUsageFileCountsRequest extends IHttpRequest {

    /**
     * Gets the SharePointSiteUsageFileCounts from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super SharePointSiteUsageFileCounts> callback);

    /**
     * Gets the SharePointSiteUsageFileCounts from the service
     *
     * @return the SharePointSiteUsageFileCounts from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SharePointSiteUsageFileCounts get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super SharePointSiteUsageFileCounts> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this SharePointSiteUsageFileCounts with a source
     *
     * @param sourceSharePointSiteUsageFileCounts the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final SharePointSiteUsageFileCounts sourceSharePointSiteUsageFileCounts, final ICallback<? super SharePointSiteUsageFileCounts> callback);

    /**
     * Patches this SharePointSiteUsageFileCounts with a source
     *
     * @param sourceSharePointSiteUsageFileCounts the source object with updates
     * @return the updated SharePointSiteUsageFileCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SharePointSiteUsageFileCounts patch(final SharePointSiteUsageFileCounts sourceSharePointSiteUsageFileCounts) throws ClientException;

    /**
     * Posts a SharePointSiteUsageFileCounts with a new object
     *
     * @param newSharePointSiteUsageFileCounts the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final SharePointSiteUsageFileCounts newSharePointSiteUsageFileCounts, final ICallback<? super SharePointSiteUsageFileCounts> callback);

    /**
     * Posts a SharePointSiteUsageFileCounts with a new object
     *
     * @param newSharePointSiteUsageFileCounts the new object to create
     * @return the created SharePointSiteUsageFileCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SharePointSiteUsageFileCounts post(final SharePointSiteUsageFileCounts newSharePointSiteUsageFileCounts) throws ClientException;

    /**
     * Posts a SharePointSiteUsageFileCounts with a new object
     *
     * @param newSharePointSiteUsageFileCounts the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final SharePointSiteUsageFileCounts newSharePointSiteUsageFileCounts, final ICallback<? super SharePointSiteUsageFileCounts> callback);

    /**
     * Posts a SharePointSiteUsageFileCounts with a new object
     *
     * @param newSharePointSiteUsageFileCounts the object to create/update
     * @return the created SharePointSiteUsageFileCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SharePointSiteUsageFileCounts put(final SharePointSiteUsageFileCounts newSharePointSiteUsageFileCounts) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ISharePointSiteUsageFileCountsRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ISharePointSiteUsageFileCountsRequest expand(final String value);

}

