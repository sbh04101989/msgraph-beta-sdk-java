// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.EnrollmentRestrictionsConfigurationPolicySetItem;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Enrollment Restrictions Configuration Policy Set Item Request.
 */
public interface IEnrollmentRestrictionsConfigurationPolicySetItemRequest extends IHttpRequest {

    /**
     * Gets the EnrollmentRestrictionsConfigurationPolicySetItem from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super EnrollmentRestrictionsConfigurationPolicySetItem> callback);

    /**
     * Gets the EnrollmentRestrictionsConfigurationPolicySetItem from the service
     *
     * @return the EnrollmentRestrictionsConfigurationPolicySetItem from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EnrollmentRestrictionsConfigurationPolicySetItem get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super EnrollmentRestrictionsConfigurationPolicySetItem> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this EnrollmentRestrictionsConfigurationPolicySetItem with a source
     *
     * @param sourceEnrollmentRestrictionsConfigurationPolicySetItem the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final EnrollmentRestrictionsConfigurationPolicySetItem sourceEnrollmentRestrictionsConfigurationPolicySetItem, final ICallback<? super EnrollmentRestrictionsConfigurationPolicySetItem> callback);

    /**
     * Patches this EnrollmentRestrictionsConfigurationPolicySetItem with a source
     *
     * @param sourceEnrollmentRestrictionsConfigurationPolicySetItem the source object with updates
     * @return the updated EnrollmentRestrictionsConfigurationPolicySetItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EnrollmentRestrictionsConfigurationPolicySetItem patch(final EnrollmentRestrictionsConfigurationPolicySetItem sourceEnrollmentRestrictionsConfigurationPolicySetItem) throws ClientException;

    /**
     * Posts a EnrollmentRestrictionsConfigurationPolicySetItem with a new object
     *
     * @param newEnrollmentRestrictionsConfigurationPolicySetItem the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final EnrollmentRestrictionsConfigurationPolicySetItem newEnrollmentRestrictionsConfigurationPolicySetItem, final ICallback<? super EnrollmentRestrictionsConfigurationPolicySetItem> callback);

    /**
     * Posts a EnrollmentRestrictionsConfigurationPolicySetItem with a new object
     *
     * @param newEnrollmentRestrictionsConfigurationPolicySetItem the new object to create
     * @return the created EnrollmentRestrictionsConfigurationPolicySetItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EnrollmentRestrictionsConfigurationPolicySetItem post(final EnrollmentRestrictionsConfigurationPolicySetItem newEnrollmentRestrictionsConfigurationPolicySetItem) throws ClientException;

    /**
     * Posts a EnrollmentRestrictionsConfigurationPolicySetItem with a new object
     *
     * @param newEnrollmentRestrictionsConfigurationPolicySetItem the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final EnrollmentRestrictionsConfigurationPolicySetItem newEnrollmentRestrictionsConfigurationPolicySetItem, final ICallback<? super EnrollmentRestrictionsConfigurationPolicySetItem> callback);

    /**
     * Posts a EnrollmentRestrictionsConfigurationPolicySetItem with a new object
     *
     * @param newEnrollmentRestrictionsConfigurationPolicySetItem the object to create/update
     * @return the created EnrollmentRestrictionsConfigurationPolicySetItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EnrollmentRestrictionsConfigurationPolicySetItem put(final EnrollmentRestrictionsConfigurationPolicySetItem newEnrollmentRestrictionsConfigurationPolicySetItem) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IEnrollmentRestrictionsConfigurationPolicySetItemRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IEnrollmentRestrictionsConfigurationPolicySetItemRequest expand(final String value);

}

