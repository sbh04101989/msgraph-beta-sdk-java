// Template Source: IBaseEntityWithReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DepMacOSEnrollmentProfile;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.DepMacOSEnrollmentProfile;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Dep Mac OSEnrollment Profile With Reference Request.
 */
public interface IDepMacOSEnrollmentProfileWithReferenceRequest extends IHttpRequest {

    void post(final DepMacOSEnrollmentProfile newDepMacOSEnrollmentProfile, final IJsonBackedObject payload, final ICallback<? super DepMacOSEnrollmentProfile> callback);

    DepMacOSEnrollmentProfile post(final DepMacOSEnrollmentProfile newDepMacOSEnrollmentProfile, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super DepMacOSEnrollmentProfile> callback);

    DepMacOSEnrollmentProfile get() throws ClientException;

	void delete(final ICallback<? super DepMacOSEnrollmentProfile> callback);

	void delete() throws ClientException;

	void patch(final DepMacOSEnrollmentProfile sourceDepMacOSEnrollmentProfile, final ICallback<? super DepMacOSEnrollmentProfile> callback);

	DepMacOSEnrollmentProfile patch(final DepMacOSEnrollmentProfile sourceDepMacOSEnrollmentProfile) throws ClientException;

    IDepMacOSEnrollmentProfileWithReferenceRequest select(final String value);

    IDepMacOSEnrollmentProfileWithReferenceRequest expand(final String value);

}
