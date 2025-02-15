// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Customer;
import com.microsoft.graph.requests.extensions.IPictureCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPictureRequestBuilder;
import com.microsoft.graph.requests.extensions.PictureCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PictureRequestBuilder;
import com.microsoft.graph.requests.extensions.ICurrencyRequestBuilder;
import com.microsoft.graph.requests.extensions.CurrencyRequestBuilder;
import com.microsoft.graph.requests.extensions.IPaymentMethodRequestBuilder;
import com.microsoft.graph.requests.extensions.PaymentMethodRequestBuilder;
import com.microsoft.graph.requests.extensions.IPaymentTermRequestBuilder;
import com.microsoft.graph.requests.extensions.PaymentTermRequestBuilder;
import com.microsoft.graph.requests.extensions.IShipmentMethodRequestBuilder;
import com.microsoft.graph.requests.extensions.ShipmentMethodRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Customer Request.
 */
public class CustomerRequest extends BaseRequest implements ICustomerRequest {
	
    /**
     * The request for the Customer
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CustomerRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Customer.class);
    }

    /**
     * Gets the Customer from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super Customer> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Customer from the service
     *
     * @return the Customer from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Customer get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super Customer> callback) {
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
     * Patches this Customer with a source
     *
     * @param sourceCustomer the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Customer sourceCustomer, final ICallback<? super Customer> callback) {
        send(HttpMethod.PATCH, callback, sourceCustomer);
    }

    /**
     * Patches this Customer with a source
     *
     * @param sourceCustomer the source object with updates
     * @return the updated Customer
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Customer patch(final Customer sourceCustomer) throws ClientException {
        return send(HttpMethod.PATCH, sourceCustomer);
    }

    /**
     * Creates a Customer with a new object
     *
     * @param newCustomer the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Customer newCustomer, final ICallback<? super Customer> callback) {
        send(HttpMethod.POST, callback, newCustomer);
    }

    /**
     * Creates a Customer with a new object
     *
     * @param newCustomer the new object to create
     * @return the created Customer
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Customer post(final Customer newCustomer) throws ClientException {
        return send(HttpMethod.POST, newCustomer);
    }

    /**
     * Creates a Customer with a new object
     *
     * @param newCustomer the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Customer newCustomer, final ICallback<? super Customer> callback) {
        send(HttpMethod.PUT, callback, newCustomer);
    }

    /**
     * Creates a Customer with a new object
     *
     * @param newCustomer the object to create/update
     * @return the created Customer
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Customer put(final Customer newCustomer) throws ClientException {
        return send(HttpMethod.PUT, newCustomer);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ICustomerRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (CustomerRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ICustomerRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (CustomerRequest)this;
     }

}

