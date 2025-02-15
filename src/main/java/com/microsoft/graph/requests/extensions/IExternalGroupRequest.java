// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ExternalGroup;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the External Group Request.
 */
public interface IExternalGroupRequest extends IHttpRequest {

    /**
     * Gets the ExternalGroup from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super ExternalGroup> callback);

    /**
     * Gets the ExternalGroup from the service
     *
     * @return the ExternalGroup from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ExternalGroup get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super ExternalGroup> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ExternalGroup with a source
     *
     * @param sourceExternalGroup the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ExternalGroup sourceExternalGroup, final ICallback<? super ExternalGroup> callback);

    /**
     * Patches this ExternalGroup with a source
     *
     * @param sourceExternalGroup the source object with updates
     * @return the updated ExternalGroup
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ExternalGroup patch(final ExternalGroup sourceExternalGroup) throws ClientException;

    /**
     * Posts a ExternalGroup with a new object
     *
     * @param newExternalGroup the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ExternalGroup newExternalGroup, final ICallback<? super ExternalGroup> callback);

    /**
     * Posts a ExternalGroup with a new object
     *
     * @param newExternalGroup the new object to create
     * @return the created ExternalGroup
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ExternalGroup post(final ExternalGroup newExternalGroup) throws ClientException;

    /**
     * Posts a ExternalGroup with a new object
     *
     * @param newExternalGroup the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final ExternalGroup newExternalGroup, final ICallback<? super ExternalGroup> callback);

    /**
     * Posts a ExternalGroup with a new object
     *
     * @param newExternalGroup the object to create/update
     * @return the created ExternalGroup
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ExternalGroup put(final ExternalGroup newExternalGroup) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IExternalGroupRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IExternalGroupRequest expand(final String value);

}

