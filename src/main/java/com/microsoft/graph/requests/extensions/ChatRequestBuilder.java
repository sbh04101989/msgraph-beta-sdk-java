// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Chat;
import com.microsoft.graph.models.extensions.TeamworkActivityTopic;
import com.microsoft.graph.models.extensions.ItemBody;
import com.microsoft.graph.models.extensions.KeyValuePair;
import com.microsoft.graph.models.extensions.TeamworkNotificationRecipient;
import com.microsoft.graph.models.extensions.ChatMessage;
import com.microsoft.graph.requests.extensions.ITeamsAppInstallationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsAppInstallationRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamsAppInstallationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamsAppInstallationRequestBuilder;
import com.microsoft.graph.requests.extensions.IConversationMemberCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IConversationMemberRequestBuilder;
import com.microsoft.graph.requests.extensions.ConversationMemberCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ConversationMemberRequestBuilder;
import com.microsoft.graph.requests.extensions.IChatMessageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IChatMessageRequestBuilder;
import com.microsoft.graph.requests.extensions.ChatMessageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ChatMessageRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsTabCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsTabRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamsTabCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamsTabRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Chat Request Builder.
 */
public class ChatRequestBuilder extends BaseRequestBuilder implements IChatRequestBuilder {

    /**
     * The request builder for the Chat
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ChatRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IChatRequest instance
     */
    public IChatRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IChatRequest instance
     */
    public IChatRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.ChatRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public ITeamsAppInstallationCollectionRequestBuilder installedApps() {
        return new TeamsAppInstallationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("installedApps"), getClient(), null);
    }

    public ITeamsAppInstallationRequestBuilder installedApps(final String id) {
        return new TeamsAppInstallationRequestBuilder(getRequestUrlWithAdditionalSegment("installedApps") + "/" + id, getClient(), null);
    }
    public IConversationMemberCollectionRequestBuilder members() {
        return new ConversationMemberCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("members"), getClient(), null);
    }

    public IConversationMemberRequestBuilder members(final String id) {
        return new ConversationMemberRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/" + id, getClient(), null);
    }
    public IChatMessageCollectionRequestBuilder messages() {
        return new ChatMessageCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("messages"), getClient(), null);
    }

    public IChatMessageRequestBuilder messages(final String id) {
        return new ChatMessageRequestBuilder(getRequestUrlWithAdditionalSegment("messages") + "/" + id, getClient(), null);
    }
    public ITeamsTabCollectionRequestBuilder tabs() {
        return new TeamsTabCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("tabs"), getClient(), null);
    }

    public ITeamsTabRequestBuilder tabs(final String id) {
        return new TeamsTabRequestBuilder(getRequestUrlWithAdditionalSegment("tabs") + "/" + id, getClient(), null);
    }

    public IChatSendActivityNotificationRequestBuilder sendActivityNotification(final TeamworkActivityTopic topic, final String activityType, final Long chainId, final ItemBody previewText, final java.util.List<KeyValuePair> templateParameters, final TeamworkNotificationRecipient recipient) {
        return new ChatSendActivityNotificationRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.sendActivityNotification"), getClient(), null, topic, activityType, chainId, previewText, templateParameters, recipient);
    }
}
