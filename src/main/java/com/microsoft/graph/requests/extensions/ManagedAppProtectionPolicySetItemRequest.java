// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedAppProtectionPolicySetItem;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed App Protection Policy Set Item Request.
 */
public class ManagedAppProtectionPolicySetItemRequest extends BaseRequest implements IManagedAppProtectionPolicySetItemRequest {
	
    /**
     * The request for the ManagedAppProtectionPolicySetItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedAppProtectionPolicySetItemRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedAppProtectionPolicySetItem.class);
    }

    /**
     * Gets the ManagedAppProtectionPolicySetItem from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super ManagedAppProtectionPolicySetItem> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ManagedAppProtectionPolicySetItem from the service
     *
     * @return the ManagedAppProtectionPolicySetItem from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedAppProtectionPolicySetItem get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super ManagedAppProtectionPolicySetItem> callback) {
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
     * Patches this ManagedAppProtectionPolicySetItem with a source
     *
     * @param sourceManagedAppProtectionPolicySetItem the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ManagedAppProtectionPolicySetItem sourceManagedAppProtectionPolicySetItem, final ICallback<? super ManagedAppProtectionPolicySetItem> callback) {
        send(HttpMethod.PATCH, callback, sourceManagedAppProtectionPolicySetItem);
    }

    /**
     * Patches this ManagedAppProtectionPolicySetItem with a source
     *
     * @param sourceManagedAppProtectionPolicySetItem the source object with updates
     * @return the updated ManagedAppProtectionPolicySetItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedAppProtectionPolicySetItem patch(final ManagedAppProtectionPolicySetItem sourceManagedAppProtectionPolicySetItem) throws ClientException {
        return send(HttpMethod.PATCH, sourceManagedAppProtectionPolicySetItem);
    }

    /**
     * Creates a ManagedAppProtectionPolicySetItem with a new object
     *
     * @param newManagedAppProtectionPolicySetItem the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ManagedAppProtectionPolicySetItem newManagedAppProtectionPolicySetItem, final ICallback<? super ManagedAppProtectionPolicySetItem> callback) {
        send(HttpMethod.POST, callback, newManagedAppProtectionPolicySetItem);
    }

    /**
     * Creates a ManagedAppProtectionPolicySetItem with a new object
     *
     * @param newManagedAppProtectionPolicySetItem the new object to create
     * @return the created ManagedAppProtectionPolicySetItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedAppProtectionPolicySetItem post(final ManagedAppProtectionPolicySetItem newManagedAppProtectionPolicySetItem) throws ClientException {
        return send(HttpMethod.POST, newManagedAppProtectionPolicySetItem);
    }

    /**
     * Creates a ManagedAppProtectionPolicySetItem with a new object
     *
     * @param newManagedAppProtectionPolicySetItem the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final ManagedAppProtectionPolicySetItem newManagedAppProtectionPolicySetItem, final ICallback<? super ManagedAppProtectionPolicySetItem> callback) {
        send(HttpMethod.PUT, callback, newManagedAppProtectionPolicySetItem);
    }

    /**
     * Creates a ManagedAppProtectionPolicySetItem with a new object
     *
     * @param newManagedAppProtectionPolicySetItem the object to create/update
     * @return the created ManagedAppProtectionPolicySetItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedAppProtectionPolicySetItem put(final ManagedAppProtectionPolicySetItem newManagedAppProtectionPolicySetItem) throws ClientException {
        return send(HttpMethod.PUT, newManagedAppProtectionPolicySetItem);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IManagedAppProtectionPolicySetItemRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ManagedAppProtectionPolicySetItemRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IManagedAppProtectionPolicySetItemRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ManagedAppProtectionPolicySetItemRequest)this;
     }

}

