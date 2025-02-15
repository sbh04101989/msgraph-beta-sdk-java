// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsAppHealthDevicePerformanceDetails;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsAppHealthDevicePerformanceDetailsCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthDevicePerformanceDetailsCollectionPage;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthDevicePerformanceDetailsCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics App Health Device Performance Details Collection Page.
 */
public class UserExperienceAnalyticsAppHealthDevicePerformanceDetailsCollectionPage extends BaseCollectionPage<UserExperienceAnalyticsAppHealthDevicePerformanceDetails, IUserExperienceAnalyticsAppHealthDevicePerformanceDetailsCollectionRequestBuilder> implements IUserExperienceAnalyticsAppHealthDevicePerformanceDetailsCollectionPage {

    /**
     * A collection page for UserExperienceAnalyticsAppHealthDevicePerformanceDetails
     *
     * @param response the serialized UserExperienceAnalyticsAppHealthDevicePerformanceDetailsCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public UserExperienceAnalyticsAppHealthDevicePerformanceDetailsCollectionPage(final UserExperienceAnalyticsAppHealthDevicePerformanceDetailsCollectionResponse response, final IUserExperienceAnalyticsAppHealthDevicePerformanceDetailsCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
