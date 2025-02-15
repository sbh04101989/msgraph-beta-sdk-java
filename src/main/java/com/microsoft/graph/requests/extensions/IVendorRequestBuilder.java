// Template Source: IBaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Vendor;
import com.microsoft.graph.requests.extensions.IPictureCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPictureRequestBuilder;
import com.microsoft.graph.requests.extensions.ICurrencyRequestBuilder;
import com.microsoft.graph.requests.extensions.IPaymentMethodRequestBuilder;
import com.microsoft.graph.requests.extensions.IPaymentTermRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Vendor Request Builder.
 */
public interface IVendorRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IVendorRequest instance
     */
    IVendorRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IVendorRequest instance
     */
    IVendorRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    /**
     * Gets the request builder for Currency
     *
     * @return the ICurrencyRequestBuilder instance
     */
    ICurrencyRequestBuilder currency();

    /**
     * Gets the request builder for PaymentMethod
     *
     * @return the IPaymentMethodRequestBuilder instance
     */
    IPaymentMethodRequestBuilder paymentMethod();

    /**
     * Gets the request builder for PaymentTerm
     *
     * @return the IPaymentTermRequestBuilder instance
     */
    IPaymentTermRequestBuilder paymentTerm();

    IPictureCollectionRequestBuilder picture();

    IPictureRequestBuilder picture(final String id);

}