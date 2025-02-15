// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MacOSWiFiConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSWi Fi Configuration Request.
 */
public class MacOSWiFiConfigurationRequest extends BaseRequest implements IMacOSWiFiConfigurationRequest {
	
    /**
     * The request for the MacOSWiFiConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public MacOSWiFiConfigurationRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends MacOSWiFiConfiguration> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the MacOSWiFiConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MacOSWiFiConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MacOSWiFiConfiguration.class);
    }

    /**
     * Gets the MacOSWiFiConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super MacOSWiFiConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the MacOSWiFiConfiguration from the service
     *
     * @return the MacOSWiFiConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MacOSWiFiConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super MacOSWiFiConfiguration> callback) {
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
     * Patches this MacOSWiFiConfiguration with a source
     *
     * @param sourceMacOSWiFiConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final MacOSWiFiConfiguration sourceMacOSWiFiConfiguration, final ICallback<? super MacOSWiFiConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceMacOSWiFiConfiguration);
    }

    /**
     * Patches this MacOSWiFiConfiguration with a source
     *
     * @param sourceMacOSWiFiConfiguration the source object with updates
     * @return the updated MacOSWiFiConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MacOSWiFiConfiguration patch(final MacOSWiFiConfiguration sourceMacOSWiFiConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceMacOSWiFiConfiguration);
    }

    /**
     * Creates a MacOSWiFiConfiguration with a new object
     *
     * @param newMacOSWiFiConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final MacOSWiFiConfiguration newMacOSWiFiConfiguration, final ICallback<? super MacOSWiFiConfiguration> callback) {
        send(HttpMethod.POST, callback, newMacOSWiFiConfiguration);
    }

    /**
     * Creates a MacOSWiFiConfiguration with a new object
     *
     * @param newMacOSWiFiConfiguration the new object to create
     * @return the created MacOSWiFiConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MacOSWiFiConfiguration post(final MacOSWiFiConfiguration newMacOSWiFiConfiguration) throws ClientException {
        return send(HttpMethod.POST, newMacOSWiFiConfiguration);
    }

    /**
     * Creates a MacOSWiFiConfiguration with a new object
     *
     * @param newMacOSWiFiConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final MacOSWiFiConfiguration newMacOSWiFiConfiguration, final ICallback<? super MacOSWiFiConfiguration> callback) {
        send(HttpMethod.PUT, callback, newMacOSWiFiConfiguration);
    }

    /**
     * Creates a MacOSWiFiConfiguration with a new object
     *
     * @param newMacOSWiFiConfiguration the object to create/update
     * @return the created MacOSWiFiConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MacOSWiFiConfiguration put(final MacOSWiFiConfiguration newMacOSWiFiConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newMacOSWiFiConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IMacOSWiFiConfigurationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (MacOSWiFiConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IMacOSWiFiConfigurationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (MacOSWiFiConfigurationRequest)this;
     }

}

