// Template Source: BaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GroupPolicyCategory;
import com.microsoft.graph.requests.extensions.IGroupPolicyCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionFileRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionFileRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Category Reference Request.
 */
public class GroupPolicyCategoryReferenceRequest extends BaseRequest implements IGroupPolicyCategoryReferenceRequest {

    /**
     * The request for the GroupPolicyCategory
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupPolicyCategoryReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GroupPolicyCategory.class);
    }

    public void delete(final ICallback<? super GroupPolicyCategory> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public GroupPolicyCategory delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IGroupPolicyCategoryReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (GroupPolicyCategoryReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IGroupPolicyCategoryReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (GroupPolicyCategoryReferenceRequest)this;
    }
    /**
     * Puts the GroupPolicyCategory
     *
     * @param srcGroupPolicyCategory the GroupPolicyCategory reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(GroupPolicyCategory srcGroupPolicyCategory, final ICallback<? super GroupPolicyCategory> callback) {
        send(HttpMethod.PUT, callback, srcGroupPolicyCategory);
    }

    /**
     * Puts the GroupPolicyCategory
     *
     * @param srcGroupPolicyCategory the GroupPolicyCategory reference to PUT
     * @return the GroupPolicyCategory
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public GroupPolicyCategory put(GroupPolicyCategory srcGroupPolicyCategory) throws ClientException {
        return send(HttpMethod.PUT, srcGroupPolicyCategory);
    }
}
