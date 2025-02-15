// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EntitlementManagementSettings;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Entitlement Management Settings Request.
 */
public class EntitlementManagementSettingsRequest extends BaseRequest implements IEntitlementManagementSettingsRequest {
	
    /**
     * The request for the EntitlementManagementSettings
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EntitlementManagementSettingsRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EntitlementManagementSettings.class);
    }

    /**
     * Gets the EntitlementManagementSettings from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super EntitlementManagementSettings> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the EntitlementManagementSettings from the service
     *
     * @return the EntitlementManagementSettings from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EntitlementManagementSettings get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super EntitlementManagementSettings> callback) {
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
     * Patches this EntitlementManagementSettings with a source
     *
     * @param sourceEntitlementManagementSettings the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final EntitlementManagementSettings sourceEntitlementManagementSettings, final ICallback<? super EntitlementManagementSettings> callback) {
        send(HttpMethod.PATCH, callback, sourceEntitlementManagementSettings);
    }

    /**
     * Patches this EntitlementManagementSettings with a source
     *
     * @param sourceEntitlementManagementSettings the source object with updates
     * @return the updated EntitlementManagementSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EntitlementManagementSettings patch(final EntitlementManagementSettings sourceEntitlementManagementSettings) throws ClientException {
        return send(HttpMethod.PATCH, sourceEntitlementManagementSettings);
    }

    /**
     * Creates a EntitlementManagementSettings with a new object
     *
     * @param newEntitlementManagementSettings the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final EntitlementManagementSettings newEntitlementManagementSettings, final ICallback<? super EntitlementManagementSettings> callback) {
        send(HttpMethod.POST, callback, newEntitlementManagementSettings);
    }

    /**
     * Creates a EntitlementManagementSettings with a new object
     *
     * @param newEntitlementManagementSettings the new object to create
     * @return the created EntitlementManagementSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EntitlementManagementSettings post(final EntitlementManagementSettings newEntitlementManagementSettings) throws ClientException {
        return send(HttpMethod.POST, newEntitlementManagementSettings);
    }

    /**
     * Creates a EntitlementManagementSettings with a new object
     *
     * @param newEntitlementManagementSettings the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final EntitlementManagementSettings newEntitlementManagementSettings, final ICallback<? super EntitlementManagementSettings> callback) {
        send(HttpMethod.PUT, callback, newEntitlementManagementSettings);
    }

    /**
     * Creates a EntitlementManagementSettings with a new object
     *
     * @param newEntitlementManagementSettings the object to create/update
     * @return the created EntitlementManagementSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EntitlementManagementSettings put(final EntitlementManagementSettings newEntitlementManagementSettings) throws ClientException {
        return send(HttpMethod.PUT, newEntitlementManagementSettings);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IEntitlementManagementSettingsRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (EntitlementManagementSettingsRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IEntitlementManagementSettingsRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (EntitlementManagementSettingsRequest)this;
     }

}

