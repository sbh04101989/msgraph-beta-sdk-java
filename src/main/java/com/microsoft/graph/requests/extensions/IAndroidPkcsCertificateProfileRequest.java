// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AndroidPkcsCertificateProfile;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Android Pkcs Certificate Profile Request.
 */
public interface IAndroidPkcsCertificateProfileRequest extends IHttpRequest {

    /**
     * Gets the AndroidPkcsCertificateProfile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super AndroidPkcsCertificateProfile> callback);

    /**
     * Gets the AndroidPkcsCertificateProfile from the service
     *
     * @return the AndroidPkcsCertificateProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidPkcsCertificateProfile get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super AndroidPkcsCertificateProfile> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AndroidPkcsCertificateProfile with a source
     *
     * @param sourceAndroidPkcsCertificateProfile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AndroidPkcsCertificateProfile sourceAndroidPkcsCertificateProfile, final ICallback<? super AndroidPkcsCertificateProfile> callback);

    /**
     * Patches this AndroidPkcsCertificateProfile with a source
     *
     * @param sourceAndroidPkcsCertificateProfile the source object with updates
     * @return the updated AndroidPkcsCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidPkcsCertificateProfile patch(final AndroidPkcsCertificateProfile sourceAndroidPkcsCertificateProfile) throws ClientException;

    /**
     * Posts a AndroidPkcsCertificateProfile with a new object
     *
     * @param newAndroidPkcsCertificateProfile the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AndroidPkcsCertificateProfile newAndroidPkcsCertificateProfile, final ICallback<? super AndroidPkcsCertificateProfile> callback);

    /**
     * Posts a AndroidPkcsCertificateProfile with a new object
     *
     * @param newAndroidPkcsCertificateProfile the new object to create
     * @return the created AndroidPkcsCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidPkcsCertificateProfile post(final AndroidPkcsCertificateProfile newAndroidPkcsCertificateProfile) throws ClientException;

    /**
     * Posts a AndroidPkcsCertificateProfile with a new object
     *
     * @param newAndroidPkcsCertificateProfile the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final AndroidPkcsCertificateProfile newAndroidPkcsCertificateProfile, final ICallback<? super AndroidPkcsCertificateProfile> callback);

    /**
     * Posts a AndroidPkcsCertificateProfile with a new object
     *
     * @param newAndroidPkcsCertificateProfile the object to create/update
     * @return the created AndroidPkcsCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidPkcsCertificateProfile put(final AndroidPkcsCertificateProfile newAndroidPkcsCertificateProfile) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAndroidPkcsCertificateProfileRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAndroidPkcsCertificateProfileRequest expand(final String value);

}

