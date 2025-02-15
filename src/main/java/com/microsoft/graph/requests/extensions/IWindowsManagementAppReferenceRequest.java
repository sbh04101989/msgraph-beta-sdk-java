// Template Source: IBaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsManagementApp;
import com.microsoft.graph.requests.extensions.IWindowsManagementAppHealthStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsManagementAppHealthStateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.WindowsManagementApp;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows Management App Reference Request.
 */
public interface IWindowsManagementAppReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super WindowsManagementApp> callback);

    WindowsManagementApp delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWindowsManagementAppReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWindowsManagementAppReferenceRequest expand(final String value);

    /**
     * Puts the WindowsManagementApp
     *
     * @param srcWindowsManagementApp the WindowsManagementApp to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(WindowsManagementApp srcWindowsManagementApp, final ICallback<? super WindowsManagementApp> callback);

    /**
     * Puts the WindowsManagementApp
     *
     * @param srcWindowsManagementApp the WindowsManagementApp to PUT
     * @return the WindowsManagementApp
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    WindowsManagementApp put(WindowsManagementApp srcWindowsManagementApp) throws ClientException;
}
