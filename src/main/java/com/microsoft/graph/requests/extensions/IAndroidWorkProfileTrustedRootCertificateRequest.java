// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AndroidWorkProfileTrustedRootCertificate;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Android Work Profile Trusted Root Certificate Request.
 */
public interface IAndroidWorkProfileTrustedRootCertificateRequest extends IHttpRequest {

    /**
     * Gets the AndroidWorkProfileTrustedRootCertificate from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super AndroidWorkProfileTrustedRootCertificate> callback);

    /**
     * Gets the AndroidWorkProfileTrustedRootCertificate from the service
     *
     * @return the AndroidWorkProfileTrustedRootCertificate from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidWorkProfileTrustedRootCertificate get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super AndroidWorkProfileTrustedRootCertificate> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AndroidWorkProfileTrustedRootCertificate with a source
     *
     * @param sourceAndroidWorkProfileTrustedRootCertificate the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AndroidWorkProfileTrustedRootCertificate sourceAndroidWorkProfileTrustedRootCertificate, final ICallback<? super AndroidWorkProfileTrustedRootCertificate> callback);

    /**
     * Patches this AndroidWorkProfileTrustedRootCertificate with a source
     *
     * @param sourceAndroidWorkProfileTrustedRootCertificate the source object with updates
     * @return the updated AndroidWorkProfileTrustedRootCertificate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidWorkProfileTrustedRootCertificate patch(final AndroidWorkProfileTrustedRootCertificate sourceAndroidWorkProfileTrustedRootCertificate) throws ClientException;

    /**
     * Posts a AndroidWorkProfileTrustedRootCertificate with a new object
     *
     * @param newAndroidWorkProfileTrustedRootCertificate the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AndroidWorkProfileTrustedRootCertificate newAndroidWorkProfileTrustedRootCertificate, final ICallback<? super AndroidWorkProfileTrustedRootCertificate> callback);

    /**
     * Posts a AndroidWorkProfileTrustedRootCertificate with a new object
     *
     * @param newAndroidWorkProfileTrustedRootCertificate the new object to create
     * @return the created AndroidWorkProfileTrustedRootCertificate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidWorkProfileTrustedRootCertificate post(final AndroidWorkProfileTrustedRootCertificate newAndroidWorkProfileTrustedRootCertificate) throws ClientException;

    /**
     * Posts a AndroidWorkProfileTrustedRootCertificate with a new object
     *
     * @param newAndroidWorkProfileTrustedRootCertificate the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final AndroidWorkProfileTrustedRootCertificate newAndroidWorkProfileTrustedRootCertificate, final ICallback<? super AndroidWorkProfileTrustedRootCertificate> callback);

    /**
     * Posts a AndroidWorkProfileTrustedRootCertificate with a new object
     *
     * @param newAndroidWorkProfileTrustedRootCertificate the object to create/update
     * @return the created AndroidWorkProfileTrustedRootCertificate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidWorkProfileTrustedRootCertificate put(final AndroidWorkProfileTrustedRootCertificate newAndroidWorkProfileTrustedRootCertificate) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAndroidWorkProfileTrustedRootCertificateRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAndroidWorkProfileTrustedRootCertificateRequest expand(final String value);

}

