// Template Source: IBaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDirectoryObjectGetUserOwnedObjectsRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Directory Object Get User Owned Objects Request Builder.
 */
public interface IDirectoryObjectGetUserOwnedObjectsRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IDirectoryObjectGetUserOwnedObjectsRequest
     *
     * @param requestOptions the options for the request
     * @return the IDirectoryObjectGetUserOwnedObjectsRequest instance
     */
    IDirectoryObjectGetUserOwnedObjectsRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IDirectoryObjectGetUserOwnedObjectsRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IDirectoryObjectGetUserOwnedObjectsRequest instance
     */
    IDirectoryObjectGetUserOwnedObjectsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
