// Template Source: BaseEntityWithReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicy;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicyAssignment;
import com.microsoft.graph.models.extensions.HasPayloadLinkResultItem;
import com.microsoft.graph.models.extensions.RetireScheduledManagedDevice;
import com.microsoft.graph.models.generated.ScheduledRetireState;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicyScript;
import com.microsoft.graph.models.extensions.DeviceComplianceScriptValidationResult;
import com.microsoft.graph.models.extensions.DeviceComplianceScheduledActionForRule;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.ISettingStateDeviceSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISettingStateDeviceSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.SettingStateDeviceSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SettingStateDeviceSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceDeviceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceDeviceStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceDeviceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceDeviceStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceScheduledActionForRuleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceScheduledActionForRuleRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceScheduledActionForRuleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceScheduledActionForRuleRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceUserStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceUserStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceUserStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceUserStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceDeviceOverviewRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceDeviceOverviewRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceUserOverviewRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceUserOverviewRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Policy With Reference Request.
 */
public class DeviceCompliancePolicyWithReferenceRequest extends BaseRequest implements IDeviceCompliancePolicyWithReferenceRequest {

    /**
     * The request for the DeviceCompliancePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceCompliancePolicyWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceCompliancePolicy.class);
    }

    public void post(final DeviceCompliancePolicy newDeviceCompliancePolicy, final IJsonBackedObject payload, final ICallback<? super DeviceCompliancePolicy> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public DeviceCompliancePolicy post(final DeviceCompliancePolicy newDeviceCompliancePolicy, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newDeviceCompliancePolicy;
        }
        return null;
    }

    public void get(final ICallback<? super DeviceCompliancePolicy> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public DeviceCompliancePolicy get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<? super DeviceCompliancePolicy> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final DeviceCompliancePolicy sourceDeviceCompliancePolicy, final ICallback<? super DeviceCompliancePolicy> callback) {
		send(HttpMethod.PATCH, callback, sourceDeviceCompliancePolicy);
	}

	public DeviceCompliancePolicy patch(final DeviceCompliancePolicy sourceDeviceCompliancePolicy) throws ClientException {
		return send(HttpMethod.PATCH, sourceDeviceCompliancePolicy);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceCompliancePolicyWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IDeviceCompliancePolicyWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceCompliancePolicyWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DeviceCompliancePolicyWithReferenceRequest)this;
    }
}
