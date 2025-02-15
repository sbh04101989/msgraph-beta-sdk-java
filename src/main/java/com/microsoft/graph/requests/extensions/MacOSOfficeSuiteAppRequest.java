// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MacOSOfficeSuiteApp;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSOffice Suite App Request.
 */
public class MacOSOfficeSuiteAppRequest extends BaseRequest implements IMacOSOfficeSuiteAppRequest {
	
    /**
     * The request for the MacOSOfficeSuiteApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MacOSOfficeSuiteAppRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MacOSOfficeSuiteApp.class);
    }

    /**
     * Gets the MacOSOfficeSuiteApp from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super MacOSOfficeSuiteApp> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the MacOSOfficeSuiteApp from the service
     *
     * @return the MacOSOfficeSuiteApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MacOSOfficeSuiteApp get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super MacOSOfficeSuiteApp> callback) {
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
     * Patches this MacOSOfficeSuiteApp with a source
     *
     * @param sourceMacOSOfficeSuiteApp the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final MacOSOfficeSuiteApp sourceMacOSOfficeSuiteApp, final ICallback<? super MacOSOfficeSuiteApp> callback) {
        send(HttpMethod.PATCH, callback, sourceMacOSOfficeSuiteApp);
    }

    /**
     * Patches this MacOSOfficeSuiteApp with a source
     *
     * @param sourceMacOSOfficeSuiteApp the source object with updates
     * @return the updated MacOSOfficeSuiteApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MacOSOfficeSuiteApp patch(final MacOSOfficeSuiteApp sourceMacOSOfficeSuiteApp) throws ClientException {
        return send(HttpMethod.PATCH, sourceMacOSOfficeSuiteApp);
    }

    /**
     * Creates a MacOSOfficeSuiteApp with a new object
     *
     * @param newMacOSOfficeSuiteApp the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final MacOSOfficeSuiteApp newMacOSOfficeSuiteApp, final ICallback<? super MacOSOfficeSuiteApp> callback) {
        send(HttpMethod.POST, callback, newMacOSOfficeSuiteApp);
    }

    /**
     * Creates a MacOSOfficeSuiteApp with a new object
     *
     * @param newMacOSOfficeSuiteApp the new object to create
     * @return the created MacOSOfficeSuiteApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MacOSOfficeSuiteApp post(final MacOSOfficeSuiteApp newMacOSOfficeSuiteApp) throws ClientException {
        return send(HttpMethod.POST, newMacOSOfficeSuiteApp);
    }

    /**
     * Creates a MacOSOfficeSuiteApp with a new object
     *
     * @param newMacOSOfficeSuiteApp the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final MacOSOfficeSuiteApp newMacOSOfficeSuiteApp, final ICallback<? super MacOSOfficeSuiteApp> callback) {
        send(HttpMethod.PUT, callback, newMacOSOfficeSuiteApp);
    }

    /**
     * Creates a MacOSOfficeSuiteApp with a new object
     *
     * @param newMacOSOfficeSuiteApp the object to create/update
     * @return the created MacOSOfficeSuiteApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MacOSOfficeSuiteApp put(final MacOSOfficeSuiteApp newMacOSOfficeSuiteApp) throws ClientException {
        return send(HttpMethod.PUT, newMacOSOfficeSuiteApp);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IMacOSOfficeSuiteAppRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (MacOSOfficeSuiteAppRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IMacOSOfficeSuiteAppRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (MacOSOfficeSuiteAppRequest)this;
     }

}

