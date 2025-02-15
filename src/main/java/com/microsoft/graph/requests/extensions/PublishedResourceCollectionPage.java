// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PublishedResource;
import com.microsoft.graph.requests.extensions.IPublishedResourceCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.PublishedResourceCollectionPage;
import com.microsoft.graph.requests.extensions.PublishedResourceCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Published Resource Collection Page.
 */
public class PublishedResourceCollectionPage extends BaseCollectionPage<PublishedResource, IPublishedResourceCollectionRequestBuilder> implements IPublishedResourceCollectionPage {

    /**
     * A collection page for PublishedResource
     *
     * @param response the serialized PublishedResourceCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public PublishedResourceCollectionPage(final PublishedResourceCollectionResponse response, final IPublishedResourceCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
