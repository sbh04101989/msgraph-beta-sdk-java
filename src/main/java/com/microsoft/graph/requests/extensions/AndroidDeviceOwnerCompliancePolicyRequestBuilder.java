// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidDeviceOwnerCompliancePolicy;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Device Owner Compliance Policy Request Builder.
 */
public class AndroidDeviceOwnerCompliancePolicyRequestBuilder extends BaseRequestBuilder implements IAndroidDeviceOwnerCompliancePolicyRequestBuilder {

    /**
     * The request builder for the AndroidDeviceOwnerCompliancePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidDeviceOwnerCompliancePolicyRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IAndroidDeviceOwnerCompliancePolicyRequest instance
     */
    public IAndroidDeviceOwnerCompliancePolicyRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IAndroidDeviceOwnerCompliancePolicyRequest instance
     */
    public IAndroidDeviceOwnerCompliancePolicyRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.AndroidDeviceOwnerCompliancePolicyRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IDeviceCompliancePolicyAssignmentCollectionRequestBuilder assignments() {
        return new DeviceCompliancePolicyAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    public IDeviceCompliancePolicyAssignmentRequestBuilder assignments(final String id) {
        return new DeviceCompliancePolicyAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }
    public ISettingStateDeviceSummaryCollectionRequestBuilder deviceSettingStateSummaries() {
        return new SettingStateDeviceSummaryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceSettingStateSummaries"), getClient(), null);
    }

    public ISettingStateDeviceSummaryRequestBuilder deviceSettingStateSummaries(final String id) {
        return new SettingStateDeviceSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("deviceSettingStateSummaries") + "/" + id, getClient(), null);
    }
    public IDeviceComplianceDeviceStatusCollectionRequestBuilder deviceStatuses() {
        return new DeviceComplianceDeviceStatusCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatuses"), getClient(), null);
    }

    public IDeviceComplianceDeviceStatusRequestBuilder deviceStatuses(final String id) {
        return new DeviceComplianceDeviceStatusRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatuses") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for DeviceComplianceDeviceOverview
     *
     * @return the IDeviceComplianceDeviceOverviewRequestBuilder instance
     */
    public IDeviceComplianceDeviceOverviewRequestBuilder deviceStatusOverview() {
        return new DeviceComplianceDeviceOverviewRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatusOverview"), getClient(), null);
    }
    public IDeviceComplianceScheduledActionForRuleCollectionRequestBuilder scheduledActionsForRule() {
        return new DeviceComplianceScheduledActionForRuleCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("scheduledActionsForRule"), getClient(), null);
    }

    public IDeviceComplianceScheduledActionForRuleRequestBuilder scheduledActionsForRule(final String id) {
        return new DeviceComplianceScheduledActionForRuleRequestBuilder(getRequestUrlWithAdditionalSegment("scheduledActionsForRule") + "/" + id, getClient(), null);
    }
    public IDeviceComplianceUserStatusCollectionRequestBuilder userStatuses() {
        return new DeviceComplianceUserStatusCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("userStatuses"), getClient(), null);
    }

    public IDeviceComplianceUserStatusRequestBuilder userStatuses(final String id) {
        return new DeviceComplianceUserStatusRequestBuilder(getRequestUrlWithAdditionalSegment("userStatuses") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for DeviceComplianceUserOverview
     *
     * @return the IDeviceComplianceUserOverviewRequestBuilder instance
     */
    public IDeviceComplianceUserOverviewRequestBuilder userStatusOverview() {
        return new DeviceComplianceUserOverviewRequestBuilder(getRequestUrlWithAdditionalSegment("userStatusOverview"), getClient(), null);
    }
}
