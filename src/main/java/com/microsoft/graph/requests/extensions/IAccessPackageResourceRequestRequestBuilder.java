// Template Source: IBaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AccessPackageResourceRequest;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageSubjectRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Access Package Resource Request Request Builder.
 */
public interface IAccessPackageResourceRequestRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IAccessPackageResourceRequestRequest instance
     */
    IAccessPackageResourceRequestRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IAccessPackageResourceRequestRequest instance
     */
    IAccessPackageResourceRequestRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    /**
     * Gets the request builder for AccessPackageResource
     *
     * @return the IAccessPackageResourceWithReferenceRequestBuilder instance
     */
    IAccessPackageResourceWithReferenceRequestBuilder accessPackageResource();

    /**
     * Gets the request builder for AccessPackageSubject
     *
     * @return the IAccessPackageSubjectRequestBuilder instance
     */
    IAccessPackageSubjectRequestBuilder requestor();

}