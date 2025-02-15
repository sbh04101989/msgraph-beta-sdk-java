// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AccessReview;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Access Review Request.
 */
public interface IAccessReviewRequest extends IHttpRequest {

    /**
     * Gets the AccessReview from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super AccessReview> callback);

    /**
     * Gets the AccessReview from the service
     *
     * @return the AccessReview from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AccessReview get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super AccessReview> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AccessReview with a source
     *
     * @param sourceAccessReview the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AccessReview sourceAccessReview, final ICallback<? super AccessReview> callback);

    /**
     * Patches this AccessReview with a source
     *
     * @param sourceAccessReview the source object with updates
     * @return the updated AccessReview
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AccessReview patch(final AccessReview sourceAccessReview) throws ClientException;

    /**
     * Posts a AccessReview with a new object
     *
     * @param newAccessReview the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AccessReview newAccessReview, final ICallback<? super AccessReview> callback);

    /**
     * Posts a AccessReview with a new object
     *
     * @param newAccessReview the new object to create
     * @return the created AccessReview
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AccessReview post(final AccessReview newAccessReview) throws ClientException;

    /**
     * Posts a AccessReview with a new object
     *
     * @param newAccessReview the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final AccessReview newAccessReview, final ICallback<? super AccessReview> callback);

    /**
     * Posts a AccessReview with a new object
     *
     * @param newAccessReview the object to create/update
     * @return the created AccessReview
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AccessReview put(final AccessReview newAccessReview) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAccessReviewRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAccessReviewRequest expand(final String value);

}

