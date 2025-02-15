// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SiteActivitySummary;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IReportRootGetSharePointActivityFileCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSharePointActivityFileCountsCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetSharePointActivityFileCountsCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Share Point Activity File Counts Collection Page.
 */
public class ReportRootGetSharePointActivityFileCountsCollectionPage extends BaseCollectionPage<SiteActivitySummary, IReportRootGetSharePointActivityFileCountsCollectionRequestBuilder> implements IReportRootGetSharePointActivityFileCountsCollectionPage {

    /**
     * A collection page for SiteActivitySummary.
     *
     * @param response The serialized ReportRootGetSharePointActivityFileCountsCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ReportRootGetSharePointActivityFileCountsCollectionPage(final ReportRootGetSharePointActivityFileCountsCollectionResponse response, final IReportRootGetSharePointActivityFileCountsCollectionRequestBuilder builder) {
       super(response.value, builder, response.additionalDataManager());
    }
}
