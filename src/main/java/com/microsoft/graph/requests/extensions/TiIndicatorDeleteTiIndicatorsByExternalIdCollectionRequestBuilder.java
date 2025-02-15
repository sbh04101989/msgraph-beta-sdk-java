// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ResultInfo;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ITiIndicatorDeleteTiIndicatorsByExternalIdCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITiIndicatorDeleteTiIndicatorsByExternalIdCollectionRequest;
import com.microsoft.graph.requests.extensions.TiIndicatorDeleteTiIndicatorsByExternalIdCollectionRequest;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.core.BaseActionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ti Indicator Delete Ti Indicators By External Id Collection Request Builder.
 */
public class TiIndicatorDeleteTiIndicatorsByExternalIdCollectionRequestBuilder extends BaseActionRequestBuilder implements ITiIndicatorDeleteTiIndicatorsByExternalIdCollectionRequestBuilder {

    /**
     * The request builder for this collection of TiIndicator
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param value the value
     */
    public TiIndicatorDeleteTiIndicatorsByExternalIdCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final java.util.List<String> value) {
        super(requestUrl, client, requestOptions);
  	 if(value!=null){
			bodyParams.put("value", value);
		}
      }
    
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public ITiIndicatorDeleteTiIndicatorsByExternalIdCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public ITiIndicatorDeleteTiIndicatorsByExternalIdCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        TiIndicatorDeleteTiIndicatorsByExternalIdCollectionRequest request = new TiIndicatorDeleteTiIndicatorsByExternalIdCollectionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("value")) {
            request.body.value = getParameter("value");
        }
  
        return request;
    }
}
