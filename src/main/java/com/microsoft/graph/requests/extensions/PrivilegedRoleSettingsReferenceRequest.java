// Template Source: BaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PrivilegedRoleSettings;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Role Settings Reference Request.
 */
public class PrivilegedRoleSettingsReferenceRequest extends BaseRequest implements IPrivilegedRoleSettingsReferenceRequest {

    /**
     * The request for the PrivilegedRoleSettings
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrivilegedRoleSettingsReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PrivilegedRoleSettings.class);
    }

    public void delete(final ICallback<? super PrivilegedRoleSettings> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public PrivilegedRoleSettings delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IPrivilegedRoleSettingsReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (PrivilegedRoleSettingsReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IPrivilegedRoleSettingsReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (PrivilegedRoleSettingsReferenceRequest)this;
    }
    /**
     * Puts the PrivilegedRoleSettings
     *
     * @param srcPrivilegedRoleSettings the PrivilegedRoleSettings reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(PrivilegedRoleSettings srcPrivilegedRoleSettings, final ICallback<? super PrivilegedRoleSettings> callback) {
        send(HttpMethod.PUT, callback, srcPrivilegedRoleSettings);
    }

    /**
     * Puts the PrivilegedRoleSettings
     *
     * @param srcPrivilegedRoleSettings the PrivilegedRoleSettings reference to PUT
     * @return the PrivilegedRoleSettings
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public PrivilegedRoleSettings put(PrivilegedRoleSettings srcPrivilegedRoleSettings) throws ClientException {
        return send(HttpMethod.PUT, srcPrivilegedRoleSettings);
    }
}
