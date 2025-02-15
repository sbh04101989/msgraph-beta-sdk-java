// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GroupPolicyDefinitionFile;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Definition File Request Builder.
 */
public class GroupPolicyDefinitionFileRequestBuilder extends BaseRequestBuilder implements IGroupPolicyDefinitionFileRequestBuilder {

    /**
     * The request builder for the GroupPolicyDefinitionFile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupPolicyDefinitionFileRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IGroupPolicyDefinitionFileRequest instance
     */
    public IGroupPolicyDefinitionFileRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IGroupPolicyDefinitionFileRequest instance
     */
    public IGroupPolicyDefinitionFileRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.GroupPolicyDefinitionFileRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IGroupPolicyDefinitionCollectionWithReferencesRequestBuilder definitions() {
        return new GroupPolicyDefinitionCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("definitions"), getClient(), null);
    }

    public IGroupPolicyDefinitionWithReferenceRequestBuilder definitions(final String id) {
        return new GroupPolicyDefinitionWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("definitions") + "/" + id, getClient(), null);
    }
}
