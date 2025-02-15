// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.EntitlementManagementSettings;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Entitlement Management Settings Request.
 */
public interface IEntitlementManagementSettingsRequest extends IHttpRequest {

    /**
     * Gets the EntitlementManagementSettings from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super EntitlementManagementSettings> callback);

    /**
     * Gets the EntitlementManagementSettings from the service
     *
     * @return the EntitlementManagementSettings from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EntitlementManagementSettings get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super EntitlementManagementSettings> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this EntitlementManagementSettings with a source
     *
     * @param sourceEntitlementManagementSettings the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final EntitlementManagementSettings sourceEntitlementManagementSettings, final ICallback<? super EntitlementManagementSettings> callback);

    /**
     * Patches this EntitlementManagementSettings with a source
     *
     * @param sourceEntitlementManagementSettings the source object with updates
     * @return the updated EntitlementManagementSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EntitlementManagementSettings patch(final EntitlementManagementSettings sourceEntitlementManagementSettings) throws ClientException;

    /**
     * Posts a EntitlementManagementSettings with a new object
     *
     * @param newEntitlementManagementSettings the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final EntitlementManagementSettings newEntitlementManagementSettings, final ICallback<? super EntitlementManagementSettings> callback);

    /**
     * Posts a EntitlementManagementSettings with a new object
     *
     * @param newEntitlementManagementSettings the new object to create
     * @return the created EntitlementManagementSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EntitlementManagementSettings post(final EntitlementManagementSettings newEntitlementManagementSettings) throws ClientException;

    /**
     * Posts a EntitlementManagementSettings with a new object
     *
     * @param newEntitlementManagementSettings the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final EntitlementManagementSettings newEntitlementManagementSettings, final ICallback<? super EntitlementManagementSettings> callback);

    /**
     * Posts a EntitlementManagementSettings with a new object
     *
     * @param newEntitlementManagementSettings the object to create/update
     * @return the created EntitlementManagementSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EntitlementManagementSettings put(final EntitlementManagementSettings newEntitlementManagementSettings) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IEntitlementManagementSettingsRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IEntitlementManagementSettingsRequest expand(final String value);

}

