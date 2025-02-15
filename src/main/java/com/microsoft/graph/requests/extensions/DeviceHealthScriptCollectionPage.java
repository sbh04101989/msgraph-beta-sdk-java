// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceHealthScript;
import com.microsoft.graph.requests.extensions.IDeviceHealthScriptCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceHealthScriptCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceHealthScriptCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Health Script Collection Page.
 */
public class DeviceHealthScriptCollectionPage extends BaseCollectionPage<DeviceHealthScript, IDeviceHealthScriptCollectionRequestBuilder> implements IDeviceHealthScriptCollectionPage {

    /**
     * A collection page for DeviceHealthScript
     *
     * @param response the serialized DeviceHealthScriptCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceHealthScriptCollectionPage(final DeviceHealthScriptCollectionResponse response, final IDeviceHealthScriptCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
