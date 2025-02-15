// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IEventMessageRequestDeclineRequest;
import com.microsoft.graph.requests.extensions.EventMessageRequestDeclineRequest;
import com.microsoft.graph.models.extensions.TimeSlot;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Event Message Request Decline Request Builder.
 */
public class EventMessageRequestDeclineRequestBuilder extends BaseActionRequestBuilder implements IEventMessageRequestDeclineRequestBuilder {

    /**
     * The request builder for this EventMessageRequestDecline
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param proposedNewTime the proposedNewTime
     * @param sendResponse the sendResponse
     * @param comment the comment
     */
    public EventMessageRequestDeclineRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final TimeSlot proposedNewTime, final Boolean sendResponse, final String comment) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("proposedNewTime", proposedNewTime);
        bodyParams.put("sendResponse", sendResponse);
        bodyParams.put("comment", comment);
    }

    /**
     * Creates the IEventMessageRequestDeclineRequest
     *
     * @param requestOptions the options for the request
     * @return the IEventMessageRequestDeclineRequest instance
     */
    public IEventMessageRequestDeclineRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IEventMessageRequestDeclineRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IEventMessageRequestDeclineRequest instance
     */
    public IEventMessageRequestDeclineRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        EventMessageRequestDeclineRequest request = new EventMessageRequestDeclineRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("proposedNewTime")) {
            request.body.proposedNewTime = getParameter("proposedNewTime");
        }

        if (hasParameter("sendResponse")) {
            request.body.sendResponse = getParameter("sendResponse");
        }

        if (hasParameter("comment")) {
            request.body.comment = getParameter("comment");
        }

        return request;
    }
}
