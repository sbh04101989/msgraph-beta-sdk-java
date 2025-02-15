// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsAutopilotDeviceIdentity;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeploymentProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsAutopilotDeploymentProfileRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Autopilot Device Identity Request Builder.
 */
public class WindowsAutopilotDeviceIdentityRequestBuilder extends BaseRequestBuilder implements IWindowsAutopilotDeviceIdentityRequestBuilder {

    /**
     * The request builder for the WindowsAutopilotDeviceIdentity
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsAutopilotDeviceIdentityRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IWindowsAutopilotDeviceIdentityRequest instance
     */
    public IWindowsAutopilotDeviceIdentityRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IWindowsAutopilotDeviceIdentityRequest instance
     */
    public IWindowsAutopilotDeviceIdentityRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.WindowsAutopilotDeviceIdentityRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for WindowsAutopilotDeploymentProfile
     *
     * @return the IWindowsAutopilotDeploymentProfileWithReferenceRequestBuilder instance
     */
    public IWindowsAutopilotDeploymentProfileWithReferenceRequestBuilder deploymentProfile() {
        return new WindowsAutopilotDeploymentProfileWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("deploymentProfile"), getClient(), null);
    }

    /**
     * Gets the request builder for WindowsAutopilotDeploymentProfile
     *
     * @return the IWindowsAutopilotDeploymentProfileWithReferenceRequestBuilder instance
     */
    public IWindowsAutopilotDeploymentProfileWithReferenceRequestBuilder intendedDeploymentProfile() {
        return new WindowsAutopilotDeploymentProfileWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("intendedDeploymentProfile"), getClient(), null);
    }

    public IWindowsAutopilotDeviceIdentityAssignResourceAccountToDeviceRequestBuilder assignResourceAccountToDevice(final String userPrincipalName, final String addressableUserName, final String resourceAccountName) {
        return new WindowsAutopilotDeviceIdentityAssignResourceAccountToDeviceRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.assignResourceAccountToDevice"), getClient(), null, userPrincipalName, addressableUserName, resourceAccountName);
    }

    public IWindowsAutopilotDeviceIdentityAssignUserToDeviceRequestBuilder assignUserToDevice(final String userPrincipalName, final String addressableUserName) {
        return new WindowsAutopilotDeviceIdentityAssignUserToDeviceRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.assignUserToDevice"), getClient(), null, userPrincipalName, addressableUserName);
    }

    public IWindowsAutopilotDeviceIdentityUnassignResourceAccountFromDeviceRequestBuilder unassignResourceAccountFromDevice() {
        return new WindowsAutopilotDeviceIdentityUnassignResourceAccountFromDeviceRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.unassignResourceAccountFromDevice"), getClient(), null);
    }

    public IWindowsAutopilotDeviceIdentityUnassignUserFromDeviceRequestBuilder unassignUserFromDevice() {
        return new WindowsAutopilotDeviceIdentityUnassignUserFromDeviceRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.unassignUserFromDevice"), getClient(), null);
    }

    public IWindowsAutopilotDeviceIdentityUpdateDevicePropertiesRequestBuilder updateDeviceProperties(final String userPrincipalName, final String addressableUserName, final String groupTag, final String displayName) {
        return new WindowsAutopilotDeviceIdentityUpdateDevicePropertiesRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.updateDeviceProperties"), getClient(), null, userPrincipalName, addressableUserName, groupTag, displayName);
    }
}
