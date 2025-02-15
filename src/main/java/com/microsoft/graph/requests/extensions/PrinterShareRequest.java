// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PrinterShare;
import com.microsoft.graph.requests.extensions.IGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserRequestBuilder;
import com.microsoft.graph.requests.extensions.UserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrinterRequestBuilder;
import com.microsoft.graph.requests.extensions.PrinterRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Printer Share Request.
 */
public class PrinterShareRequest extends BaseRequest implements IPrinterShareRequest {
	
    /**
     * The request for the PrinterShare
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrinterShareRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PrinterShare.class);
    }

    /**
     * Gets the PrinterShare from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super PrinterShare> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PrinterShare from the service
     *
     * @return the PrinterShare from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PrinterShare get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super PrinterShare> callback) {
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
     * Patches this PrinterShare with a source
     *
     * @param sourcePrinterShare the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final PrinterShare sourcePrinterShare, final ICallback<? super PrinterShare> callback) {
        send(HttpMethod.PATCH, callback, sourcePrinterShare);
    }

    /**
     * Patches this PrinterShare with a source
     *
     * @param sourcePrinterShare the source object with updates
     * @return the updated PrinterShare
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PrinterShare patch(final PrinterShare sourcePrinterShare) throws ClientException {
        return send(HttpMethod.PATCH, sourcePrinterShare);
    }

    /**
     * Creates a PrinterShare with a new object
     *
     * @param newPrinterShare the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final PrinterShare newPrinterShare, final ICallback<? super PrinterShare> callback) {
        send(HttpMethod.POST, callback, newPrinterShare);
    }

    /**
     * Creates a PrinterShare with a new object
     *
     * @param newPrinterShare the new object to create
     * @return the created PrinterShare
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PrinterShare post(final PrinterShare newPrinterShare) throws ClientException {
        return send(HttpMethod.POST, newPrinterShare);
    }

    /**
     * Creates a PrinterShare with a new object
     *
     * @param newPrinterShare the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final PrinterShare newPrinterShare, final ICallback<? super PrinterShare> callback) {
        send(HttpMethod.PUT, callback, newPrinterShare);
    }

    /**
     * Creates a PrinterShare with a new object
     *
     * @param newPrinterShare the object to create/update
     * @return the created PrinterShare
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PrinterShare put(final PrinterShare newPrinterShare) throws ClientException {
        return send(HttpMethod.PUT, newPrinterShare);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IPrinterShareRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (PrinterShareRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IPrinterShareRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (PrinterShareRequest)this;
     }

}

