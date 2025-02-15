// Template Source: IBaseMethodRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AssignmentOrder;
import com.microsoft.graph.requests.extensions.IIdentityUserFlowAttributeAssignmentGetOrderRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Identity User Flow Attribute Assignment Get Order Request.
 */
public interface IIdentityUserFlowAttributeAssignmentGetOrderRequest extends IHttpRequest {

    /**
     * Gets the AssignmentOrder
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super AssignmentOrder> callback);

    /**
     * Gets the AssignmentOrder
     *
     * @return the AssignmentOrder
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    AssignmentOrder get() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IIdentityUserFlowAttributeAssignmentGetOrderRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IIdentityUserFlowAttributeAssignmentGetOrderRequest expand(final String value);

}
