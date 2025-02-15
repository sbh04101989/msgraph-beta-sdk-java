// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UnsupportedGroupPolicyExtension;
import com.microsoft.graph.requests.extensions.IUnsupportedGroupPolicyExtensionCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.UnsupportedGroupPolicyExtensionCollectionPage;
import com.microsoft.graph.requests.extensions.UnsupportedGroupPolicyExtensionCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unsupported Group Policy Extension Collection Page.
 */
public class UnsupportedGroupPolicyExtensionCollectionPage extends BaseCollectionPage<UnsupportedGroupPolicyExtension, IUnsupportedGroupPolicyExtensionCollectionRequestBuilder> implements IUnsupportedGroupPolicyExtensionCollectionPage {

    /**
     * A collection page for UnsupportedGroupPolicyExtension
     *
     * @param response the serialized UnsupportedGroupPolicyExtensionCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public UnsupportedGroupPolicyExtensionCollectionPage(final UnsupportedGroupPolicyExtensionCollectionResponse response, final IUnsupportedGroupPolicyExtensionCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
