// Template Source: IBaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsPhone81CertificateProfileBase;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.WindowsPhone81CertificateProfileBase;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows Phone81Certificate Profile Base Reference Request.
 */
public interface IWindowsPhone81CertificateProfileBaseReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super WindowsPhone81CertificateProfileBase> callback);

    WindowsPhone81CertificateProfileBase delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWindowsPhone81CertificateProfileBaseReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWindowsPhone81CertificateProfileBaseReferenceRequest expand(final String value);

    /**
     * Puts the WindowsPhone81CertificateProfileBase
     *
     * @param srcWindowsPhone81CertificateProfileBase the WindowsPhone81CertificateProfileBase to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(WindowsPhone81CertificateProfileBase srcWindowsPhone81CertificateProfileBase, final ICallback<? super WindowsPhone81CertificateProfileBase> callback);

    /**
     * Puts the WindowsPhone81CertificateProfileBase
     *
     * @param srcWindowsPhone81CertificateProfileBase the WindowsPhone81CertificateProfileBase to PUT
     * @return the WindowsPhone81CertificateProfileBase
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    WindowsPhone81CertificateProfileBase put(WindowsPhone81CertificateProfileBase srcWindowsPhone81CertificateProfileBase) throws ClientException;
}
