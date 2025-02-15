// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IAccessReviewInstanceAcceptRecommendationsRequest;
import com.microsoft.graph.requests.extensions.AccessReviewInstanceAcceptRecommendationsRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Review Instance Accept Recommendations Request Builder.
 */
public class AccessReviewInstanceAcceptRecommendationsRequestBuilder extends BaseActionRequestBuilder implements IAccessReviewInstanceAcceptRecommendationsRequestBuilder {

    /**
     * The request builder for this AccessReviewInstanceAcceptRecommendations
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessReviewInstanceAcceptRecommendationsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IAccessReviewInstanceAcceptRecommendationsRequest
     *
     * @param requestOptions the options for the request
     * @return the IAccessReviewInstanceAcceptRecommendationsRequest instance
     */
    public IAccessReviewInstanceAcceptRecommendationsRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IAccessReviewInstanceAcceptRecommendationsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IAccessReviewInstanceAcceptRecommendationsRequest instance
     */
    public IAccessReviewInstanceAcceptRecommendationsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        AccessReviewInstanceAcceptRecommendationsRequest request = new AccessReviewInstanceAcceptRecommendationsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
