// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WorkPosition;
import com.microsoft.graph.requests.extensions.IWorkPositionCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.WorkPositionCollectionPage;
import com.microsoft.graph.requests.extensions.WorkPositionCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Work Position Collection Page.
 */
public class WorkPositionCollectionPage extends BaseCollectionPage<WorkPosition, IWorkPositionCollectionRequestBuilder> implements IWorkPositionCollectionPage {

    /**
     * A collection page for WorkPosition
     *
     * @param response the serialized WorkPositionCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public WorkPositionCollectionPage(final WorkPositionCollectionResponse response, final IWorkPositionCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
