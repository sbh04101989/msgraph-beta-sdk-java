
// Template Source: BaseEntityReferenceRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagementCondition;
import com.microsoft.graph.models.generated.DevicePlatformType;
import com.microsoft.graph.requests.extensions.IManagementConditionStatementCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagementConditionStatementRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagementConditionStatementCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagementConditionStatementRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Management Condition Reference Request Builder.
 */
public class ManagementConditionReferenceRequestBuilder extends BaseRequestBuilder implements IManagementConditionReferenceRequestBuilder {

    /**
     * The request builder for the ManagementCondition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagementConditionReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return The IManagementConditionReferenceRequest instance
     */
    public IManagementConditionReferenceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IManagementConditionReferenceRequest instance
     */
    public IManagementConditionReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new ManagementConditionReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }
}
