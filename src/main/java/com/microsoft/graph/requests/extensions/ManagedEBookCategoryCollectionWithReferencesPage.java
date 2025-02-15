// Template Source: BaseEntityCollectionWithReferencesPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedEBook;
import com.microsoft.graph.models.extensions.ManagedEBookCategory;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IManagedEBookCategoryCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedEBookCategoryCollectionWithReferencesPage;
import com.microsoft.graph.requests.extensions.ManagedEBookCategoryCollectionResponse;
import com.microsoft.graph.models.extensions.ManagedEBookCategory;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed EBook Category Collection With References Page.
 */
public class ManagedEBookCategoryCollectionWithReferencesPage extends BaseCollectionPage<ManagedEBookCategory, IManagedEBookCategoryCollectionWithReferencesRequestBuilder> implements IManagedEBookCategoryCollectionWithReferencesPage {

    /**
     * A collection page for ManagedEBookCategory
     *
     * @param response the serialized ManagedEBookCategoryCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ManagedEBookCategoryCollectionWithReferencesPage(final ManagedEBookCategoryCollectionResponse response, final IManagedEBookCategoryCollectionWithReferencesRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
