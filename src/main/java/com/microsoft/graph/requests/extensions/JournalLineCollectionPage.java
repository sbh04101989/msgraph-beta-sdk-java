// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.JournalLine;
import com.microsoft.graph.requests.extensions.IJournalLineCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.JournalLineCollectionPage;
import com.microsoft.graph.requests.extensions.JournalLineCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Journal Line Collection Page.
 */
public class JournalLineCollectionPage extends BaseCollectionPage<JournalLine, IJournalLineCollectionRequestBuilder> implements IJournalLineCollectionPage {

    /**
     * A collection page for JournalLine
     *
     * @param response the serialized JournalLineCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public JournalLineCollectionPage(final JournalLineCollectionResponse response, final IJournalLineCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
