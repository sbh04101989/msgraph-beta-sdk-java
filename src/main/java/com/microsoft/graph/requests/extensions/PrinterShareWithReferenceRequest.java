// Template Source: BaseEntityWithReferenceRequest.java.tt
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

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Printer Share With Reference Request.
 */
public class PrinterShareWithReferenceRequest extends BaseRequest implements IPrinterShareWithReferenceRequest {

    /**
     * The request for the PrinterShare
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrinterShareWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PrinterShare.class);
    }

    public void post(final PrinterShare newPrinterShare, final IJsonBackedObject payload, final ICallback<? super PrinterShare> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public PrinterShare post(final PrinterShare newPrinterShare, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newPrinterShare;
        }
        return null;
    }

    public void get(final ICallback<? super PrinterShare> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public PrinterShare get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<? super PrinterShare> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final PrinterShare sourcePrinterShare, final ICallback<? super PrinterShare> callback) {
		send(HttpMethod.PATCH, callback, sourcePrinterShare);
	}

	public PrinterShare patch(final PrinterShare sourcePrinterShare) throws ClientException {
		return send(HttpMethod.PATCH, sourcePrinterShare);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IPrinterShareWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IPrinterShareWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IPrinterShareWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (PrinterShareWithReferenceRequest)this;
    }
}
