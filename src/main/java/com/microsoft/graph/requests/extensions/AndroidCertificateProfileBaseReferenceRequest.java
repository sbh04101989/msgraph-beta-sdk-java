// Template Source: BaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidCertificateProfileBase;
import com.microsoft.graph.requests.extensions.IAndroidTrustedRootCertificateRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidTrustedRootCertificateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Certificate Profile Base Reference Request.
 */
public class AndroidCertificateProfileBaseReferenceRequest extends BaseRequest implements IAndroidCertificateProfileBaseReferenceRequest {

    /**
     * The request for the AndroidCertificateProfileBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidCertificateProfileBaseReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidCertificateProfileBase.class);
    }

    public void delete(final ICallback<? super AndroidCertificateProfileBase> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public AndroidCertificateProfileBase delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IAndroidCertificateProfileBaseReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (AndroidCertificateProfileBaseReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IAndroidCertificateProfileBaseReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (AndroidCertificateProfileBaseReferenceRequest)this;
    }
    /**
     * Puts the AndroidCertificateProfileBase
     *
     * @param srcAndroidCertificateProfileBase the AndroidCertificateProfileBase reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(AndroidCertificateProfileBase srcAndroidCertificateProfileBase, final ICallback<? super AndroidCertificateProfileBase> callback) {
        send(HttpMethod.PUT, callback, srcAndroidCertificateProfileBase);
    }

    /**
     * Puts the AndroidCertificateProfileBase
     *
     * @param srcAndroidCertificateProfileBase the AndroidCertificateProfileBase reference to PUT
     * @return the AndroidCertificateProfileBase
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public AndroidCertificateProfileBase put(AndroidCertificateProfileBase srcAndroidCertificateProfileBase) throws ClientException {
        return send(HttpMethod.PUT, srcAndroidCertificateProfileBase);
    }
}
