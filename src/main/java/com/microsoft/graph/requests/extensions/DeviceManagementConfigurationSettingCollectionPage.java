// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagementConfigurationSetting;
import com.microsoft.graph.requests.extensions.IDeviceManagementConfigurationSettingCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementConfigurationSettingCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementConfigurationSettingCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Configuration Setting Collection Page.
 */
public class DeviceManagementConfigurationSettingCollectionPage extends BaseCollectionPage<DeviceManagementConfigurationSetting, IDeviceManagementConfigurationSettingCollectionRequestBuilder> implements IDeviceManagementConfigurationSettingCollectionPage {

    /**
     * A collection page for DeviceManagementConfigurationSetting
     *
     * @param response the serialized DeviceManagementConfigurationSettingCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceManagementConfigurationSettingCollectionPage(final DeviceManagementConfigurationSettingCollectionResponse response, final IDeviceManagementConfigurationSettingCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
