// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.List;
import com.microsoft.graph.requests.extensions.IItemActivityOLDCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IItemActivityOLDRequestBuilder;
import com.microsoft.graph.requests.extensions.ItemActivityOLDCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ItemActivityOLDRequestBuilder;
import com.microsoft.graph.requests.extensions.IColumnDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IColumnDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.ColumnDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ColumnDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.IContentTypeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IContentTypeRequestBuilder;
import com.microsoft.graph.requests.extensions.ContentTypeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ContentTypeRequestBuilder;
import com.microsoft.graph.requests.extensions.IListItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IListItemRequestBuilder;
import com.microsoft.graph.requests.extensions.ListItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ListItemRequestBuilder;
import com.microsoft.graph.requests.extensions.ISubscriptionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISubscriptionRequestBuilder;
import com.microsoft.graph.requests.extensions.SubscriptionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SubscriptionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the List Request Builder.
 */
public class ListRequestBuilder extends BaseRequestBuilder implements IListRequestBuilder {

    /**
     * The request builder for the List
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ListRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IListRequest instance
     */
    public IListRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IListRequest instance
     */
    public IListRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.ListRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for User
     *
     * @return the IUserWithReferenceRequestBuilder instance
     */
    public IUserWithReferenceRequestBuilder createdByUser() {
        return new UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("createdByUser"), getClient(), null);
    }

    /**
     * Gets the request builder for User
     *
     * @return the IUserWithReferenceRequestBuilder instance
     */
    public IUserWithReferenceRequestBuilder lastModifiedByUser() {
        return new UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("lastModifiedByUser"), getClient(), null);
    }
    public IItemActivityOLDCollectionRequestBuilder activities() {
        return new ItemActivityOLDCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("activities"), getClient(), null);
    }

    public IItemActivityOLDRequestBuilder activities(final String id) {
        return new ItemActivityOLDRequestBuilder(getRequestUrlWithAdditionalSegment("activities") + "/" + id, getClient(), null);
    }
    public IColumnDefinitionCollectionRequestBuilder columns() {
        return new ColumnDefinitionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("columns"), getClient(), null);
    }

    public IColumnDefinitionRequestBuilder columns(final String id) {
        return new ColumnDefinitionRequestBuilder(getRequestUrlWithAdditionalSegment("columns") + "/" + id, getClient(), null);
    }
    public IContentTypeCollectionRequestBuilder contentTypes() {
        return new ContentTypeCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("contentTypes"), getClient(), null);
    }

    public IContentTypeRequestBuilder contentTypes(final String id) {
        return new ContentTypeRequestBuilder(getRequestUrlWithAdditionalSegment("contentTypes") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for Drive
     *
     * @return the IDriveRequestBuilder instance
     */
    public IDriveRequestBuilder drive() {
        return new DriveRequestBuilder(getRequestUrlWithAdditionalSegment("drive"), getClient(), null);
    }
    public IListItemCollectionRequestBuilder items() {
        return new ListItemCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("items"), getClient(), null);
    }

    public IListItemRequestBuilder items(final String id) {
        return new ListItemRequestBuilder(getRequestUrlWithAdditionalSegment("items") + "/" + id, getClient(), null);
    }
    public ISubscriptionCollectionRequestBuilder subscriptions() {
        return new SubscriptionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("subscriptions"), getClient(), null);
    }

    public ISubscriptionRequestBuilder subscriptions(final String id) {
        return new SubscriptionRequestBuilder(getRequestUrlWithAdditionalSegment("subscriptions") + "/" + id, getClient(), null);
    }
}
