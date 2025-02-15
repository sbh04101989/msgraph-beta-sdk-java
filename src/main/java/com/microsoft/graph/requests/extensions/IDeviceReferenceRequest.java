// Template Source: IBaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Device;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICommandCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICommandRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.Device;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Reference Request.
 */
public interface IDeviceReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super Device> callback);

    Device delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceReferenceRequest expand(final String value);

    /**
     * Puts the Device
     *
     * @param srcDevice the Device to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(Device srcDevice, final ICallback<? super Device> callback);

    /**
     * Puts the Device
     *
     * @param srcDevice the Device to PUT
     * @return the Device
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    Device put(Device srcDevice) throws ClientException;
}
