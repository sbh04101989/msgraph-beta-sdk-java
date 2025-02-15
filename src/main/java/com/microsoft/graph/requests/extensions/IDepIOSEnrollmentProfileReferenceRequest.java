// Template Source: IBaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DepIOSEnrollmentProfile;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.DepIOSEnrollmentProfile;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Dep IOSEnrollment Profile Reference Request.
 */
public interface IDepIOSEnrollmentProfileReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super DepIOSEnrollmentProfile> callback);

    DepIOSEnrollmentProfile delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDepIOSEnrollmentProfileReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDepIOSEnrollmentProfileReferenceRequest expand(final String value);

    /**
     * Puts the DepIOSEnrollmentProfile
     *
     * @param srcDepIOSEnrollmentProfile the DepIOSEnrollmentProfile to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(DepIOSEnrollmentProfile srcDepIOSEnrollmentProfile, final ICallback<? super DepIOSEnrollmentProfile> callback);

    /**
     * Puts the DepIOSEnrollmentProfile
     *
     * @param srcDepIOSEnrollmentProfile the DepIOSEnrollmentProfile to PUT
     * @return the DepIOSEnrollmentProfile
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    DepIOSEnrollmentProfile put(DepIOSEnrollmentProfile srcDepIOSEnrollmentProfile) throws ClientException;
}
