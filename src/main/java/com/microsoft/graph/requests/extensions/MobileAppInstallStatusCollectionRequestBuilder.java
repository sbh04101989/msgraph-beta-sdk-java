// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UserAppInstallStatus;
import com.microsoft.graph.models.extensions.MobileAppInstallStatus;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IMobileAppInstallStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppInstallStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppInstallStatusCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Install Status Collection Request Builder.
 */
public class MobileAppInstallStatusCollectionRequestBuilder extends BaseRequestBuilder implements IMobileAppInstallStatusCollectionRequestBuilder {

    /**
     * The request builder for this collection of UserAppInstallStatus
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MobileAppInstallStatusCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IMobileAppInstallStatusCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IMobileAppInstallStatusCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new MobileAppInstallStatusCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IMobileAppInstallStatusRequestBuilder byId(final String id) {
        return new MobileAppInstallStatusRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
