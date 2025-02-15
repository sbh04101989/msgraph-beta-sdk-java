// Template Source: IBaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OrgContact;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.OrgContact;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Org Contact Reference Request.
 */
public interface IOrgContactReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super OrgContact> callback);

    OrgContact delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IOrgContactReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IOrgContactReferenceRequest expand(final String value);

    /**
     * Puts the OrgContact
     *
     * @param srcOrgContact the OrgContact to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(OrgContact srcOrgContact, final ICallback<? super OrgContact> callback);

    /**
     * Puts the OrgContact
     *
     * @param srcOrgContact the OrgContact to PUT
     * @return the OrgContact
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    OrgContact put(OrgContact srcOrgContact) throws ClientException;
}
