// Template Source: BaseEntityWithReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GovernanceRoleAssignment;
import com.microsoft.graph.requests.extensions.IGovernanceRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceRoleDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceSubjectRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceSubjectRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Governance Role Assignment With Reference Request.
 */
public class GovernanceRoleAssignmentWithReferenceRequest extends BaseRequest implements IGovernanceRoleAssignmentWithReferenceRequest {

    /**
     * The request for the GovernanceRoleAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GovernanceRoleAssignmentWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GovernanceRoleAssignment.class);
    }

    public void post(final GovernanceRoleAssignment newGovernanceRoleAssignment, final IJsonBackedObject payload, final ICallback<? super GovernanceRoleAssignment> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public GovernanceRoleAssignment post(final GovernanceRoleAssignment newGovernanceRoleAssignment, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newGovernanceRoleAssignment;
        }
        return null;
    }

    public void get(final ICallback<? super GovernanceRoleAssignment> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public GovernanceRoleAssignment get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<? super GovernanceRoleAssignment> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final GovernanceRoleAssignment sourceGovernanceRoleAssignment, final ICallback<? super GovernanceRoleAssignment> callback) {
		send(HttpMethod.PATCH, callback, sourceGovernanceRoleAssignment);
	}

	public GovernanceRoleAssignment patch(final GovernanceRoleAssignment sourceGovernanceRoleAssignment) throws ClientException {
		return send(HttpMethod.PATCH, sourceGovernanceRoleAssignment);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IGovernanceRoleAssignmentWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IGovernanceRoleAssignmentWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IGovernanceRoleAssignmentWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (GovernanceRoleAssignmentWithReferenceRequest)this;
    }
}
