// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.ReferenceAttachmentPermission;
import com.microsoft.graph.models.generated.ReferenceAttachmentProvider;
import com.microsoft.graph.models.extensions.Attachment;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Reference Attachment.
 */
public class ReferenceAttachment extends Attachment implements IJsonBackedObject {


    /**
     * The Is Folder.
     * Specifies whether the attachment is a link to a folder. Must set this to true if sourceUrl is a link to a folder. Optional.
     */
    @SerializedName(value = "isFolder", alternate = {"IsFolder"})
    @Expose
    public Boolean isFolder;

    /**
     * The Permission.
     * Specifies the permissions granted for the attachment by the type of provider in providerType. Possible values are: other, view, edit, anonymousView, anonymousEdit, organizationView, organizationEdit. Optional.
     */
    @SerializedName(value = "permission", alternate = {"Permission"})
    @Expose
    public ReferenceAttachmentPermission permission;

    /**
     * The Preview Url.
     * Applies to only a reference attachment of an image - URL to get a preview image. Use thumbnailUrl and previewUrl only when sourceUrl identifies an image file. Optional.
     */
    @SerializedName(value = "previewUrl", alternate = {"PreviewUrl"})
    @Expose
    public String previewUrl;

    /**
     * The Provider Type.
     * The type of provider that supports an attachment of this contentType. Possible values are: other, oneDriveBusiness, oneDriveConsumer, dropbox. Optional.
     */
    @SerializedName(value = "providerType", alternate = {"ProviderType"})
    @Expose
    public ReferenceAttachmentProvider providerType;

    /**
     * The Source Url.
     * URL to get the attachment content. If this is a URL to a folder, then for the folder to be displayed correctly in Outlook or Outlook on the web, set isFolder to true. Required.
     */
    @SerializedName(value = "sourceUrl", alternate = {"SourceUrl"})
    @Expose
    public String sourceUrl;

    /**
     * The Thumbnail Url.
     * Applies to only a reference attachment of an image - URL to get a thumbnail image. Use thumbnailUrl and previewUrl only when sourceUrl identifies an image file. Optional.
     */
    @SerializedName(value = "thumbnailUrl", alternate = {"ThumbnailUrl"})
    @Expose
    public String thumbnailUrl;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
