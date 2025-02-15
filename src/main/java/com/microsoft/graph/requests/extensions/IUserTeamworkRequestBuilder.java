// Template Source: IBaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UserTeamwork;
import com.microsoft.graph.models.extensions.TeamworkActivityTopic;
import com.microsoft.graph.models.extensions.ItemBody;
import com.microsoft.graph.models.extensions.KeyValuePair;
import com.microsoft.graph.requests.extensions.IUserScopeTeamsAppInstallationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserScopeTeamsAppInstallationRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the User Teamwork Request Builder.
 */
public interface IUserTeamworkRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserTeamworkRequest instance
     */
    IUserTeamworkRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IUserTeamworkRequest instance
     */
    IUserTeamworkRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IUserScopeTeamsAppInstallationCollectionRequestBuilder installedApps();

    IUserScopeTeamsAppInstallationRequestBuilder installedApps(final String id);
    IUserTeamworkSendActivityNotificationRequestBuilder sendActivityNotification(final TeamworkActivityTopic topic, final String activityType, final Long chainId, final ItemBody previewText, final java.util.List<KeyValuePair> templateParameters);

}