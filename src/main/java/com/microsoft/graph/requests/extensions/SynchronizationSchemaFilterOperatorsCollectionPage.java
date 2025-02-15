// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.FilterOperatorSchema;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ISynchronizationSchemaFilterOperatorsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SynchronizationSchemaFilterOperatorsCollectionPage;
import com.microsoft.graph.requests.extensions.SynchronizationSchemaFilterOperatorsCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Synchronization Schema Filter Operators Collection Page.
 */
public class SynchronizationSchemaFilterOperatorsCollectionPage extends BaseCollectionPage<FilterOperatorSchema, ISynchronizationSchemaFilterOperatorsCollectionRequestBuilder> implements ISynchronizationSchemaFilterOperatorsCollectionPage {

    /**
     * A collection page for FilterOperatorSchema.
     *
     * @param response The serialized SynchronizationSchemaFilterOperatorsCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public SynchronizationSchemaFilterOperatorsCollectionPage(final SynchronizationSchemaFilterOperatorsCollectionResponse response, final ISynchronizationSchemaFilterOperatorsCollectionRequestBuilder builder) {
       super(response.value, builder, response.additionalDataManager());
    }
}
