// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Contact;
import com.microsoft.graph.requests.extensions.IExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMultiValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMultiValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.MultiValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MultiValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.ISingleValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISingleValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.SingleValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SingleValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.IProfilePhotoRequestBuilder;
import com.microsoft.graph.requests.extensions.ProfilePhotoRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Contact Request.
 */
public class ContactRequest extends BaseRequest implements IContactRequest {
	
    /**
     * The request for the Contact
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ContactRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Contact.class);
    }

    /**
     * Gets the Contact from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super Contact> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Contact from the service
     *
     * @return the Contact from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Contact get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super Contact> callback) {
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
     * Patches this Contact with a source
     *
     * @param sourceContact the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Contact sourceContact, final ICallback<? super Contact> callback) {
        send(HttpMethod.PATCH, callback, sourceContact);
    }

    /**
     * Patches this Contact with a source
     *
     * @param sourceContact the source object with updates
     * @return the updated Contact
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Contact patch(final Contact sourceContact) throws ClientException {
        return send(HttpMethod.PATCH, sourceContact);
    }

    /**
     * Creates a Contact with a new object
     *
     * @param newContact the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Contact newContact, final ICallback<? super Contact> callback) {
        send(HttpMethod.POST, callback, newContact);
    }

    /**
     * Creates a Contact with a new object
     *
     * @param newContact the new object to create
     * @return the created Contact
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Contact post(final Contact newContact) throws ClientException {
        return send(HttpMethod.POST, newContact);
    }

    /**
     * Creates a Contact with a new object
     *
     * @param newContact the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Contact newContact, final ICallback<? super Contact> callback) {
        send(HttpMethod.PUT, callback, newContact);
    }

    /**
     * Creates a Contact with a new object
     *
     * @param newContact the object to create/update
     * @return the created Contact
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Contact put(final Contact newContact) throws ClientException {
        return send(HttpMethod.PUT, newContact);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IContactRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ContactRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IContactRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ContactRequest)this;
     }

}

