// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ExternalConnection;
import com.microsoft.graph.requests.extensions.IExternalGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExternalGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.ExternalGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExternalGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.IExternalItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExternalItemRequestBuilder;
import com.microsoft.graph.requests.extensions.ExternalItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExternalItemRequestBuilder;
import com.microsoft.graph.requests.extensions.IConnectionOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IConnectionOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.ConnectionOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ConnectionOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.ISchemaRequestBuilder;
import com.microsoft.graph.requests.extensions.SchemaRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the External Connection Request Builder.
 */
public class ExternalConnectionRequestBuilder extends BaseRequestBuilder implements IExternalConnectionRequestBuilder {

    /**
     * The request builder for the ExternalConnection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ExternalConnectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IExternalConnectionRequest instance
     */
    public IExternalConnectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IExternalConnectionRequest instance
     */
    public IExternalConnectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.ExternalConnectionRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IExternalGroupCollectionRequestBuilder groups() {
        return new ExternalGroupCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("groups"), getClient(), null);
    }

    public IExternalGroupRequestBuilder groups(final String id) {
        return new ExternalGroupRequestBuilder(getRequestUrlWithAdditionalSegment("groups") + "/" + id, getClient(), null);
    }
    public IExternalItemCollectionRequestBuilder items() {
        return new ExternalItemCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("items"), getClient(), null);
    }

    public IExternalItemRequestBuilder items(final String id) {
        return new ExternalItemRequestBuilder(getRequestUrlWithAdditionalSegment("items") + "/" + id, getClient(), null);
    }
    public IConnectionOperationCollectionRequestBuilder operations() {
        return new ConnectionOperationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("operations"), getClient(), null);
    }

    public IConnectionOperationRequestBuilder operations(final String id) {
        return new ConnectionOperationRequestBuilder(getRequestUrlWithAdditionalSegment("operations") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for Schema
     *
     * @return the ISchemaRequestBuilder instance
     */
    public ISchemaRequestBuilder schema() {
        return new SchemaRequestBuilder(getRequestUrlWithAdditionalSegment("schema"), getClient(), null);
    }
}
