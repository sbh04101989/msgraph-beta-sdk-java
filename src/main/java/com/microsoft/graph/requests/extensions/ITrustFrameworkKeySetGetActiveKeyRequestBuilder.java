// Template Source: IBaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ITrustFrameworkKeySetGetActiveKeyRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Trust Framework Key Set Get Active Key Request Builder.
 */
public interface ITrustFrameworkKeySetGetActiveKeyRequestBuilder extends IRequestBuilder {

    /**
     * Creates the ITrustFrameworkKeySetGetActiveKeyRequest
     *
     * @param requestOptions the options for the request
     * @return the ITrustFrameworkKeySetGetActiveKeyRequest instance
     */
    ITrustFrameworkKeySetGetActiveKeyRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the ITrustFrameworkKeySetGetActiveKeyRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the ITrustFrameworkKeySetGetActiveKeyRequest instance
     */
    ITrustFrameworkKeySetGetActiveKeyRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
