// Template Source: IBaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MailSearchFolder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Mail Search Folder Request Builder.
 */
public interface IMailSearchFolderRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IMailSearchFolderRequest instance
     */
    IMailSearchFolderRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IMailSearchFolderRequest instance
     */
    IMailSearchFolderRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IMailFolderCollectionRequestBuilder childFolders();

    IMailFolderRequestBuilder childFolders(final String id);

    IMessageRuleCollectionRequestBuilder messageRules();

    IMessageRuleRequestBuilder messageRules(final String id);

    IMessageCollectionRequestBuilder messages();

    IMessageRequestBuilder messages(final String id);

    IMultiValueLegacyExtendedPropertyCollectionRequestBuilder multiValueExtendedProperties();

    IMultiValueLegacyExtendedPropertyRequestBuilder multiValueExtendedProperties(final String id);

    ISingleValueLegacyExtendedPropertyCollectionRequestBuilder singleValueExtendedProperties();

    ISingleValueLegacyExtendedPropertyRequestBuilder singleValueExtendedProperties(final String id);

    IUserConfigurationCollectionRequestBuilder userConfigurations();

    IUserConfigurationRequestBuilder userConfigurations(final String id);

}