// Template Source: IBaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SecurityConfigurationTask;
import com.microsoft.graph.models.extensions.VulnerableManagedDevice;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IVulnerableManagedDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.IVulnerableManagedDeviceCollectionRequest;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Vulnerable Managed Device Collection Request Builder.
 */
public interface IVulnerableManagedDeviceCollectionRequestBuilder extends IRequestBuilder {

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    IVulnerableManagedDeviceCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    IVulnerableManagedDeviceCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IVulnerableManagedDeviceRequestBuilder byId(final String id);

}
