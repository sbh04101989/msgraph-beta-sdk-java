// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MacOSMicrosoftEdgeApp;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSMicrosoft Edge App Request.
 */
public class MacOSMicrosoftEdgeAppRequest extends BaseRequest implements IMacOSMicrosoftEdgeAppRequest {
	
    /**
     * The request for the MacOSMicrosoftEdgeApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MacOSMicrosoftEdgeAppRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MacOSMicrosoftEdgeApp.class);
    }

    /**
     * Gets the MacOSMicrosoftEdgeApp from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super MacOSMicrosoftEdgeApp> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the MacOSMicrosoftEdgeApp from the service
     *
     * @return the MacOSMicrosoftEdgeApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MacOSMicrosoftEdgeApp get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super MacOSMicrosoftEdgeApp> callback) {
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
     * Patches this MacOSMicrosoftEdgeApp with a source
     *
     * @param sourceMacOSMicrosoftEdgeApp the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final MacOSMicrosoftEdgeApp sourceMacOSMicrosoftEdgeApp, final ICallback<? super MacOSMicrosoftEdgeApp> callback) {
        send(HttpMethod.PATCH, callback, sourceMacOSMicrosoftEdgeApp);
    }

    /**
     * Patches this MacOSMicrosoftEdgeApp with a source
     *
     * @param sourceMacOSMicrosoftEdgeApp the source object with updates
     * @return the updated MacOSMicrosoftEdgeApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MacOSMicrosoftEdgeApp patch(final MacOSMicrosoftEdgeApp sourceMacOSMicrosoftEdgeApp) throws ClientException {
        return send(HttpMethod.PATCH, sourceMacOSMicrosoftEdgeApp);
    }

    /**
     * Creates a MacOSMicrosoftEdgeApp with a new object
     *
     * @param newMacOSMicrosoftEdgeApp the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final MacOSMicrosoftEdgeApp newMacOSMicrosoftEdgeApp, final ICallback<? super MacOSMicrosoftEdgeApp> callback) {
        send(HttpMethod.POST, callback, newMacOSMicrosoftEdgeApp);
    }

    /**
     * Creates a MacOSMicrosoftEdgeApp with a new object
     *
     * @param newMacOSMicrosoftEdgeApp the new object to create
     * @return the created MacOSMicrosoftEdgeApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MacOSMicrosoftEdgeApp post(final MacOSMicrosoftEdgeApp newMacOSMicrosoftEdgeApp) throws ClientException {
        return send(HttpMethod.POST, newMacOSMicrosoftEdgeApp);
    }

    /**
     * Creates a MacOSMicrosoftEdgeApp with a new object
     *
     * @param newMacOSMicrosoftEdgeApp the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final MacOSMicrosoftEdgeApp newMacOSMicrosoftEdgeApp, final ICallback<? super MacOSMicrosoftEdgeApp> callback) {
        send(HttpMethod.PUT, callback, newMacOSMicrosoftEdgeApp);
    }

    /**
     * Creates a MacOSMicrosoftEdgeApp with a new object
     *
     * @param newMacOSMicrosoftEdgeApp the object to create/update
     * @return the created MacOSMicrosoftEdgeApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MacOSMicrosoftEdgeApp put(final MacOSMicrosoftEdgeApp newMacOSMicrosoftEdgeApp) throws ClientException {
        return send(HttpMethod.PUT, newMacOSMicrosoftEdgeApp);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IMacOSMicrosoftEdgeAppRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (MacOSMicrosoftEdgeAppRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IMacOSMicrosoftEdgeAppRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (MacOSMicrosoftEdgeAppRequest)this;
     }

}

