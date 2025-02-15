// Template Source: IBaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IManagedDeviceRotateFileVaultKeyRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Managed Device Rotate File Vault Key Request Builder.
 */
public interface IManagedDeviceRotateFileVaultKeyRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IManagedDeviceRotateFileVaultKeyRequest
     *
     * @param requestOptions the options for the request
     * @return the IManagedDeviceRotateFileVaultKeyRequest instance
     */
    IManagedDeviceRotateFileVaultKeyRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IManagedDeviceRotateFileVaultKeyRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IManagedDeviceRotateFileVaultKeyRequest instance
     */
    IManagedDeviceRotateFileVaultKeyRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
