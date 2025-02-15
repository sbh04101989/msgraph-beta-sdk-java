// Template Source: BaseEntityRequest.java.tt
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
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Chat Request.
 */
public class ChatRequest extends BaseRequest implements IChatRequest {
	
    /**
     * The request for the Chat
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ChatRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Chat.class);
    }

    /**
     * Gets the Chat from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super Chat> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Chat from the service
     *
     * @return the Chat from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Chat get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super Chat> callback) {
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
     * Patches this Chat with a source
     *
     * @param sourceChat the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Chat sourceChat, final ICallback<? super Chat> callback) {
        send(HttpMethod.PATCH, callback, sourceChat);
    }

    /**
     * Patches this Chat with a source
     *
     * @param sourceChat the source object with updates
     * @return the updated Chat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Chat patch(final Chat sourceChat) throws ClientException {
        return send(HttpMethod.PATCH, sourceChat);
    }

    /**
     * Creates a Chat with a new object
     *
     * @param newChat the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Chat newChat, final ICallback<? super Chat> callback) {
        send(HttpMethod.POST, callback, newChat);
    }

    /**
     * Creates a Chat with a new object
     *
     * @param newChat the new object to create
     * @return the created Chat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Chat post(final Chat newChat) throws ClientException {
        return send(HttpMethod.POST, newChat);
    }

    /**
     * Creates a Chat with a new object
     *
     * @param newChat the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Chat newChat, final ICallback<? super Chat> callback) {
        send(HttpMethod.PUT, callback, newChat);
    }

    /**
     * Creates a Chat with a new object
     *
     * @param newChat the object to create/update
     * @return the created Chat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Chat put(final Chat newChat) throws ClientException {
        return send(HttpMethod.PUT, newChat);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IChatRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ChatRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IChatRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ChatRequest)this;
     }

}

