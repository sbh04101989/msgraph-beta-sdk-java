// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PolicyRoot;
import com.microsoft.graph.requests.extensions.IActivityBasedTimeoutPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IActivityBasedTimeoutPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.ActivityBasedTimeoutPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ActivityBasedTimeoutPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IAuthorizationPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAuthorizationPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.AuthorizationPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AuthorizationPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IClaimsMappingPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IClaimsMappingPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.ClaimsMappingPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ClaimsMappingPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IHomeRealmDiscoveryPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IHomeRealmDiscoveryPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.HomeRealmDiscoveryPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.HomeRealmDiscoveryPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IPermissionGrantPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPermissionGrantPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.PermissionGrantPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PermissionGrantPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivateLinkResourcePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivateLinkResourcePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivateLinkResourcePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivateLinkResourcePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.ITokenIssuancePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITokenIssuancePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.TokenIssuancePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TokenIssuancePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.ITokenLifetimePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITokenLifetimePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.TokenLifetimePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TokenLifetimePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IConditionalAccessPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IConditionalAccessPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.ConditionalAccessPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ConditionalAccessPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IAuthenticationFlowsPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.AuthenticationFlowsPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IB2cAuthenticationMethodsPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.B2cAuthenticationMethodsPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceRegistrationPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceRegistrationPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IAdminConsentRequestPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.AdminConsentRequestPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryRoleAccessReviewPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryRoleAccessReviewPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IIdentitySecurityDefaultsEnforcementPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IdentitySecurityDefaultsEnforcementPolicyRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Policy Root Request.
 */
public class PolicyRootRequest extends BaseRequest implements IPolicyRootRequest {
	
    /**
     * The request for the PolicyRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PolicyRootRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PolicyRoot.class);
    }

    /**
     * Gets the PolicyRoot from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super PolicyRoot> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PolicyRoot from the service
     *
     * @return the PolicyRoot from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PolicyRoot get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super PolicyRoot> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this PolicyRoot with a source
     *
     * @param sourcePolicyRoot the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final PolicyRoot sourcePolicyRoot, final ICallback<? super PolicyRoot> callback) {
        send(HttpMethod.PATCH, callback, sourcePolicyRoot);
    }

    /**
     * Patches this PolicyRoot with a source
     *
     * @param sourcePolicyRoot the source object with updates
     * @return the updated PolicyRoot
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PolicyRoot patch(final PolicyRoot sourcePolicyRoot) throws ClientException {
        return send(HttpMethod.PATCH, sourcePolicyRoot);
    }

    /**
     * Creates a PolicyRoot with a new object
     *
     * @param newPolicyRoot the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final PolicyRoot newPolicyRoot, final ICallback<? super PolicyRoot> callback) {
        send(HttpMethod.POST, callback, newPolicyRoot);
    }

    /**
     * Creates a PolicyRoot with a new object
     *
     * @param newPolicyRoot the new object to create
     * @return the created PolicyRoot
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PolicyRoot post(final PolicyRoot newPolicyRoot) throws ClientException {
        return send(HttpMethod.POST, newPolicyRoot);
    }

    /**
     * Creates a PolicyRoot with a new object
     *
     * @param newPolicyRoot the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final PolicyRoot newPolicyRoot, final ICallback<? super PolicyRoot> callback) {
        send(HttpMethod.PUT, callback, newPolicyRoot);
    }

    /**
     * Creates a PolicyRoot with a new object
     *
     * @param newPolicyRoot the object to create/update
     * @return the created PolicyRoot
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PolicyRoot put(final PolicyRoot newPolicyRoot) throws ClientException {
        return send(HttpMethod.PUT, newPolicyRoot);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IPolicyRootRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (PolicyRootRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IPolicyRootRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (PolicyRootRequest)this;
     }

}

