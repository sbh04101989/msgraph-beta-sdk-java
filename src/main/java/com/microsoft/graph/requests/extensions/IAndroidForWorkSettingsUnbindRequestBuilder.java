// Template Source: IBaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IAndroidForWorkSettingsUnbindRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Android For Work Settings Unbind Request Builder.
 */
public interface IAndroidForWorkSettingsUnbindRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IAndroidForWorkSettingsUnbindRequest
     *
     * @param requestOptions the options for the request
     * @return the IAndroidForWorkSettingsUnbindRequest instance
     */
    IAndroidForWorkSettingsUnbindRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IAndroidForWorkSettingsUnbindRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IAndroidForWorkSettingsUnbindRequest instance
     */
    IAndroidForWorkSettingsUnbindRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
