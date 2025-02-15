// Template Source: IBaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.CommsApplication;
import com.microsoft.graph.models.extensions.Call;
import com.microsoft.graph.models.extensions.InvitationParticipantInfo;
import com.microsoft.graph.models.generated.CallDisposition;
import com.microsoft.graph.models.extensions.MediaConfig;
import com.microsoft.graph.models.generated.Modality;
import com.microsoft.graph.models.extensions.CancelMediaProcessingOperation;
import com.microsoft.graph.models.generated.ScreenSharingRole;
import com.microsoft.graph.models.extensions.MuteParticipantOperation;
import com.microsoft.graph.models.extensions.Prompt;
import com.microsoft.graph.models.extensions.PlayPromptOperation;
import com.microsoft.graph.models.extensions.RecordOperation;
import com.microsoft.graph.models.generated.RejectReason;
import com.microsoft.graph.models.extensions.SubscribeToToneOperation;
import com.microsoft.graph.models.extensions.UnmuteParticipantOperation;
import com.microsoft.graph.models.generated.RecordingStatus;
import com.microsoft.graph.models.extensions.UpdateRecordingStatusOperation;
import com.microsoft.graph.models.extensions.TeleconferenceDeviceQuality;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Call Collection Request.
 */
public interface ICallCollectionRequest extends IHttpRequest {

    void get(final ICallback<? super ICallCollectionPage> callback);

    ICallCollectionPage get() throws ClientException;

    void post(final Call newCall, final ICallback<? super Call> callback);

    Call post(final Call newCall) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ICallCollectionRequest expand(final String value);

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    ICallCollectionRequest filter(final String value);

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    ICallCollectionRequest orderBy(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ICallCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    ICallCollectionRequest top(final int value);

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    ICallCollectionRequest skip(final int value);

    /**
	 * Sets the skip token value for the request
	 * 
	 * @param skipToken value for pagination
     *
	 * @return the updated request
	 */
	ICallCollectionRequest skipToken(final String skipToken);
}
