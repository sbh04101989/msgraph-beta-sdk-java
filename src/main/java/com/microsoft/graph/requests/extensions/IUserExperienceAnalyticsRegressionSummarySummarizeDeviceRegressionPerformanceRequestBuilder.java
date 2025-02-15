// Template Source: IBaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsRegressionSummarySummarizeDeviceRegressionPerformanceRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the User Experience Analytics Regression Summary Summarize Device Regression Performance Request Builder.
 */
public interface IUserExperienceAnalyticsRegressionSummarySummarizeDeviceRegressionPerformanceRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IUserExperienceAnalyticsRegressionSummarySummarizeDeviceRegressionPerformanceRequest
     *
     * @param requestOptions the options for the request
     * @return the IUserExperienceAnalyticsRegressionSummarySummarizeDeviceRegressionPerformanceRequest instance
     */
    IUserExperienceAnalyticsRegressionSummarySummarizeDeviceRegressionPerformanceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IUserExperienceAnalyticsRegressionSummarySummarizeDeviceRegressionPerformanceRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IUserExperienceAnalyticsRegressionSummarySummarizeDeviceRegressionPerformanceRequest instance
     */
    IUserExperienceAnalyticsRegressionSummarySummarizeDeviceRegressionPerformanceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IUserExperienceAnalyticsMetricCollectionRequestBuilder manufacturerRegression();

    IUserExperienceAnalyticsMetricRequestBuilder manufacturerRegression(final String id);

    IUserExperienceAnalyticsMetricCollectionRequestBuilder modelRegression();

    IUserExperienceAnalyticsMetricRequestBuilder modelRegression(final String id);

    IUserExperienceAnalyticsMetricCollectionRequestBuilder operatingSystemRegression();

    IUserExperienceAnalyticsMetricRequestBuilder operatingSystemRegression(final String id);
}
