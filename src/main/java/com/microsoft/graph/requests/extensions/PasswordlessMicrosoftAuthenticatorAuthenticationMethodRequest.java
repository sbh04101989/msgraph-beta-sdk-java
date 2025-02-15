// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PasswordlessMicrosoftAuthenticatorAuthenticationMethod;
import com.microsoft.graph.requests.extensions.IDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Passwordless Microsoft Authenticator Authentication Method Request.
 */
public class PasswordlessMicrosoftAuthenticatorAuthenticationMethodRequest extends BaseRequest implements IPasswordlessMicrosoftAuthenticatorAuthenticationMethodRequest {
	
    /**
     * The request for the PasswordlessMicrosoftAuthenticatorAuthenticationMethod
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PasswordlessMicrosoftAuthenticatorAuthenticationMethodRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PasswordlessMicrosoftAuthenticatorAuthenticationMethod.class);
    }

    /**
     * Gets the PasswordlessMicrosoftAuthenticatorAuthenticationMethod from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super PasswordlessMicrosoftAuthenticatorAuthenticationMethod> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PasswordlessMicrosoftAuthenticatorAuthenticationMethod from the service
     *
     * @return the PasswordlessMicrosoftAuthenticatorAuthenticationMethod from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PasswordlessMicrosoftAuthenticatorAuthenticationMethod get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super PasswordlessMicrosoftAuthenticatorAuthenticationMethod> callback) {
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
     * Patches this PasswordlessMicrosoftAuthenticatorAuthenticationMethod with a source
     *
     * @param sourcePasswordlessMicrosoftAuthenticatorAuthenticationMethod the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final PasswordlessMicrosoftAuthenticatorAuthenticationMethod sourcePasswordlessMicrosoftAuthenticatorAuthenticationMethod, final ICallback<? super PasswordlessMicrosoftAuthenticatorAuthenticationMethod> callback) {
        send(HttpMethod.PATCH, callback, sourcePasswordlessMicrosoftAuthenticatorAuthenticationMethod);
    }

    /**
     * Patches this PasswordlessMicrosoftAuthenticatorAuthenticationMethod with a source
     *
     * @param sourcePasswordlessMicrosoftAuthenticatorAuthenticationMethod the source object with updates
     * @return the updated PasswordlessMicrosoftAuthenticatorAuthenticationMethod
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PasswordlessMicrosoftAuthenticatorAuthenticationMethod patch(final PasswordlessMicrosoftAuthenticatorAuthenticationMethod sourcePasswordlessMicrosoftAuthenticatorAuthenticationMethod) throws ClientException {
        return send(HttpMethod.PATCH, sourcePasswordlessMicrosoftAuthenticatorAuthenticationMethod);
    }

    /**
     * Creates a PasswordlessMicrosoftAuthenticatorAuthenticationMethod with a new object
     *
     * @param newPasswordlessMicrosoftAuthenticatorAuthenticationMethod the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final PasswordlessMicrosoftAuthenticatorAuthenticationMethod newPasswordlessMicrosoftAuthenticatorAuthenticationMethod, final ICallback<? super PasswordlessMicrosoftAuthenticatorAuthenticationMethod> callback) {
        send(HttpMethod.POST, callback, newPasswordlessMicrosoftAuthenticatorAuthenticationMethod);
    }

    /**
     * Creates a PasswordlessMicrosoftAuthenticatorAuthenticationMethod with a new object
     *
     * @param newPasswordlessMicrosoftAuthenticatorAuthenticationMethod the new object to create
     * @return the created PasswordlessMicrosoftAuthenticatorAuthenticationMethod
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PasswordlessMicrosoftAuthenticatorAuthenticationMethod post(final PasswordlessMicrosoftAuthenticatorAuthenticationMethod newPasswordlessMicrosoftAuthenticatorAuthenticationMethod) throws ClientException {
        return send(HttpMethod.POST, newPasswordlessMicrosoftAuthenticatorAuthenticationMethod);
    }

    /**
     * Creates a PasswordlessMicrosoftAuthenticatorAuthenticationMethod with a new object
     *
     * @param newPasswordlessMicrosoftAuthenticatorAuthenticationMethod the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final PasswordlessMicrosoftAuthenticatorAuthenticationMethod newPasswordlessMicrosoftAuthenticatorAuthenticationMethod, final ICallback<? super PasswordlessMicrosoftAuthenticatorAuthenticationMethod> callback) {
        send(HttpMethod.PUT, callback, newPasswordlessMicrosoftAuthenticatorAuthenticationMethod);
    }

    /**
     * Creates a PasswordlessMicrosoftAuthenticatorAuthenticationMethod with a new object
     *
     * @param newPasswordlessMicrosoftAuthenticatorAuthenticationMethod the object to create/update
     * @return the created PasswordlessMicrosoftAuthenticatorAuthenticationMethod
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PasswordlessMicrosoftAuthenticatorAuthenticationMethod put(final PasswordlessMicrosoftAuthenticatorAuthenticationMethod newPasswordlessMicrosoftAuthenticatorAuthenticationMethod) throws ClientException {
        return send(HttpMethod.PUT, newPasswordlessMicrosoftAuthenticatorAuthenticationMethod);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IPasswordlessMicrosoftAuthenticatorAuthenticationMethodRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (PasswordlessMicrosoftAuthenticatorAuthenticationMethodRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IPasswordlessMicrosoftAuthenticatorAuthenticationMethodRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (PasswordlessMicrosoftAuthenticatorAuthenticationMethodRequest)this;
     }

}

