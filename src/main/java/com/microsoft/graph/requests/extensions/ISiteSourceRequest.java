// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SiteSource;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Site Source Request.
 */
public interface ISiteSourceRequest extends IHttpRequest {

    /**
     * Gets the SiteSource from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super SiteSource> callback);

    /**
     * Gets the SiteSource from the service
     *
     * @return the SiteSource from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SiteSource get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super SiteSource> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this SiteSource with a source
     *
     * @param sourceSiteSource the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final SiteSource sourceSiteSource, final ICallback<? super SiteSource> callback);

    /**
     * Patches this SiteSource with a source
     *
     * @param sourceSiteSource the source object with updates
     * @return the updated SiteSource
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SiteSource patch(final SiteSource sourceSiteSource) throws ClientException;

    /**
     * Posts a SiteSource with a new object
     *
     * @param newSiteSource the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final SiteSource newSiteSource, final ICallback<? super SiteSource> callback);

    /**
     * Posts a SiteSource with a new object
     *
     * @param newSiteSource the new object to create
     * @return the created SiteSource
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SiteSource post(final SiteSource newSiteSource) throws ClientException;

    /**
     * Posts a SiteSource with a new object
     *
     * @param newSiteSource the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final SiteSource newSiteSource, final ICallback<? super SiteSource> callback);

    /**
     * Posts a SiteSource with a new object
     *
     * @param newSiteSource the object to create/update
     * @return the created SiteSource
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SiteSource put(final SiteSource newSiteSource) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ISiteSourceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ISiteSourceRequest expand(final String value);

}

