// Template Source: IBaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DataClassificationService;
import com.microsoft.graph.models.extensions.ExactMatchUploadAgent;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IExactMatchUploadAgentRequestBuilder;
import com.microsoft.graph.requests.extensions.IExactMatchUploadAgentCollectionRequest;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Exact Match Upload Agent Collection Request Builder.
 */
public interface IExactMatchUploadAgentCollectionRequestBuilder extends IRequestBuilder {

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    IExactMatchUploadAgentCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    IExactMatchUploadAgentCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IExactMatchUploadAgentRequestBuilder byId(final String id);

}
