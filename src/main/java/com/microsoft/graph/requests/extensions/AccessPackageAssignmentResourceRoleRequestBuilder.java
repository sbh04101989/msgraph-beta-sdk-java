// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AccessPackageAssignmentResourceRole;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceRoleRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageResourceRoleRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceScopeRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageResourceScopeRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageSubjectRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageSubjectRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Assignment Resource Role Request Builder.
 */
public class AccessPackageAssignmentResourceRoleRequestBuilder extends BaseRequestBuilder implements IAccessPackageAssignmentResourceRoleRequestBuilder {

    /**
     * The request builder for the AccessPackageAssignmentResourceRole
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessPackageAssignmentResourceRoleRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IAccessPackageAssignmentResourceRoleRequest instance
     */
    public IAccessPackageAssignmentResourceRoleRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IAccessPackageAssignmentResourceRoleRequest instance
     */
    public IAccessPackageAssignmentResourceRoleRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.AccessPackageAssignmentResourceRoleRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IAccessPackageAssignmentCollectionRequestBuilder accessPackageAssignments() {
        return new AccessPackageAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("accessPackageAssignments"), getClient(), null);
    }

    public IAccessPackageAssignmentRequestBuilder accessPackageAssignments(final String id) {
        return new AccessPackageAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("accessPackageAssignments") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for AccessPackageResourceRole
     *
     * @return the IAccessPackageResourceRoleRequestBuilder instance
     */
    public IAccessPackageResourceRoleRequestBuilder accessPackageResourceRole() {
        return new AccessPackageResourceRoleRequestBuilder(getRequestUrlWithAdditionalSegment("accessPackageResourceRole"), getClient(), null);
    }

    /**
     * Gets the request builder for AccessPackageResourceScope
     *
     * @return the IAccessPackageResourceScopeRequestBuilder instance
     */
    public IAccessPackageResourceScopeRequestBuilder accessPackageResourceScope() {
        return new AccessPackageResourceScopeRequestBuilder(getRequestUrlWithAdditionalSegment("accessPackageResourceScope"), getClient(), null);
    }

    /**
     * Gets the request builder for AccessPackageSubject
     *
     * @return the IAccessPackageSubjectRequestBuilder instance
     */
    public IAccessPackageSubjectRequestBuilder accessPackageSubject() {
        return new AccessPackageSubjectRequestBuilder(getRequestUrlWithAdditionalSegment("accessPackageSubject"), getClient(), null);
    }
}
