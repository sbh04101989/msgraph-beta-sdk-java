// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.CommentAction;
import com.microsoft.graph.models.extensions.CreateAction;
import com.microsoft.graph.models.extensions.DeleteAction;
import com.microsoft.graph.models.extensions.EditAction;
import com.microsoft.graph.models.extensions.MentionAction;
import com.microsoft.graph.models.extensions.MoveAction;
import com.microsoft.graph.models.extensions.RenameAction;
import com.microsoft.graph.models.extensions.RestoreAction;
import com.microsoft.graph.models.extensions.ShareAction;
import com.microsoft.graph.models.extensions.VersionAction;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Item Action Set.
 */
public class ItemActionSet implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Comment.
     * A comment was added to the item.
     */
    @SerializedName(value = "comment", alternate = {"Comment"})
    @Expose
    public CommentAction comment;

    /**
     * The Create.
     * An item was created.
     */
    @SerializedName(value = "create", alternate = {"Create"})
    @Expose
    public CreateAction create;

    /**
     * The Delete.
     * An item was deleted.
     */
    @SerializedName(value = "delete", alternate = {"Delete"})
    @Expose
    public DeleteAction delete;

    /**
     * The Edit.
     * An item was edited.
     */
    @SerializedName(value = "edit", alternate = {"Edit"})
    @Expose
    public EditAction edit;

    /**
     * The Mention.
     * A user was mentioned in the item.
     */
    @SerializedName(value = "mention", alternate = {"Mention"})
    @Expose
    public MentionAction mention;

    /**
     * The Move.
     * An item was moved.
     */
    @SerializedName(value = "move", alternate = {"Move"})
    @Expose
    public MoveAction move;

    /**
     * The Rename.
     * An item was renamed.
     */
    @SerializedName(value = "rename", alternate = {"Rename"})
    @Expose
    public RenameAction rename;

    /**
     * The Restore.
     * An item was restored.
     */
    @SerializedName(value = "restore", alternate = {"Restore"})
    @Expose
    public RestoreAction restore;

    /**
     * The Share.
     * An item was shared.
     */
    @SerializedName(value = "share", alternate = {"Share"})
    @Expose
    public ShareAction share;

    /**
     * The Version.
     * An item was versioned.
     */
    @SerializedName(value = "version", alternate = {"Version"})
    @Expose
    public VersionAction version;


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
