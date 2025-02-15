// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WindowsIdentityProtectionConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows Identity Protection Configuration Request.
 */
public interface IWindowsIdentityProtectionConfigurationRequest extends IHttpRequest {

    /**
     * Gets the WindowsIdentityProtectionConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super WindowsIdentityProtectionConfiguration> callback);

    /**
     * Gets the WindowsIdentityProtectionConfiguration from the service
     *
     * @return the WindowsIdentityProtectionConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsIdentityProtectionConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super WindowsIdentityProtectionConfiguration> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WindowsIdentityProtectionConfiguration with a source
     *
     * @param sourceWindowsIdentityProtectionConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WindowsIdentityProtectionConfiguration sourceWindowsIdentityProtectionConfiguration, final ICallback<? super WindowsIdentityProtectionConfiguration> callback);

    /**
     * Patches this WindowsIdentityProtectionConfiguration with a source
     *
     * @param sourceWindowsIdentityProtectionConfiguration the source object with updates
     * @return the updated WindowsIdentityProtectionConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsIdentityProtectionConfiguration patch(final WindowsIdentityProtectionConfiguration sourceWindowsIdentityProtectionConfiguration) throws ClientException;

    /**
     * Posts a WindowsIdentityProtectionConfiguration with a new object
     *
     * @param newWindowsIdentityProtectionConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WindowsIdentityProtectionConfiguration newWindowsIdentityProtectionConfiguration, final ICallback<? super WindowsIdentityProtectionConfiguration> callback);

    /**
     * Posts a WindowsIdentityProtectionConfiguration with a new object
     *
     * @param newWindowsIdentityProtectionConfiguration the new object to create
     * @return the created WindowsIdentityProtectionConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsIdentityProtectionConfiguration post(final WindowsIdentityProtectionConfiguration newWindowsIdentityProtectionConfiguration) throws ClientException;

    /**
     * Posts a WindowsIdentityProtectionConfiguration with a new object
     *
     * @param newWindowsIdentityProtectionConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final WindowsIdentityProtectionConfiguration newWindowsIdentityProtectionConfiguration, final ICallback<? super WindowsIdentityProtectionConfiguration> callback);

    /**
     * Posts a WindowsIdentityProtectionConfiguration with a new object
     *
     * @param newWindowsIdentityProtectionConfiguration the object to create/update
     * @return the created WindowsIdentityProtectionConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsIdentityProtectionConfiguration put(final WindowsIdentityProtectionConfiguration newWindowsIdentityProtectionConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWindowsIdentityProtectionConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWindowsIdentityProtectionConfigurationRequest expand(final String value);

}

