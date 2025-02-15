// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ProgramControlType;
import com.microsoft.graph.requests.extensions.IProgramControlTypeCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ProgramControlTypeCollectionPage;
import com.microsoft.graph.requests.extensions.ProgramControlTypeCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Program Control Type Collection Page.
 */
public class ProgramControlTypeCollectionPage extends BaseCollectionPage<ProgramControlType, IProgramControlTypeCollectionRequestBuilder> implements IProgramControlTypeCollectionPage {

    /**
     * A collection page for ProgramControlType
     *
     * @param response the serialized ProgramControlTypeCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ProgramControlTypeCollectionPage(final ProgramControlTypeCollectionResponse response, final IProgramControlTypeCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
