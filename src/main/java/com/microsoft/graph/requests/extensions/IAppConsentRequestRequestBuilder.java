// Template Source: IBaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AppConsentRequest;
import com.microsoft.graph.requests.extensions.IUserConsentRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserConsentRequestRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the App Consent Request Request Builder.
 */
public interface IAppConsentRequestRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IAppConsentRequestRequest instance
     */
    IAppConsentRequestRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IAppConsentRequestRequest instance
     */
    IAppConsentRequestRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IUserConsentRequestCollectionRequestBuilder userConsentRequests();

    IUserConsentRequestRequestBuilder userConsentRequests(final String id);

}