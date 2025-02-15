// Template Source: IBaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsCategory;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsMetricCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsMetricRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.UserExperienceAnalyticsCategory;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the User Experience Analytics Category Reference Request.
 */
public interface IUserExperienceAnalyticsCategoryReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super UserExperienceAnalyticsCategory> callback);

    UserExperienceAnalyticsCategory delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IUserExperienceAnalyticsCategoryReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IUserExperienceAnalyticsCategoryReferenceRequest expand(final String value);

    /**
     * Puts the UserExperienceAnalyticsCategory
     *
     * @param srcUserExperienceAnalyticsCategory the UserExperienceAnalyticsCategory to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(UserExperienceAnalyticsCategory srcUserExperienceAnalyticsCategory, final ICallback<? super UserExperienceAnalyticsCategory> callback);

    /**
     * Puts the UserExperienceAnalyticsCategory
     *
     * @param srcUserExperienceAnalyticsCategory the UserExperienceAnalyticsCategory to PUT
     * @return the UserExperienceAnalyticsCategory
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    UserExperienceAnalyticsCategory put(UserExperienceAnalyticsCategory srcUserExperienceAnalyticsCategory) throws ClientException;
}
