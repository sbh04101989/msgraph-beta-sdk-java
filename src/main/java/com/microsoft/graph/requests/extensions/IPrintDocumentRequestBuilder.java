// Template Source: IBaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PrintDocument;
import com.microsoft.graph.models.extensions.PrintDocumentUploadProperties;
import com.microsoft.graph.models.extensions.UploadSession;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Print Document Request Builder.
 */
public interface IPrintDocumentRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IPrintDocumentRequest instance
     */
    IPrintDocumentRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IPrintDocumentRequest instance
     */
    IPrintDocumentRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IPrintDocumentCreateUploadSessionRequestBuilder createUploadSession(final PrintDocumentUploadProperties properties);
    IPrintDocumentUploadDataRequestBuilder uploadData();

}