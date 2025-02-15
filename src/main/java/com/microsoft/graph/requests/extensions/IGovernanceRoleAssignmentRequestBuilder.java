// Template Source: IBaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GovernanceRoleAssignment;
import com.microsoft.graph.requests.extensions.IGovernanceRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceSubjectRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Governance Role Assignment Request Builder.
 */
public interface IGovernanceRoleAssignmentRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IGovernanceRoleAssignmentRequest instance
     */
    IGovernanceRoleAssignmentRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IGovernanceRoleAssignmentRequest instance
     */
    IGovernanceRoleAssignmentRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    /**
     * Gets the request builder for GovernanceRoleAssignment
     *
     * @return the IGovernanceRoleAssignmentWithReferenceRequestBuilder instance
     */
    IGovernanceRoleAssignmentWithReferenceRequestBuilder linkedEligibleRoleAssignment();

    /**
     * Gets the request builder for GovernanceResource
     *
     * @return the IGovernanceResourceRequestBuilder instance
     */
    IGovernanceResourceRequestBuilder resource();

    /**
     * Gets the request builder for GovernanceRoleDefinition
     *
     * @return the IGovernanceRoleDefinitionRequestBuilder instance
     */
    IGovernanceRoleDefinitionRequestBuilder roleDefinition();

    /**
     * Gets the request builder for GovernanceSubject
     *
     * @return the IGovernanceSubjectRequestBuilder instance
     */
    IGovernanceSubjectRequestBuilder subject();

}