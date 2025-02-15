// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Security;
import com.microsoft.graph.models.extensions.TiIndicator;
import com.microsoft.graph.models.extensions.ResultInfo;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ITiIndicatorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITiIndicatorRequestBuilder;
import com.microsoft.graph.requests.extensions.ITiIndicatorCollectionRequest;
import com.microsoft.graph.requests.extensions.ITiIndicatorDeleteTiIndicatorsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITiIndicatorDeleteTiIndicatorsByExternalIdCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITiIndicatorSubmitTiIndicatorsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITiIndicatorUpdateTiIndicatorsCollectionRequestBuilder;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ti Indicator Collection Request Builder.
 */
public class TiIndicatorCollectionRequestBuilder extends BaseRequestBuilder implements ITiIndicatorCollectionRequestBuilder {

    /**
     * The request builder for this collection of Security
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TiIndicatorCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public ITiIndicatorCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public ITiIndicatorCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new TiIndicatorCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public ITiIndicatorRequestBuilder byId(final String id) {
        return new TiIndicatorRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }



    public ITiIndicatorDeleteTiIndicatorsCollectionRequestBuilder deleteTiIndicators(final java.util.List<String> value) {
        return new TiIndicatorDeleteTiIndicatorsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.deleteTiIndicators"), getClient(), null, value);
    }

    public ITiIndicatorDeleteTiIndicatorsByExternalIdCollectionRequestBuilder deleteTiIndicatorsByExternalId(final java.util.List<String> value) {
        return new TiIndicatorDeleteTiIndicatorsByExternalIdCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.deleteTiIndicatorsByExternalId"), getClient(), null, value);
    }

    public ITiIndicatorSubmitTiIndicatorsCollectionRequestBuilder submitTiIndicators(final java.util.List<TiIndicator> value) {
        return new TiIndicatorSubmitTiIndicatorsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.submitTiIndicators"), getClient(), null, value);
    }

    public ITiIndicatorUpdateTiIndicatorsCollectionRequestBuilder updateTiIndicators(final java.util.List<TiIndicator> value) {
        return new TiIndicatorUpdateTiIndicatorsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.updateTiIndicators"), getClient(), null, value);
    }
}
