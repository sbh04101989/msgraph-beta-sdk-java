// Template Source: BaseEntityCollectionWithReferencesPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceAndAppManagementRoleAssignment;
import com.microsoft.graph.models.extensions.RoleScopeTag;
import com.microsoft.graph.models.extensions.RoleScopeTagAutoAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IRoleScopeTagCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IRoleScopeTagCollectionWithReferencesPage;
import com.microsoft.graph.requests.extensions.RoleScopeTagCollectionResponse;
import com.microsoft.graph.models.extensions.RoleScopeTag;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Role Scope Tag Collection With References Page.
 */
public class RoleScopeTagCollectionWithReferencesPage extends BaseCollectionPage<RoleScopeTag, IRoleScopeTagCollectionWithReferencesRequestBuilder> implements IRoleScopeTagCollectionWithReferencesPage {

    /**
     * A collection page for RoleScopeTag
     *
     * @param response the serialized RoleScopeTagCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public RoleScopeTagCollectionWithReferencesPage(final RoleScopeTagCollectionResponse response, final IRoleScopeTagCollectionWithReferencesRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
