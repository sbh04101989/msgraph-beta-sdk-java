// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.RiskDetection;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Risk Detection Request.
 */
public interface IRiskDetectionRequest extends IHttpRequest {

    /**
     * Gets the RiskDetection from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super RiskDetection> callback);

    /**
     * Gets the RiskDetection from the service
     *
     * @return the RiskDetection from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    RiskDetection get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super RiskDetection> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this RiskDetection with a source
     *
     * @param sourceRiskDetection the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final RiskDetection sourceRiskDetection, final ICallback<? super RiskDetection> callback);

    /**
     * Patches this RiskDetection with a source
     *
     * @param sourceRiskDetection the source object with updates
     * @return the updated RiskDetection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    RiskDetection patch(final RiskDetection sourceRiskDetection) throws ClientException;

    /**
     * Posts a RiskDetection with a new object
     *
     * @param newRiskDetection the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final RiskDetection newRiskDetection, final ICallback<? super RiskDetection> callback);

    /**
     * Posts a RiskDetection with a new object
     *
     * @param newRiskDetection the new object to create
     * @return the created RiskDetection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    RiskDetection post(final RiskDetection newRiskDetection) throws ClientException;

    /**
     * Posts a RiskDetection with a new object
     *
     * @param newRiskDetection the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final RiskDetection newRiskDetection, final ICallback<? super RiskDetection> callback);

    /**
     * Posts a RiskDetection with a new object
     *
     * @param newRiskDetection the object to create/update
     * @return the created RiskDetection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    RiskDetection put(final RiskDetection newRiskDetection) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IRiskDetectionRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IRiskDetectionRequest expand(final String value);

}

