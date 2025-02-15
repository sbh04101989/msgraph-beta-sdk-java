// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IEducationAssignmentPublishRequest;
import com.microsoft.graph.requests.extensions.EducationAssignmentPublishRequest;
import com.microsoft.graph.models.extensions.EducationAssignment;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Assignment Publish Request Builder.
 */
public class EducationAssignmentPublishRequestBuilder extends BaseActionRequestBuilder implements IEducationAssignmentPublishRequestBuilder {

    /**
     * The request builder for this EducationAssignmentPublish
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationAssignmentPublishRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IEducationAssignmentPublishRequest
     *
     * @param requestOptions the options for the request
     * @return the IEducationAssignmentPublishRequest instance
     */
    public IEducationAssignmentPublishRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IEducationAssignmentPublishRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IEducationAssignmentPublishRequest instance
     */
    public IEducationAssignmentPublishRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        EducationAssignmentPublishRequest request = new EducationAssignmentPublishRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
