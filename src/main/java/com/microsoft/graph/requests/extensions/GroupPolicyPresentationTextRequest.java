// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GroupPolicyPresentationText;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Presentation Text Request.
 */
public class GroupPolicyPresentationTextRequest extends BaseRequest implements IGroupPolicyPresentationTextRequest {
	
    /**
     * The request for the GroupPolicyPresentationText
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupPolicyPresentationTextRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GroupPolicyPresentationText.class);
    }

    /**
     * Gets the GroupPolicyPresentationText from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super GroupPolicyPresentationText> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the GroupPolicyPresentationText from the service
     *
     * @return the GroupPolicyPresentationText from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GroupPolicyPresentationText get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super GroupPolicyPresentationText> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this GroupPolicyPresentationText with a source
     *
     * @param sourceGroupPolicyPresentationText the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final GroupPolicyPresentationText sourceGroupPolicyPresentationText, final ICallback<? super GroupPolicyPresentationText> callback) {
        send(HttpMethod.PATCH, callback, sourceGroupPolicyPresentationText);
    }

    /**
     * Patches this GroupPolicyPresentationText with a source
     *
     * @param sourceGroupPolicyPresentationText the source object with updates
     * @return the updated GroupPolicyPresentationText
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GroupPolicyPresentationText patch(final GroupPolicyPresentationText sourceGroupPolicyPresentationText) throws ClientException {
        return send(HttpMethod.PATCH, sourceGroupPolicyPresentationText);
    }

    /**
     * Creates a GroupPolicyPresentationText with a new object
     *
     * @param newGroupPolicyPresentationText the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final GroupPolicyPresentationText newGroupPolicyPresentationText, final ICallback<? super GroupPolicyPresentationText> callback) {
        send(HttpMethod.POST, callback, newGroupPolicyPresentationText);
    }

    /**
     * Creates a GroupPolicyPresentationText with a new object
     *
     * @param newGroupPolicyPresentationText the new object to create
     * @return the created GroupPolicyPresentationText
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GroupPolicyPresentationText post(final GroupPolicyPresentationText newGroupPolicyPresentationText) throws ClientException {
        return send(HttpMethod.POST, newGroupPolicyPresentationText);
    }

    /**
     * Creates a GroupPolicyPresentationText with a new object
     *
     * @param newGroupPolicyPresentationText the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final GroupPolicyPresentationText newGroupPolicyPresentationText, final ICallback<? super GroupPolicyPresentationText> callback) {
        send(HttpMethod.PUT, callback, newGroupPolicyPresentationText);
    }

    /**
     * Creates a GroupPolicyPresentationText with a new object
     *
     * @param newGroupPolicyPresentationText the object to create/update
     * @return the created GroupPolicyPresentationText
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GroupPolicyPresentationText put(final GroupPolicyPresentationText newGroupPolicyPresentationText) throws ClientException {
        return send(HttpMethod.PUT, newGroupPolicyPresentationText);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IGroupPolicyPresentationTextRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (GroupPolicyPresentationTextRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IGroupPolicyPresentationTextRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (GroupPolicyPresentationTextRequest)this;
     }

}

