// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsMobileMSI;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Mobile MSIRequest Builder.
 */
public class WindowsMobileMSIRequestBuilder extends BaseRequestBuilder implements IWindowsMobileMSIRequestBuilder {

    /**
     * The request builder for the WindowsMobileMSI
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsMobileMSIRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IWindowsMobileMSIRequest instance
     */
    public IWindowsMobileMSIRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IWindowsMobileMSIRequest instance
     */
    public IWindowsMobileMSIRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.WindowsMobileMSIRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IMobileAppAssignmentCollectionRequestBuilder assignments() {
        return new MobileAppAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    public IMobileAppAssignmentRequestBuilder assignments(final String id) {
        return new MobileAppAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }
    public IMobileAppCategoryCollectionWithReferencesRequestBuilder categories() {
        return new MobileAppCategoryCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("categories"), getClient(), null);
    }

    public IMobileAppCategoryWithReferenceRequestBuilder categories(final String id) {
        return new MobileAppCategoryWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("categories") + "/" + id, getClient(), null);
    }
    public IMobileAppInstallStatusCollectionRequestBuilder deviceStatuses() {
        return new MobileAppInstallStatusCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatuses"), getClient(), null);
    }

    public IMobileAppInstallStatusRequestBuilder deviceStatuses(final String id) {
        return new MobileAppInstallStatusRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatuses") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for MobileAppInstallSummary
     *
     * @return the IMobileAppInstallSummaryRequestBuilder instance
     */
    public IMobileAppInstallSummaryRequestBuilder installSummary() {
        return new MobileAppInstallSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("installSummary"), getClient(), null);
    }
    public IMobileAppRelationshipCollectionRequestBuilder relationships() {
        return new MobileAppRelationshipCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("relationships"), getClient(), null);
    }

    public IMobileAppRelationshipRequestBuilder relationships(final String id) {
        return new MobileAppRelationshipRequestBuilder(getRequestUrlWithAdditionalSegment("relationships") + "/" + id, getClient(), null);
    }
    public IUserAppInstallStatusCollectionRequestBuilder userStatuses() {
        return new UserAppInstallStatusCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("userStatuses"), getClient(), null);
    }

    public IUserAppInstallStatusRequestBuilder userStatuses(final String id) {
        return new UserAppInstallStatusRequestBuilder(getRequestUrlWithAdditionalSegment("userStatuses") + "/" + id, getClient(), null);
    }
    public IMobileAppContentCollectionRequestBuilder contentVersions() {
        return new MobileAppContentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("contentVersions"), getClient(), null);
    }

    public IMobileAppContentRequestBuilder contentVersions(final String id) {
        return new MobileAppContentRequestBuilder(getRequestUrlWithAdditionalSegment("contentVersions") + "/" + id, getClient(), null);
    }
}
