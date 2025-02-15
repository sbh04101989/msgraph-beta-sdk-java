// Template Source: IBaseEntityReferenceRequest.java.tt
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
import com.microsoft.graph.requests.extensions.IUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrinterRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.PrinterShare;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Printer Share Reference Request.
 */
public interface IPrinterShareReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super PrinterShare> callback);

    PrinterShare delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IPrinterShareReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IPrinterShareReferenceRequest expand(final String value);

    /**
     * Puts the PrinterShare
     *
     * @param srcPrinterShare the PrinterShare to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(PrinterShare srcPrinterShare, final ICallback<? super PrinterShare> callback);

    /**
     * Puts the PrinterShare
     *
     * @param srcPrinterShare the PrinterShare to PUT
     * @return the PrinterShare
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    PrinterShare put(PrinterShare srcPrinterShare) throws ClientException;
}
