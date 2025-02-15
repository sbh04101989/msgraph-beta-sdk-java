// Template Source: IBaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MobileAppContent;
import com.microsoft.graph.requests.extensions.IMobileContainedAppCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileContainedAppRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppContentFileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppContentFileRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Mobile App Content Request Builder.
 */
public interface IMobileAppContentRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IMobileAppContentRequest instance
     */
    IMobileAppContentRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IMobileAppContentRequest instance
     */
    IMobileAppContentRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IMobileContainedAppCollectionRequestBuilder containedApps();

    IMobileContainedAppRequestBuilder containedApps(final String id);

    IMobileAppContentFileCollectionRequestBuilder files();

    IMobileAppContentFileRequestBuilder files(final String id);

}